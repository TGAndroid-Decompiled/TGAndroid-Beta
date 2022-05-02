package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
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
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
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
import org.telegram.p009ui.ActionBar.ActionBarLayout;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
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

@TargetApi(C0952R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)
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
    private float useRecognizedBounds = 0.0f;
    private Runnable requestShot = new RunnableC12137();
    private float averageProcessTime = 0.0f;
    private long processTimesCount = 0;

    public interface CameraScanActivityDelegate {

        public final class CC {
            public static void $default$didFindMrzInfo(CameraScanActivityDelegate cameraScanActivityDelegate, MrzRecognizer.Result result) {
            }

            public static void $default$didFindQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str) {
            }

            public static boolean $default$processQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str, Runnable runnable) {
                return false;
            }
        }

        void didFindMrzInfo(MrzRecognizer.Result result);

        void didFindQr(String str);

        boolean processQr(String str, Runnable runnable);
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public static ActionBarLayout[] showAsSheet(BaseFragment baseFragment, boolean z, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return null;
        }
        ActionBarLayout[] actionBarLayoutArr = {new ActionBarLayout(baseFragment.getParentActivity())};
        DialogC12061 r9 = new DialogC12061(baseFragment.getParentActivity(), false, actionBarLayoutArr, i, z, cameraScanActivityDelegate);
        r9.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar(r9.getWindow(), false);
        AndroidUtilities.setNavigationBarColor(r9.getWindow(), -16777216, false);
        r9.setUseLightStatusBar(false);
        r9.getWindow().addFlags(512);
        r9.show();
        return actionBarLayoutArr;
    }

    public class DialogC12061 extends BottomSheet {
        CameraScanActivity fragment;
        final ActionBarLayout[] val$actionBarLayout;
        final CameraScanActivityDelegate val$cameraDelegate;
        final boolean val$gallery;
        final int val$type;

        @Override
        protected boolean canDismissWithSwipe() {
            return false;
        }

        DialogC12061(Context context, boolean z, ActionBarLayout[] actionBarLayoutArr, int i, boolean z2, CameraScanActivityDelegate cameraScanActivityDelegate) {
            super(context, z);
            this.val$actionBarLayout = actionBarLayoutArr;
            this.val$type = i;
            this.val$gallery = z2;
            this.val$cameraDelegate = cameraScanActivityDelegate;
            actionBarLayoutArr[0].init(new ArrayList<>());
            CameraScanActivity cameraScanActivity = new CameraScanActivity(i) {
                @Override
                public void finishFragment() {
                    DialogC12061.this.dismiss();
                }

                @Override
                public void removeSelfFromStack() {
                    DialogC12061.this.dismiss();
                }
            };
            this.fragment = cameraScanActivity;
            cameraScanActivity.shownAsBottomSheet = true;
            cameraScanActivity.needGalleryButton = z2;
            actionBarLayoutArr[0].addFragmentToStack(this.fragment);
            actionBarLayoutArr[0].showLastFragment();
            ActionBarLayout actionBarLayout = actionBarLayoutArr[0];
            int i2 = this.backgroundPaddingLeft;
            actionBarLayout.setPadding(i2, 0, i2, 0);
            this.fragment.setDelegate(cameraScanActivityDelegate);
            this.containerView = actionBarLayoutArr[0];
            setApplyBottomPadding(false);
            setApplyBottomPadding(false);
            setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    CameraScanActivity.DialogC12061.this.lambda$new$0(dialogInterface);
                }
            });
        }

        public void lambda$new$0(DialogInterface dialogInterface) {
            this.fragment.onFragmentDestroy();
        }

        @Override
        public void onBackPressed() {
            ActionBarLayout[] actionBarLayoutArr = this.val$actionBarLayout;
            if (actionBarLayoutArr[0] == null || actionBarLayoutArr[0].fragmentsStack.size() <= 1) {
                super.onBackPressed();
            } else {
                this.val$actionBarLayout[0].onBackPressed();
            }
        }

        @Override
        public void dismiss() {
            super.dismiss();
            this.val$actionBarLayout[0] = null;
        }
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
        } else if (devicePerformanceClass != 1) {
            this.sps = 40;
        } else {
            this.sps = 24;
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
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
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
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
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
            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                ((BaseFragment) CameraScanActivity.this).actionBar.measure(i, i2);
                if (CameraScanActivity.this.currentType != 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    CameraScanActivity.this.recognizedMrzView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    if (CameraScanActivity.this.galleryButton != null) {
                        CameraScanActivity.this.galleryButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(60.0f), 1073741824));
                    }
                    CameraScanActivity.this.flashButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(60.0f), 1073741824));
                } else if (CameraScanActivity.this.cameraView != null) {
                    CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                }
                CameraScanActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m34dp(72.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                CameraScanActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                setMeasuredDimension(size, size2);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5;
                int i6;
                int i7;
                int i8 = i3 - i;
                int i9 = i4 - i2;
                if (CameraScanActivity.this.currentType == 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight() + 0);
                    }
                    CameraScanActivity.this.recognizedMrzView.setTextSize(0, i9 / 22);
                    CameraScanActivity.this.recognizedMrzView.setPadding(0, 0, 0, i9 / 15);
                    int i10 = (int) (i9 * 0.65f);
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.m34dp(36.0f), i10, AndroidUtilities.m34dp(36.0f) + CameraScanActivity.this.titleTextView.getMeasuredWidth(), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i10);
                } else {
                    ((BaseFragment) CameraScanActivity.this).actionBar.layout(0, 0, ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredHeight());
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i8, i9) / 1.5f);
                    if (CameraScanActivity.this.currentType == 1) {
                        i6 = ((i9 - min) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        i5 = AndroidUtilities.m34dp(30.0f);
                    } else {
                        i6 = ((i9 - min) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        i5 = AndroidUtilities.m34dp(64.0f);
                    }
                    int i11 = i6 - i5;
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.m34dp(36.0f), i11, AndroidUtilities.m34dp(36.0f) + CameraScanActivity.this.titleTextView.getMeasuredWidth(), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i11);
                    CameraScanActivity.this.recognizedMrzView.layout(0, getMeasuredHeight() - CameraScanActivity.this.recognizedMrzView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    if (CameraScanActivity.this.needGalleryButton) {
                        i7 = (i8 / 2) + AndroidUtilities.m34dp(35.0f);
                    } else {
                        i7 = (i8 / 2) - (CameraScanActivity.this.flashButton.getMeasuredWidth() / 2);
                    }
                    int dp = ((i9 - min) / 2) + min + AndroidUtilities.m34dp(80.0f);
                    CameraScanActivity.this.flashButton.layout(i7, dp, CameraScanActivity.this.flashButton.getMeasuredWidth() + i7, CameraScanActivity.this.flashButton.getMeasuredHeight() + dp);
                    if (CameraScanActivity.this.galleryButton != null) {
                        int dp2 = ((i8 / 2) - AndroidUtilities.m34dp(35.0f)) - CameraScanActivity.this.galleryButton.getMeasuredWidth();
                        CameraScanActivity.this.galleryButton.layout(dp2, dp, CameraScanActivity.this.galleryButton.getMeasuredWidth() + dp2, CameraScanActivity.this.galleryButton.getMeasuredHeight() + dp);
                    }
                }
                int i12 = (int) (i9 * 0.74f);
                int i13 = (int) (i8 * 0.05f);
                CameraScanActivity.this.descriptionText.layout(i13, i12, CameraScanActivity.this.descriptionText.getMeasuredWidth() + i13, CameraScanActivity.this.descriptionText.getMeasuredHeight() + i12);
                CameraScanActivity.this.updateNormalBounds();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean drawChild = super.drawChild(canvas, view, j);
                if (!CameraScanActivity.this.isQr() || view != CameraScanActivity.this.cameraView) {
                    return drawChild;
                }
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
                int lerp = AndroidUtilities.lerp(0, AndroidUtilities.m34dp(4.0f), Math.min(1.0f, CameraScanActivity.this.qrAppearingValue * 20.0f));
                int i4 = lerp / 2;
                int lerp2 = AndroidUtilities.lerp(Math.min(width, height2), AndroidUtilities.m34dp(20.0f), Math.min(1.2f, (float) Math.pow(CameraScanActivity.this.qrAppearingValue, 1.7999999523162842d)));
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

            private RectF aroundPoint(int i, int i2, int i3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
                return rectF;
            }
        };
        viewGroup.setOnTouchListener(CameraScanActivity$$ExternalSyntheticLambda4.INSTANCE);
        this.fragmentView = viewGroup;
        int i = this.currentType;
        if (i == 1 || i == 2) {
            viewGroup.postDelayed(new Runnable() {
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
        if (this.currentType == 2) {
            this.actionBar.setTitle(LocaleController.getString("AuthAnotherClientScan", C0952R.string.AuthAnotherClientScan));
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
                    if (uRLSpanNoUnderlineArr != null && uRLSpanNoUnderlineArr.length > 0) {
                        LinkPath linkPath = new LinkPath(true);
                        this.textPath = linkPath;
                        linkPath.setAllowReset(false);
                        for (int i4 = 0; i4 < uRLSpanNoUnderlineArr.length; i4++) {
                            int spanStart = spanned.getSpanStart(uRLSpanNoUnderlineArr[i4]);
                            int spanEnd = spanned.getSpanEnd(uRLSpanNoUnderlineArr[i4]);
                            this.textPath.setCurrentLayout(getLayout(), spanStart, 0.0f);
                            int i5 = getText() != null ? getPaint().baselineShift : 0;
                            this.textPath.setBaselineShift(i5 != 0 ? i5 + AndroidUtilities.m34dp(i5 > 0 ? 5.0f : -2.0f) : 0);
                            getLayout().getSelectionPath(spanStart, spanEnd, this.textPath);
                        }
                        this.textPath.setAllowReset(true);
                    }
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
            this.titleTextView.setText(LocaleController.getString("PassportScanPassport", C0952R.string.PassportScanPassport));
            this.descriptionText.setText(LocaleController.getString("PassportScanPassportInfo", C0952R.string.PassportScanPassportInfo));
            this.titleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.recognizedMrzView.setTypeface(Typeface.MONOSPACE);
        } else {
            if (!this.needGalleryButton) {
                if (i2 == 1) {
                    this.titleTextView.setText(LocaleController.getString("AuthAnotherClientScan", C0952R.string.AuthAnotherClientScan));
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("AuthAnotherClientInfo5", C0952R.string.AuthAnotherClientInfo5));
                    String[] strArr = {LocaleController.getString("AuthAnotherClientDownloadClientUrl", C0952R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString("AuthAnotherWebClientUrl", C0952R.string.AuthAnotherWebClientUrl)};
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
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmedium.ttf")), i5, i7, 33);
                        i3++;
                    }
                    this.titleTextView.setLinkTextColor(-1);
                    this.titleTextView.setTextSize(1, 16.0f);
                    this.titleTextView.setLineSpacing(AndroidUtilities.m34dp(2.0f), 1.0f);
                    this.titleTextView.setPadding(0, 0, 0, 0);
                    this.titleTextView.setText(spannableStringBuilder);
                }
            }
            this.titleTextView.setTextColor(-1);
            this.recognizedMrzView.setTextSize(1, 16.0f);
            this.recognizedMrzView.setPadding(AndroidUtilities.m34dp(10.0f), 0, AndroidUtilities.m34dp(10.0f), AndroidUtilities.m34dp(10.0f));
            if (!this.needGalleryButton) {
                this.recognizedMrzView.setText(LocaleController.getString("AuthAnotherClientNotFound", C0952R.string.AuthAnotherClientNotFound));
            }
            viewGroup.addView(this.recognizedMrzView);
            if (this.needGalleryButton) {
                ImageView imageView = new ImageView(context);
                this.galleryButton = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.galleryButton.setImageResource(C0952R.C0953drawable.qr_gallery);
                this.galleryButton.setBackgroundDrawable(Theme.createSelectorDrawableFromDrawables(Theme.createCircleDrawable(AndroidUtilities.m34dp(60.0f), 587202559), Theme.createCircleDrawable(AndroidUtilities.m34dp(60.0f), 1157627903)));
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
            this.flashButton.setImageResource(C0952R.C0953drawable.qr_flashlight);
            this.flashButton.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.m34dp(60.0f), 587202559));
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
        if (getParentActivity() != null) {
            if (Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(PhotoAlbumPickerActivity.SELECT_TYPE_QR, false, false, null);
                photoAlbumPickerActivity.setMaxSelectedPhotos(1, false);
                photoAlbumPickerActivity.setAllowSearchImages(false);
                photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
                    @Override
                    public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i) {
                        try {
                            if (!arrayList.isEmpty()) {
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
                            }
                        } catch (Throwable th) {
                            FileLog.m30e(th);
                        }
                    }

                    @Override
                    public void startPhotoSelectActivity() {
                        try {
                            Intent intent = new Intent("android.intent.action.PICK");
                            intent.setType("image/*");
                            CameraScanActivity.this.getParentActivity().startActivityForResult(intent, 11);
                        } catch (Exception e) {
                            FileLog.m30e(e);
                        }
                    }
                });
                presentFragment(photoAlbumPickerActivity);
                return;
            }
            getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
        }
    }

    public void lambda$createView$4(View view) {
        CameraSession cameraSession;
        CameraView cameraView = this.cameraView;
        if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
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
    }

    public void lambda$createView$3(ValueAnimator valueAnimator) {
        this.flashButton.invalidate();
    }

    public void updateRecognized() {
        ValueAnimator valueAnimator = this.recognizedAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.recognized ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.recognizedT, f);
        this.recognizedAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CameraScanActivity.this.lambda$updateRecognized$5(valueAnimator2);
            }
        });
        this.recognizedAnimator.setDuration(Math.abs(this.recognizedT - f) * 300.0f);
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
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                CameraScanActivity.this.lambda$updateRecognized$6(dynamicAnimation, f2, f3);
            }
        });
        this.useRecognizedBoundsAnimator.setSpring(new SpringForce(500.0f));
        this.useRecognizedBoundsAnimator.getSpring().setDampingRatio(1.0f);
        this.useRecognizedBoundsAnimator.getSpring().setStiffness(500.0f);
        this.useRecognizedBoundsAnimator.start();
    }

    public void lambda$updateRecognized$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.recognizedT = floatValue;
        this.titleTextView.setAlpha(1.0f - floatValue);
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
        if (this.fragmentView != null) {
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
            if (this.currentType == 0 && (textView = this.recognizedMrzView) != null) {
                this.cameraView.addView(textView);
            }
        }
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
            if (rectF2 == null || elapsedRealtime - j >= 75) {
                if (rectF2 == null) {
                    this.fromBounds = new RectF();
                }
                this.fromBounds.set(this.bounds);
            } else {
                float min = Math.min(1.0f, Math.max(0.0f, ((float) (elapsedRealtime - j)) / 75.0f));
                RectF rectF3 = this.fromBounds;
                AndroidUtilities.lerp(rectF3, this.bounds, min, rectF3);
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
        if (i2 == -1 && i == 11 && intent != null && intent.getData() != null) {
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
                FileLog.m30e(th);
            }
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

    public class RunnableC12137 implements Runnable {
        RunnableC12137() {
        }

        @Override
        public void run() {
            if (CameraScanActivity.this.cameraView != null && !CameraScanActivity.this.recognized && CameraScanActivity.this.cameraView.getCameraSession() != null) {
                CameraScanActivity.this.handler.post(new Runnable() {
                    @Override
                    public final void run() {
                        CameraScanActivity.RunnableC12137.this.lambda$run$0();
                    }
                });
            }
        }

        public void lambda$run$0() {
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
        if (this.cameraView != null) {
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
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    CameraScanActivity.this.updateRecognized();
                                }
                            });
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
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    CameraScanActivity.this.updateRecognized();
                                }
                            });
                            AndroidUtilities.runOnUIThread(this.requestShot, 500L);
                            return;
                        }
                    }
                    if (((this.recognizeIndex == 0 && tryReadQr != null && tryReadQr.bounds == null && !this.qrLoading) || (SystemClock.elapsedRealtime() - this.recognizedStart > 1000 && !this.qrLoading)) && this.recognizedText != null) {
                        CameraView cameraView = this.cameraView;
                        if (!(cameraView == null || cameraView.getCameraSession() == null)) {
                            CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                CameraScanActivity.this.lambda$processShot$15();
                            }
                        });
                    } else if (this.recognized) {
                        this.handler.postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                CameraScanActivity.this.lambda$processShot$16();
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
            if (!this.recognized) {
                AndroidUtilities.runOnUIThread(this.requestShot, 500L);
            }
        }
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
        if (!(cameraView == null || cameraView.getCameraSession() == null)) {
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

    public void lambda$processShot$15() {
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindQr(this.recognizedText);
        }
        finishFragment();
    }

    public void lambda$processShot$16() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            processShot(cameraView.getTextureView().getBitmap());
        }
    }

    public class QrResult {
        RectF bounds;
        String text;

        private QrResult(CameraScanActivity cameraScanActivity) {
        }

        QrResult(CameraScanActivity cameraScanActivity, DialogC12061 r2) {
            this(cameraScanActivity);
        }
    }

    public org.telegram.p009ui.CameraScanActivity.QrResult tryReadQr(byte[] r25, org.telegram.messenger.camera.Size r26, int r27, int r28, int r29, android.graphics.Bitmap r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.CameraScanActivity.tryReadQr(byte[], org.telegram.messenger.camera.Size, int, int, int, android.graphics.Bitmap):org.telegram.ui.CameraScanActivity$QrResult");
    }

    public boolean isQr() {
        int i = this.currentType;
        return i == 1 || i == 2;
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
