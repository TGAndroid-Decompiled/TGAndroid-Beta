package org.telegram.ui.Charts;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Charts.ChartPickerDelegate;

public class ChartPickerDelegate {
    public boolean disabled;
    ValueAnimator moveToAnimator;
    public float moveToX;
    public float moveToY;
    public float pickerWidth;
    public long startTapTime;
    public boolean tryMoveTo;
    Listener view;
    public Rect leftPickerArea = new Rect();
    public Rect rightPickerArea = new Rect();
    public Rect middlePickerArea = new Rect();
    public float pickerStart = 0.7f;
    public float pickerEnd = 1.0f;
    public float minDistance = 0.1f;
    CapturesData[] capturedStates = {null, null};

    public class CapturesData {
        ValueAnimator a;
        public float aValue = 0.0f;
        public int capturedX;
        public float end;
        ValueAnimator jumpToAnimator;
        public int lastMovingX;
        public float start;
        public final int state;

        public CapturesData(int i) {
            this.state = i;
        }

        public void lambda$captured$0(ValueAnimator valueAnimator) {
            this.aValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChartPickerDelegate.this.view.invalidate();
        }

        public void captured() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.a = ofFloat;
            ofFloat.setDuration(600L);
            this.a.setInterpolator(BaseChartView.INTERPOLATOR);
            this.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChartPickerDelegate.CapturesData.this.lambda$captured$0(valueAnimator);
                }
            });
            this.a.start();
        }

        public void uncapture() {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.jumpToAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public interface Listener {
        void invalidate();

        void onPickerDataChanged();

        void onPickerJumpTo(float f, float f2, boolean z);
    }

    public ChartPickerDelegate(Listener listener) {
        this.view = listener;
    }

    public void lambda$uncapture$0(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pickerStart = f + ((f2 - f) * floatValue);
        this.pickerEnd = f3 + ((f4 - f3) * floatValue);
        this.view.onPickerJumpTo(f2, f4, false);
    }

    public boolean capture(int i, int i2, int i3) {
        CapturesData capturesData;
        if (this.disabled) {
            return false;
        }
        if (i3 == 0) {
            if (this.leftPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr = this.capturedStates;
                CapturesData capturesData2 = capturesDataArr[0];
                if (capturesData2 != null) {
                    capturesDataArr[1] = capturesData2;
                }
                capturesDataArr[0] = new CapturesData(1);
                CapturesData capturesData3 = this.capturedStates[0];
                capturesData3.start = this.pickerStart;
                capturesData3.capturedX = i;
                capturesData3.lastMovingX = i;
                capturesData3.captured();
                ValueAnimator valueAnimator = this.moveToAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return true;
            }
            if (this.rightPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr2 = this.capturedStates;
                CapturesData capturesData4 = capturesDataArr2[0];
                if (capturesData4 != null) {
                    capturesDataArr2[1] = capturesData4;
                }
                capturesDataArr2[0] = new CapturesData(2);
                CapturesData capturesData5 = this.capturedStates[0];
                capturesData5.end = this.pickerEnd;
                capturesData5.capturedX = i;
                capturesData5.lastMovingX = i;
                capturesData5.captured();
                ValueAnimator valueAnimator2 = this.moveToAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                return true;
            }
            if (this.middlePickerArea.contains(i, i2)) {
                this.capturedStates[0] = new CapturesData(4);
                CapturesData capturesData6 = this.capturedStates[0];
                capturesData6.end = this.pickerEnd;
                capturesData6.start = this.pickerStart;
                capturesData6.capturedX = i;
                capturesData6.lastMovingX = i;
                capturesData6.captured();
                ValueAnimator valueAnimator3 = this.moveToAnimator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                return true;
            }
            Rect rect = this.leftPickerArea;
            if (i2 < rect.bottom && i2 > rect.top) {
                this.tryMoveTo = true;
                this.moveToX = i;
                this.moveToY = i2;
                this.startTapTime = System.currentTimeMillis();
                ValueAnimator valueAnimator4 = this.moveToAnimator;
                if (valueAnimator4 != null) {
                    if (valueAnimator4.isRunning()) {
                        this.view.onPickerJumpTo(this.pickerStart, this.pickerEnd, true);
                    }
                    this.moveToAnimator.cancel();
                }
                return true;
            }
        } else {
            if (i3 != 1 || (capturesData = this.capturedStates[0]) == null || capturesData.state == 4) {
                return false;
            }
            if (this.leftPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr3 = this.capturedStates;
                if (capturesDataArr3[0].state != 1) {
                    capturesDataArr3[1] = new CapturesData(1);
                    CapturesData capturesData7 = this.capturedStates[1];
                    capturesData7.start = this.pickerStart;
                    capturesData7.capturedX = i;
                    capturesData7.lastMovingX = i;
                    capturesData7.captured();
                    ValueAnimator valueAnimator5 = this.moveToAnimator;
                    if (valueAnimator5 != null) {
                        valueAnimator5.cancel();
                    }
                    return true;
                }
            }
            if (this.rightPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr4 = this.capturedStates;
                if (capturesDataArr4[0].state == 2) {
                    return false;
                }
                capturesDataArr4[1] = new CapturesData(2);
                CapturesData capturesData8 = this.capturedStates[1];
                capturesData8.end = this.pickerEnd;
                capturesData8.capturedX = i;
                capturesData8.lastMovingX = i;
                capturesData8.captured();
                ValueAnimator valueAnimator6 = this.moveToAnimator;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public boolean captured() {
        return this.capturedStates[0] != null || this.tryMoveTo;
    }

    public CapturesData getLeftCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        CapturesData capturesData = capturesDataArr[0];
        if (capturesData != null && capturesData.state == 1) {
            return capturesData;
        }
        CapturesData capturesData2 = capturesDataArr[1];
        if (capturesData2 == null || capturesData2.state != 1) {
            return null;
        }
        return capturesData2;
    }

    public CapturesData getMiddleCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        CapturesData capturesData = capturesDataArr[0];
        if (capturesData != null && capturesData.state == 4) {
            return capturesData;
        }
        CapturesData capturesData2 = capturesDataArr[1];
        if (capturesData2 == null || capturesData2.state != 4) {
            return null;
        }
        return capturesData2;
    }

    public CapturesData getRightCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        CapturesData capturesData = capturesDataArr[0];
        if (capturesData != null && capturesData.state == 2) {
            return capturesData;
        }
        CapturesData capturesData2 = capturesDataArr[1];
        if (capturesData2 == null || capturesData2.state != 2) {
            return null;
        }
        return capturesData2;
    }

    public boolean move(int i, int i2, int i3) {
        CapturesData capturesData;
        boolean z = false;
        if (this.tryMoveTo || (capturesData = this.capturedStates[i3]) == null) {
            return false;
        }
        int i4 = capturesData.state;
        float f = capturesData.start;
        float f2 = capturesData.end;
        int i5 = capturesData.capturedX;
        capturesData.lastMovingX = i;
        if (i4 == 1) {
            float f3 = f - ((i5 - i) / this.pickerWidth);
            this.pickerStart = f3;
            if (f3 < 0.0f) {
                this.pickerStart = 0.0f;
            }
            float f4 = this.pickerEnd;
            float f5 = f4 - this.pickerStart;
            float f6 = this.minDistance;
            if (f5 < f6) {
                this.pickerStart = f4 - f6;
            }
            z = true;
        }
        if (i4 == 2) {
            float f7 = f2 - ((i5 - i) / this.pickerWidth);
            this.pickerEnd = f7;
            if (f7 > 1.0f) {
                this.pickerEnd = 1.0f;
            }
            float f8 = this.pickerEnd;
            float f9 = this.pickerStart;
            float f10 = f8 - f9;
            float f11 = this.minDistance;
            if (f10 < f11) {
                this.pickerEnd = f9 + f11;
            }
            z = true;
        }
        if (i4 == 4) {
            float f12 = (i5 - i) / this.pickerWidth;
            float f13 = f - f12;
            this.pickerStart = f13;
            this.pickerEnd = f2 - f12;
            if (f13 < 0.0f) {
                this.pickerStart = 0.0f;
                this.pickerEnd = f2 - f;
            }
            if (this.pickerEnd > 1.0f) {
                this.pickerEnd = 1.0f;
                this.pickerStart = 1.0f - (f2 - f);
            }
            z = true;
        }
        if (z) {
            this.view.onPickerDataChanged();
        }
        return true;
    }

    public void set(float f, float f2) {
        this.pickerStart = f;
        this.pickerEnd = f2;
        this.view.onPickerDataChanged();
    }

    public void uncapture() {
        CapturesData capturesData = this.capturedStates[0];
        if (capturesData != null) {
            capturesData.uncapture();
        }
        CapturesData capturesData2 = this.capturedStates[1];
        if (capturesData2 != null) {
            capturesData2.uncapture();
        }
        CapturesData[] capturesDataArr = this.capturedStates;
        capturesDataArr[0] = null;
        capturesDataArr[1] = null;
    }

    public boolean uncapture(MotionEvent motionEvent, int i) {
        final float f;
        final float f2;
        if (i != 0) {
            CapturesData capturesData = this.capturedStates[1];
            if (capturesData != null) {
                capturesData.uncapture();
            }
            this.capturedStates[1] = null;
        } else {
            if (this.tryMoveTo) {
                this.tryMoveTo = false;
                float x = this.moveToX - motionEvent.getX();
                float y = this.moveToY - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.startTapTime < 300 && Math.sqrt((x * x) + (y * y)) < AndroidUtilities.dp(10.0f)) {
                    float f3 = (this.moveToX - BaseChartView.HORIZONTAL_PADDING) / this.pickerWidth;
                    final float f4 = this.pickerEnd;
                    final float f5 = this.pickerStart;
                    float f6 = f4 - f5;
                    float f7 = f6 / 2.0f;
                    float f8 = f3 - f7;
                    float f9 = f3 + f7;
                    if (f8 < 0.0f) {
                        f = f6;
                        f2 = 0.0f;
                    } else if (f9 > 1.0f) {
                        f2 = 1.0f - f6;
                        f = 1.0f;
                    } else {
                        f = f9;
                        f2 = f8;
                    }
                    this.moveToAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.view.onPickerJumpTo(f2, f, true);
                    this.moveToAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChartPickerDelegate.this.lambda$uncapture$0(f5, f2, f4, f, valueAnimator);
                        }
                    });
                    this.moveToAnimator.setInterpolator(BaseChartView.INTERPOLATOR);
                    this.moveToAnimator.start();
                }
                return true;
            }
            CapturesData capturesData2 = this.capturedStates[0];
            if (capturesData2 != null) {
                capturesData2.uncapture();
            }
            CapturesData[] capturesDataArr = this.capturedStates;
            capturesDataArr[0] = null;
            CapturesData capturesData3 = capturesDataArr[1];
            if (capturesData3 != null) {
                capturesDataArr[0] = capturesData3;
                capturesDataArr[1] = null;
            }
        }
        return false;
    }
}
