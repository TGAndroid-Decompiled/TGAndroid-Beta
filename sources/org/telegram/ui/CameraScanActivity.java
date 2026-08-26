package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
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
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.RGBLuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.GlobalHistogramBinarizer;
import com.stripe.android.Stripe;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;

public class CameraScanActivity extends BaseFragment {
    public float averageProcessTime;
    public float backShadowAlpha;
    public final HandlerThread backgroundHandlerThread;
    public final RectF bounds;
    public CameraView cameraView;
    public final Paint cornerPaint;
    public final int currentType;
    public CameraScanActivityDelegate delegate;
    public TextView descriptionText;
    public AnimatorSet flashAnimator;
    public ImageView flashButton;
    public final RectF fromBounds;
    public final PointF[] fromPoints;
    public Handler handler;
    public long lastBoundsUpdate;
    public float newRecognizedT;
    public RectF normalBounds;
    public final Paint paint;
    public final PointF[] points;
    public long processTimesCount;
    public SpringAnimation qrAppearing;
    public float qrAppearingValue;
    public boolean qrLoading;
    public Stripe qrReader;
    public int recognizeFailed;
    public int recognizeIndex;
    public boolean recognized;
    public ValueAnimator recognizedAnimator;
    public TextView recognizedMrzView;
    public long recognizedStart;
    public float recognizedT;
    public String recognizedText;
    public final BubbleActivity.AnonymousClass1 requestShot;
    public boolean shownAsBottomSheet;
    public final int sps;
    public AnonymousClass4 titleTextView;
    public final PointF[] tmp2Points;
    public final PointF[] tmpPoints;
    public float useRecognizedBounds;
    public SpringAnimation useRecognizedBoundsAnimator;
    public BarcodeDetector visionQrReader;

    public final class AnonymousClass1 extends BottomSheet {
        public final C00041 fragment;
        public final INavigationLayout[] val$actionBarLayout;
        public final CameraScanActivityDelegate val$cameraDelegate;

