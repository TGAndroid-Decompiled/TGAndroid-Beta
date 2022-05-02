package org.telegram.p009ui.Charts;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Charts.ChartPickerDelegate;

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

    public interface Listener {
        void invalidate();

        void onPickerDataChanged();

        void onPickerJumpTo(float f, float f2, boolean z);
    }

    public ChartPickerDelegate(Listener listener) {
        this.view = listener;
    }

    public CapturesData getMiddleCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        if (capturesDataArr[0] != null && capturesDataArr[0].state == 4) {
            return capturesDataArr[0];
        }
        if (capturesDataArr[1] == null || capturesDataArr[1].state != 4) {
            return null;
        }
        return capturesDataArr[1];
    }

    public CapturesData getLeftCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        if (capturesDataArr[0] != null && capturesDataArr[0].state == 1) {
            return capturesDataArr[0];
        }
        if (capturesDataArr[1] == null || capturesDataArr[1].state != 1) {
            return null;
        }
        return capturesDataArr[1];
    }

    public CapturesData getRightCaptured() {
        CapturesData[] capturesDataArr = this.capturedStates;
        if (capturesDataArr[0] != null && capturesDataArr[0].state == 2) {
            return capturesDataArr[0];
        }
        if (capturesDataArr[1] == null || capturesDataArr[1].state != 2) {
            return null;
        }
        return capturesDataArr[1];
    }

    public class CapturesData {
        ValueAnimator f1011a;
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

        public void captured() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1011a = ofFloat;
            ofFloat.setDuration(600L);
            this.f1011a.setInterpolator(BaseChartView.INTERPOLATOR);
            this.f1011a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChartPickerDelegate.CapturesData.this.lambda$captured$0(valueAnimator);
                }
            });
            this.f1011a.start();
        }

        public void lambda$captured$0(ValueAnimator valueAnimator) {
            this.aValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ChartPickerDelegate.this.view.invalidate();
        }

        public void uncapture() {
            ValueAnimator valueAnimator = this.f1011a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.jumpToAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public boolean capture(int i, int i2, int i3) {
        if (this.disabled) {
            return false;
        }
        if (i3 == 0) {
            if (this.leftPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr = this.capturedStates;
                if (capturesDataArr[0] != null) {
                    capturesDataArr[1] = capturesDataArr[0];
                }
                capturesDataArr[0] = new CapturesData(1);
                CapturesData[] capturesDataArr2 = this.capturedStates;
                capturesDataArr2[0].start = this.pickerStart;
                capturesDataArr2[0].capturedX = i;
                capturesDataArr2[0].lastMovingX = i;
                capturesDataArr2[0].captured();
                ValueAnimator valueAnimator = this.moveToAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return true;
            } else if (this.rightPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr3 = this.capturedStates;
                if (capturesDataArr3[0] != null) {
                    capturesDataArr3[1] = capturesDataArr3[0];
                }
                capturesDataArr3[0] = new CapturesData(2);
                CapturesData[] capturesDataArr4 = this.capturedStates;
                capturesDataArr4[0].end = this.pickerEnd;
                capturesDataArr4[0].capturedX = i;
                capturesDataArr4[0].lastMovingX = i;
                capturesDataArr4[0].captured();
                ValueAnimator valueAnimator2 = this.moveToAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                return true;
            } else if (this.middlePickerArea.contains(i, i2)) {
                this.capturedStates[0] = new CapturesData(4);
                CapturesData[] capturesDataArr5 = this.capturedStates;
                capturesDataArr5[0].end = this.pickerEnd;
                capturesDataArr5[0].start = this.pickerStart;
                capturesDataArr5[0].capturedX = i;
                capturesDataArr5[0].lastMovingX = i;
                capturesDataArr5[0].captured();
                ValueAnimator valueAnimator3 = this.moveToAnimator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                return true;
            } else {
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
            }
        } else if (i3 == 1) {
            CapturesData[] capturesDataArr6 = this.capturedStates;
            if (capturesDataArr6[0] == null || capturesDataArr6[0].state == 4) {
                return false;
            }
            if (this.leftPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr7 = this.capturedStates;
                if (capturesDataArr7[0].state != 1) {
                    capturesDataArr7[1] = new CapturesData(1);
                    CapturesData[] capturesDataArr8 = this.capturedStates;
                    capturesDataArr8[1].start = this.pickerStart;
                    capturesDataArr8[1].capturedX = i;
                    capturesDataArr8[1].lastMovingX = i;
                    capturesDataArr8[1].captured();
                    ValueAnimator valueAnimator5 = this.moveToAnimator;
                    if (valueAnimator5 != null) {
                        valueAnimator5.cancel();
                    }
                    return true;
                }
            }
            if (this.rightPickerArea.contains(i, i2)) {
                CapturesData[] capturesDataArr9 = this.capturedStates;
                if (capturesDataArr9[0].state == 2) {
                    return false;
                }
                capturesDataArr9[1] = new CapturesData(2);
                CapturesData[] capturesDataArr10 = this.capturedStates;
                capturesDataArr10[1].end = this.pickerEnd;
                capturesDataArr10[1].capturedX = i;
                capturesDataArr10[1].lastMovingX = i;
                capturesDataArr10[1].captured();
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
        if (i4 == 1) {
            float f3 = f - ((i5 - i) / this.pickerWidth);
            this.pickerStart = f3;
            if (f3 < 0.0f) {
                this.pickerStart = 0.0f;
            }
            float f4 = this.pickerEnd;
            float f5 = this.minDistance;
            if (f4 - this.pickerStart < f5) {
                this.pickerStart = f4 - f5;
            }
            z = true;
        }
        if (i4 == 2) {
            float f6 = f2 - ((i5 - i) / this.pickerWidth);
            this.pickerEnd = f6;
            if (f6 > 1.0f) {
                this.pickerEnd = 1.0f;
            }
            float f7 = this.pickerEnd;
            float f8 = this.pickerStart;
            float f9 = this.minDistance;
            if (f7 - f8 < f9) {
                this.pickerEnd = f8 + f9;
            }
            z = true;
        }
        if (i4 == 4) {
            float f10 = i5 - i;
            float f11 = this.pickerWidth;
            float f12 = f - (f10 / f11);
            this.pickerStart = f12;
            this.pickerEnd = f2 - (f10 / f11);
            if (f12 < 0.0f) {
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

    public boolean uncapture(MotionEvent motionEvent, int i) {
        final float f;
        final float f2;
        if (i != 0) {
            CapturesData[] capturesDataArr = this.capturedStates;
            if (capturesDataArr[1] != null) {
                capturesDataArr[1].uncapture();
            }
            this.capturedStates[1] = null;
        } else if (this.tryMoveTo) {
            this.tryMoveTo = false;
            float x = this.moveToX - motionEvent.getX();
            float y = this.moveToY - motionEvent.getY();
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.startTapTime < 300 && Math.sqrt((x * x) + (y * y)) < AndroidUtilities.m34dp(10.0f)) {
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
        } else {
            CapturesData[] capturesDataArr2 = this.capturedStates;
            if (capturesDataArr2[0] != null) {
                capturesDataArr2[0].uncapture();
            }
            CapturesData[] capturesDataArr3 = this.capturedStates;
            capturesDataArr3[0] = null;
            if (capturesDataArr3[1] != null) {
                capturesDataArr3[0] = capturesDataArr3[1];
                capturesDataArr3[1] = null;
            }
        }
        return false;
    }

    public void lambda$uncapture$0(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.pickerStart = f + ((f2 - f) * floatValue);
        this.pickerEnd = f3 + ((f4 - f3) * floatValue);
        this.view.onPickerJumpTo(f2, f4, false);
    }

    public void uncapture() {
        CapturesData[] capturesDataArr = this.capturedStates;
        if (capturesDataArr[0] != null) {
            capturesDataArr[0].uncapture();
        }
        CapturesData[] capturesDataArr2 = this.capturedStates;
        if (capturesDataArr2[1] != null) {
            capturesDataArr2[1].uncapture();
        }
        CapturesData[] capturesDataArr3 = this.capturedStates;
        capturesDataArr3[0] = null;
        capturesDataArr3[1] = null;
    }
}
