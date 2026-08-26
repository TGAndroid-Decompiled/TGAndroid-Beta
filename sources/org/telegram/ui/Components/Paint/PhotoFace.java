package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import org.telegram.ui.Components.Size;

public final class PhotoFace {
    public final float angle;
    public final PointF chinPoint;
    public final PointF eyesCenterPoint;
    public final float eyesDistance;
    public final PointF foreheadPoint;
    public final PointF mouthPoint;
    public final float width;

    public PhotoFace(Face face, Bitmap bitmap, Size size, boolean z) {
        PointF pointFTransposePoint = null;
        PointF pointFTransposePoint2 = null;
        PointF pointFTransposePoint3 = null;
        PointF pointFTransposePoint4 = null;
        for (Landmark landmark : face.zzh) {
            PointF pointF = landmark.zza;
            int i = landmark.zzb;
            if (i == 4) {
                pointFTransposePoint = transposePoint(pointF, bitmap, size, z);
            } else if (i == 5) {
                pointFTransposePoint3 = transposePoint(pointF, bitmap, size, z);
            } else if (i == 10) {
                pointFTransposePoint2 = transposePoint(pointF, bitmap, size, z);
            } else if (i == 11) {
                pointFTransposePoint4 = transposePoint(pointF, bitmap, size, z);
            }
        }
        if (pointFTransposePoint != null && pointFTransposePoint2 != null) {
            if (pointFTransposePoint.x >= pointFTransposePoint2.x) {
                PointF pointF2 = pointFTransposePoint2;
                pointFTransposePoint2 = pointFTransposePoint;
                pointFTransposePoint = pointF2;
            }
            PointF pointF3 = new PointF((pointFTransposePoint.x * 0.5f) + (pointFTransposePoint2.x * 0.5f), (pointFTransposePoint.y * 0.5f) + (pointFTransposePoint2.y * 0.5f));
            this.eyesCenterPoint = pointF3;
            float fHypot = (float) Math.hypot(pointFTransposePoint.x - pointFTransposePoint2.x, pointFTransposePoint.y - pointFTransposePoint2.y);
            this.eyesDistance = fHypot;
            float degrees = (float) Math.toDegrees(Math.atan2(pointFTransposePoint.y - pointFTransposePoint2.y, pointFTransposePoint.x - pointFTransposePoint2.x) + 3.141592653589793d);
            this.angle = degrees;
            this.width = 2.35f * fHypot;
            float f = fHypot * 0.8f;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.foreheadPoint = new PointF((((float) Math.cos(radians)) * f) + pointF3.x, (f * ((float) Math.sin(radians))) + pointF3.y);
        }
        if (pointFTransposePoint3 == null || pointFTransposePoint4 == null) {
            return;
        }
        if (pointFTransposePoint3.x >= pointFTransposePoint4.x) {
            PointF pointF4 = pointFTransposePoint4;
            pointFTransposePoint4 = pointFTransposePoint3;
            pointFTransposePoint3 = pointF4;
        }
        PointF pointF5 = new PointF((pointFTransposePoint3.x * 0.5f) + (pointFTransposePoint4.x * 0.5f), (pointFTransposePoint3.y * 0.5f) + (pointFTransposePoint4.y * 0.5f));
        this.mouthPoint = pointF5;
        float f2 = this.eyesDistance * 0.7f;
        double radians2 = (float) Math.toRadians(this.angle + 90.0f);
        this.chinPoint = new PointF((((float) Math.cos(radians2)) * f2) + pointF5.x, (f2 * ((float) Math.sin(radians2))) + pointF5.y);
    }

    public static PointF transposePoint(PointF pointF, Bitmap bitmap, Size size, boolean z) {
        return new PointF((size.width * pointF.x) / (z ? bitmap.getHeight() : bitmap.getWidth()), (size.height * pointF.y) / (z ? bitmap.getWidth() : bitmap.getHeight()));
    }
}