        public AnonymousClass1(Activity activity, INavigationLayout[] iNavigationLayoutArr, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
            super(activity, null, false, false);
            this.val$actionBarLayout = iNavigationLayoutArr;
            this.val$cameraDelegate = cameraScanActivityDelegate;
            ((ActionBarLayout) iNavigationLayoutArr[0]).setFragmentStack(new ArrayList());
            ?? r3 = new CameraScanActivity(i) {
                @Override
                public final void finishFragment() {
                    setFinishing(true);
                    AnonymousClass1.this.lambda$showGiftOfferSheet$15();
                }

                @Override
                public final void removeSelfFromStack() {
                    AnonymousClass1.this.lambda$showGiftOfferSheet$15();
                }
            };
            this.fragment = r3;
            r3.shownAsBottomSheet = true;
            INavigationLayout iNavigationLayout = iNavigationLayoutArr[0];
            iNavigationLayout.getClass();
            ((ActionBarLayout) iNavigationLayout).addFragmentToStack(-1, r3);
            ((ActionBarLayout) iNavigationLayoutArr[0]).showLastFragment();
            ViewGroup view = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
            int i2 = this.backgroundPaddingLeft;
            view.setPadding(i2, 0, i2, 0);
            r3.delegate = cameraScanActivityDelegate;
            if (cameraScanActivityDelegate.getSubtitleText() != null) {
                r3.descriptionText.setText(cameraScanActivityDelegate.getSubtitleText());
            }
            this.containerView = ((ActionBarLayout) iNavigationLayoutArr[0]).getView();
            setApplyBottomPadding(false);
            setApplyBottomPadding(false);
            setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 4));
        }

        @Override
        public final boolean canDismissWithSwipe() {
            return false;
        }

        @Override
        public final void lambda$showGiftOfferSheet$15() {
            super.lambda$showGiftOfferSheet$15();
            this.val$actionBarLayout[0] = null;
            this.val$cameraDelegate.onDismiss();
        }

        @Override
        public final void lambda$openCrafting$8() {
            INavigationLayout[] iNavigationLayoutArr = this.val$actionBarLayout;
            INavigationLayout iNavigationLayout = iNavigationLayoutArr[0];
            if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getFragmentStack().size() <= 1) {
                super.lambda$openCrafting$8();
            } else {
                ((ActionBarLayout) iNavigationLayoutArr[0]).onBackPressed();
            }
        }
    }

    public interface CameraScanActivityDelegate {
        void didFindMrzInfo(MrzRecognizer.Result result);

        void didFindQr(String str);

        String getSubtitleText();

        void onDismiss();

        boolean processQr(String str, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0);
    }

    public CameraScanActivity(int i) {
        super(null);
        this.backgroundHandlerThread = new HandlerThread("ScanCamera");
        this.paint = new Paint();
        this.cornerPaint = new Paint(1);
        new Path();
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
        this.recognizeFailed = 0;
        this.recognizeIndex = 0;
        this.qrLoading = false;
        this.qrReader = null;
        this.visionQrReader = null;
        this.recognizedT = 0.0f;
        this.newRecognizedT = 0.0f;
        this.useRecognizedBounds = 0.0f;
        this.requestShot = new BubbleActivity.AnonymousClass1(this, 3);
        this.averageProcessTime = 0.0f;
        this.processTimesCount = 0L;
        this.currentType = i;
        if (isQr()) {
            Utilities.globalQueue.postRunnable(new CameraScanActivity$$ExternalSyntheticLambda0(this, 5));
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

    public static Bitmap invert(Bitmap bitmap) {
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

    public static Bitmap monochrome(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        float f = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 85.0f, 85.0f, 85.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static void setPointsFromBounds(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static AnonymousClass1 showAsSheet(Activity activity, int i, CameraScanActivityDelegate cameraScanActivityDelegate) {
        if (activity == null) {
            return null;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity, new INavigationLayout[]{new ActionBarLayout(activity, false)}, i, cameraScanActivityDelegate);
        anonymousClass1.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) anonymousClass1, false);
        AndroidUtilities.setNavigationBarColor((Dialog) anonymousClass1, -16777216, false);
        anonymousClass1.setUseLightStatusBar(false);
        anonymousClass1.getWindow().addFlags(512);
        anonymousClass1.show();
        return anonymousClass1;
    }

    public static PointF[] toPointF(Point[] pointArr, int i, int i2) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            Point point = pointArr[i3];
            pointFArr[i3] = new PointF(point.x / i, point.y / i2);
        }
        return pointFArr;
    }

    @Override
    public final View createView(Context context) {
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
            ActionBar actionBar = this.actionBar;
            if (actionBar.occupyStatusBar && actionBar.actionModeTop == null) {
                View view = new View(actionBar.getContext());
                actionBar.actionModeTop = view;
                view.setBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultTop, actionBar.resourcesProvider));
                actionBar.addView(actionBar.actionModeTop);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBar.actionModeTop.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                actionBar.actionModeTop.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 16));
        this.paint.setColor(2130706432);
        Paint paint = this.cornerPaint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, context);
        anonymousClass3.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        this.fragmentView = anonymousClass3;
        if (isQr()) {
            this.fragmentView.postDelayed(new CameraScanActivity$$ExternalSyntheticLambda0(this, 0), 450L);
        } else {
            initCameraView();
        }
        int i = this.currentType;
        if (i == 0) {
            ActionBar actionBar2 = this.actionBar;
            int i2 = Theme.key_windowBackgroundWhite;
            actionBar2.setBackgroundColor(Theme.getColor(null, i2, false));
            this.fragmentView.setBackgroundColor(Theme.getColor(null, i2, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.setItemsColor(-1, false);
            this.actionBar.setItemsBackgroundColor(587202559, false);
            anonymousClass3.setBackgroundColor(-16777216);
            anonymousClass3.addView(this.actionBar);
        }
        if (i == 2 || i == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(LinkPath.getRoundedEffect());
        paint2.setColor(ColorUtils.setAlphaComponent(-1, 40));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, paint2);
        this.titleTextView = anonymousClass4;
        anonymousClass4.setGravity(1);
        this.titleTextView.setTextSize(1, 24.0f);
        anonymousClass3.addView(this.titleTextView);
        TextView textView = new TextView(context);
        this.descriptionText = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
        this.descriptionText.setGravity(1);
        this.descriptionText.setTextSize(1, 16.0f);
        anonymousClass3.addView(this.descriptionText);
        TextView textView2 = new TextView(context);
        this.recognizedMrzView = textView2;
        textView2.setTextColor(-1);
        this.recognizedMrzView.setGravity(81);
        this.recognizedMrzView.setAlpha(0.0f);
        if (i == 0) {
            this.titleTextView.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.descriptionText.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.recognizedMrzView.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i == 1 || i == 3) {
                this.titleTextView.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                int i3 = 0;
                for (int i4 = 2; i3 < i4; i4 = 2) {
                    String string = spannableStringBuilder.toString();
                    int iIndexOf = string.indexOf(42);
                    int i5 = iIndexOf + 1;
                    int iIndexOf2 = string.indexOf(42, i5);
                    if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf == iIndexOf2) {
                        break;
                    }
                    this.titleTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(iIndexOf, i5, (CharSequence) " ");
                    URLSpanNoUnderline uRLSpanNoUnderline = new URLSpanNoUnderline(strArr[i3], null);
                    uRLSpanNoUnderline.forceNoUnderline = true;
                    spannableStringBuilder.setSpan(uRLSpanNoUnderline, i5, iIndexOf2, 33);
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i5, iIndexOf2, 33);
                    i3++;
                }
                this.titleTextView.setLinkTextColor(-1);
                this.titleTextView.setTextSize(1, 16.0f);
                this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.titleTextView.setPadding(0, 0, 0, 0);
                this.titleTextView.setText(spannableStringBuilder);
            }
            this.titleTextView.setTextColor(-1);
            if (i == 3) {
                this.descriptionText.setTextColor(-1711276033);
            }
            this.recognizedMrzView.setTextSize(1, 16.0f);
            this.recognizedMrzView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.recognizedMrzView.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            anonymousClass3.addView(this.recognizedMrzView);
            ImageView imageView = new ImageView(context);
            this.flashButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.flashButton.setImageResource(R.drawable.qr_flashlight);
            this.flashButton.setBackgroundDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(60.0f), 587202559));
            anonymousClass3.addView(this.flashButton);
            this.flashButton.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda38(this, 17));
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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

    public final void initCameraView() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.cameraView = cameraView;
        cameraView.setUseMaxPreview(true);
        this.cameraView.setOptimizeForBarcode(true);
        this.cameraView.setDelegate(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 29));
        ((ViewGroup) this.fragmentView).addView(this.cameraView, 0, LayoutHelper.createFrame(-1.0f, -1));
        if (this.currentType != 0 || (textView = this.recognizedMrzView) == null) {
            return;
        }
        this.cameraView.addView(textView);
    }

    public final boolean isQr() {
        int i = this.currentType;
        return i == 1 || i == 2 || i == 3;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 != -1 || i != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            try {
                ChatActivity.AnonymousClass117 anonymousClass117TryReadQr = tryReadQr(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
                if (anonymousClass117TryReadQr != null) {
                    CameraScanActivityDelegate cameraScanActivityDelegate = this.delegate;
                    if (cameraScanActivityDelegate != null) {
                        cameraScanActivityDelegate.didFindQr((String) anonymousClass117TryReadQr.val$primaryMessage);
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.cameraView;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.cameraView = null;
        }
        this.backgroundHandlerThread.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        BarcodeDetector barcodeDetector = this.visionQrReader;
        if (barcodeDetector != null) {
            barcodeDetector.release();
        }
    }

    public final void processShot(Bitmap bitmap) {
        CameraScanActivity cameraScanActivity;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.requestShot;
        if (this.cameraView == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.cameraView.getPreviewSize();
            int i = this.currentType;
            if (i == 0) {
                MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmap, false);
                if (resultRecognize != null && !TextUtils.isEmpty(resultRecognize.firstName) && !TextUtils.isEmpty(resultRecognize.lastName) && !TextUtils.isEmpty(resultRecognize.number) && resultRecognize.birthDay != 0 && (resultRecognize.expiryDay != 0 || resultRecognize.doesNotExpire)) {
                    if (resultRecognize.gender != 0) {
                        this.recognized = true;
                        CameraController.getInstance().stopPreview(this.cameraView.getCameraSession());
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(23, this, resultRecognize));
                        return;
                    }
                }
                cameraScanActivity = this;
            } else {
                int iMin = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                cameraScanActivity = this;
                try {
                    ChatActivity.AnonymousClass117 anonymousClass117TryReadQr = cameraScanActivity.tryReadQr(previewSize, (previewSize.getWidth() - iMin) / 2, (previewSize.getHeight() - iMin) / 2, iMin, bitmap);
                    boolean z = cameraScanActivity.recognized;
                    if (z) {
                        cameraScanActivity.recognizeIndex++;
                    }
                    if (anonymousClass117TryReadQr != null) {
                        cameraScanActivity.recognizeFailed = 0;
                        String str = (String) anonymousClass117TryReadQr.val$primaryMessage;
                        cameraScanActivity.recognizedText = str;
                        if (!z) {
                            cameraScanActivity.recognized = true;
                            cameraScanActivity.qrLoading = cameraScanActivity.delegate.processQr(str, new CameraScanActivity$$ExternalSyntheticLambda0(this, 7));
                            cameraScanActivity.recognizedStart = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(24, this, anonymousClass117TryReadQr));
                    } else if (z) {
                        int i2 = cameraScanActivity.recognizeFailed + 1;
                        cameraScanActivity.recognizeFailed = i2;
                        if (i2 > 4 && !cameraScanActivity.qrLoading) {
                            cameraScanActivity.recognized = false;
                            cameraScanActivity.recognizeIndex = 0;
                            cameraScanActivity.recognizedText = null;
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 8));
                            AndroidUtilities.runOnUIThread(anonymousClass1, 500L);
                            return;
                        }
                    }
                    if (((cameraScanActivity.recognizeIndex == 0 && anonymousClass117TryReadQr != null && ((RectF) anonymousClass117TryReadQr.val$finalReactionsLayout) == null && !cameraScanActivity.qrLoading) || (SystemClock.elapsedRealtime() - cameraScanActivity.recognizedStart > 1000 && !cameraScanActivity.qrLoading)) && cameraScanActivity.recognizedText != null) {
                        CameraView cameraView = cameraScanActivity.cameraView;
                        if (cameraView != null && cameraView.getCameraSession() != null && i != 3) {
                            CameraController.getInstance().stopPreview(cameraScanActivity.cameraView.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(22, this, cameraScanActivity.recognizedText));
                        if (i == 3) {
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 1));
                        }
                    } else if (cameraScanActivity.recognized) {
                        cameraScanActivity.handler.postDelayed(new CameraScanActivity$$ExternalSyntheticLambda0(this, 2), Math.max(16L, ((long) (1000 / cameraScanActivity.sps)) - ((long) cameraScanActivity.averageProcessTime)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 6));
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
        AndroidUtilities.runOnUIThread(anonymousClass1, 500L);
    }

    public final ChatActivity.AnonymousClass117 tryReadQr(Size size, int i, int i2, int i3, Bitmap bitmap) {
        ChatActivity.AnonymousClass117 anonymousClass117;
        ChatActivity.AnonymousClass117 anonymousClass118;
        int width;
        String str;
        ?? r5;
        int height;
        LuminanceSource rGBLuminanceSource;
        Result result;
        PointF[] pointFArr;
        ChatActivity.AnonymousClass117 anonymousClass119 = null;
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
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(null);
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
                    PointF[] pointF = toPointF(pointArr, width, height);
                    pointFArr = pointF;
                    if (pointArr.length == 0) {
                        rectF = null;
                        r5 = pointFArr;
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
                        r5 = pointF;
                    }
                    anonymousClass118 = null;
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
                        PointF[] pointF2 = toPointF(pointArr2, width, height);
                        if (pointArr2.length == 0) {
                            pointFArr = pointF2;
                            rectF = null;
                            r5 = pointFArr;
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
                            r5 = pointF2;
                        }
                    } else {
                        Bitmap bitmapMonochrome = monochrome(bitmapInvert);
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
                            PointF[] pointF3 = toPointF(pointArr3, width6, height);
                            if (pointArr3.length == 0) {
                                str = str2;
                                width = width6;
                                pointFArr = pointF3;
                                rectF = null;
                                r5 = pointFArr;
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
                                r5 = pointF3;
                            }
                        } else {
                            width = width6;
                            str = null;
                            r5 = 0;
                        }
                    }
                    anonymousClass118 = null;
                } else {
                    str = null;
                    r5 = 0;
                    anonymousClass118 = null;
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
                    PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(size.getWidth(), size.getHeight(), i, i2, i3, i3);
                    width = size.getWidth();
                    height = size.getHeight();
                    rGBLuminanceSource = planarYUVLuminanceSource;
                }
                Result resultDecode = this.qrReader.decode(new BinaryBitmap(0, (Object) new GlobalHistogramBinarizer(rGBLuminanceSource), false));
                str = (String) resultDecode.text;
                ResultPoint[] resultPointArr = (ResultPoint[]) resultDecode.resultPoints;
                if (resultPointArr == null || resultPointArr.length == 0) {
                    anonymousClass118 = null;
                    r5 = 0;
                    rectF = null;
                } else {
                    int length4 = resultPointArr.length;
                    float fMax5 = Float.MIN_VALUE;
                    float fMin5 = Float.MAX_VALUE;
                    int i5 = 0;
                    while (i5 < length4) {
                        ResultPoint resultPoint = resultPointArr[i5];
                        float f = resultPoint.x;
                        anonymousClass117 = anonymousClass119;
                        float f2 = resultPoint.y;
                        try {
                            fMin = Math.min(fMin, f);
                            fMax = Math.max(fMax, resultPoint.x);
                            fMin5 = Math.min(fMin5, f2);
                            fMax5 = Math.max(fMax5, f2);
                            i5++;
                            anonymousClass119 = anonymousClass117;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 6));
                            return anonymousClass117;
                        }
                    }
                    anonymousClass118 = anonymousClass119;
                    rectF.set(fMin, fMin5, fMax, fMax5);
                    if (resultPointArr.length == 4) {
                        r5 = new PointF[4];
                        while (i4 < 4) {
                            ResultPoint resultPoint2 = resultPointArr[i4];
                            r5[i4] = new PointF(resultPoint2.x / width, resultPoint2.y / height);
                            i4++;
                        }
                    } else {
                        r5 = anonymousClass118;
                    }
                }
            } else {
                anonymousClass118 = null;
                width = 1;
                str = null;
                r5 = 0;
                height = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 6));
                return anonymousClass118;
            }
            if (this.currentType == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(this, 6));
                return anonymousClass118;
            }
            ChatActivity.AnonymousClass117 anonymousClass1110 = new ChatActivity.AnonymousClass117();
            if (rectF != null) {
                float fDp = AndroidUtilities.dp(25.0f);
                float fDp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - fDp, rectF.top - fDp2, rectF.right + fDp, rectF.bottom + fDp2);
                float f3 = width;
                float f4 = height;
                rectF.set(rectF.left / f3, rectF.top / f4, rectF.right / f3, rectF.bottom / f4);
            }
            anonymousClass1110.this$0 = r5;
            anonymousClass1110.val$finalReactionsLayout = rectF;
            anonymousClass1110.val$primaryMessage = str;
            return anonymousClass1110;
        } catch (Throwable unused2) {
            anonymousClass117 = null;
        }
    }

    public final void updateNormalBounds() {
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

    public final class AnonymousClass3 extends ViewGroup {
        public final int $r8$classId = 0;
        public final Object path;
        public final BaseFragment this$0;

        public AnonymousClass3(CameraScanActivity cameraScanActivity, Context context) {
            super(context);
            this.this$0 = cameraScanActivity;
            this.path = new Path();
        }

        public static RectF aroundPoint(int i, int i2, int i3) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
            return rectF;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 0:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    CameraScanActivity cameraScanActivity = (CameraScanActivity) this.this$0;
                    if (!cameraScanActivity.isQr() || view != cameraScanActivity.cameraView) {
                        return zDrawChild;
                    }
                    float fMin = Math.min(1.0f, Math.max(0.0f, (SystemClock.elapsedRealtime() - cameraScanActivity.lastBoundsUpdate) / 75.0f));
                    if (fMin < 1.0f) {
                        cameraScanActivity.fragmentView.invalidate();
                    }
                    RectF rectF = cameraScanActivity.fromBounds;
                    RectF rectF2 = cameraScanActivity.bounds;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    AndroidUtilities.lerp(rectF, rectF2, fMin, rectF3);
                    if (cameraScanActivity.useRecognizedBounds < 1.0f) {
                        if (cameraScanActivity.normalBounds == null) {
                            cameraScanActivity.updateNormalBounds();
                        }
                        AndroidUtilities.lerp(cameraScanActivity.normalBounds, rectF3, cameraScanActivity.useRecognizedBounds, rectF3);
                    }
                    int iWidth = (int) (rectF3.width() * view.getWidth());
                    int iHeight = (int) (rectF3.height() * view.getHeight());
                    int iCenterX = (int) (rectF3.centerX() * view.getWidth());
                    int iCenterY = (int) (rectF3.centerY() * view.getHeight());
                    float f = cameraScanActivity.qrAppearingValue;
                    float f2 = (f * 0.5f) + 0.5f;
                    int i = (int) (iWidth * f2);
                    int i2 = (int) (f2 * iHeight);
                    int i3 = iCenterX - (i / 2);
                    int i4 = iCenterY - (i2 / 2);
                    cameraScanActivity.paint.setAlpha((int) ((1.0f - (Math.min(1.0f, f) * (1.0f - cameraScanActivity.backShadowAlpha))) * 255.0f));
                    float f3 = i4;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f3, cameraScanActivity.paint);
                    int i5 = i4 + i2;
                    float f4 = i5;
                    canvas.drawRect(0.0f, f4, view.getMeasuredWidth(), view.getMeasuredHeight(), cameraScanActivity.paint);
                    float f5 = i3;
                    canvas.drawRect(0.0f, f3, f5, f4, cameraScanActivity.paint);
                    int i6 = i3 + i;
                    float f6 = i6;
                    canvas.drawRect(f6, f3, view.getMeasuredWidth(), f4, cameraScanActivity.paint);
                    cameraScanActivity.paint.setAlpha((int) (Math.max(0.0f, 1.0f - cameraScanActivity.qrAppearingValue) * 255.0f));
                    canvas.drawRect(f5, f3, f6, f4, cameraScanActivity.paint);
                    int iLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), Math.min(1.0f, cameraScanActivity.qrAppearingValue * 20.0f));
                    int i7 = iLerp / 2;
                    int iLerp2 = AndroidUtilities.lerp(Math.min(i, i2), AndroidUtilities.dp(20.0f), Math.min(1.2f, (float) Math.pow(cameraScanActivity.qrAppearingValue, 1.7999999523162842d)));
                    cameraScanActivity.cornerPaint.setAlpha((int) (Math.min(1.0f, cameraScanActivity.qrAppearingValue) * 255.0f));
                    Path path = (Path) this.path;
                    path.reset();
                    int i8 = i4 + iLerp2;
                    path.arcTo(aroundPoint(i3, i8, i7), 0.0f, 180.0f);
                    float f7 = iLerp * 1.5f;
                    int i9 = (int) (f5 + f7);
                    int i10 = (int) (f3 + f7);
                    int i11 = iLerp * 2;
                    path.arcTo(aroundPoint(i9, i10, i11), 180.0f, 90.0f);
                    int i12 = i3 + iLerp2;
                    path.arcTo(aroundPoint(i12, i4, i7), 270.0f, 180.0f);
                    path.lineTo(i3 + i7, i4 + i7);
                    path.arcTo(aroundPoint(i9, i10, iLerp), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, cameraScanActivity.cornerPaint);
                    path.reset();
                    path.arcTo(aroundPoint(i6, i8, i7), 180.0f, -180.0f);
                    int i13 = (int) (f6 - f7);
                    path.arcTo(aroundPoint(i13, i10, i11), 0.0f, -90.0f);
                    int i14 = i6 - iLerp2;
                    path.arcTo(aroundPoint(i14, i4, i7), 270.0f, -180.0f);
                    path.arcTo(aroundPoint(i13, i10, iLerp), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, cameraScanActivity.cornerPaint);
                    path.reset();
                    int i15 = i5 - iLerp2;
                    path.arcTo(aroundPoint(i3, i15, i7), 0.0f, -180.0f);
                    int i16 = (int) (f4 - f7);
                    path.arcTo(aroundPoint(i9, i16, i11), 180.0f, -90.0f);
                    path.arcTo(aroundPoint(i12, i5, i7), 90.0f, -180.0f);
                    path.arcTo(aroundPoint(i9, i16, iLerp), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, cameraScanActivity.cornerPaint);
                    path.reset();
                    path.arcTo(aroundPoint(i6, i15, i7), 180.0f, 180.0f);
                    path.arcTo(aroundPoint(i13, i16, i11), 0.0f, 90.0f);
                    path.arcTo(aroundPoint(i14, i5, i7), 90.0f, 180.0f);
                    path.arcTo(aroundPoint(i13, i16, iLerp), 90.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, cameraScanActivity.cornerPaint);
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredHeight;
            int iDp;
            switch (this.$r8$classId) {
                case 0:
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    CameraScanActivity cameraScanActivity = (CameraScanActivity) this.this$0;
                    int i7 = cameraScanActivity.currentType;
                    if (i7 == 0) {
                        CameraView cameraView = cameraScanActivity.cameraView;
                        if (cameraView != null) {
                            cameraView.layout(0, 0, cameraView.getMeasuredWidth(), cameraScanActivity.cameraView.getMeasuredHeight());
                        }
                        cameraScanActivity.recognizedMrzView.setTextSize(0, i6 / 22);
                        cameraScanActivity.recognizedMrzView.setPadding(0, 0, 0, i6 / 15);
                        int i8 = (int) (i6 * 0.65f);
                        cameraScanActivity.titleTextView.layout(AndroidUtilities.dp(36.0f), i8, cameraScanActivity.titleTextView.getMeasuredWidth() + AndroidUtilities.dp(36.0f), cameraScanActivity.titleTextView.getMeasuredHeight() + i8);
                    } else {
                        ((BaseFragment) cameraScanActivity).actionBar.layout(0, 0, ((BaseFragment) cameraScanActivity).actionBar.getMeasuredWidth(), ((BaseFragment) cameraScanActivity).actionBar.getMeasuredHeight());
                        CameraView cameraView2 = cameraScanActivity.cameraView;
                        if (cameraView2 != null) {
                            cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), cameraScanActivity.cameraView.getMeasuredHeight());
                        }
                        int iMin = (int) (Math.min(i5, i6) / 1.5f);
                        if (i7 == 1) {
                            measuredHeight = ((i6 - iMin) / 2) - cameraScanActivity.titleTextView.getMeasuredHeight();
                            iDp = AndroidUtilities.dp(30.0f);
                        } else {
                            measuredHeight = ((i6 - iMin) / 2) - cameraScanActivity.titleTextView.getMeasuredHeight();
                            iDp = AndroidUtilities.dp(64.0f);
                        }
                        int i9 = measuredHeight - iDp;
                        cameraScanActivity.titleTextView.layout(AndroidUtilities.dp(36.0f), i9, cameraScanActivity.titleTextView.getMeasuredWidth() + AndroidUtilities.dp(36.0f), cameraScanActivity.titleTextView.getMeasuredHeight() + i9);
                        if (i7 == 3) {
                            int iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(cameraScanActivity.titleTextView.getMeasuredHeight(), 8.0f, i9);
                            cameraScanActivity.descriptionText.layout(AndroidUtilities.dp(36.0f), iM, cameraScanActivity.descriptionText.getMeasuredWidth() + AndroidUtilities.dp(36.0f), cameraScanActivity.descriptionText.getMeasuredHeight() + iM);
                        }
                        cameraScanActivity.recognizedMrzView.layout(0, getMeasuredHeight() - cameraScanActivity.recognizedMrzView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                        int measuredWidth = (i5 / 2) - (cameraScanActivity.flashButton.getMeasuredWidth() / 2);
                        int iDp2 = AndroidUtilities.dp(80.0f) + RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(i6, iMin, 2, iMin);
                        ImageView imageView = cameraScanActivity.flashButton;
                        imageView.layout(measuredWidth, iDp2, imageView.getMeasuredWidth() + measuredWidth, cameraScanActivity.flashButton.getMeasuredHeight() + iDp2);
                    }
                    if (i7 != 3) {
                        int i10 = (int) (i6 * 0.74f);
                        int i11 = (int) (i5 * 0.05f);
                        TextView textView = cameraScanActivity.descriptionText;
                        textView.layout(i11, i10, textView.getMeasuredWidth() + i11, cameraScanActivity.descriptionText.getMeasuredHeight() + i10);
                    }
                    cameraScanActivity.updateNormalBounds();
                    break;
                default:
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    ((BaseFragment) twoStepVerificationSetupActivity).actionBar.layout(0, 0, ((BaseFragment) twoStepVerificationSetupActivity).actionBar.getMeasuredWidth(), ((BaseFragment) twoStepVerificationSetupActivity).actionBar.getMeasuredHeight());
                    ChatActivity.AnonymousClass27 anonymousClass27 = twoStepVerificationSetupActivity.actionBarBackground;
                    anonymousClass27.layout(0, 0, anonymousClass27.getMeasuredWidth(), twoStepVerificationSetupActivity.actionBarBackground.getMeasuredHeight());
                    PasscodeActivity.AnonymousClass2 anonymousClass2 = (PasscodeActivity.AnonymousClass2) this.path;
                    anonymousClass2.layout(0, 0, anonymousClass2.getMeasuredWidth(), anonymousClass2.getMeasuredHeight());
                    break;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    CameraScanActivity cameraScanActivity = (CameraScanActivity) this.this$0;
                    ((BaseFragment) cameraScanActivity).actionBar.measure(i, i2);
                    int i3 = cameraScanActivity.currentType;
                    if (i3 == 0) {
                        CameraView cameraView = cameraScanActivity.cameraView;
                        if (cameraView != null) {
                            cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                        }
                    } else {
                        CameraView cameraView2 = cameraScanActivity.cameraView;
                        if (cameraView2 != null) {
                            cameraView2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                        cameraScanActivity.recognizedMrzView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                        cameraScanActivity.flashButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    }
                    cameraScanActivity.titleTextView.measure(OKLCH.m(size, 72.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    if (i3 == 3) {
                        cameraScanActivity.descriptionText.measure(OKLCH.m(size, 72.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    } else {
                        cameraScanActivity.descriptionText.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    }
                    setMeasuredDimension(size, size2);
                    break;
                default:
                    int size3 = View.MeasureSpec.getSize(i);
                    int size4 = View.MeasureSpec.getSize(i2);
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = (TwoStepVerificationSetupActivity) this.this$0;
                    ((BaseFragment) twoStepVerificationSetupActivity).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                    twoStepVerificationSetupActivity.actionBarBackground.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f) + ((BaseFragment) twoStepVerificationSetupActivity).actionBar.getMeasuredHeight(), 1073741824));
                    ((PasscodeActivity.AnonymousClass2) this.path).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                    setMeasuredDimension(size3, size4);
                    break;
            }
        }

        public AnonymousClass3(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, Context context, PasscodeActivity.AnonymousClass2 anonymousClass2) {
            super(context);
            this.this$0 = twoStepVerificationSetupActivity;
            this.path = anonymousClass2;
        }
    }

    public final class AnonymousClass4 extends TextView {
        public final int $r8$classId = 0;
        public final Object links;
        public Object pressedLink;
        public Path textPath;
        public final Paint val$selectionPaint;

        public AnonymousClass4(Context context, Paint paint) {
            super(context);
            this.val$selectionPaint = paint;
            this.links = new LinkSpanDrawable.LinkCollector(this);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    Paint paint = this.val$selectionPaint;
                    paint.setColor(Theme.multAlpha(0.15f, Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((SearchTagsList) this.links).resourcesProvider)));
                    RectF rectF = (RectF) this.pressedLink;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    Path path = this.textPath;
                    Paint paint2 = ReactionsLayoutInBubble.paint;
                    ReactionsLayoutInBubble.fillTagPath(rectF, AndroidUtilities.rectTmp, path);
                    canvas.drawPath(path, paint);
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    LinkPath linkPath = (LinkPath) this.textPath;
                    if (linkPath != null) {
                        canvas.drawPath(linkPath, this.val$selectionPaint);
                    }
                    if (((LinkSpanDrawable.LinkCollector) this.links).draw(canvas)) {
                        invalidate();
                    }
                    super.onDraw(canvas);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    super.onLayout(z, i, i2, i3, i4);
                    int width = getWidth();
                    int i5 = 0;
                    int iMax = 0;
                    while (true) {
                        SearchTagsList searchTagsList = (SearchTagsList) this.links;
                        if (i5 >= searchTagsList.getChildCount()) {
                            setPivotX((width + iMax) / 2.0f);
                        } else {
                            width = Math.min(width, searchTagsList.getChildAt(i5).getLeft());
                            iMax = Math.max(iMax, searchTagsList.getChildAt(i5).getRight());
                            i5++;
                        }
                        break;
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    if (getText() instanceof Spanned) {
                        Spanned spanned = (Spanned) getText();
                        URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
                        if (uRLSpanNoUnderlineArr != null && uRLSpanNoUnderlineArr.length > 0) {
                            LinkPath linkPath = new LinkPath(0);
                            this.textPath = linkPath;
                            linkPath.allowReset = false;
                            for (int i3 = 0; i3 < uRLSpanNoUnderlineArr.length; i3++) {
                                int spanStart = spanned.getSpanStart(uRLSpanNoUnderlineArr[i3]);
                                int spanEnd = spanned.getSpanEnd(uRLSpanNoUnderlineArr[i3]);
                                ((LinkPath) this.textPath).setCurrentLayout(getLayout(), spanStart, 0.0f, 0.0f);
                                int i4 = getText() != null ? getPaint().baselineShift : 0;
                                LinkPath linkPath2 = (LinkPath) this.textPath;
                                linkPath2.baselineShift = i4 != 0 ? AndroidUtilities.dp(i4 > 0 ? 5.0f : -2.0f) + i4 : 0;
                                getLayout().getSelectionPath(spanStart, spanEnd, (LinkPath) this.textPath);
                            }
                            ((LinkPath) this.textPath).allowReset = true;
                            break;
                        }
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            ClickableSpan clickableSpan;
            switch (this.$r8$classId) {
                case 0:
                    Layout layout = getLayout();
                    float f = 0;
                    int x = (int) (motionEvent.getX() - f);
                    int y = (int) (motionEvent.getY() - f);
                    int action = motionEvent.getAction();
                    LinkSpanDrawable.LinkCollector linkCollector = (LinkSpanDrawable.LinkCollector) this.links;
                    if (action == 0 || motionEvent.getAction() == 1) {
                        int lineForVertical = layout.getLineForVertical(y);
                        float f2 = x;
                        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
                        float lineLeft = layout.getLineLeft(lineForVertical);
                        if (lineLeft <= f2 && layout.getLineWidth(lineForVertical) + lineLeft >= f2 && y >= 0 && y <= layout.getHeight()) {
                            Spannable spannable = (Spannable) layout.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                linkCollector.clear(true);
                                if (motionEvent.getAction() != 0) {
                                    if (motionEvent.getAction() != 1) {
                                        return true;
                                    }
                                    LinkSpanDrawable linkSpanDrawable = (LinkSpanDrawable) this.pressedLink;
                                    if (linkSpanDrawable != null && linkSpanDrawable.mSpan == (clickableSpan = clickableSpanArr[0])) {
                                        clickableSpan.onClick(this);
                                    }
                                    this.pressedLink = null;
                                    return true;
                                }
                                LinkSpanDrawable linkSpanDrawable2 = new LinkSpanDrawable(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY());
                                this.pressedLink = linkSpanDrawable2;
                                linkSpanDrawable2.setColor(771751935);
                                linkCollector.addLink((LinkSpanDrawable) this.pressedLink, null);
                                int spanStart = spannable.getSpanStart(((LinkSpanDrawable) this.pressedLink).mSpan);
                                int spanEnd = spannable.getSpanEnd(((LinkSpanDrawable) this.pressedLink).mSpan);
                                LinkPath linkPathObtainNewPath = ((LinkSpanDrawable) this.pressedLink).obtainNewPath();
                                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f, f);
                                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                                return true;
                            }
                        }
                    }
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        linkCollector.clear(true);
                        this.pressedLink = null;
                    }
                    return super.onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        public AnonymousClass4(SearchTagsList searchTagsList, Context context) {
            super(context);
            this.links = searchTagsList;
            this.textPath = new Path();
            this.pressedLink = new RectF();
            this.val$selectionPaint = new Paint();
        }
    }
}
