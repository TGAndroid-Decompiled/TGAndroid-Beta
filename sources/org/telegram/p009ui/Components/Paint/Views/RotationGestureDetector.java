package org.telegram.p009ui.Components.Paint.Views;

import android.view.MotionEvent;

public class RotationGestureDetector {
    private float angle;
    private float f1070fX;
    private float f1071fY;
    private OnRotationGestureListener mListener;
    private float f1072sX;
    private float f1073sY;
    private float startAngle;

    public interface OnRotationGestureListener {
        void onRotation(RotationGestureDetector rotationGestureDetector);

        void onRotationBegin(RotationGestureDetector rotationGestureDetector);

        void onRotationEnd(RotationGestureDetector rotationGestureDetector);
    }

    public float getAngle() {
        return this.angle;
    }

    public float getStartAngle() {
        return this.startAngle;
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.mListener = onRotationGestureListener;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX(0);
                    float y = motionEvent.getY(0);
                    this.angle = angleBetweenLines(this.f1070fX, this.f1071fY, this.f1072sX, this.f1073sY, motionEvent.getX(1), motionEvent.getY(1), x, y);
                    if (this.mListener != null) {
                        if (Float.isNaN(this.startAngle)) {
                            this.startAngle = this.angle;
                            this.mListener.onRotationBegin(this);
                        } else {
                            this.mListener.onRotation(this);
                        }
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            this.startAngle = Float.NaN;
                            OnRotationGestureListener onRotationGestureListener = this.mListener;
                            if (onRotationGestureListener != null) {
                                onRotationGestureListener.onRotationEnd(this);
                            }
                        }
                    }
                }
                return true;
            }
            this.startAngle = Float.NaN;
            return true;
        }
        this.f1072sX = motionEvent.getX(0);
        this.f1073sY = motionEvent.getY(0);
        this.f1070fX = motionEvent.getX(1);
        this.f1071fY = motionEvent.getY(1);
        return true;
    }

    private float angleBetweenLines(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float degrees = ((float) Math.toDegrees(((float) Math.atan2(f2 - f4, f - f3)) - ((float) Math.atan2(f6 - f8, f5 - f7)))) % 360.0f;
        if (degrees < -180.0f) {
            degrees += 360.0f;
        }
        return degrees > 180.0f ? degrees - 360.0f : degrees;
    }
}
