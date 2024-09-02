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
        org.telegram.ui.Components.Point point = null;
        org.telegram.ui.Components.Point point2 = null;
        org.telegram.ui.Components.Point point3 = null;
        org.telegram.ui.Components.Point point4 = null;
        for (Landmark landmark : face.getLandmarks()) {
            PointF position = landmark.getPosition();
            int type = landmark.getType();
            if (type == 4) {
                point = transposePoint(position, bitmap, size, z);
            } else if (type == 5) {
                point3 = transposePoint(position, bitmap, size, z);
            } else if (type == 10) {
                point2 = transposePoint(position, bitmap, size, z);
            } else if (type == 11) {
                point4 = transposePoint(position, bitmap, size, z);
            }
        }
        if (point != null && point2 != null) {
            if (point.x >= point2.x) {
                org.telegram.ui.Components.Point point5 = point2;
                point2 = point;
                point = point5;
            }
            this.eyesCenterPoint = new org.telegram.ui.Components.Point((point2.x * 0.5f) + (point.x * 0.5f), (point2.y * 0.5f) + (point.y * 0.5f));
            this.eyesDistance = (float) Math.hypot(point.x - point2.x, point.y - point2.y);
            this.angle = (float) Math.toDegrees(Math.atan2(point.y - point2.y, point.x - point2.x) + 3.141592653589793d);
            float f = this.eyesDistance;
            this.width = 2.35f * f;
            float f2 = f * 0.8f;
            double radians = (float) Math.toRadians(r12 - 90.0f);
            this.foreheadPoint = new org.telegram.ui.Components.Point(this.eyesCenterPoint.x + (((float) Math.cos(radians)) * f2), this.eyesCenterPoint.y + (f2 * ((float) Math.sin(radians))));
        }
        if (point3 == null || point4 == null) {
            return;
        }
        if (point3.x < point4.x) {
            org.telegram.ui.Components.Point point6 = point4;
            point4 = point3;
            point3 = point6;
        }
        this.mouthPoint = new org.telegram.ui.Components.Point((point3.x * 0.5f) + (point4.x * 0.5f), (point3.y * 0.5f) + (point4.y * 0.5f));
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
