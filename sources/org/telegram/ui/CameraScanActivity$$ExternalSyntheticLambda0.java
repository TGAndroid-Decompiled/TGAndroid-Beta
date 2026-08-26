package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzm;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.stripe.android.Stripe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class CameraScanActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda0(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void run() {
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.initCameraView();
                break;
            case 1:
                CameraScanActivity cameraScanActivity = this.f$0;
                if (!cameraScanActivity.isFinishing()) {
                    cameraScanActivity.recognizedText = null;
                    cameraScanActivity.recognized = false;
                    cameraScanActivity.requestShot.run();
                    if (!cameraScanActivity.recognized) {
                        AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(cameraScanActivity, 8), 500L);
                    }
                    break;
                }
                break;
            case 2:
                CameraScanActivity cameraScanActivity2 = this.f$0;
                CameraView cameraView = cameraScanActivity2.cameraView;
                if (cameraView != null) {
                    cameraScanActivity2.processShot(cameraView.getTextureView().getBitmap());
                }
                break;
            case 3:
                this.f$0.finishFragment();
                break;
            case 4:
                CameraScanActivity cameraScanActivity3 = this.f$0;
                CameraScanActivity.CameraScanActivityDelegate cameraScanActivityDelegate = cameraScanActivity3.delegate;
                if (cameraScanActivityDelegate != null) {
                    cameraScanActivityDelegate.didFindQr(cameraScanActivity3.recognizedText);
                }
                cameraScanActivity3.finishFragment();
                break;
            case 5:
                CameraScanActivity cameraScanActivity4 = this.f$0;
                cameraScanActivity4.qrReader = new Stripe(10);
                Context context = ApplicationLoader.applicationContext;
                zzk zzkVar = new zzk();
                zzkVar.zza = 256;
                cameraScanActivity4.visionQrReader = new BarcodeDetector(new zzm(context, zzkVar));
                break;
            case 6:
                CameraScanActivity cameraScanActivity5 = this.f$0;
                if (cameraScanActivity5.recognizedMrzView.getTag() != null) {
                    cameraScanActivity5.recognizedMrzView.setTag(null);
                    cameraScanActivity5.recognizedMrzView.animate().setDuration(200L).alpha(0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                }
                break;
            case 7:
                CameraScanActivity cameraScanActivity6 = this.f$0;
                CameraView cameraView2 = cameraScanActivity6.cameraView;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(cameraScanActivity6.cameraView.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(cameraScanActivity6, 4));
                break;
            default:
                CameraScanActivity cameraScanActivity7 = this.f$0;
                float f = cameraScanActivity7.recognizedT;
                float f2 = cameraScanActivity7.recognized ? 1.0f : 0.0f;
                cameraScanActivity7.newRecognizedT = f2;
                if (f != f2) {
                    ValueAnimator valueAnimator = cameraScanActivity7.recognizedAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(cameraScanActivity7.recognizedT, cameraScanActivity7.newRecognizedT);
                    cameraScanActivity7.recognizedAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda5(cameraScanActivity7, i));
                    cameraScanActivity7.recognizedAnimator.setDuration((long) (Math.abs(cameraScanActivity7.recognizedT - cameraScanActivity7.newRecognizedT) * 300.0f));
                    cameraScanActivity7.recognizedAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    cameraScanActivity7.recognizedAnimator.start();
                    SpringAnimation springAnimation = cameraScanActivity7.useRecognizedBoundsAnimator;
                    if (springAnimation != null) {
                        springAnimation.cancel();
                    }
                    SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder((cameraScanActivity7.recognized ? cameraScanActivity7.useRecognizedBounds : 1.0f - cameraScanActivity7.useRecognizedBounds) * 500.0f));
                    cameraScanActivity7.useRecognizedBoundsAnimator = springAnimation2;
                    springAnimation2.addUpdateListener(new CameraScanActivity$$ExternalSyntheticLambda13(cameraScanActivity7, i));
                    cameraScanActivity7.useRecognizedBoundsAnimator.mSpring = new SpringForce(500.0f);
                    cameraScanActivity7.useRecognizedBoundsAnimator.mSpring.setDampingRatio(1.0f);
                    cameraScanActivity7.useRecognizedBoundsAnimator.mSpring.setStiffness(500.0f);
                    cameraScanActivity7.useRecognizedBoundsAnimator.start();
                }
                break;
        }
    }
}
