package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import org.telegram.ui.Components.Size;

public class PhotoFace {
    private float angle;
    private org.telegram.ui.Components.Point chinPoint;
    private org.telegram.ui.Components.Point eyesCenterPoint;
    private float eyesDistance;
    private org.telegram.ui.Components.Point foreheadPoint;
    private org.telegram.ui.Components.Point mouthPoint;
    private float width;

    public PhotoFace(Face face, Bitmap bitmap, Size size, boolean z) {
        org.telegram.ui.Components.Point pointTransposePoint = null;
        org.telegram.ui.Components.Point pointTransposePoint2 = null;
        org.telegram.ui.Components.Point pointTransposePoint3 = null;
        org.telegram.ui.Components.Point pointTransposePoint4 = null;
        for (Landmark landmark : face.getLandmarks()) {
            PointF position = landmark.getPosition();
            int type = landmark.getType();
            if (type == 4) {
                pointTransposePoint = transposePoint(position, bitmap, size, z);
            } else if (type == 5) {
                pointTransposePoint3 = transposePoint(position, bitmap, size, z);
            } else if (type == 10) {
                pointTransposePoint2 = transposePoint(position, bitmap, size, z);
            } else if (type == 11) {
                pointTransposePoint4 = transposePoint(position, bitmap, size, z);
            }
        }
        if (pointTransposePoint != null && pointTransposePoint2 != null) {
            if (pointTransposePoint.x >= pointTransposePoint2.x) {
                org.telegram.ui.Components.Point point = pointTransposePoint2;
                pointTransposePoint2 = pointTransposePoint;
                pointTransposePoint = point;
            }
            this.eyesCenterPoint = new org.telegram.ui.Components.Point((pointTransposePoint2.x * 0.5f) + (pointTransposePoint.x * 0.5f), (pointTransposePoint2.y * 0.5f) + (pointTransposePoint.y * 0.5f));
            this.eyesDistance = (float) Math.hypot(pointTransposePoint.x - pointTransposePoint2.x, pointTransposePoint.y - pointTransposePoint2.y);
            this.angle = (float) Math.toDegrees(Math.atan2(pointTransposePoint.y - pointTransposePoint2.y, pointTransposePoint.x - pointTransposePoint2.x) + 3.141592653589793d);
            float f = this.eyesDistance;
            this.width = 2.35f * f;
            float f2 = f * 0.8f;
            double radians = (float) Math.toRadians(r12 - 90.0f);
            this.foreheadPoint = new org.telegram.ui.Components.Point(this.eyesCenterPoint.x + (((float) Math.cos(radians)) * f2), this.eyesCenterPoint.y + (f2 * ((float) Math.sin(radians))));
        }
        if (pointTransposePoint3 == null || pointTransposePoint4 == null) {
            return;
        }
        if (pointTransposePoint3.x < pointTransposePoint4.x) {
            org.telegram.ui.Components.Point point2 = pointTransposePoint4;
            pointTransposePoint4 = pointTransposePoint3;
            pointTransposePoint3 = point2;
        }
        this.mouthPoint = new org.telegram.ui.Components.Point((pointTransposePoint3.x * 0.5f) + (pointTransposePoint4.x * 0.5f), (pointTransposePoint3.y * 0.5f) + (pointTransposePoint4.y * 0.5f));
        float f3 = this.eyesDistance * 0.7f;
        double radians2 = (float) Math.toRadians(this.angle + 90.0f);
        this.chinPoint = new org.telegram.ui.Components.Point(this.mouthPoint.x + (((float) Math.cos(radians2)) * f3), this.mouthPoint.y + (f3 * ((float) Math.sin(radians2))));
    }

    public boolean isSufficient() {
        return this.eyesCenterPoint != null;
    }

    private org.telegram.ui.Components.Point transposePoint(PointF pointF, Bitmap bitmap, Size size, boolean z) {
        return new org.telegram.ui.Components.Point((size.width * pointF.x) / (z ? bitmap.getHeight() : bitmap.getWidth()), (size.height * pointF.y) / (z ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public org.telegram.ui.Components.Point getPointForAnchor(int i) {
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
