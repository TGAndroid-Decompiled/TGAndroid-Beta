package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
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
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
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
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.util.StateSet;
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
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.LuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.stripe.android.Stripe;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;

public class CameraScanActivity extends BaseFragment {
    public static final int TYPE_MRZ = 0;
    public static final int TYPE_QR = 1;
    public static final int TYPE_QR_LOGIN = 2;
    public static final int TYPE_QR_WEB_BOT = 3;
    private float averageProcessTime;
    private float backShadowAlpha;
    private HandlerThread backgroundHandlerThread;
    private final RectF bounds;
    private final long boundsUpdateDuration;
    private CameraView cameraView;
    private Paint cornerPaint;
    private int currentType;
    private CameraScanActivityDelegate delegate;
    private TextView descriptionText;
    private AnimatorSet flashAnimator;
    private ImageView flashButton;
    private final RectF fromBounds;
    private final PointF[] fromPoints;
    private ImageView galleryButton;
    private Handler handler;
    private long lastBoundsUpdate;
    private boolean needGalleryButton;
    private float newRecognizedT;
    private RectF normalBounds;
    private Paint paint;
    private Path path;
    private final PointF[] points;
    private long processTimesCount;
    private SpringAnimation qrAppearing;
    private float qrAppearingValue;
    private boolean qrLoaded;
    private boolean qrLoading;
    private QRCodeReader qrReader;
    private int recognizeFailed;
    private int recognizeIndex;
    private boolean recognized;
    private ValueAnimator recognizedAnimator;
    private TextView recognizedMrzView;
    private long recognizedStart;
    private float recognizedT;
    private String recognizedText;
    private final Runnable requestShot;
    protected boolean shownAsBottomSheet;
    private int sps;
    private TextView titleTextView;
    private final PointF[] tmp2Points;
    private final PointF[] tmpPoints;
    private float useRecognizedBounds;
    private SpringAnimation useRecognizedBoundsAnimator;
    private BarcodeDetector visionQrReader;

    public class AnonymousClass1 extends BottomSheet {
        CameraScanActivity fragment;
        final INavigationLayout[] val$actionBarLayout;
        final CameraScanActivityDelegate val$cameraDelegate;
        final boolean val$gallery;
        final int val$type;

