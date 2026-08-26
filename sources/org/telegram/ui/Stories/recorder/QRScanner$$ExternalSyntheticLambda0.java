package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import com.google.android.gms.vision.Frame$Metadata;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.Result;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;

public final class QRScanner$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final QRScanner f$0;

    public QRScanner$$ExternalSyntheticLambda0(QRScanner qRScanner, int i) {
        this.$r8$classId = i;
        this.f$0 = qRScanner;
    }

    @Override
    public final void run() {
        long j;
        QRScanner.Detected detected;
        BarcodeDetector barcodeDetector;
        switch (this.$r8$classId) {
            case 0:
                QRScanner qRScanner = this.f$0;
                if (qRScanner.detector.get() != null && qRScanner.cameraView != null && !qRScanner.paused.get()) {
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
                        Bitmap bitmap2 = qRScanner.cacheBitmap;
                        int i = 0;
                        if (bitmap2 == null || (barcodeDetector = (BarcodeDetector) qRScanner.detector.get()) == null || !barcodeDetector.zza.zzb()) {
                            detected = null;
                        } else {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            Result result = new Result();
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            result.resultMetadata = bitmap2;
                            Frame$Metadata frame$Metadata = (Frame$Metadata) result.text;
                            frame$Metadata.zza = width3;
                            frame$Metadata.zzb = height3;
                            SparseArray sparseArrayDetect = barcodeDetector.detect(result);
                            int i2 = 0;
                            while (true) {
                                if (i2 < sparseArrayDetect.size()) {
                                    Barcode barcode = (Barcode) sparseArrayDetect.valueAt(i2);
                                    String str = barcode.rawValue;
                                    if (str != null) {
                                        String strTrim = str.trim();
                                        if (!strTrim.startsWith(qRScanner.prefix)) {
                                            if (!strTrim.startsWith("https://" + qRScanner.prefix)) {
                                                if (!strTrim.startsWith("http://" + qRScanner.prefix)) {
                                                }
                                            }
                                        }
                                        PointF[] pointFArr = new PointF[barcode.cornerPoints.length];
                                        for (int i3 = 0; i3 < barcode.cornerPoints.length; i3++) {
                                            Point point = barcode.cornerPoints[i3];
                                            pointFArr[i3] = new PointF(point.x / width2, point.y / height2);
                                        }
                                        detected = new QRScanner.Detected(strTrim, pointFArr);
                                    }
                                    i2++;
                                } else {
                                    detected = null;
                                }
                            }
                        }
                        QRScanner.Detected detected2 = qRScanner.lastDetected;
                        if ((detected2 != null) != (detected != null)) {
                            qRScanner.lastDetected = detected;
                            AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(24, qRScanner, detected));
                        } else if (detected != null && detected2 != null) {
                            if (TextUtils.equals(detected.link, detected2.link)) {
                                PointF[] pointFArr2 = detected.points;
                                PointF[] pointFArr3 = detected2.points;
                                if (pointFArr2 != pointFArr3) {
                                    if (pointFArr2.length != pointFArr3.length) {
                                        qRScanner.lastDetected = detected;
                                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(24, qRScanner, detected));
                                    } else {
                                        while (true) {
                                            PointF[] pointFArr4 = detected.points;
                                            if (i < pointFArr4.length) {
                                                if (Math.abs(pointFArr4[i].x - detected2.points[i].x) > 0.001f || Math.abs(detected.points[i].y - detected2.points[i].y) > 0.001f) {
                                                    qRScanner.lastDetected = detected;
                                                    AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(24, qRScanner, detected));
                                                } else {
                                                    i++;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                qRScanner.lastDetected = detected;
                                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(24, qRScanner, detected));
                            }
                        }
                    }
                    if (!qRScanner.paused.get()) {
                        Utilities.globalQueue.cancelRunnable(qRScanner.process);
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        QRScanner$$ExternalSyntheticLambda0 qRScanner$$ExternalSyntheticLambda0 = qRScanner.process;
                        if (qRScanner.lastDetected == null) {
                            j = 750;
                        } else {
                            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                            j = devicePerformanceClass != 1 ? devicePerformanceClass != 2 ? 800L : 80L : 400L;
                        }
                        dispatchQueue.postRunnable(qRScanner$$ExternalSyntheticLambda0, j);
                    }
                    break;
                }
                break;
            default:
                this.f$0.listener.run(null);
                break;
        }
    }
}
