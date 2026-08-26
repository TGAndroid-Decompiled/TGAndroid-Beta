package org.telegram.ui.Charts;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;

public final class ChartPickerDelegate {
    public ValueAnimator moveToAnimator;
    public float moveToX;
    public float moveToY;
    public float pickerWidth;
    public long startTapTime;
    public boolean tryMoveTo;
    public final BaseChartView view;
    public final Rect leftPickerArea = new Rect();
    public final Rect rightPickerArea = new Rect();
    public final Rect middlePickerArea = new Rect();
    public float pickerStart = 0.7f;
    public float pickerEnd = 1.0f;
    public float minDistance = 0.1f;
    public final CapturesData[] capturedStates = {null, null};

    public final class CapturesData {
        public ValueAnimator a;
        public float aValue = 0.0f;
        public int capturedX;
        public float end;
        public float start;
        public final int state;

        public CapturesData(int i) {
            this.state = i;
        }

        public final void captured() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(600L);
            this.a.setInterpolator(BaseChartView.INTERPOLATOR);
            this.a.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 15));
            this.a.start();
        }
    }

    public interface Listener {
        void invalidate();

        void onPickerJumpTo(float f, float f2, boolean z);
    }

    public ChartPickerDelegate(BaseChartView baseChartView) {
        this.view = baseChartView;
    }

    public final boolean capture(int i, int i2, int i3) {
        CapturesData capturesData;
        Rect rect = this.rightPickerArea;
        Rect rect2 = this.leftPickerArea;
        CapturesData[] capturesDataArr = this.capturedStates;
        if (i3 != 0) {
            if (i3 == 1 && (capturesData = capturesDataArr[0]) != null && capturesData.state != 4) {
                if (rect2.contains(i, i2) && capturesDataArr[0].state != 1) {
                    CapturesData capturesData2 = new CapturesData(1);
                    capturesDataArr[1] = capturesData2;
                    capturesData2.start = this.pickerStart;
                    capturesData2.capturedX = i;
                    capturesData2.captured();
                    ValueAnimator valueAnimator = this.moveToAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return true;
                    }
                } else if (rect.contains(i, i2) && capturesDataArr[0].state != 2) {
                    CapturesData capturesData3 = new CapturesData(2);
                    capturesDataArr[1] = capturesData3;
                    capturesData3.end = this.pickerEnd;
                    capturesData3.capturedX = i;
                    capturesData3.captured();
                    ValueAnimator valueAnimator2 = this.moveToAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                }
                return true;
            }
            return false;
        }
        if (rect2.contains(i, i2)) {
            CapturesData capturesData4 = capturesDataArr[0];
            if (capturesData4 != null) {
                capturesDataArr[1] = capturesData4;
            }
            CapturesData capturesData5 = new CapturesData(1);
            capturesDataArr[0] = capturesData5;
            capturesData5.start = this.pickerStart;
            capturesData5.capturedX = i;
            capturesData5.captured();
            ValueAnimator valueAnimator3 = this.moveToAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return true;
            }
        } else if (rect.contains(i, i2)) {
            CapturesData capturesData6 = capturesDataArr[0];
            if (capturesData6 != null) {
                capturesDataArr[1] = capturesData6;
            }
            CapturesData capturesData7 = new CapturesData(2);
            capturesDataArr[0] = capturesData7;
            capturesData7.end = this.pickerEnd;
            capturesData7.capturedX = i;
            capturesData7.captured();
            ValueAnimator valueAnimator4 = this.moveToAnimator;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
                return true;
            }
        } else {
            if (!this.middlePickerArea.contains(i, i2)) {
                if (i2 < rect2.bottom && i2 > rect2.top) {
                    this.tryMoveTo = true;
                    this.moveToX = i;
                    this.moveToY = i2;
                    this.startTapTime = System.currentTimeMillis();
                    ValueAnimator valueAnimator5 = this.moveToAnimator;
                    if (valueAnimator5 != null) {
                        if (valueAnimator5.isRunning()) {
                            this.view.onPickerJumpTo(this.pickerStart, this.pickerEnd, true);
                        }
                        this.moveToAnimator.cancel();
                        return true;
                    }
                }
                return false;
            }
            CapturesData capturesData8 = new CapturesData(4);
            capturesDataArr[0] = capturesData8;
            capturesData8.end = this.pickerEnd;
            capturesData8.start = this.pickerStart;
            capturesData8.capturedX = i;
            capturesData8.captured();
            ValueAnimator valueAnimator6 = this.moveToAnimator;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
                return true;
            }
        }
        return true;
    }

    public final boolean move(int i, int i2) {
        CapturesData capturesData;
        boolean z;
        if (this.tryMoveTo || (capturesData = this.capturedStates[i2]) == null) {
            return false;
        }
        float f = capturesData.start;
        float f2 = capturesData.end;
        int i3 = capturesData.capturedX;
        int i4 = capturesData.state;
        if (i4 == 1) {
            float f3 = f - ((i3 - i) / this.pickerWidth);
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
        } else {
            z = false;
        }
        if (i4 == 2) {
            float f7 = f2 - ((i3 - i) / this.pickerWidth);
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
            float f12 = (i3 - i) / this.pickerWidth;
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
            this.view.onPickerDataChanged(true, false, false);
        }
        return true;
    }

    public final boolean uncapture(int i, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f;
        float f2;
        CapturesData[] capturesDataArr = this.capturedStates;
        if (i != 0) {
            CapturesData capturesData = capturesDataArr[1];
            if (capturesData != null && (valueAnimator = capturesData.a) != null) {
                valueAnimator.cancel();
            }
            capturesDataArr[1] = null;
            return false;
        }
        if (!this.tryMoveTo) {
            CapturesData capturesData2 = capturesDataArr[0];
            if (capturesData2 != null && (valueAnimator2 = capturesData2.a) != null) {
                valueAnimator2.cancel();
            }
            capturesDataArr[0] = null;
            CapturesData capturesData3 = capturesDataArr[1];
            if (capturesData3 != null) {
                capturesDataArr[0] = capturesData3;
                capturesDataArr[1] = null;
            }
            return false;
        }
        this.tryMoveTo = false;
        float x = this.moveToX - motionEvent.getX();
        float y = this.moveToY - motionEvent.getY();
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.startTapTime < 300) {
            if (Math.sqrt((y * y) + (x * x)) < AndroidUtilities.dp(10.0f)) {
                float f3 = (this.moveToX - BaseChartView.HORIZONTAL_PADDING) / this.pickerWidth;
                float f4 = this.pickerEnd;
                float f5 = this.pickerStart;
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
                this.moveToAnimator.addUpdateListener(new ChartPickerDelegate$$ExternalSyntheticLambda0(this, f5, f2, f4, f, 0));
                this.moveToAnimator.setInterpolator(BaseChartView.INTERPOLATOR);
                this.moveToAnimator.start();
                return true;
            }
        }
        return true;
    }
}