        public AnonymousClass1(Context context, boolean z, INavigationLayout[] iNavigationLayoutArr, int i, boolean z2, CameraScanActivityDelegate cameraScanActivityDelegate) {
            super(context, z, false, null);
            this.val$actionBarLayout = iNavigationLayoutArr;
            this.val$type = i;
            this.val$gallery = z2;
            this.val$cameraDelegate = cameraScanActivityDelegate;
            ((ActionBarLayout) iNavigationLayoutArr[0]).setFragmentStack(new ArrayList());
            CameraScanActivity cameraScanActivity = new CameraScanActivity(i) {
                @Override
                public void finishFragment() {
                    setFinishing(true);
                    AnonymousClass1.this.lambda$showGiftOfferSheet$15();
                }

                @Override
                public void removeSelfFromStack() {
                    AnonymousClass1.this.lambda$showGiftOfferSheet$15();
                }
            };
            this.fragment = cameraScanActivity;
            cameraScanActivity.shownAsBottomSheet = true;
            cameraScanActivity.needGalleryButton = z2;
            INavigationLayout iNavigationLayout = iNavigationLayoutArr[0];
            CameraScanActivity cameraScanActivity2 = this.fragment;
            iNavigationLayout.getClass();
            ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, cameraScanActivity2);
            ((ActionBarLayout) iNavigationLayoutArr[0]).showLastFragment();
            ViewGroup view = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
            int i2 = this.backgroundPaddingLeft;
            view.setPadding(i2, 0, i2, 0);
            this.fragment.setDelegate(cameraScanActivityDelegate);
            if (cameraScanActivityDelegate.getSubtitleText() != null) {
                this.fragment.descriptionText.setText(cameraScanActivityDelegate.getSubtitleText());
            }
            this.containerView = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
            setApplyBottomPadding(false);
            setApplyBottomPadding(false);
            setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(this, 2));
        }

        public void lambda$new$0(DialogInterface dialogInterface) {
            this.fragment.onFragmentDestroy();
        }

        @Override
        public boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            this.val$actionBarLayout[0] = null;
            this.val$cameraDelegate.onDismiss();
        }

        @Override
        public void lambda$openCrafting$8() {
            INavigationLayout iNavigationLayout = this.val$actionBarLayout[0];
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1) {
                super.lambda$openCrafting$8();
            } else {
                ((ActionBarLayout) this.val$actionBarLayout[0]).onBackPressed();
            }
        }

        @Override
        public void setLastVisible(boolean z) {
        }
    }

    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
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

        @Override
        public void run() {
            if (CameraScanActivity.this.cameraView == null || CameraScanActivity.this.recognized || CameraScanActivity.this.cameraView.getCameraSession() == null) {
                return;
            }
            CameraScanActivity.this.handler.post(new ChatActivity$21$$ExternalSyntheticLambda4(this, 5));
        }
    }

    public class QrResult {
        RectF bounds;
        PointF[] cornerPoints;
        String text;

        private QrResult() {
        }

        public QrResult(CameraScanActivity cameraScanActivity, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public CameraScanActivity(int i) {
        super(null);
        this.backgroundHandlerThread = new HandlerThread("ScanCamera");
        this.paint = new Paint();
        this.cornerPaint = new Paint(1);
        this.path = new Path();
        this.backShadowAlpha = 0.5f;
        this.shownAsBottomSheet = false;
        this.qrAppearing = null;
        this.qrAppearingValue = 0.0f;
        this.fromPoints = new PointF[4];
        this.points = new PointF[4];
        this.tmpPoints = new PointF[4];
        this.tmp2Points = new PointF[4];
        for (int i2 = 0; i2 < 4; i2++) {
            this.fromPoints[i2] = new PointF(-1.0f, -1.0f);
            this.points[i2] = new PointF(-1.0f, -1.0f);
            this.tmpPoints[i2] = new PointF(-1.0f, -1.0f);
            this.tmp2Points[i2] = new PointF(-1.0f, -1.0f);
        }
        this.fromBounds = new RectF();
        this.bounds = new RectF();
        this.lastBoundsUpdate = 0L;
        this.boundsUpdateDuration = 75L;
        this.recognizeFailed = 0;
        this.recognizeIndex = 0;
        this.qrLoading = false;
        this.qrLoaded = false;
        this.qrReader = null;
        this.visionQrReader = null;
        this.recognizedT = 0.0f;
        this.newRecognizedT = 0.0f;
        this.useRecognizedBounds = 0.0f;
        this.requestShot = new AnonymousClass7();
        this.averageProcessTime = 0.0f;
        this.processTimesCount = 0L;
        this.currentType = i;
        if (isQr()) {
            Utilities.globalQueue.postRunnable(new CameraScanActivity$$ExternalSyntheticLambda1(this, 1));
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

    public static ColorMatrix createThresholdMatrix(int i) {
        float f = i * (-255.0f);
        return new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
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

    private PointF[] getPoints() {
        PointF[] recognizedPoints = getRecognizedPoints();
        if (this.useRecognizedBounds < 1.0f) {
            if (this.normalBounds == null) {
                updateNormalBounds();
            }
            setPointsFromBounds(this.normalBounds, this.tmp2Points);
            for (int i = 0; i < recognizedPoints.length; i++) {
                PointF pointF = recognizedPoints[i];
                pointF.set(AndroidUtilities.lerp(this.tmp2Points[i].x, pointF.x, this.useRecognizedBounds), AndroidUtilities.lerp(this.tmp2Points[i].y, recognizedPoints[i].y, this.useRecognizedBounds));
            }
        }
        return recognizedPoints;
    }

    private RectF getRecognizedBounds() {
        float fMin = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - this.lastBoundsUpdate) / 75.0f));
        if (fMin < 1.0f) {
            this.fragmentView.invalidate();
        }
        RectF rectF = this.fromBounds;
        RectF rectF2 = this.bounds;
        RectF rectF3 = AndroidUtilities.rectTmp;
        AndroidUtilities.lerp(rectF, rectF2, fMin, rectF3);
        return rectF3;
    }

    private PointF[] getRecognizedPoints() {
        float fMin = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - this.lastBoundsUpdate) / 75.0f));
        if (fMin < 1.0f) {
            this.fragmentView.invalidate();
        }
        for (int i = 0; i < 4; i++) {
            this.tmpPoints[i].set(AndroidUtilities.lerp(this.fromPoints[i].x, this.points[i].x, fMin), AndroidUtilities.lerp(this.fromPoints[i].y, this.points[i].y, fMin));
        }
        return this.tmpPoints;
    }

    public void initCameraView() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.cameraView = cameraView;
        cameraView.setUseMaxPreview(true);
        this.cameraView.setOptimizeForBarcode(true);
        this.cameraView.setDelegate(new BoostsActivity$$ExternalSyntheticLambda4(this, 5));
        ((ViewGroup) this.fragmentView).addView(this.cameraView, 0, LayoutHelper.createFrame(-1, -1.0f));
        if (this.currentType != 0 || (textView = this.recognizedMrzView) == null) {
            return;
        }
        this.cameraView.addView(textView);
    }

    private Bitmap invert(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public boolean isQr() {
        int i = this.currentType;
        return i == 1 || i == 2 || i == 3;
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$2(View view) {
        if (getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                return;
            }
        } else if (i >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            return;
        }
        PhotoAlbumPickerActivity photoAlbumPickerActivity = new PhotoAlbumPickerActivity(PhotoAlbumPickerActivity.SELECT_TYPE_QR, false, false, null);
        photoAlbumPickerActivity.setMaxSelectedPhotos(1, false);
        photoAlbumPickerActivity.setAllowSearchImages(false);
        photoAlbumPickerActivity.setDelegate(new PhotoAlbumPickerActivity.PhotoAlbumPickerActivityDelegate() {
            @Override
            public void didSelectPhotos(ArrayList<SendMessagesHelper.SendingMediaInfo> arrayList, boolean z, int i2) {
                try {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = arrayList.get(0);
                    if (sendingMediaInfo.path != null) {
                        Point realScreenSize = AndroidUtilities.getRealScreenSize();
                        QrResult qrResultTryReadQr = CameraScanActivity.this.tryReadQr(null, null, 0, 0, 0, ImageLoader.loadBitmap(sendingMediaInfo.path, null, realScreenSize.x, realScreenSize.y, true));
                        if (qrResultTryReadQr != null) {
                            if (CameraScanActivity.this.delegate != null) {
                                CameraScanActivity.this.delegate.didFindQr(qrResultTryReadQr.text);
                            }
                            CameraScanActivity.this.removeSelfFromStack();
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }

            @Override
            public void startPhotoSelectActivity() {
                try {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    CameraScanActivity.this.getParentActivity().startActivityForResult(intent, 11);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        presentFragment(photoAlbumPickerActivity);
    }

    public void lambda$createView$3(ValueAnimator valueAnimator) {
        this.flashButton.invalidate();
    }

    public void lambda$createView$4(View view) {
        CameraSessionWrapper cameraSession;
        int i = 0;
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
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(shapeDrawable, AnimationProperties.SHAPE_DRAWABLE_ALPHA, this.flashButton.getTag() == null ? 68 : 34);
        objectAnimatorOfInt.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda13(this, i));
        this.flashAnimator.playTogether(objectAnimatorOfInt);
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
            cameraSession.setCurrentFlashMode("torch");
        } else {
            this.flashButton.setTag(null);
            cameraSession.setCurrentFlashMode("off");
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
            int i = 0;
            springAnimation2.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda17(this, i));
            this.qrAppearing.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda18(this, i));
            this.qrAppearing.mSpring = new SpringForce(500.0f);
            this.qrAppearing.mSpring.setDampingRatio(0.8f);
            this.qrAppearing.mSpring.setStiffness(250.0f);
            this.qrAppearing.start();
        }
    }

    public void lambda$new$0() {
        this.qrReader = new QRCodeReader();
        Context context = ApplicationLoader.applicationContext;
        zzk zzkVar = new zzk();
        zzkVar.zza = 256;
        this.visionQrReader = new BarcodeDetector(new zzm(context, zzkVar));
    }

    public void lambda$onNoQrFound$10() {
        if (this.recognizedMrzView.getTag() != null) {
            this.recognizedMrzView.setTag(null);
            this.recognizedMrzView.animate().setDuration(200L).alpha(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }

    public void lambda$processShot$11(MrzRecognizer.Result result) {
        this.recognizedMrzView.setText(result.rawMRZ);
        this.recognizedMrzView.animate().setDuration(200L).alpha(1.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindMrzInfo(result);
        }
        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 2), 1200L);
    }

    public void lambda$processShot$12() {
        CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
        if (cameraScanActivityDelegate != null) {
            cameraScanActivityDelegate.didFindQr(this.recognizedText);
        }
        finishFragment();
    }

    public void lambda$processShot$13() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null && cameraView.getCameraSession() != null) {
            CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
        }
        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 3));
    }

    public void lambda$processShot$14(QrResult qrResult) {
        updateRecognizedBounds(qrResult.bounds, qrResult.cornerPoints);
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
        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 5), 500L);
    }

    public void lambda$processShot$17() {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            processShot(cameraView.getTextureView().getBitmap());
        }
    }

    public void lambda$updateRecognized$5(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.recognizedT = fFloatValue;
        this.titleTextView.setAlpha(1.0f - fFloatValue);
        if (this.currentType == 3) {
            this.descriptionText.setAlpha(1.0f - this.recognizedT);
        }
        this.flashButton.setAlpha(1.0f - this.recognizedT);
        this.backShadowAlpha = (this.recognizedT * 0.25f) + 0.5f;
        this.fragmentView.invalidate();
    }

    public void lambda$updateRecognized$6(DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 500.0f;
        if (!this.recognized) {
            f3 = 1.0f - f3;
        }
        this.useRecognizedBounds = f3;
        this.fragmentView.invalidate();
    }

    private Bitmap monochrome(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(createThresholdMatrix(i)));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    private void onNoQrFound() {
        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 4));
    }

    private void setPointsFromBounds(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static BottomSheet showAsSheet(Activity activity, boolean z, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        if (activity == null) {
            return null;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity, false, new INavigationLayout[]{new ActionBarLayout(activity, false)}, i, z, cameraScanActivityDelegate);
        anonymousClass1.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) anonymousClass1, false);
        AndroidUtilities.setNavigationBarColor((Dialog) anonymousClass1, -16777216, false);
        anonymousClass1.setUseLightStatusBar(false);
        anonymousClass1.getWindow().addFlags(512);
        anonymousClass1.show();
        return anonymousClass1;
    }

    private void startRecognizing() {
        this.backgroundHandlerThread.start();
        this.handler = new Handler(this.backgroundHandlerThread.getLooper());
        AndroidUtilities.runOnUIThread(this.requestShot, 0L);
    }

    private static PointF[] toPointF(Point[] pointArr, int i, int i2) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            Point point = pointArr[i3];
            pointFArr[i3] = new PointF(point.x / i, point.y / i2);
        }
        return pointFArr;
    }

    public QrResult tryReadQr(byte[] bArr, Size size, int i, int i2, int i3, Bitmap bitmap) {
        int width;
        String str;
        PointF[] pointF;
        int height;
        LuminanceSource rGBLuminanceSource;
        Result result;
        AnonymousClass1 anonymousClass1 = null;
        try {
            RectF rectF = new RectF();
            BarcodeDetector barcodeDetector = this.visionQrReader;
            float fMax = Float.MIN_VALUE;
            float fMin = Float.MAX_VALUE;
            int i4 = 0;
            if (barcodeDetector != null && barcodeDetector.zza.zzb()) {
                if (bitmap != null) {
                    result = new Result();
                    int width2 = bitmap.getWidth();
                    int height2 = bitmap.getHeight();
                    result.resultMetadata = bitmap;
                    Frame$Metadata frame$Metadata = (Frame$Metadata) result.text;
                    frame$Metadata.zza = width2;
                    frame$Metadata.zzb = height2;
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    result = new Result();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    int width3 = size.getWidth();
                    int height3 = size.getHeight();
                    if (byteBufferWrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (byteBufferWrap.capacity() < width3 * height3) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    result.resultPoints = byteBufferWrap;
                    Frame$Metadata frame$Metadata2 = (Frame$Metadata) result.text;
                    frame$Metadata2.zza = width3;
                    frame$Metadata2.zzb = height3;
                    width = size.getWidth();
                    height = size.getWidth();
                }
                SparseArray sparseArrayDetect = this.visionQrReader.detect(result);
                if (sparseArrayDetect.size() > 0) {
                    Barcode barcode = (Barcode) sparseArrayDetect.valueAt(0);
                    str = barcode.rawValue;
                    Point[] pointArr = barcode.cornerPoints;
                    pointF = toPointF(pointArr, width, height);
                    if (pointArr == null || pointArr.length == 0) {
                        rectF = null;
                    } else {
                        int length = pointArr.length;
                        float fMax2 = Float.MIN_VALUE;
                        float fMin2 = Float.MAX_VALUE;
                        while (i4 < length) {
                            Point point = pointArr[i4];
                            fMin = Math.min(fMin, point.x);
                            fMax = Math.max(fMax, point.x);
                            fMin2 = Math.min(fMin2, point.y);
                            fMax2 = Math.max(fMax2, point.y);
                            i4++;
                        }
                        rectF.set(fMin, fMin2, fMax, fMax2);
                    }
                } else if (bitmap != null) {
                    Bitmap bitmapInvert = invert(bitmap);
                    bitmap.recycle();
                    Result result2 = new Result();
                    int width4 = bitmapInvert.getWidth();
                    int height4 = bitmapInvert.getHeight();
                    result2.resultMetadata = bitmapInvert;
                    Frame$Metadata frame$Metadata3 = (Frame$Metadata) result2.text;
                    frame$Metadata3.zza = width4;
                    frame$Metadata3.zzb = height4;
                    width = bitmapInvert.getWidth();
                    height = bitmapInvert.getHeight();
                    SparseArray sparseArrayDetect2 = this.visionQrReader.detect(result2);
                    if (sparseArrayDetect2.size() > 0) {
                        Barcode barcode2 = (Barcode) sparseArrayDetect2.valueAt(0);
                        str = barcode2.rawValue;
                        Point[] pointArr2 = barcode2.cornerPoints;
                        pointF = toPointF(pointArr2, width, height);
                        if (pointArr2 == null || pointArr2.length == 0) {
                            rectF = null;
                        } else {
                            int length2 = pointArr2.length;
                            float fMax3 = Float.MIN_VALUE;
                            float fMin3 = Float.MAX_VALUE;
                            while (i4 < length2) {
                                Point point2 = pointArr2[i4];
                                fMin = Math.min(fMin, point2.x);
                                fMax = Math.max(fMax, point2.x);
                                fMin3 = Math.min(fMin3, point2.y);
                                fMax3 = Math.max(fMax3, point2.y);
                                i4++;
                            }
                            rectF.set(fMin, fMin3, fMax, fMax3);
                        }
                    } else {
                        Bitmap bitmapMonochrome = monochrome(bitmapInvert, 90);
                        bitmapInvert.recycle();
                        Result result3 = new Result();
                        int width5 = bitmapMonochrome.getWidth();
                        int height5 = bitmapMonochrome.getHeight();
                        result3.resultMetadata = bitmapMonochrome;
                        Frame$Metadata frame$Metadata4 = (Frame$Metadata) result3.text;
                        frame$Metadata4.zza = width5;
                        frame$Metadata4.zzb = height5;
                        int width6 = bitmapInvert.getWidth();
                        height = bitmapInvert.getHeight();
                        SparseArray sparseArrayDetect3 = this.visionQrReader.detect(result3);
                        if (sparseArrayDetect3.size() > 0) {
                            Barcode barcode3 = (Barcode) sparseArrayDetect3.valueAt(0);
                            String str2 = barcode3.rawValue;
                            Point[] pointArr3 = barcode3.cornerPoints;
                            pointF = toPointF(pointArr3, width6, height);
                            if (pointArr3 == null || pointArr3.length == 0) {
                                str = str2;
                                width = width6;
                                rectF = null;
                            } else {
                                int length3 = pointArr3.length;
                                float fMax4 = Float.MIN_VALUE;
                                float fMin4 = Float.MAX_VALUE;
                                while (i4 < length3) {
                                    Point point3 = pointArr3[i4];
                                    fMin = Math.min(fMin, point3.x);
                                    fMax = Math.max(fMax, point3.x);
                                    fMin4 = Math.min(fMin4, point3.y);
                                    fMax4 = Math.max(fMax4, point3.y);
                                    i4++;
                                }
                                rectF.set(fMin, fMin4, fMax, fMax4);
                                str = str2;
                                width = width6;
                            }
                        } else {
                            width = width6;
                            str = null;
                            pointF = null;
                        }
                    }
                } else {
                    str = null;
                    pointF = null;
                }
            } else if (this.qrReader != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    rGBLuminanceSource = new RGBLuminanceSource(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width7 = bitmap.getWidth();
                    height = bitmap.getHeight();
                    width = width7;
                } else {
                    PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(bArr, size.getWidth(), size.getHeight(), i, i2, i3, i3);
                    width = size.getWidth();
                    height = size.getHeight();
                    rGBLuminanceSource = planarYUVLuminanceSource;
                }
                Result resultDecode = this.qrReader.decode(new Stripe(new GlobalHistogramBinarizer(rGBLuminanceSource), 7));
                str = (String) resultDecode.text;
                ResultPoint[] resultPointArr = (ResultPoint[]) resultDecode.resultPoints;
                if (resultPointArr == null || resultPointArr.length == 0) {
                    pointF = null;
                    rectF = null;
                } else {
                    float fMax5 = Float.MIN_VALUE;
                    float fMin5 = Float.MAX_VALUE;
                    for (ResultPoint resultPoint : resultPointArr) {
                        float f = resultPoint.x;
                        float f2 = resultPoint.y;
                        fMin = Math.min(fMin, f);
                        fMax = Math.max(fMax, resultPoint.x);
                        fMin5 = Math.min(fMin5, f2);
                        fMax5 = Math.max(fMax5, f2);
                    }
                    rectF.set(fMin, fMin5, fMax, fMax5);
                    if (resultPointArr.length == 4) {
                        pointF = new PointF[4];
                        for (int i5 = 0; i5 < 4; i5++) {
                            ResultPoint resultPoint2 = resultPointArr[i5];
                            pointF[i5] = new PointF(resultPoint2.x / width, resultPoint2.y / height);
                        }
                    } else {
                        pointF = null;
                    }
                }
            } else {
                width = 1;
                str = null;
                pointF = null;
                height = 1;
            }
            if (TextUtils.isEmpty(str)) {
                onNoQrFound();
                return null;
            }
            if (this.needGalleryButton) {
                Uri.parse(str).getPath().replace("/", "");
            } else if (this.currentType == 2 && !str.startsWith("tg://login?token=")) {
                onNoQrFound();
                return null;
            }
            QrResult qrResult = new QrResult(this, anonymousClass1);
            if (rectF != null) {
                float fDp = AndroidUtilities.dp(25.0f);
                float fDp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - fDp, rectF.top - fDp2, rectF.right + fDp, rectF.bottom + fDp2);
                float f3 = width;
                float f4 = height;
                rectF.set(rectF.left / f3, rectF.top / f4, rectF.right / f3, rectF.bottom / f4);
            }
            qrResult.cornerPoints = pointF;
            qrResult.bounds = rectF;
            qrResult.text = str;
            return qrResult;
        } catch (Throwable unused) {
            onNoQrFound();
            return null;
        }
    }

    public void updateNormalBounds() {
        if (this.normalBounds == null) {
            this.normalBounds = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int height = this.fragmentView.getHeight();
        int iMin = (int) (Math.min(width, height) / 1.5f);
        float f = width;
        float f2 = height;
        this.normalBounds.set(((width - iMin) / 2.0f) / f, ((height - iMin) / 2.0f) / f2, ((width + iMin) / 2.0f) / f, ((height + iMin) / 2.0f) / f2);
    }

    public void updateRecognized() {
        int i = 1;
        float f = this.recognizedT;
        float f2 = this.recognized ? 1.0f : 0.0f;
        this.newRecognizedT = f2;
        if (f != f2) {
            ValueAnimator valueAnimator = this.recognizedAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.recognizedT, this.newRecognizedT);
            this.recognizedAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda13(this, i));
            this.recognizedAnimator.setDuration((long) (Math.abs(this.recognizedT - this.newRecognizedT) * 300.0f));
            this.recognizedAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.recognizedAnimator.start();
            SpringAnimation springAnimation = this.useRecognizedBoundsAnimator;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder((this.recognized ? this.useRecognizedBounds : 1.0f - this.useRecognizedBounds) * 500.0f));
            this.useRecognizedBoundsAnimator = springAnimation2;
            springAnimation2.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda17(this, i));
            this.useRecognizedBoundsAnimator.mSpring = new SpringForce(500.0f);
            this.useRecognizedBoundsAnimator.mSpring.setDampingRatio(1.0f);
            this.useRecognizedBoundsAnimator.mSpring.setStiffness(500.0f);
            this.useRecognizedBoundsAnimator.start();
        }
    }

    private void updateRecognizedBounds(RectF rectF, PointF[] pointFArr) {
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastBoundsUpdate;
        int i2 = 0;
        if (j == 0) {
            this.lastBoundsUpdate = jElapsedRealtime - 75;
            this.bounds.set(rectF);
            this.fromBounds.set(rectF);
            if (pointFArr == null) {
                setPointsFromBounds(rectF, this.fromPoints);
                setPointsFromBounds(rectF, this.points);
            } else {
                while (i2 < 4) {
                    PointF pointF = this.fromPoints[i2];
                    PointF pointF2 = pointFArr[i2];
                    pointF.set(pointF2.x, pointF2.y);
                    PointF pointF3 = this.points[i2];
                    PointF pointF4 = pointFArr[i2];
                    pointF3.set(pointF4.x, pointF4.y);
                    i2++;
                }
            }
        } else {
            RectF rectF2 = this.fromBounds;
            if (rectF2 != null) {
                long j2 = jElapsedRealtime - j;
                if (j2 < 75) {
                    float fMin = Math.min(1.0f, Math.max(0.0f, j2 / 75.0f));
                    RectF rectF3 = this.fromBounds;
                    AndroidUtilities.lerp(rectF3, this.bounds, fMin, rectF3);
                    for (int i3 = 0; i3 < 4; i3++) {
                        PointF pointF5 = this.fromPoints[i3];
                        pointF5.set(AndroidUtilities.lerp(pointF5.x, this.points[i3].x, fMin), AndroidUtilities.lerp(this.fromPoints[i3].y, this.points[i3].y, fMin));
                    }
                } else {
                    rectF2.set(this.bounds);
                    for (i = 0; i < 4; i++) {
                        PointF pointF6 = this.fromPoints[i];
                        PointF pointF7 = this.points[i];
                        pointF6.set(pointF7.x, pointF7.y);
                    }
                }
            } else {
                rectF2.set(this.bounds);
                while (i < 4) {
                    PointF pointF8 = this.fromPoints[i];
                    PointF pointF9 = this.points[i];
                    pointF8.set(pointF9.x, pointF9.y);
                }
            }
            this.bounds.set(rectF);
            if (pointFArr == null) {
                setPointsFromBounds(this.bounds, this.points);
            } else {
                while (i2 < 4) {
                    PointF pointF10 = this.points[i2];
                    PointF pointF11 = pointFArr[i2];
                    pointF10.set(pointF11.x, pointF11.y);
                    i2++;
                }
            }
            this.lastBoundsUpdate = jElapsedRealtime;
        }
        this.fragmentView.invalidate();
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.shownAsBottomSheet) {
            this.actionBar.setItemsColor(-1, false);
            this.actionBar.setItemsBackgroundColor(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.setItemsColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), false);
            this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
            this.actionBar.setTitleColor(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !isQr()) {
            this.actionBar.showActionModeTop();
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
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
            Path path = new Path();

            private RectF aroundPoint(int i, int i2, int i3) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
                return rectF;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (!CameraScanActivity.this.isQr() || view != CameraScanActivity.this.cameraView) {
                    return zDrawChild;
                }
                RectF bounds = CameraScanActivity.this.getBounds();
                int iWidth = (int) (bounds.width() * view.getWidth());
                int iHeight = (int) (bounds.height() * view.getHeight());
                int iCenterX = (int) (bounds.centerX() * view.getWidth());
                int iCenterY = (int) (bounds.centerY() * view.getHeight());
                int i = (int) (((CameraScanActivity.this.qrAppearingValue * 0.5f) + 0.5f) * iWidth);
                int i2 = (int) (((CameraScanActivity.this.qrAppearingValue * 0.5f) + 0.5f) * iHeight);
                int i3 = iCenterX - (i / 2);
                int i4 = iCenterY - (i2 / 2);
                CameraScanActivity.this.paint.setAlpha((int) ((1.0f - (Math.min(1.0f, CameraScanActivity.this.qrAppearingValue) * (1.0f - CameraScanActivity.this.backShadowAlpha))) * 255.0f));
                float f = i4;
                canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f, CameraScanActivity.this.paint);
                int i5 = i4 + i2;
                float f2 = i5;
                canvas.drawRect(0.0f, f2, view.getMeasuredWidth(), view.getMeasuredHeight(), CameraScanActivity.this.paint);
                float f3 = i3;
                canvas.drawRect(0.0f, f, f3, f2, CameraScanActivity.this.paint);
                int i6 = i3 + i;
                float f4 = i6;
                canvas.drawRect(f4, f, view.getMeasuredWidth(), f2, CameraScanActivity.this.paint);
                CameraScanActivity.this.paint.setAlpha((int) (Math.max(0.0f, 1.0f - CameraScanActivity.this.qrAppearingValue) * 255.0f));
                canvas.drawRect(f3, f, f4, f2, CameraScanActivity.this.paint);
                int iLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, CameraScanActivity.this.qrAppearingValue * 20.0f));
                int i7 = iLerp / 2;
                int iLerp2 = AndroidUtilities.lerp(Math.min(i, i2), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(CameraScanActivity.this.qrAppearingValue, 1.7999999523162842d)));
                CameraScanActivity.this.cornerPaint.setAlpha((int) (Math.min(1.0f, CameraScanActivity.this.qrAppearingValue) * 255.0f));
                this.path.reset();
                int i8 = i4 + iLerp2;
                this.path.arcTo(aroundPoint(i3, i8, i7), 0.0f, 180.0f);
                float f5 = iLerp * 1.5f;
                int i9 = (int) (f3 + f5);
                int i10 = (int) (f + f5);
                int i11 = iLerp * 2;
                this.path.arcTo(aroundPoint(i9, i10, i11), 180.0f, 90.0f);
                int i12 = i3 + iLerp2;
                this.path.arcTo(aroundPoint(i12, i4, i7), 270.0f, 180.0f);
                this.path.lineTo(i3 + i7, i4 + i7);
                this.path.arcTo(aroundPoint(i9, i10, iLerp), 270.0f, -90.0f);
                this.path.close();
                canvas.drawPath(this.path, CameraScanActivity.this.cornerPaint);
                this.path.reset();
                this.path.arcTo(aroundPoint(i6, i8, i7), 180.0f, -180.0f);
                int i13 = (int) (f4 - f5);
                this.path.arcTo(aroundPoint(i13, i10, i11), 0.0f, -90.0f);
                int i14 = i6 - iLerp2;
                this.path.arcTo(aroundPoint(i14, i4, i7), 270.0f, -180.0f);
                this.path.arcTo(aroundPoint(i13, i10, iLerp), 270.0f, 90.0f);
                this.path.close();
                canvas.drawPath(this.path, CameraScanActivity.this.cornerPaint);
                this.path.reset();
                int i15 = i5 - iLerp2;
                this.path.arcTo(aroundPoint(i3, i15, i7), 0.0f, -180.0f);
                int i16 = (int) (f2 - f5);
                this.path.arcTo(aroundPoint(i9, i16, i11), 180.0f, -90.0f);
                this.path.arcTo(aroundPoint(i12, i5, i7), 90.0f, -180.0f);
                this.path.arcTo(aroundPoint(i9, i16, iLerp), 90.0f, 90.0f);
                this.path.close();
                canvas.drawPath(this.path, CameraScanActivity.this.cornerPaint);
                this.path.reset();
                this.path.arcTo(aroundPoint(i6, i15, i7), 180.0f, 180.0f);
                this.path.arcTo(aroundPoint(i13, i16, i11), 0.0f, 90.0f);
                this.path.arcTo(aroundPoint(i14, i5, i7), 90.0f, 180.0f);
                this.path.arcTo(aroundPoint(i13, i16, iLerp), 90.0f, -90.0f);
                this.path.close();
                canvas.drawPath(this.path, CameraScanActivity.this.cornerPaint);
                return zDrawChild;
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int measuredHeight;
                int iDp;
                int measuredWidth;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (CameraScanActivity.this.currentType == 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight());
                    }
                    CameraScanActivity.this.recognizedMrzView.setTextSize(0, i6 / 22);
                    CameraScanActivity.this.recognizedMrzView.setPadding(0, 0, 0, i6 / 15);
                    int i7 = (int) (i6 * 0.65f);
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.dp(36.0f), i7, CameraScanActivity.this.titleTextView.getMeasuredWidth() + AndroidUtilities.dp(36.0f), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i7);
                } else {
                    ((BaseFragment) CameraScanActivity.this).actionBar.layout(0, 0, ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) CameraScanActivity.this).actionBar.getMeasuredHeight());
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.layout(0, 0, CameraScanActivity.this.cameraView.getMeasuredWidth(), CameraScanActivity.this.cameraView.getMeasuredHeight());
                    }
                    int iMin = (int) (Math.min(i5, i6) / 1.5f);
                    if (CameraScanActivity.this.currentType == 1) {
                        measuredHeight = ((i6 - iMin) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        iDp = AndroidUtilities.dp(30.0f);
                    } else {
                        measuredHeight = ((i6 - iMin) / 2) - CameraScanActivity.this.titleTextView.getMeasuredHeight();
                        iDp = AndroidUtilities.dp(64.0f);
                    }
                    int i8 = measuredHeight - iDp;
                    CameraScanActivity.this.titleTextView.layout(AndroidUtilities.dp(36.0f), i8, CameraScanActivity.this.titleTextView.getMeasuredWidth() + AndroidUtilities.dp(36.0f), CameraScanActivity.this.titleTextView.getMeasuredHeight() + i8);
                    if (CameraScanActivity.this.currentType == 3) {
                        int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(8.0f, CameraScanActivity.this.titleTextView.getMeasuredHeight(), i8);
                        CameraScanActivity.this.descriptionText.layout(AndroidUtilities.dp(36.0f), iM, CameraScanActivity.this.descriptionText.getMeasuredWidth() + AndroidUtilities.dp(36.0f), CameraScanActivity.this.descriptionText.getMeasuredHeight() + iM);
                    }
                    CameraScanActivity.this.recognizedMrzView.layout(0, getMeasuredHeight() - CameraScanActivity.this.recognizedMrzView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    if (CameraScanActivity.this.needGalleryButton) {
                        measuredWidth = AndroidUtilities.dp(35.0f) + (i5 / 2);
                    } else {
                        measuredWidth = (i5 / 2) - (CameraScanActivity.this.flashButton.getMeasuredWidth() / 2);
                    }
                    int iDp2 = AndroidUtilities.dp(80.0f) + RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i6, iMin, 2, iMin);
                    CameraScanActivity.this.flashButton.layout(measuredWidth, iDp2, CameraScanActivity.this.flashButton.getMeasuredWidth() + measuredWidth, CameraScanActivity.this.flashButton.getMeasuredHeight() + iDp2);
                    if (CameraScanActivity.this.galleryButton != null) {
                        int iDp3 = ((i5 / 2) - AndroidUtilities.dp(35.0f)) - CameraScanActivity.this.galleryButton.getMeasuredWidth();
                        CameraScanActivity.this.galleryButton.layout(iDp3, iDp2, CameraScanActivity.this.galleryButton.getMeasuredWidth() + iDp3, CameraScanActivity.this.galleryButton.getMeasuredHeight() + iDp2);
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
            public void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                ((BaseFragment) CameraScanActivity.this).actionBar.measure(i, i2);
                if (CameraScanActivity.this.currentType != 0) {
                    if (CameraScanActivity.this.cameraView != null) {
                        CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    CameraScanActivity.this.recognizedMrzView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    if (CameraScanActivity.this.galleryButton != null) {
                        CameraScanActivity.this.galleryButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    }
                    CameraScanActivity.this.flashButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                } else if (CameraScanActivity.this.cameraView != null) {
                    CameraScanActivity.this.cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                }
                CameraScanActivity.this.titleTextView.measure(OKLCH.m(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                if (CameraScanActivity.this.currentType == 3) {
                    CameraScanActivity.this.descriptionText.measure(OKLCH.m(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    CameraScanActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
            }
        };
        viewGroup.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(4));
        this.fragmentView = viewGroup;
        if (isQr()) {
            this.fragmentView.postDelayed(new CameraScanActivity$$ExternalSyntheticLambda1(this, 8), 450L);
        } else {
            initCameraView();
        }
        if (this.currentType == 0) {
            ActionBar actionBar = this.actionBar;
            int i = Theme.key_windowBackgroundWhite;
            actionBar.setBackgroundColor(Theme.getColor(null, i, false));
            this.fragmentView.setBackgroundColor(Theme.getColor(null, i, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.setItemsColor(-1, false);
            this.actionBar.setItemsBackgroundColor(587202559, false);
            viewGroup.setBackgroundColor(-16777216);
            viewGroup.addView(this.actionBar);
        }
        int i2 = this.currentType;
        if (i2 == 2 || i2 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        final Paint paint = new Paint(1);
        paint.setPathEffect(LinkPath.getRoundedEffect());
        paint.setColor(ColorUtils.setAlphaComponent(-1, 40));
        TextView textView = new TextView(context) {
            LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector(this);
            private LinkSpanDrawable<URLSpanNoUnderline> pressedLink;
            LinkPath textPath;

            @Override
            public void onDraw(Canvas canvas) {
                LinkPath linkPath = this.textPath;
                if (linkPath != null) {
                    canvas.drawPath(linkPath, paint);
                }
                if (this.links.draw(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
            }

            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
                    if (uRLSpanNoUnderlineArr == null || uRLSpanNoUnderlineArr.length <= 0) {
                        return;
                    }
                    LinkPath linkPath = new LinkPath(true);
                    this.textPath = linkPath;
                    linkPath.setAllowReset(false);
                    for (int i5 = 0; i5 < uRLSpanNoUnderlineArr.length; i5++) {
                        int spanStart = spanned.getSpanStart(uRLSpanNoUnderlineArr[i5]);
                        int spanEnd = spanned.getSpanEnd(uRLSpanNoUnderlineArr[i5]);
                        this.textPath.setCurrentLayout(getLayout(), spanStart, 0.0f);
                        int i6 = getText() != null ? getPaint().baselineShift : 0;
                        this.textPath.setBaselineShift(i6 != 0 ? AndroidUtilities.dp(i6 > 0 ? 5.0f : -2.0f) + i6 : 0);
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
                    if (lineLeft <= f2 && layout.getLineWidth(lineForVertical) + lineLeft >= f2 && y >= 0 && y <= layout.getHeight()) {
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
                                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, f);
                                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                            } else if (motionEvent.getAction() == 1) {
                                LinkSpanDrawable<URLSpanNoUnderline> linkSpanDrawable2 = this.pressedLink;
                                if (linkSpanDrawable2 != null) {
                                    CharacterStyle span = linkSpanDrawable2.getSpan();
                                    ClickableSpan clickableSpan = clickableSpanArr[0];
                                    if (span == clickableSpan) {
                                        clickableSpan.onClick(this);
                                    }
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
        };
        this.titleTextView = textView;
        textView.setGravity(1);
        this.titleTextView.setTextSize(1, 24.0f);
        viewGroup.addView(this.titleTextView);
        TextView textView2 = new TextView(context);
        this.descriptionText = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setTextSize(1, 16.0f);
        viewGroup.addView(this.descriptionText);
        TextView textView3 = new TextView(context);
        this.recognizedMrzView = textView3;
        textView3.setTextColor(-1);
        this.recognizedMrzView.setGravity(81);
        this.recognizedMrzView.setAlpha(0.0f);
        int i3 = this.currentType;
        if (i3 == 0) {
            this.titleTextView.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.descriptionText.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.recognizedMrzView.setTypeface(Typeface.MONOSPACE);
        } else {
            if (!this.needGalleryButton) {
                if (i3 == 1 || i3 == 3) {
                    this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                    String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                    int i4 = 0;
                    for (int i5 = 2; i4 < i5; i5 = 2) {
                        String string = spannableStringBuilder.toString();
                        int iIndexOf = string.indexOf(42);
                        int i6 = iIndexOf + 1;
                        int iIndexOf2 = string.indexOf(42, i6);
                        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf == iIndexOf2) {
                            break;
                        }
                        this.titleTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) " ");
                        spannableStringBuilder.replace(iIndexOf, i6, (CharSequence) " ");
                        spannableStringBuilder.setSpan(new URLSpanNoUnderline(strArr[i4], true), i6, iIndexOf2, 33);
                        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i6, iIndexOf2, 33);
                        i4++;
                    }
                    this.titleTextView.setLinkTextColor(-1);
                    this.titleTextView.setTextSize(1, 16.0f);
                    this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.titleTextView.setPadding(0, 0, 0, 0);
                    this.titleTextView.setText(spannableStringBuilder);
                }
            }
            this.titleTextView.setTextColor(-1);
            if (this.currentType == 3) {
                this.descriptionText.setTextColor(-1711276033);
            }
            this.recognizedMrzView.setTextSize(1, 16.0f);
            this.recognizedMrzView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            if (!this.needGalleryButton) {
                this.recognizedMrzView.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            }
            viewGroup.addView(this.recognizedMrzView);
            if (this.needGalleryButton) {
                ImageView imageView = new ImageView(context);
                this.galleryButton = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.galleryButton.setImageResource(R.drawable.qr_gallery);
                ImageView imageView2 = this.galleryButton;
                ShapeDrawable shapeDrawableCreateCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(60.0f), 587202559);
                ShapeDrawable shapeDrawableCreateCircleDrawable2 = Theme.createCircleDrawable(AndroidUtilities.dp(60.0f), 1157627903);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, shapeDrawableCreateCircleDrawable2);
                stateListDrawable.addState(new int[]{16842913}, shapeDrawableCreateCircleDrawable2);
                stateListDrawable.addState(StateSet.WILD_CARD, shapeDrawableCreateCircleDrawable);
                imageView2.setBackgroundDrawable(stateListDrawable);
                viewGroup.addView(this.galleryButton);
                final int i7 = 0;
                this.galleryButton.setOnClickListener(new View.OnClickListener(this) {
                    public final CameraScanActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$createView$2(view);
                                break;
                            default:
                                this.f$0.lambda$createView$4(view);
                                break;
                        }
                    }
                });
            }
            ImageView imageView3 = new ImageView(context);
            this.flashButton = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            this.flashButton.setImageResource(R.drawable.qr_flashlight);
            this.flashButton.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(60.0f), 587202559));
            viewGroup.addView(this.flashButton);
            final int i8 = 1;
            this.flashButton.setOnClickListener(new View.OnClickListener(this) {
                public final CameraScanActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            this.f$0.lambda$createView$2(view);
                            break;
                        default:
                            this.f$0.lambda$createView$4(view);
                            break;
                    }
                }
            });
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public void destroy(boolean z, Runnable runnable) {
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.destroy(z, runnable);
            this.cameraView = null;
        }
        this.backgroundHandlerThread.quitSafely();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        if (isQr()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarWhiteSelector));
        arrayList.add(new ThemeDescription(this.titleTextView, 256, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.descriptionText, 256, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        return arrayList;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            try {
                QrResult qrResultTryReadQr = tryReadQr(null, null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (qrResultTryReadQr != null) {
                    CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
                    if (cameraScanActivityDelegate != null) {
                        cameraScanActivityDelegate.didFindQr(qrResultTryReadQr.text);
                    }
                    finishFragment();
                }
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        destroy(false, null);
        AndroidUtilities.unlockOrientation(getParentActivity());
        BarcodeDetector barcodeDetector = this.visionQrReader;
        if (barcodeDetector != null) {
            barcodeDetector.release();
        }
    }

    public void processShot(Bitmap bitmap) {
        CameraScanActivity cameraScanActivity;
        if (this.cameraView == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.cameraView.getPreviewSize();
            if (this.currentType == 0) {
                MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmap, false);
                if (resultRecognize != null && !TextUtils.isEmpty(resultRecognize.firstName) && !TextUtils.isEmpty(resultRecognize.lastName) && !TextUtils.isEmpty(resultRecognize.number) && resultRecognize.birthDay != 0 && (resultRecognize.expiryDay != 0 || resultRecognize.doesNotExpire)) {
                    if (resultRecognize.gender != 0) {
                        this.recognized = true;
                        CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
                        AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(22, this, resultRecognize));
                        return;
                    }
                }
                cameraScanActivity = this;
            } else {
                int iMin = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                cameraScanActivity = this;
                try {
                    QrResult qrResultTryReadQr = cameraScanActivity.tryReadQr(null, previewSize, (previewSize.getWidth() - iMin) / 2, (previewSize.getHeight() - iMin) / 2, iMin, bitmap);
                    boolean z = cameraScanActivity.recognized;
                    if (z) {
                        cameraScanActivity.recognizeIndex++;
                    }
                    if (qrResultTryReadQr != null) {
                        cameraScanActivity.recognizeFailed = 0;
                        String str = qrResultTryReadQr.text;
                        cameraScanActivity.recognizedText = str;
                        if (!z) {
                            cameraScanActivity.recognized = true;
                            cameraScanActivity.qrLoading = cameraScanActivity.delegate.processQr(str, new CameraScanActivity$$ExternalSyntheticLambda1(this, 0));
                            cameraScanActivity.recognizedStart = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 5));
                        }
                        AndroidUtilities.runOnUIThread(new PhotoViewer$44$$ExternalSyntheticLambda0(3, this, qrResultTryReadQr));
                    } else if (z) {
                        int i = cameraScanActivity.recognizeFailed + 1;
                        cameraScanActivity.recognizeFailed = i;
                        if (i > 4 && !cameraScanActivity.qrLoading) {
                            cameraScanActivity.recognized = false;
                            cameraScanActivity.recognizeIndex = 0;
                            cameraScanActivity.recognizedText = null;
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 5));
                            AndroidUtilities.runOnUIThread(cameraScanActivity.requestShot, 500L);
                            return;
                        }
                    }
                    if (((cameraScanActivity.recognizeIndex == 0 && qrResultTryReadQr != null && qrResultTryReadQr.bounds == null && !cameraScanActivity.qrLoading) || (SystemClock.elapsedRealtime() - cameraScanActivity.recognizedStart > 1000 && !cameraScanActivity.qrLoading)) && cameraScanActivity.recognizedText != null) {
                        CameraView cameraView = cameraScanActivity.cameraView;
                        if (cameraView != null && cameraView.getCameraSession() != null && cameraScanActivity.currentType != 3) {
                            CameraController.getInstance().stopPreview(cameraScanActivity.cameraView.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new PhotoViewer$7$$ExternalSyntheticLambda0(23, this, cameraScanActivity.recognizedText));
                        if (cameraScanActivity.currentType == 3) {
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda1(this, 6));
                        }
                    } else if (cameraScanActivity.recognized) {
                        cameraScanActivity.handler.postDelayed(new CameraScanActivity$$ExternalSyntheticLambda1(this, 7), Math.max(16L, ((long) (1000 / cameraScanActivity.sps)) - ((long) cameraScanActivity.averageProcessTime)));
                    }
                } catch (Throwable unused) {
                    onNoQrFound();
                }
            }
        } catch (Throwable unused2) {
            cameraScanActivity = this;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        float f = cameraScanActivity.averageProcessTime;
        long j = cameraScanActivity.processTimesCount;
        float f2 = (f * j) + jElapsedRealtime2;
        long j2 = j + 1;
        cameraScanActivity.processTimesCount = j2;
        cameraScanActivity.averageProcessTime = f2 / j2;
        cameraScanActivity.processTimesCount = Math.max(j2, 30L);
        if (cameraScanActivity.recognized) {
            return;
        }
        AndroidUtilities.runOnUIThread(cameraScanActivity.requestShot, 500L);
    }

    public void setDelegate(CameraScanActivityDelegate cameraScanActivityDelegate) {
        this.delegate = cameraScanActivityDelegate;
    }

    public static BottomSheet showAsSheet(BaseFragment baseFragment, boolean z, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        return showAsSheet(baseFragment.getParentActivity(), z, i, cameraScanActivityDelegate);
    }

    public interface CameraScanActivityDelegate {
        void didFindMrzInfo(MrzRecognizer.Result result);

        void didFindQr(String str);

        String getSubtitleText();

        void onDismiss();

        boolean processQr(String str, Runnable runnable);

        public abstract class CC {
            public static String $default$getSubtitleText(CameraScanActivityDelegate cameraScanActivityDelegate) {
                return null;
            }

            public static boolean $default$processQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str, Runnable runnable) {
                return false;
            }

            public static void $default$onDismiss(CameraScanActivityDelegate cameraScanActivityDelegate) {
            }

            public static void $default$didFindMrzInfo(CameraScanActivityDelegate cameraScanActivityDelegate, MrzRecognizer.Result result) {
            }

            public static void $default$didFindQr(CameraScanActivityDelegate cameraScanActivityDelegate, String str) {
            }
        }
    }
}
