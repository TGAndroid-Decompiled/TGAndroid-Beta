package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.CameraScanActivity;
import org.telegram.p009ui.Components.AnimationProperties;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.LinkPath;
import org.telegram.p009ui.Components.LinkSpanDrawable;
import org.telegram.p009ui.Components.TypefaceSpan;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.PhotoAlbumPickerActivity;

@TargetApi(18)
public class CameraScanActivity extends BaseFragment {
    private CameraView cameraView;
    private int currentType;
    private CameraScanActivityDelegate delegate;
    private TextView descriptionText;
    private AnimatorSet flashAnimator;
    private ImageView flashButton;
    private ImageView galleryButton;
    private Handler handler;
    private boolean needGalleryButton;
    private RectF normalBounds;
    private boolean recognized;
    private ValueAnimator recognizedAnimator;
    private TextView recognizedMrzView;
    private long recognizedStart;
    private String recognizedText;
    private int sps;
    private TextView titleTextView;
    private SpringAnimation useRecognizedBoundsAnimator;
    private HandlerThread backgroundHandlerThread = new HandlerThread("ScanCamera");
    private Paint paint = new Paint();
    private Paint cornerPaint = new Paint(1);
    private Path path = new Path();
    private float backShadowAlpha = 0.5f;
    protected boolean shownAsBottomSheet = false;
    private SpringAnimation qrAppearing = null;
    private float qrAppearingValue = 0.0f;
    private RectF fromBounds = new RectF();
    private RectF bounds = new RectF();
    private long lastBoundsUpdate = 0;
    private int recognizeFailed = 0;
    private int recognizeIndex = 0;
    private boolean qrLoading = false;
    private QRCodeReader qrReader = null;
    private BarcodeDetector visionQrReader = null;
    private float recognizedT = 0.0f;
    private float newRecognizedT = 0.0f;
    private float useRecognizedBounds = 0.0f;
    private Runnable requestShot = new RunnableC13667();
    private float averageProcessTime = 0.0f;
    private long processTimesCount = 0;

    public interface CameraScanActivityDelegate {

        public final class CC {
            public static void $default$didFindMrzInfo(CameraScanActivityDelegate cameraScanActivityDelegate, MrzRecognizer.Result result) {
            }

            public static void $default$didFindQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str) {
            }

            public static String $default$getSubtitleText(CameraScanActivityDelegate cameraScanActivityDelegate) {
                return null;
            }

            public static void $default$onDismiss(CameraScanActivityDelegate cameraScanActivityDelegate) {
            }

