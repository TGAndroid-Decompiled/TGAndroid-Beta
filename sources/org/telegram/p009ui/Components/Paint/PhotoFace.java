package org.telegram.p009ui.Components.Paint;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import org.telegram.p009ui.Components.Point;
import org.telegram.p009ui.Components.Size;

public class PhotoFace {
    private float angle;
    private Point chinPoint;
    private Point eyesCenterPoint;
    private float eyesDistance;
    private Point foreheadPoint;
    private Point mouthPoint;
    private float width;

    public PhotoFace(Face face, Bitmap bitmap, Size size, boolean z) {
        float degrees;
        Point point = null;
        Point point2 = null;
        Point point3 = null;
        Point point4 = null;
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
        if (!(point == null || point2 == null)) {
            if (point.f1058x < point2.f1058x) {
                point = point2;
                point2 = point;
            }
            this.eyesCenterPoint = new Point((point.f1058x * 0.5f) + (point2.f1058x * 0.5f), (point.f1059y * 0.5f) + (point2.f1059y * 0.5f));
            this.eyesDistance = (float) Math.hypot(point2.f1058x - point.f1058x, point2.f1059y - point.f1059y);
            this.angle = (float) Math.toDegrees(Math.atan2(point2.f1059y - point.f1059y, point2.f1058x - point.f1058x) + 3.141592653589793d);
            float f = this.eyesDistance;
            this.width = 2.35f * f;
            float f2 = f * 0.8f;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.foreheadPoint = new Point(this.eyesCenterPoint.f1058x + (((float) Math.cos(radians)) * f2), this.eyesCenterPoint.f1059y + (f2 * ((float) Math.sin(radians))));
        }
        if (!(point3 == null || point4 == null)) {
            if (point3.f1058x < point4.f1058x) {
                point3 = point4;
                point4 = point3;
            }
            this.mouthPoint = new Point((point3.f1058x * 0.5f) + (point4.f1058x * 0.5f), (point3.f1059y * 0.5f) + (point4.f1059y * 0.5f));
            float f3 = this.eyesDistance * 0.7f;
            double radians2 = (float) Math.toRadians(this.angle + 90.0f);
            this.chinPoint = new Point(this.mouthPoint.f1058x + (((float) Math.cos(radians2)) * f3), this.mouthPoint.f1059y + (f3 * ((float) Math.sin(radians2))));
        }
    }

    public boolean isSufficient() {
        return this.eyesCenterPoint != null;
    }

    private Point transposePoint(PointF pointF, Bitmap bitmap, Size size, boolean z) {
        return new Point((size.width * pointF.x) / (z ? bitmap.getHeight() : bitmap.getWidth()), (size.height * pointF.y) / (z ? bitmap.getWidth() : bitmap.getHeight()));
    }

    public Point getPointForAnchor(int i) {
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
