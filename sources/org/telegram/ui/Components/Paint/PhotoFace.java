package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import org.telegram.ui.Components.Size;

public class PhotoFace {
    private float angle;
    private PointF chinPoint;
    private PointF eyesCenterPoint;
    private float eyesDistance;
    private PointF foreheadPoint;
    private PointF mouthPoint;
    private float width;

    public PhotoFace(Face face, Bitmap bitmap, Size size, boolean z) {
        PointF pointFTransposePoint = null;
        PointF pointFTransposePoint2 = null;
        PointF pointFTransposePoint3 = null;
        PointF pointFTransposePoint4 = null;
        for (Landmark landmark : face.getLandmarks()) {
            PointF position = landmark.getPosition();
            int type = landmark.getType();
            if (type == 4) {
                pointFTransposePoint = transposePoint(position, bitmap, size, z);
            } else if (type == 5) {
                pointFTransposePoint3 = transposePoint(position, bitmap, size, z);
            } else if (type == 10) {
                pointFTransposePoint2 = transposePoint(position, bitmap, size, z);
            } else if (type == 11) {
                pointFTransposePoint4 = transposePoint(position, bitmap, size, z);
            }
        }
        if (pointFTransposePoint != null && pointFTransposePoint2 != null) {
            if (pointFTransposePoint.x >= pointFTransposePoint2.x) {
                PointF pointF = pointFTransposePoint2;
                pointFTransposePoint2 = pointFTransposePoint;
                pointFTransposePoint = pointF;
            }
            this.eyesCenterPoint = new PointF((pointFTransposePoint2.x * 0.5f) + (pointFTransposePoint.x * 0.5f), (pointFTransposePoint2.y * 0.5f) + (pointFTransposePoint.y * 0.5f));
            this.eyesDistance = (float) Math.hypot(pointFTransposePoint.x - pointFTransposePoint2.x, pointFTransposePoint.y - pointFTransposePoint2.y);
            float degrees = (float) Math.toDegrees(Math.atan2(pointFTransposePoint.y - pointFTransposePoint2.y, pointFTransposePoint.x - pointFTransposePoint2.x) + 3.141592653589793d);
            this.angle = degrees;
            float f = this.eyesDistance;
            this.width = 2.35f * f;
            float f2 = f * 0.8f;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.foreheadPoint = new PointF(this.eyesCenterPoint.x + (((float) Math.cos(radians)) * f2), this.eyesCenterPoint.y + (f2 * ((float) Math.sin(radians))));
        }
        if (pointFTransposePoint3 == null || pointFTransposePoint4 == null) {
            return;
        }
        if (pointFTransposePoint3.x < pointFTransposePoint4.x) {
            PointF pointF2 = pointFTransposePoint4;
            pointFTransposePoint4 = pointFTransposePoint3;
            pointFTransposePoint3 = pointF2;
        }
        this.mouthPoint = new PointF((pointFTransposePoint3.x * 0.5f) + (pointFTransposePoint4.x * 0.5f), (pointFTransposePoint3.y * 0.5f) + (pointFTransposePoint4.y * 0.5f));
        float f3 = this.eyesDistance * 0.7f;
        double radians2 = (float) Math.toRadians(this.angle + 90.0f);
        this.chinPoint = new PointF(this.mouthPoint.x + (((float) Math.cos(radians2)) * f3), this.mouthPoint.y + (f3 * ((float) Math.sin(radians2))));
    }

    public boolean isSufficient() {
        return this.eyesCenterPoint != null;
    }

    private PointF transposePoint(PointF pointF, Bitmap bitmap, Size size, boolean z) {
        return new PointF((size.width * pointF.x) / (z ? bitmap.getHeight() : bitmap.getWidth()), (size.height * pointF.y) / (z ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public PointF getPointForAnchor(int i) {
        if (i == 0) {
            return this.foreheadPoint;
        }
        if (i == 1) {
            return this.eyesCenterPoint;
        }
        if (i == 2) {
            return this.mouthPoint;
        }
        if (i != 3) {
            return null;
        }
        return this.chinPoint;
    }

    public float getWidthForAnchor(int i) {
        if (i == 1) {
            return this.eyesDistance;
        }
        return this.width;
    }

    public float getAngle() {
        return this.angle;
    }
}