            public static boolean $default$processQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str, Runnable runnable) {
                return false;
            }
        }

        void didFindMrzInfo(MrzRecognizer.Result result);

        void didFindQr(String str);

        String getSubtitleText();

        void onDismiss();

        boolean processQr(String str, Runnable runnable);
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public static BottomSheet showAsSheet(BaseFragment baseFragment, boolean z, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        return showAsSheet(baseFragment.getParentActivity(), z, i, cameraScanActivityDelegate);
    }

    public class DialogC13591 extends BottomSheet {
        CameraScanActivity fragment;
        final INavigationLayout[] val$actionBarLayout;
        final CameraScanActivityDelegate val$cameraDelegate;
        final boolean val$gallery;
        final int val$type;

        @Override
        protected boolean canDismissWithSwipe() {
            return false;
        }

        DialogC13591(Context context, boolean z, INavigationLayout[] iNavigationLayoutArr, int i, boolean z2, CameraScanActivityDelegate cameraScanActivityDelegate) {
            super(context, z);
            this.val$actionBarLayout = iNavigationLayoutArr;
            this.val$type = i;
            this.val$gallery = z2;
            this.val$cameraDelegate = cameraScanActivityDelegate;
            iNavigationLayoutArr[0].setFragmentStack(new ArrayList());
            CameraScanActivity cameraScanActivity = new CameraScanActivity(i) {
                {
                    DialogC13591.this = this;
                }

                @Override
                public void finishFragment() {
                    setFinishing(true);
                    DialogC13591.this.dismiss();
                }

                @Override
                public void removeSelfFromStack() {
                    DialogC13591.this.dismiss();
                }
            };
            this.fragment = cameraScanActivity;
            cameraScanActivity.shownAsBottomSheet = true;
            cameraScanActivity.needGalleryButton = z2;
            iNavigationLayoutArr[0].addFragmentToStack(this.fragment);
            iNavigationLayoutArr[0].showLastFragment();
            ViewGroup view = iNavigationLayoutArr[0].getView();
            int i2 = this.backgroundPaddingLeft;
            view.setPadding(i2, 0, i2, 0);
            this.fragment.setDelegate(cameraScanActivityDelegate);
            if (cameraScanActivityDelegate.getSubtitleText() != null) {
                this.fragment.descriptionText.setText(cameraScanActivityDelegate.getSubtitleText());
            }
            this.containerView = iNavigationLayoutArr[0].getView();
            setApplyBottomPadding(false);
            setApplyBottomPadding(false);
            setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    CameraScanActivity.DialogC13591.this.lambda$new$0(dialogInterface);
                }
            });
        }

        public void lambda$new$0(DialogInterface dialogInterface) {
            this.fragment.onFragmentDestroy();
        }

        @Override
        public void onBackPressed() {
            INavigationLayout[] iNavigationLayoutArr = this.val$actionBarLayout;
            if (iNavigationLayoutArr[0] == null || iNavigationLayoutArr[0].getFragmentStack().size() <= 1) {
                super.onBackPressed();
            } else {
                this.val$actionBarLayout[0].onBackPressed();
            }
        }

        @Override
        public void dismiss() {
            super.dismiss();
            this.val$actionBarLayout[0] = null;
            this.val$cameraDelegate.onDismiss();
        }
    }

    public static BottomSheet showAsSheet(Activity activity, boolean z, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        if (activity == null) {
            return null;
        }
        DialogC13591 dialogC13591 = new DialogC13591(activity, false, new INavigationLayout[]{INavigationLayout.CC.newLayout(activity)}, i, z, cameraScanActivityDelegate);
        dialogC13591.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar(dialogC13591.getWindow(), false);
        AndroidUtilities.setNavigationBarColor(dialogC13591.getWindow(), -16777216, false);
        dialogC13591.setUseLightStatusBar(false);
        dialogC13591.getWindow().addFlags(512);
        dialogC13591.show();
        return dialogC13591;
    }

    public CameraScanActivity(int i) {
        this.currentType = i;
        if (isQr()) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    CameraScanActivity.this.lambda$new$0();
                }
            });
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.sps = 8;
        } else if (devicePerformanceClass == 1) {
            this.sps = 24;
        } else {
            this.sps = 40;
        }
    }

    public void lambda$new$0() {
        this.qrReader = new QRCodeReader();
        this.visionQrReader = new BarcodeDetector.Builder(ApplicationLoader.applicationContext).setBarcodeFormats(256).build();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        destroy(false, null);
        if (getParentActivity() != null) {
            getParentActivity().setRequestedOrientation(-1);
        }
        BarcodeDetector barcodeDetector = this.visionQrReader;
        if (barcodeDetector != null) {
            barcodeDetector.release();
        }
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        if (this.shownAsBottomSheet) {
            this.actionBar.setItemsColor(-1, false);
            this.actionBar.setItemsBackgroundColor(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.setItemsColor(Theme.getColor("windowBackgroundWhiteGrayText2"), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarWhiteSelector"), false);
            this.actionBar.setTitleColor(Theme.getColor("actionBarDefaultTitle"));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !isQr()) {
            this.actionBar.showActionModeTop();
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            {
                CameraScanActivity.this = this;
            }

            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    CameraScanActivity.this.finishFragment();
                }
            }
        });
        this.paint.setColor(2130706432);
        this.cornerPaint.setColor(-1);
        this.cornerPaint.setStyle(Paint.Style.FILL);
        ViewGroup viewGroup = new ViewGroup(context) {
            {
                CameraScanActivity.this = this;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                ((BaseFragment) CameraScanActivity.this).actionBar.measure(i, i2);
                if (CameraScanActivity.this.currentType == 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    CameraScanActivity.this.recognizedMrzView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    if (CameraScanActivity.this.galleryButton != null) {
                        CameraScanActivity.this.galleryButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(60.0f), 1073741824));
                    }
                    CameraScanActivity.this.flashButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(60.0f), 1073741824));
                }
                CameraScanActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(72.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (CameraScanActivity.this.currentType == 3) {
                    CameraScanActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(72.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    CameraScanActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int measuredHeight;
                int m35dp;
                int measuredWidth;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (CameraScanActivity.this.currentType == 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight() + 0);
                    }
                    CameraScanActivity.this.recognizedMrzView.setTextSize(0, i6 / 22);
                    CameraScanActivity.this.recognizedMrzView.setPadding(0, 0, 0, i6 / 15);
                    int i7 = (int) (i6 * 0.65f);
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.m35dp(36.0f), i7, AndroidUtilities.m35dp(36.0f) + CameraScanActivity.this.titleTextView.getMeasuredWidth(), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i7);
                } else {
                    ((BaseFragment) CameraScanActivity.this).actionBar.layout(0, 0, ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredHeight());
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i5, i6) / 1.5f);
                    if (CameraScanActivity.this.currentType == 1) {
                        measuredHeight = ((i6 - min) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        m35dp = AndroidUtilities.m35dp(30.0f);
                    } else {
                        measuredHeight = ((i6 - min) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        m35dp = AndroidUtilities.m35dp(64.0f);
                    }
                    int i8 = measuredHeight - m35dp;
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.m35dp(36.0f), i8, AndroidUtilities.m35dp(36.0f) + CameraScanActivity.this.titleTextView.getMeasuredWidth(), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i8);
                    if (CameraScanActivity.this.currentType == 3) {
                        int measuredHeight2 = i8 + CameraScanActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.m35dp(8.0f);
                        CameraScanActivity.this.descriptionText.layout(AndroidUtilities.m35dp(36.0f), measuredHeight2, AndroidUtilities.m35dp(36.0f) + CameraScanActivity.this.descriptionText.getMeasuredWidth(), CameraScanActivity.this.descriptionText.getMeasuredHeight() + measuredHeight2);
                    }
                    CameraScanActivity.this.recognizedMrzView.layout(0, getMeasuredHeight() - CameraScanActivity.this.recognizedMrzView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    if (!CameraScanActivity.this.needGalleryButton) {
                        measuredWidth = (i5 / 2) - (CameraScanActivity.this.flashButton.getMeasuredWidth() / 2);
                    } else {
                        measuredWidth = (i5 / 2) + AndroidUtilities.m35dp(35.0f);
                    }
                    int m35dp2 = ((i6 - min) / 2) + min + AndroidUtilities.m35dp(80.0f);
                    CameraScanActivity.this.flashButton.layout(measuredWidth, m35dp2, CameraScanActivity.this.flashButton.getMeasuredWidth() + measuredWidth, CameraScanActivity.this.flashButton.getMeasuredHeight() + m35dp2);
                    if (CameraScanActivity.this.galleryButton != null) {
                        int m35dp3 = ((i5 / 2) - AndroidUtilities.m35dp(35.0f)) - CameraScanActivity.this.galleryButton.getMeasuredWidth();
                        CameraScanActivity.this.galleryButton.layout(m35dp3, m35dp2, CameraScanActivity.this.galleryButton.getMeasuredWidth() + m35dp3, CameraScanActivity.this.galleryButton.getMeasuredHeight() + m35dp2);
                    }
                }
                if (CameraScanActivity.this.currentType != 3) {
                    int i9 = (int) (i6 * 0.74f);
                    int i10 = (int) (i5 * 0.05f);
                    CameraScanActivity.this.descriptionText.layout(i10, i9, CameraScanActivity.this.descriptionText.getMeasuredWidth() + i10, CameraScanActivity.this.descriptionText.getMeasuredHeight() + i9);
                }
                CameraScanActivity.this.updateNormalBounds();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean drawChild = super.drawChild(canvas, view, j);
                if (CameraScanActivity.this.isQr() && view == CameraScanActivity.this.cameraView) {
                    RectF bounds = CameraScanActivity.this.getBounds();
                    int height = (int) (view.getHeight() * bounds.centerY());
                    int width = (int) (((int) (view.getWidth() * bounds.width())) * ((CameraScanActivity.this.qrAppearingValue * 0.5f) + 0.5f));
                    int height2 = (int) (((int) (view.getHeight() * bounds.height())) * ((CameraScanActivity.this.qrAppearingValue * 0.5f) + 0.5f));
                    int width2 = ((int) (view.getWidth() * bounds.centerX())) - (width / 2);
                    int i = height - (height2 / 2);
                    CameraScanActivity.this.paint.setAlpha((int) ((1.0f - ((1.0f - CameraScanActivity.this.backShadowAlpha) * Math.min(1.0f, CameraScanActivity.this.qrAppearingValue))) * 255.0f));
                    float f = i;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f, CameraScanActivity.this.paint);
                    int i2 = i + height2;
                    float f2 = i2;
                    canvas.drawRect(0.0f, f2, view.getMeasuredWidth(), view.getMeasuredHeight(), CameraScanActivity.this.paint);
                    float f3 = width2;
                    canvas.drawRect(0.0f, f, f3, f2, CameraScanActivity.this.paint);
                    int i3 = width2 + width;
                    float f4 = i3;
                    canvas.drawRect(f4, f, view.getMeasuredWidth(), f2, CameraScanActivity.this.paint);
                    CameraScanActivity.this.paint.setAlpha((int) (Math.max(0.0f, 1.0f - CameraScanActivity.this.qrAppearingValue) * 255.0f));
                    canvas.drawRect(f3, f, f4, f2, CameraScanActivity.this.paint);
                    int lerp = AndroidUtilities.lerp(0, AndroidUtilities.m35dp(4.0f), Math.min(1.0f, CameraScanActivity.this.qrAppearingValue * 20.0f));
                    int i4 = lerp / 2;
                    int lerp2 = AndroidUtilities.lerp(Math.min(width, height2), AndroidUtilities.m35dp(20.0f), Math.min(1.2f, (float) Math.pow(CameraScanActivity.this.qrAppearingValue, 1.7999999523162842d)));
                    CameraScanActivity.this.cornerPaint.setAlpha((int) (Math.min(1.0f, CameraScanActivity.this.qrAppearingValue) * 255.0f));
                    CameraScanActivity.this.path.reset();
                    int i5 = i + lerp2;
                    CameraScanActivity.this.path.arcTo(aroundPoint(width2, i5, i4), 0.0f, 180.0f);
                    float f5 = lerp * 1.5f;
                    int i6 = (int) (f3 + f5);
                    int i7 = (int) (f + f5);
                    int i8 = lerp * 2;
                    CameraScanActivity.this.path.arcTo(aroundPoint(i6, i7, i8), 180.0f, 90.0f);
                    int i9 = width2 + lerp2;
                    CameraScanActivity.this.path.arcTo(aroundPoint(i9, i, i4), 270.0f, 180.0f);
                    CameraScanActivity.this.path.lineTo(width2 + i4, i + i4);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i6, i7, lerp), 270.0f, -90.0f);
                    CameraScanActivity.this.path.close();
                    canvas.drawPath(CameraScanActivity.this.path, CameraScanActivity.this.cornerPaint);
                    CameraScanActivity.this.path.reset();
                    CameraScanActivity.this.path.arcTo(aroundPoint(i3, i5, i4), 180.0f, -180.0f);
                    int i10 = (int) (f4 - f5);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i10, i7, i8), 0.0f, -90.0f);
                    int i11 = i3 - lerp2;
                    CameraScanActivity.this.path.arcTo(aroundPoint(i11, i, i4), 270.0f, -180.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i10, i7, lerp), 270.0f, 90.0f);
                    CameraScanActivity.this.path.close();
                    canvas.drawPath(CameraScanActivity.this.path, CameraScanActivity.this.cornerPaint);
                    CameraScanActivity.this.path.reset();
                    int i12 = i2 - lerp2;
                    CameraScanActivity.this.path.arcTo(aroundPoint(width2, i12, i4), 0.0f, -180.0f);
                    int i13 = (int) (f2 - f5);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i6, i13, i8), 180.0f, -90.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i9, i2, i4), 90.0f, -180.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i6, i13, lerp), 90.0f, 90.0f);
                    CameraScanActivity.this.path.close();
                    canvas.drawPath(CameraScanActivity.this.path, CameraScanActivity.this.cornerPaint);
                    CameraScanActivity.this.path.reset();
                    CameraScanActivity.this.path.arcTo(aroundPoint(i3, i12, i4), 180.0f, 180.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i10, i13, i8), 0.0f, 90.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i11, i2, i4), 90.0f, 180.0f);
                    CameraScanActivity.this.path.arcTo(aroundPoint(i10, i13, lerp), 90.0f, -90.0f);
                    CameraScanActivity.this.path.close();
                    canvas.drawPath(CameraScanActivity.this.path, CameraScanActivity.this.cornerPaint);
                    return drawChild;
                }
                return drawChild;
            }

            private RectF aroundPoint(int i, int i2, int i3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
                return rectF;
            }
        };
        viewGroup.setOnTouchListener(CameraScanActivity$$ExternalSyntheticLambda4.INSTANCE);
        this.fragmentView = viewGroup;
        if (isQr()) {
            this.fragmentView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    CameraScanActivity.this.initCameraView();
                }
            }, 450L);
        } else {
            initCameraView();
        }
        if (this.currentType == 0) {
            this.actionBar.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.fragmentView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.setItemsColor(-1, false);
            this.actionBar.setItemsBackgroundColor(587202559, false);
            viewGroup.setBackgroundColor(Theme.getColor("wallet_blackBackground"));
            viewGroup.addView(this.actionBar);
        }
        int i = this.currentType;
        if (i == 2 || i == 3) {
            this.actionBar.setTitle(LocaleController.getString("AuthAnotherClientScan", C1072R.string.AuthAnotherClientScan));
        }
        final Paint paint = new Paint(1);
        paint.setPathEffect(LinkPath.getRoundedEffect());
        paint.setColor(ColorUtils.setAlphaComponent(-1, 40));
        TextView textView = new TextView(this, context) {
            LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector(this);
            private LinkSpanDrawable<URLSpanNoUnderline> pressedLink;
            LinkPath textPath;

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
                    if (uRLSpanNoUnderlineArr == null || uRLSpanNoUnderlineArr.length <= 0) {
                        return;
                    }
                    LinkPath linkPath = new LinkPath(true);
                    this.textPath = linkPath;
                    linkPath.setAllowReset(false);
                    for (int i4 = 0; i4 < uRLSpanNoUnderlineArr.length; i4++) {
                        int spanStart = spanned.getSpanStart(uRLSpanNoUnderlineArr[i4]);
                        int spanEnd = spanned.getSpanEnd(uRLSpanNoUnderlineArr[i4]);
                        this.textPath.setCurrentLayout(getLayout(), spanStart, 0.0f);
                        int i5 = getText() != null ? getPaint().baselineShift : 0;
                        this.textPath.setBaselineShift(i5 != 0 ? i5 + AndroidUtilities.m35dp(i5 > 0 ? 5.0f : -2.0f) : 0);
                        getLayout().getSelectionPath(spanStart, spanEnd, this.textPath);
                    }
                    this.textPath.setAllowReset(true);
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                Layout layout = getLayout();
                float f = 0;
                int x = (int) (motionEvent.getX() - f);
                int y = (int) (motionEvent.getY() - f);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y);
                    float f2 = x;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f2 && lineLeft + layout.getLineWidth(lineForVertical) >= f2 && y >= 0 && y <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            this.links.clear();
                            if (motionEvent.getAction() == 0) {
                                LinkSpanDrawable<URLSpanNoUnderline> linkSpanDrawable = new LinkSpanDrawable<>(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY());
                                this.pressedLink = linkSpanDrawable;
                                linkSpanDrawable.setColor(771751935);
                                this.links.addLink(this.pressedLink);
                                int spanStart = spannable.getSpanStart(this.pressedLink.getSpan());
                                int spanEnd = spannable.getSpanEnd(this.pressedLink.getSpan());
                                LinkPath obtainNewPath = this.pressedLink.obtainNewPath();
                                obtainNewPath.setCurrentLayout(layout, spanStart, f);
                                layout.getSelectionPath(spanStart, spanEnd, obtainNewPath);
                            } else if (motionEvent.getAction() == 1) {
                                LinkSpanDrawable<URLSpanNoUnderline> linkSpanDrawable2 = this.pressedLink;
                                if (linkSpanDrawable2 != null && linkSpanDrawable2.getSpan() == clickableSpanArr[0]) {
                                    clickableSpanArr[0].onClick(this);
                                }
                                this.pressedLink = null;
                            }
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.links.clear();
                    this.pressedLink = null;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                LinkPath linkPath = this.textPath;
                if (linkPath != null) {
                    canvas.drawPath(linkPath, paint);
                }
                if (this.links.draw(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
            }
        };
        this.titleTextView = textView;
        textView.setGravity(1);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.descriptionText = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
        this.descriptionText.setGravity(1);
        this.descriptionText.setTextSize(1, 16.0f);
        viewGroup.addView(this.descriptionText);
        TextView textView3 = new TextView(context);
        this.recognizedMrzView = textView3;
        textView3.setTextColor(-1);
        this.recognizedMrzView.setGravity(81);
        this.recognizedMrzView.setAlpha(0.0f);
        int i2 = this.currentType;
        if (i2 == 0) {
            this.titleTextView.setText(LocaleController.getString("PassportScanPassport", C1072R.string.PassportScanPassport));
            this.descriptionText.setText(LocaleController.getString("PassportScanPassportInfo", C1072R.string.PassportScanPassportInfo));
            this.titleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.recognizedMrzView.setTypeface(Typeface.MONOSPACE);
        } else {
            if (!this.needGalleryButton) {
                if (i2 == 1 || i2 == 3) {
                    this.titleTextView.setText(LocaleController.getString("AuthAnotherClientScan", C1072R.string.AuthAnotherClientScan));
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("AuthAnotherClientInfo5", C1072R.string.AuthAnotherClientInfo5));
                    String[] strArr = {LocaleController.getString("AuthAnotherClientDownloadClientUrl", C1072R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString("AuthAnotherWebClientUrl", C1072R.string.AuthAnotherWebClientUrl)};
                    int i3 = 0;
                    for (int i4 = 2; i3 < i4; i4 = 2) {
                        String spannableStringBuilder2 = spannableStringBuilder.toString();
                        int indexOf = spannableStringBuilder2.indexOf(42);
                        int i5 = indexOf + 1;
                        int indexOf2 = spannableStringBuilder2.indexOf(42, i5);
                        if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                            break;
                        }
                        this.titleTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        int i6 = indexOf2 + 1;
                        spannableStringBuilder.replace(indexOf2, i6, (CharSequence) " ");
                        spannableStringBuilder.replace(indexOf, i5, (CharSequence) " ");
                        int i7 = i6 - 1;
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(strArr[i3], true), i5, i7, 33);
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM)), i5, i7, 33);
                        i3++;
                    }
                    this.titleTextView.setLinkTextColor(-1);
                    this.titleTextView.setTextSize(1, 16.0f);
                    this.titleTextView.setLineSpacing(AndroidUtilities.m35dp(2.0f), 1.0f);
                    this.titleTextView.setPadding(0, 0, 0, 0);
                    this.titleTextView.setText(spannableStringBuilder);
                }
            }
            this.titleTextView.setTextColor(-1);
            if (this.currentType == 3) {
                this.descriptionText.setTextColor(-1711276033);
            }
            this.recognizedMrzView.setTextSize(1, 16.0f);
            this.recognizedMrzView.setPadding(AndroidUtilities.m35dp(10.0f), 0, AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(10.0f));
            if (!this.needGalleryButton) {
                this.recognizedMrzView.setText(LocaleController.getString("AuthAnotherClientNotFound", C1072R.string.AuthAnotherClientNotFound));
            }
            viewGroup.addView(this.recognizedMrzView);
            if (this.needGalleryButton) {
                ImageView imageView = new ImageView(context);
                this.galleryButton = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.galleryButton.setImageResource(C1072R.C1073drawable.qr_gallery);
                this.galleryButton.setBackgroundDrawable(Theme.createSelectorDrawableFromDrawables(Theme.createCircleDrawable(AndroidUtilities.m35dp(60.0f), 587202559), Theme.createCircleDrawable(AndroidUtilities.m35dp(60.0f), 1157627903)));
                viewGroup.addView(this.galleryButton);
                this.galleryButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        CameraScanActivity.this.lambda$createView$2(view);
                    }
                });
            }
            ImageView imageView2 = new ImageView(context);
            this.flashButton = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            this.flashButton.setImageResource(C1072R.C1073drawable.qr_flashlight);
            this.flashButton.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.m35dp(60.0f), 587202559));
            viewGroup.addView(this.flashButton);
            this.flashButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CameraScanActivity.this.lambda$createView$4(view);
                }
            });
        }
        if (getParentActivity() != null) {
            getParentActivity().setRequestedOrientation(1);
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public void lambda$createView$2(View view) {
        if (getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            return;
        }
        PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(PhotoAlbumPickerActivity.SELECT_TYPE_QR, false, false, null);
        photoAlbumPickerActivity.setMaxSelectedPhotos(1, false);
        photoAlbumPickerActivity.setAllowSearchImages(false);
        photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
            {
                CameraScanActivity.this = this;
            }

            @Override
            public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i) {
                try {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = arrayList.get(0);
                    if (sendingMediaInfo.path != null) {
                        Point realScreenSize = AndroidUtilities.getRealScreenSize();
                        QrResult tryReadQr = CameraScanActivity.this.tryReadQr(null, null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                        if (tryReadQr != null) {
                            if (CameraScanActivity.this.delegate != null) {
                                CameraScanActivity.this.delegate.didFindQr(tryReadQr.text);
                            }
                            CameraScanActivity.this.removeSelfFromStack();
                        }
                    }
                } catch (Throwable th) {
                    FileLog.m31e(th);
                }
            }

            @Override
            public void startPhotoSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    CameraScanActivity.this.getParentActivity().startActivityForResult(intent, 11);
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
        });
        presentFragment(photoAlbumPickerActivity);
    }

    public void lambda$createView$4(View view) {
        CameraSession cameraSession;
        CameraView cameraView = this.cameraView;
        if (cameraView == null || (cameraSession = cameraView.getCameraSession()) == null) {
            return;
        }
        ShapeDrawable shapeDrawable = (ShapeDrawable) this.flashButton.getBackground();
        AnimatorSet animatorSet = this.flashAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.flashAnimator = null;
        }
        this.flashAnimator = new AnimatorSet();
        Property<ShapeDrawable, Integer> property = AnimationProperties.SHAPE_DRAWABLE_ALPHA;
        int[] iArr = new int[1];
        iArr[0] = this.flashButton.getTag() == null ? 68 : 34;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, property, iArr);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CameraScanActivity.this.lambda$createView$3(valueAnimator);
            }
        });
        this.flashAnimator.playTogether(ofInt);
        this.flashAnimator.setDuration(200L);
        this.flashAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.flashAnimator.addListener(new AnimatorListenerAdapter() {
            {
                CameraScanActivity.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                CameraScanActivity.this.flashAnimator = null;
            }
        });
        this.flashAnimator.start();
        if (this.flashButton.getTag() == null) {
            this.flashButton.setTag(1);
            cameraSession.setTorchEnabled(true);
            return;
        }
        this.flashButton.setTag(null);
        cameraSession.setTorchEnabled(false);
    }

    public void lambda$createView$3(ValueAnimator valueAnimator) {
        this.flashButton.invalidate();
    }

    public void updateRecognized() {
        float f = this.recognizedT;
        float f2 = this.recognized ? 1.0f : 0.0f;
        this.newRecognizedT = f2;
        if (f != f2) {
            ValueAnimator valueAnimator = this.recognizedAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.recognizedT, this.newRecognizedT);
            this.recognizedAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CameraScanActivity.this.lambda$updateRecognized$5(valueAnimator2);
                }
            });
            this.recognizedAnimator.setDuration(Math.abs(this.recognizedT - this.newRecognizedT) * 300.0f);
            this.recognizedAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.recognizedAnimator.start();
            SpringAnimation springAnimation = this.useRecognizedBoundsAnimator;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder((this.recognized ? this.useRecognizedBounds : 1.0f - this.useRecognizedBounds) * 500.0f));
            this.useRecognizedBoundsAnimator = springAnimation2;
            springAnimation2.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f3, float f4) {
                    CameraScanActivity.this.lambda$updateRecognized$6(dynamicAnimation, f3, f4);
                }
            });
            this.useRecognizedBoundsAnimator.setSpring(new SpringForce(500.0f));
            this.useRecognizedBoundsAnimator.getSpring().setDampingRatio(1.0f);
            this.useRecognizedBoundsAnimator.getSpring().setStiffness(500.0f);
            this.useRecognizedBoundsAnimator.start();
        }
    }

    public void lambda$updateRecognized$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.recognizedT = floatValue;
        this.titleTextView.setAlpha(1.0f - floatValue);
        if (this.currentType == 3) {
            this.descriptionText.setAlpha(1.0f - this.recognizedT);
        }
        this.flashButton.setAlpha(1.0f - this.recognizedT);
        this.backShadowAlpha = (this.recognizedT * 0.25f) + 0.5f;
        this.fragmentView.invalidate();
    }

    public void lambda$updateRecognized$6(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.useRecognizedBounds = this.recognized ? f / 500.0f : 1.0f - (f / 500.0f);
        this.fragmentView.invalidate();
    }

    public void initCameraView() {
        TextView textView;
        if (this.fragmentView == null) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.cameraView = cameraView;
        cameraView.setUseMaxPreview(true);
        this.cameraView.setOptimizeForBarcode(true);
        this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
            @Override
            public final void onCameraInit() {
                CameraScanActivity.this.lambda$initCameraView$9();
            }
        });
        ((ViewGroup) this.fragmentView).addView(this.cameraView, 0, LayoutHelper.createFrame(-1, -1.0f));
        if (this.currentType != 0 || (textView = this.recognizedMrzView) == null) {
            return;
        }
        this.cameraView.addView(textView);
    }

    public void lambda$initCameraView$9() {
        startRecognizing();
        if (isQr()) {
            SpringAnimation springAnimation = this.qrAppearing;
            if (springAnimation != null) {
                springAnimation.cancel();
                this.qrAppearing = null;
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(0.0f));
            this.qrAppearing = springAnimation2;
            springAnimation2.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    CameraScanActivity.this.lambda$initCameraView$7(dynamicAnimation, f, f2);
                }
            });
            this.qrAppearing.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    CameraScanActivity.this.lambda$initCameraView$8(dynamicAnimation, z, f, f2);
                }
            });
            this.qrAppearing.setSpring(new SpringForce(500.0f));
            this.qrAppearing.getSpring().setDampingRatio(0.8f);
            this.qrAppearing.getSpring().setStiffness(250.0f);
            this.qrAppearing.start();
        }
    }

    public void lambda$initCameraView$7(DynamicAnimation dynamicAnimation, float f, float f2) {
        this.qrAppearingValue = f / 500.0f;
        this.fragmentView.invalidate();
    }

    public void lambda$initCameraView$8(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        SpringAnimation springAnimation = this.qrAppearing;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.qrAppearing = null;
        }
    }

    private void updateRecognizedBounds(RectF rectF) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastBoundsUpdate;
        if (j == 0) {
            this.lastBoundsUpdate = elapsedRealtime - 75;
            this.bounds.set(rectF);
            this.fromBounds.set(rectF);
        } else {
            RectF rectF2 = this.fromBounds;
            if (rectF2 != null && elapsedRealtime - j < 75) {
                float min = Math.min(1.0f, Math.max(0.0f, ((float) (elapsedRealtime - j)) / 75.0f));
                RectF rectF3 = this.fromBounds;
                AndroidUtilities.lerp(rectF3, this.bounds, min, rectF3);
            } else {
                if (rectF2 == null) {
                    this.fromBounds = new RectF();
                }
                this.fromBounds.set(this.bounds);
            }
            this.bounds.set(rectF);
            this.lastBoundsUpdate = elapsedRealtime;
        }
        this.fragmentView.invalidate();
    }

    private RectF getRecognizedBounds() {
        if (this.fromBounds == null) {
            return this.bounds;
        }
        float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - this.lastBoundsUpdate)) / 75.0f));
        if (min < 1.0f) {
            this.fragmentView.invalidate();
        }
        RectF rectF = this.fromBounds;
        RectF rectF2 = this.bounds;
        RectF rectF3 = AndroidUtilities.rectTmp;
        AndroidUtilities.lerp(rectF, rectF2, min, rectF3);
        return rectF3;
    }

    public void updateNormalBounds() {
        int max;
        if (this.normalBounds == null) {
            this.normalBounds = new RectF();
        }
        int max2 = Math.max(AndroidUtilities.displaySize.x, this.fragmentView.getWidth());
        int min = (int) (Math.min(max2, max) / 1.5f);
        float f = max2;
        float max3 = Math.max(AndroidUtilities.displaySize.y, this.fragmentView.getHeight());
        this.normalBounds.set(((max2 - min) / 2.0f) / f, ((max - min) / 2.0f) / max3, ((max2 + min) / 2.0f) / f, ((max + min) / 2.0f) / max3);
    }

    public RectF getBounds() {
        RectF recognizedBounds = getRecognizedBounds();
        if (this.useRecognizedBounds < 1.0f) {
            if (this.normalBounds == null) {
                updateNormalBounds();
            }
            AndroidUtilities.lerp(this.normalBounds, recognizedBounds, this.useRecognizedBounds, recognizedBounds);
        }
        return recognizedBounds;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            QrResult tryReadQr = tryReadQr(null, null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (tryReadQr != null) {
                CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
                if (cameraScanActivityDelegate != null) {
                    cameraScanActivityDelegate.didFindQr(tryReadQr.text);
                }
                finishFragment();
            }
        } catch (Throwable th) {
            FileLog.m31e(th);
        }
    }

    public void setDelegate(CameraScanActivityDelegate cameraScanActivityDelegate) {
        this.delegate = cameraScanActivityDelegate;
    }

    public void destroy(boolean z, Runnable runnable) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.destroy(z, runnable);
            this.cameraView = null;
        }
        this.backgroundHandlerThread.quitSafely();
    }

    public class RunnableC13667 implements Runnable {
        RunnableC13667() {
            CameraScanActivity.this = r1;
        }

        @Override
        public void run() {
            if (CameraScanActivity.this.cameraView == null || CameraScanActivity.this.recognized || CameraScanActivity.this.cameraView.getCameraSession() == null) {
                return;
            }
            CameraScanActivity.this.handler.post(new Runnable() {
                @Override
                public final void run() {
                    CameraScanActivity.RunnableC13667.this.lambda$run$0();
                }
            });
        }

        public void lambda$run$0() {
            try {
                CameraScanActivity.this.cameraView.focusToPoint(CameraScanActivity.this.cameraView.getWidth() / 2, CameraScanActivity.this.cameraView.getHeight() / 2, false);
            } catch (Exception unused) {
            }
            if (CameraScanActivity.this.cameraView != null) {
                CameraScanActivity cameraScanActivity = CameraScanActivity.this;
                cameraScanActivity.processShot(cameraScanActivity.cameraView.getTextureView().getBitmap());
            }
        }
    }

    private void startRecognizing() {
        this.backgroundHandlerThread.start();
        this.handler = new Handler(this.backgroundHandlerThread.getLooper());
        AndroidUtilities.runOnUIThread(this.requestShot, 0L);
    }

    private void onNoQrFound() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraScanActivity.this.lambda$onNoQrFound$10();
            }
        });
    }

    public void lambda$onNoQrFound$10() {
        if (this.recognizedMrzView.getTag() != null) {
            this.recognizedMrzView.setTag(null);
            this.recognizedMrzView.animate().setDuration(200L).alpha(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }

    public void processShot(Bitmap bitmap) {
        if (this.cameraView == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.cameraView.getPreviewSize();
            if (this.currentType == 0) {
                final MrzRecognizer.Result recognize = MrzRecognizer.recognize(bitmap, false);
                if (recognize != null && !TextUtils.isEmpty(recognize.firstName) && !TextUtils.isEmpty(recognize.lastName) && !TextUtils.isEmpty(recognize.number) && recognize.birthDay != 0 && ((recognize.expiryDay != 0 || recognize.doesNotExpire) && recognize.gender != 0)) {
                    this.recognized = true;
                    CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CameraScanActivity.this.lambda$processShot$11(recognize);
                        }
                    });
                    return;
                }
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                final QrResult tryReadQr = tryReadQr(null, previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                boolean z = this.recognized;
                if (z) {
                    this.recognizeIndex++;
                }
                if (tryReadQr != null) {
                    this.recognizeFailed = 0;
                    String str = tryReadQr.text;
                    this.recognizedText = str;
                    if (!z) {
                        this.recognized = true;
                        this.qrLoading = this.delegate.processQr(str, new Runnable() {
                            @Override
                            public final void run() {
                                CameraScanActivity.this.lambda$processShot$13();
                            }
                        });
                        this.recognizedStart = SystemClock.elapsedRealtime();
                        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda15(this));
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CameraScanActivity.this.lambda$processShot$14(tryReadQr);
                        }
                    });
                } else if (z) {
                    int i = this.recognizeFailed + 1;
                    this.recognizeFailed = i;
                    if (i > 4 && !this.qrLoading) {
                        this.recognized = false;
                        this.recognizeIndex = 0;
                        this.recognizedText = null;
                        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda15(this));
                        AndroidUtilities.runOnUIThread(this.requestShot, 500L);
                        return;
                    }
                }
                if (((this.recognizeIndex == 0 && tryReadQr != null && tryReadQr.bounds == null && !this.qrLoading) || (SystemClock.elapsedRealtime() - this.recognizedStart > 1000 && !this.qrLoading)) && this.recognizedText != null) {
                    CameraView cameraView = this.cameraView;
                    if (cameraView != null && cameraView.getCameraSession() != null && this.currentType != 3) {
                        CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
                    }
                    final String str2 = this.recognizedText;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CameraScanActivity.this.lambda$processShot$15(str2);
                        }
                    });
                    if (this.currentType == 3) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                CameraScanActivity.this.lambda$processShot$16();
                            }
                        });
                    }
                } else if (this.recognized) {
                    this.handler.postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            CameraScanActivity.this.lambda$processShot$17();
                        }
                    }, Math.max(16L, (1000 / this.sps) - this.averageProcessTime));
                }
            }
        } catch (Throwable unused) {
            onNoQrFound();
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f = this.averageProcessTime;
        long j = this.processTimesCount;
        long j2 = j + 1;
        this.processTimesCount = j2;
        this.averageProcessTime = ((f * ((float) j)) + ((float) elapsedRealtime2)) / ((float) j2);
        this.processTimesCount = Math.max(j2, 30L);
        if (this.recognized) {
            return;
        }
        AndroidUtilities.runOnUIThread(this.requestShot, 500L);
    }

    public void lambda$processShot$11(MrzRecognizer.Result result) {
        this.recognizedMrzView.setText(result.rawMRZ);
        this.recognizedMrzView.animate().setDuration(200L).alpha(1.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindMrzInfo(result);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraScanActivity.this.finishFragment();
            }
        }, 1200L);
    }

    public void lambda$processShot$13() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null && cameraView.getCameraSession() != null) {
            CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CameraScanActivity.this.lambda$processShot$12();
            }
        });
    }

    public void lambda$processShot$12() {
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindQr(this.recognizedText);
        }
        finishFragment();
    }

    public void lambda$processShot$14(QrResult qrResult) {
        updateRecognizedBounds(qrResult.bounds);
    }

    public void lambda$processShot$15(String str) {
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindQr(str);
        }
        if (this.currentType != 3) {
            finishFragment();
        }
    }

    public void lambda$processShot$16() {
        if (isFinishing()) {
            return;
        }
        this.recognizedText = null;
        this.recognized = false;
        this.requestShot.run();
        if (this.recognized) {
            return;
        }
        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda15(this), 500L);
    }

    public void lambda$processShot$17() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            processShot(cameraView.getTextureView().getBitmap());
        }
    }

    private Bitmap invert(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private Bitmap monochrome(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(createThresholdMatrix(i)));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static ColorMatrix createThresholdMatrix(int i) {
        float f = i * (-255.0f);
        return new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public class QrResult {
        RectF bounds;
        String text;

        private QrResult(CameraScanActivity cameraScanActivity) {
        }

        QrResult(CameraScanActivity cameraScanActivity, DialogC13591 dialogC13591) {
            this(cameraScanActivity);
        }
    }

    public QrResult tryReadQr(byte[] bArr, Size size, int i, int i2, int i3, Bitmap bitmap) {
        String str;
        int i4;
        LuminanceSource planarYUVLuminanceSource;
        Frame build;
        int i5;
        String str2;
        try {
            RectF rectF = new RectF();
            BarcodeDetector barcodeDetector = this.visionQrReader;
            int i6 = 1;
            int i7 = 0;
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            if (barcodeDetector != null && barcodeDetector.isOperational()) {
                if (bitmap != null) {
                    build = new Frame.Builder().setBitmap(bitmap).build();
                    i6 = bitmap.getWidth();
                    i4 = bitmap.getHeight();
                } else {
                    build = new Frame.Builder().setImageData(ByteBuffer.wrap(bArr), size.getWidth(), size.getHeight(), 17).build();
                    i6 = size.getWidth();
                    i4 = size.getWidth();
                }
                SparseArray<Barcode> detect = this.visionQrReader.detect(build);
                if (detect != null && detect.size() > 0) {
                    Barcode valueAt = detect.valueAt(0);
                    str = valueAt.rawValue;
                    Point[] pointArr = valueAt.cornerPoints;
                    if (pointArr != null && pointArr.length != 0) {
                        int length = pointArr.length;
                        float f3 = Float.MIN_VALUE;
                        float f4 = Float.MAX_VALUE;
                        while (i7 < length) {
                            Point point = pointArr[i7];
                            f2 = Math.min(f2, point.x);
                            f = Math.max(f, point.x);
                            f4 = Math.min(f4, point.y);
                            f3 = Math.max(f3, point.y);
                            i7++;
                        }
                        rectF.set(f2, f4, f, f3);
                    }
                    rectF = null;
                } else if (bitmap != null) {
                    Bitmap invert = invert(bitmap);
                    bitmap.recycle();
                    Frame build2 = new Frame.Builder().setBitmap(invert).build();
                    int width = invert.getWidth();
                    int height = invert.getHeight();
                    SparseArray<Barcode> detect2 = this.visionQrReader.detect(build2);
                    if (detect2 != null && detect2.size() > 0) {
                        Barcode valueAt2 = detect2.valueAt(0);
                        str2 = valueAt2.rawValue;
                        Point[] pointArr2 = valueAt2.cornerPoints;
                        if (pointArr2 != null && pointArr2.length != 0) {
                            int length2 = pointArr2.length;
                            float f5 = Float.MIN_VALUE;
                            float f6 = Float.MAX_VALUE;
                            while (i7 < length2) {
                                Point point2 = pointArr2[i7];
                                f2 = Math.min(f2, point2.x);
                                f = Math.max(f, point2.x);
                                f6 = Math.min(f6, point2.y);
                                f5 = Math.max(f5, point2.y);
                                i7++;
                            }
                            rectF.set(f2, f6, f, f5);
                            i5 = height;
                            str = str2;
                            i6 = width;
                            i4 = i5;
                        }
                        rectF = null;
                        i5 = height;
                        str = str2;
                        i6 = width;
                        i4 = i5;
                    } else {
                        Bitmap monochrome = monochrome(invert, 90);
                        invert.recycle();
                        Frame build3 = new Frame.Builder().setBitmap(monochrome).build();
                        width = invert.getWidth();
                        height = invert.getHeight();
                        SparseArray<Barcode> detect3 = this.visionQrReader.detect(build3);
                        if (detect3 == null || detect3.size() <= 0) {
                            i5 = height;
                            str = null;
                            i6 = width;
                            i4 = i5;
                        } else {
                            Barcode valueAt3 = detect3.valueAt(0);
                            str2 = valueAt3.rawValue;
                            Point[] pointArr3 = valueAt3.cornerPoints;
                            if (pointArr3 != null && pointArr3.length != 0) {
                                int length3 = pointArr3.length;
                                float f7 = Float.MIN_VALUE;
                                float f8 = Float.MAX_VALUE;
                                while (i7 < length3) {
                                    Point point3 = pointArr3[i7];
                                    f2 = Math.min(f2, point3.x);
                                    f = Math.max(f, point3.x);
                                    f8 = Math.min(f8, point3.y);
                                    f7 = Math.max(f7, point3.y);
                                    i7++;
                                }
                                rectF.set(f2, f8, f, f7);
                                i5 = height;
                                str = str2;
                                i6 = width;
                                i4 = i5;
                            }
                            rectF = null;
                            i5 = height;
                            str = str2;
                            i6 = width;
                            i4 = i5;
                        }
                    }
                } else {
                    str = null;
                }
            } else if (this.qrReader != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    planarYUVLuminanceSource = new RGBLuminanceSource(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    i6 = bitmap.getWidth();
                    i4 = bitmap.getWidth();
                } else {
                    planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr, size.getWidth(), size.getHeight(), i, i2, i3, i3, false);
                    i6 = size.getWidth();
                    i4 = size.getHeight();
                }
                Result decode = this.qrReader.decode(new BinaryBitmap(new GlobalHistogramBinarizer(planarYUVLuminanceSource)));
                if (decode == null) {
                    onNoQrFound();
                    return null;
                }
                str = decode.getText();
                if (decode.getResultPoints() != null && decode.getResultPoints().length != 0) {
                    ResultPoint[] resultPoints = decode.getResultPoints();
                    int length4 = resultPoints.length;
                    float f9 = Float.MIN_VALUE;
                    float f10 = Float.MAX_VALUE;
                    while (i7 < length4) {
                        ResultPoint resultPoint = resultPoints[i7];
                        f2 = Math.min(f2, resultPoint.getX());
                        f = Math.max(f, resultPoint.getX());
                        f10 = Math.min(f10, resultPoint.getY());
                        f9 = Math.max(f9, resultPoint.getY());
                        i7++;
                    }
                    rectF.set(f2, f10, f, f9);
                }
                rectF = null;
            } else {
                str = null;
                i4 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                onNoQrFound();
                return null;
            }
            if (this.needGalleryButton) {
                Uri.parse(str).getPath().replace("/", "");
            } else if (!str.startsWith("tg://login?token=") && this.currentType != 3) {
                onNoQrFound();
                return null;
            }
            QrResult qrResult = new QrResult(this, null);
            if (rectF != null) {
                float m35dp = AndroidUtilities.m35dp(25.0f);
                float m35dp2 = AndroidUtilities.m35dp(15.0f);
                rectF.set(rectF.left - m35dp, rectF.top - m35dp2, rectF.right + m35dp, rectF.bottom + m35dp2);
                float f11 = i6;
                float f12 = i4;
                rectF.set(rectF.left / f11, rectF.top / f12, rectF.right / f11, rectF.bottom / f12);
            }
            qrResult.bounds = rectF;
            qrResult.text = str;
            return qrResult;
        } catch (Throwable unused) {
            onNoQrFound();
            return null;
        }
    }

    public boolean isQr() {
        int i = this.currentType;
        return i == 1 || i == 2 || i == 3;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        if (isQr()) {
            return arrayList;
        }
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarWhiteSelector"));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.descriptionText, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText6"));
        return arrayList;
    }
}
