package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class QRScanner {
    private Bitmap cacheBitmap;
    private CameraView cameraView;
    private Detected lastDetected;
    private final Utilities.Callback listener;
    private final AtomicReference detector = new AtomicReference();
    private final AtomicBoolean paused = new AtomicBoolean(false);
    private final Runnable process = new Runnable() {
        @Override
        public final void run() {
            QRScanner.$r8$lambda$1_Vg2vmx2y4lzqjH_K8pBklWzv8(this.f$0);
        }
    };
    private final String prefix = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public QRScanner(final Context context, Utilities.Callback callback) {
        this.listener = callback;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                QRScanner.m4569$r8$lambda$MIkoa3N5R7Md9nU4Klkrz42HSY(this.f$0, context);
            }
        });
    }

    public static void m4569$r8$lambda$MIkoa3N5R7Md9nU4Klkrz42HSY(QRScanner qRScanner, Context context) {
        qRScanner.detector.set(new BarcodeDetector.Builder(context).setBarcodeFormats(256).build());
        qRScanner.attach(qRScanner.cameraView);
    }

    public Detected getDetected() {
        return this.lastDetected;
    }

    public void destroy() {
        this.cameraView = null;
        Utilities.globalQueue.cancelRunnable(this.process);
    }

    public void attach(CameraView cameraView) {
        this.cameraView = cameraView;
        if (this.detector.get() == null || this.paused.get()) {
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.process);
        Utilities.globalQueue.postRunnable(this.process, getTimeout());
    }

    public void setPaused(boolean z) {
        if (this.paused.getAndSet(z) == z) {
            return;
        }
        if (z) {
            Utilities.globalQueue.cancelRunnable(this.process);
            if (this.lastDetected != null) {
                this.lastDetected = null;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.listener.run(null);
                    }
                });
                return;
            }
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.process);
        Utilities.globalQueue.postRunnable(this.process, getTimeout());
    }

    public static void $r8$lambda$1_Vg2vmx2y4lzqjH_K8pBklWzv8(final QRScanner qRScanner) {
        if (qRScanner.detector.get() == null || qRScanner.cameraView == null || qRScanner.paused.get()) {
            return;
        }
        TextureView textureView = qRScanner.cameraView.getTextureView();
        if (textureView != null) {
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            if (width > 720 || height > 720) {
                float f = width;
                float f2 = height;
                float fMin = Math.min(720.0f / f, 720.0f / f2);
                width = (int) (f * fMin);
                height = (int) (f2 * fMin);
            }
            int iMax = Math.max(1, width);
            int iMax2 = Math.max(1, height);
            Bitmap bitmap = qRScanner.cacheBitmap;
            if (bitmap == null || iMax != bitmap.getWidth() || iMax2 != qRScanner.cacheBitmap.getHeight()) {
                qRScanner.cacheBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            }
            textureView.getBitmap(qRScanner.cacheBitmap);
            final Detected detectedDetect = qRScanner.detect(qRScanner.cacheBitmap);
            Detected detected = qRScanner.lastDetected;
            if ((detected != null) != (detectedDetect != null) || (detectedDetect != null && detected != null && !detectedDetect.equals(detected))) {
                qRScanner.lastDetected = detectedDetect;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.listener.run(detectedDetect);
                    }
                });
            }
        }
        if (qRScanner.paused.get()) {
            return;
        }
        Utilities.globalQueue.cancelRunnable(qRScanner.process);
        Utilities.globalQueue.postRunnable(qRScanner.process, qRScanner.getTimeout());
    }

    private Detected detect(Bitmap bitmap) {
        BarcodeDetector barcodeDetector;
        if (bitmap != null && (barcodeDetector = (BarcodeDetector) this.detector.get()) != null && barcodeDetector.isOperational()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            SparseArray sparseArrayDetect = barcodeDetector.detect(new Frame.Builder().setBitmap(bitmap).build());
            for (int i = 0; i < sparseArrayDetect.size(); i++) {
                Barcode barcode = (Barcode) sparseArrayDetect.valueAt(i);
                String str = barcode.rawValue;
                if (str != null) {
                    String strTrim = str.trim();
                    if (!strTrim.startsWith(this.prefix)) {
                        if (!strTrim.startsWith("https://" + this.prefix)) {
                            if (!strTrim.startsWith("http://" + this.prefix)) {
                            }
                        }
                    }
                    PointF[] pointFArr = new PointF[barcode.cornerPoints.length];
                    for (int i2 = 0; i2 < barcode.cornerPoints.length; i2++) {
                        Point point = barcode.cornerPoints[i2];
                        pointFArr[i2] = new PointF(point.x / width, point.y / height);
                    }
                    return new Detected(strTrim, pointFArr);
                }
            }
        }
        return null;
    }

    public long getTimeout() {
        if (this.lastDetected == null) {
            return 750L;
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public static final class Detected {
        public final float cx;
        public final float cy;
        public final String link;
        public final PointF[] points;

        private Detected(String str, PointF[] pointFArr) {
            float length;
            this.link = str;
            this.points = pointFArr;
            float f = 0.0f;
            if (pointFArr != null) {
                float f2 = 0.0f;
                for (PointF pointF : pointFArr) {
                    f2 += pointF.x;
                    f += pointF.y;
                }
                float length2 = f2 / pointFArr.length;
                length = f / pointFArr.length;
                f = length2;
            } else {
                length = 0.0f;
            }
            this.cx = f;
            this.cy = length;
        }

        public boolean equals(Detected detected) {
            if (detected == null || !TextUtils.equals(this.link, detected.link)) {
                return false;
            }
            PointF[] pointFArr = this.points;
            PointF[] pointFArr2 = detected.points;
            if (pointFArr == pointFArr2) {
                return true;
            }
            if ((pointFArr != null) != (pointFArr2 != null) || pointFArr == null || pointFArr2 == null || pointFArr.length != pointFArr2.length) {
                return false;
            }
            int i = 0;
            while (true) {
                PointF[] pointFArr3 = this.points;
                if (i >= pointFArr3.length) {
                    return true;
                }
                if (Math.abs(pointFArr3[i].x - detected.points[i].x) > 0.001f || Math.abs(this.points[i].y - detected.points[i].y) > 0.001f) {
                    return false;
                }
                i++;
            }
        }
    }

    public static class QrRegionDrawer {
        private final AnimatedFloat[] animatedQPX;
        private final AnimatedFloat[] animatedQPY;
        private final AnimatedFloat animatedQr;
        private final AnimatedFloat animatedQrCX;
        private final AnimatedFloat animatedQrCY;
        private boolean hasQrResult;
        private final Runnable invalidate;
        private final Paint qrPaint;
        private final Path qrPath;
        private Detected qrResult;

        public QrRegionDrawer(Runnable runnable) {
            Paint paint = new Paint(1);
            this.qrPaint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-8697);
            paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
            this.qrPath = new Path();
            this.invalidate = runnable;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            this.animatedQr = new AnimatedFloat(0.0f, runnable, 0L, 320L, cubicBezierInterpolator);
            this.animatedQrCX = new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator);
            this.animatedQrCY = new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator);
            this.animatedQPX = new AnimatedFloat[]{new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator)};
            this.animatedQPY = new AnimatedFloat[]{new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator), new AnimatedFloat(0.0f, runnable, 0L, 160L, cubicBezierInterpolator)};
        }

        public void draw(Canvas canvas, RectF rectF) {
            Detected detected = this.qrResult;
            if (detected == null || detected.points.length <= 0) {
                return;
            }
            float f = this.animatedQr.set(this.hasQrResult);
            float f2 = this.animatedQrCX.set(this.qrResult.cx);
            float fWidth = rectF.left + (rectF.width() * f2);
            float f3 = this.animatedQrCY.set(this.qrResult.cy);
            float fHeight = rectF.top + (rectF.height() * f3);
            float fLerp = AndroidUtilities.lerp(0.5f, 1.1f, f);
            canvas.save();
            canvas.scale(fLerp, fLerp, fWidth, fHeight);
            if (f > 0.0f) {
                this.qrPath.rewind();
                int iMin = Math.min(4, this.qrResult.points.length);
                int i = 0;
                while (i < iMin) {
                    int i2 = i - 1;
                    if (i2 < 0) {
                        i2 = iMin - 1;
                    }
                    int i3 = i + 1;
                    int i4 = i3 >= iMin ? 0 : i3;
                    Detected detected2 = this.qrResult;
                    PointF[] pointFArr = detected2.points;
                    PointF pointF = pointFArr[i2];
                    PointF pointF2 = pointFArr[i];
                    PointF pointF3 = pointFArr[i4];
                    float f4 = f;
                    float f5 = f2;
                    float fWidth2 = rectF.left + ((this.animatedQPX[i2].set(pointF.x - detected2.cx) + f5) * rectF.width());
                    float fHeight2 = rectF.top + ((this.animatedQPY[i2].set(pointF.y - this.qrResult.cy) + f3) * rectF.height());
                    float fWidth3 = rectF.left + ((this.animatedQPX[i].set(pointF2.x - this.qrResult.cx) + f5) * rectF.width());
                    float fHeight3 = rectF.top + ((this.animatedQPY[i].set(pointF2.y - this.qrResult.cy) + f3) * rectF.height());
                    float fWidth4 = rectF.left + ((this.animatedQPX[i4].set(pointF3.x - this.qrResult.cx) + f5) * rectF.width());
                    float fHeight4 = (rectF.top + ((this.animatedQPY[i4].set(pointF3.y - this.qrResult.cy) + f3) * rectF.height())) - fHeight3;
                    this.qrPath.moveTo(((fWidth2 - fWidth3) * 0.18f) + fWidth3, ((fHeight2 - fHeight3) * 0.18f) + fHeight3);
                    this.qrPath.lineTo(fWidth3, fHeight3);
                    this.qrPath.lineTo(fWidth3 + ((fWidth4 - fWidth3) * 0.18f), fHeight3 + (fHeight4 * 0.18f));
                    i = i3;
                    f = f4;
                    f2 = f5;
                }
                this.qrPaint.setAlpha((int) (255.0f * f));
                canvas.drawPath(this.qrPath, this.qrPaint);
            }
            canvas.restore();
        }

        public void setQrDetected(Detected detected) {
            if (detected != null) {
                this.qrResult = detected;
            }
            if (detected != null && !this.hasQrResult) {
                this.animatedQrCX.set(detected.cx, true);
                this.animatedQrCY.set(detected.cy, true);
                for (int i = 0; i < Math.min(4, detected.points.length); i++) {
                    this.animatedQPX[i].set(detected.points[i].x - detected.cx, true);
                    this.animatedQPY[i].set(detected.points[i].y - detected.cy, true);
                }
            }
            this.hasQrResult = detected != null;
            this.invalidate.run();
        }

        public boolean hasNoDraw() {
            return !this.hasQrResult && this.animatedQr.get() <= 0.0f;
        }
    }
}
