package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;

public final class QRScanner {
    public Bitmap cacheBitmap;
    public StoryRecorder.AnonymousClass25 cameraView;
    public Detected lastDetected;
    public final StoryRecorder$$ExternalSyntheticLambda19 listener;
    public final AtomicReference detector = new AtomicReference();
    public final AtomicBoolean paused = new AtomicBoolean(false);
    public final QRScanner$$ExternalSyntheticLambda0 process = new QRScanner$$ExternalSyntheticLambda0(this, 0);
    public final String prefix = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public final class Detected {
        public final float cx;
        public final float cy;
        public final String link;
        public final PointF[] points;

        public Detected(String str, PointF[] pointFArr) {
            this.link = str;
            this.points = pointFArr;
            float f = 0.0f;
            float f2 = 0.0f;
            for (PointF pointF : pointFArr) {
                f2 += pointF.x;
                f += pointF.y;
            }
            float length = f2 / pointFArr.length;
            float length2 = f / pointFArr.length;
            this.cx = length;
            this.cy = length2;
        }
    }

    public final class QrRegionDrawer {
        public final AnimatedFloat[] animatedQPX;
        public final AnimatedFloat[] animatedQPY;
        public final AnimatedFloat animatedQr;
        public final AnimatedFloat animatedQrCX;
        public final AnimatedFloat animatedQrCY;
        public boolean hasQrResult;
        public final CollageLayoutView2$$ExternalSyntheticLambda0 invalidate;
        public final Paint qrPaint;
        public final Path qrPath;
        public Detected qrResult;

        public QrRegionDrawer(CollageLayoutView2$$ExternalSyntheticLambda0 collageLayoutView2$$ExternalSyntheticLambda0) {
            Paint paint = new Paint(1);
            this.qrPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-8697);
            paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
            this.qrPath = new Path();
            this.invalidate = collageLayoutView2$$ExternalSyntheticLambda0;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            this.animatedQr = new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 320L, cubicBezierInterpolator);
            this.animatedQrCX = new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator);
            this.animatedQrCY = new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator);
            this.animatedQPX = new AnimatedFloat[]{new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator)};
            this.animatedQPY = new AnimatedFloat[]{new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, collageLayoutView2$$ExternalSyntheticLambda0, 0L, 160L, cubicBezierInterpolator)};
        }

        public final void setQrDetected(Detected detected) {
            if (detected != null) {
                this.qrResult = detected;
            }
            if (detected != null && !this.hasQrResult) {
                AnimatedFloat animatedFloat = this.animatedQrCX;
                float f = detected.cx;
                animatedFloat.set(f, true);
                AnimatedFloat animatedFloat2 = this.animatedQrCY;
                float f2 = detected.cy;
                animatedFloat2.set(f2, true);
                int i = 0;
                while (true) {
                    PointF[] pointFArr = detected.points;
                    if (i >= Math.min(4, pointFArr.length)) {
                        break;
                    }
                    this.animatedQPX[i].set(pointFArr[i].x - f, true);
                    this.animatedQPY[i].set(pointFArr[i].y - f2, true);
                    i++;
                }
            }
            this.hasQrResult = detected != null;
            this.invalidate.run();
        }
    }

    public QRScanner(Context context, StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19) {
        this.listener = storyRecorder$$ExternalSyntheticLambda19;
        Utilities.globalQueue.postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(23, this, context));
    }

    public final void setPaused(boolean z) {
        long j;
        if (this.paused.getAndSet(z) == z) {
            return;
        }
        if (z) {
            Utilities.globalQueue.cancelRunnable(this.process);
            if (this.lastDetected != null) {
                this.lastDetected = null;
                AndroidUtilities.runOnUIThread(new QRScanner$$ExternalSyntheticLambda0(this, 1));
                return;
            }
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.process);
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        QRScanner$$ExternalSyntheticLambda0 qRScanner$$ExternalSyntheticLambda0 = this.process;
        if (this.lastDetected == null) {
            j = 750;
        } else {
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass != 1) {
                j = devicePerformanceClass != 2 ? 800L : 80L;
            } else {
                j = 400;
            }
        }
        dispatchQueue.postRunnable(qRScanner$$ExternalSyntheticLambda0, j);
    }
}
