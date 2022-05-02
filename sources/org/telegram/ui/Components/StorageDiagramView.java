package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class StorageDiagramView extends View {
    private float[] animateToPercentage;
    private ClearViewData[] data;
    private float[] drawingPercentage;
    int enabledCount;
    StaticLayout layout1;
    StaticLayout layout2;
    private float[] startFromPercentage;
    ValueAnimator valueAnimator;
    private RectF rectF = new RectF();
    private float singleProgress = 0.0f;
    TextPaint textPaint = new TextPaint(1);
    TextPaint textPaint2 = new TextPaint(1);

    public StorageDiagramView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
        this.rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(3.0f), getMeasuredHeight() - AndroidUtilities.dp(3.0f));
        updateDescription();
        this.textPaint.setTextSize(AndroidUtilities.dp(24.0f));
        this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public void setData(ClearViewData[] clearViewDataArr) {
        this.data = clearViewDataArr;
        invalidate();
        this.drawingPercentage = new float[clearViewDataArr.length];
        this.animateToPercentage = new float[clearViewDataArr.length];
        this.startFromPercentage = new float[clearViewDataArr.length];
        update(false);
        if (this.enabledCount > 1) {
            this.singleProgress = 0.0f;
        } else {
            this.singleProgress = 1.0f;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2;
        Canvas canvas3 = canvas;
        if (this.data != null) {
            float f = 1.0f;
            if (this.enabledCount > 1) {
                float f2 = this.singleProgress;
                if (f2 > 0.0f) {
                    double d = f2;
                    Double.isNaN(d);
                    float f3 = (float) (d - 0.04d);
                    this.singleProgress = f3;
                    if (f3 < 0.0f) {
                        this.singleProgress = 0.0f;
                    }
                }
            } else {
                float f4 = this.singleProgress;
                if (f4 < 1.0f) {
                    double d2 = f4;
                    Double.isNaN(d2);
                    float f5 = (float) (d2 + 0.04d);
                    this.singleProgress = f5;
                    if (f5 > 1.0f) {
                        this.singleProgress = 1.0f;
                    }
                }
            }
            int i2 = 0;
            int i3 = 0;
            float f6 = 0.0f;
            while (true) {
                ClearViewData[] clearViewDataArr = this.data;
                i = 255;
                if (i3 >= clearViewDataArr.length) {
                    break;
                }
                if (clearViewDataArr[i3] != null) {
                    float[] fArr = this.drawingPercentage;
                    if (fArr[i3] != 0.0f) {
                        float f7 = fArr[i3];
                        if (clearViewDataArr[i3].firstDraw) {
                            float f8 = ((-360.0f) * f7) + ((f - this.singleProgress) * 10.0f);
                            float f9 = f8 > 0.0f ? 0.0f : f8;
                            clearViewDataArr[i3].paint.setColor(Theme.getColor(clearViewDataArr[i3].color));
                            this.data[i3].paint.setAlpha(255);
                            double width = this.rectF.width() / 2.0f;
                            Double.isNaN(width);
                            double d3 = f9;
                            Double.isNaN(d3);
                            if (Math.abs((float) (d3 * ((3.141592653589793d * width) / 180.0d))) <= f) {
                                float centerX = this.rectF.centerX();
                                double d4 = (-90.0f) - (360.0f * f6);
                                double cos = Math.cos(Math.toRadians(d4));
                                Double.isNaN(width);
                                float f10 = centerX + ((float) (width * cos));
                                float centerY = this.rectF.centerY();
                                double sin = Math.sin(Math.toRadians(d4));
                                Double.isNaN(width);
                                float f11 = centerY + ((float) (width * sin));
                                if (Build.VERSION.SDK_INT >= 21) {
                                    canvas3.drawPoint(f10, f11, this.data[i3].paint);
                                } else {
                                    this.data[i3].paint.setStyle(Paint.Style.FILL);
                                    canvas3.drawCircle(f10, f11, this.data[i3].paint.getStrokeWidth() / 2.0f, this.data[i3].paint);
                                }
                            } else {
                                this.data[i3].paint.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(this.rectF, (-90.0f) - (360.0f * f6), f9, false, this.data[i3].paint);
                            }
                        }
                        f6 += f7;
                    }
                }
                i3++;
                f = 1.0f;
            }
            float f12 = 0.0f;
            while (true) {
                ClearViewData[] clearViewDataArr2 = this.data;
                if (i2 >= clearViewDataArr2.length) {
                    break;
                }
                if (clearViewDataArr2[i2] != null) {
                    float[] fArr2 = this.drawingPercentage;
                    if (fArr2[i2] != 0.0f) {
                        float f13 = fArr2[i2];
                        if (!clearViewDataArr2[i2].firstDraw) {
                            float f14 = (f13 * (-360.0f)) + ((1.0f - this.singleProgress) * 10.0f);
                            float f15 = f14 > 0.0f ? 0.0f : f14;
                            clearViewDataArr2[i2].paint.setColor(Theme.getColor(clearViewDataArr2[i2].color));
                            this.data[i2].paint.setAlpha(i);
                            double width2 = this.rectF.width() / 2.0f;
                            Double.isNaN(width2);
                            double d5 = f15;
                            Double.isNaN(d5);
                            if (Math.abs((float) (((width2 * 3.141592653589793d) / 180.0d) * d5)) <= 1.0f) {
                                float centerX2 = this.rectF.centerX();
                                double d6 = (-90.0f) - (f12 * 360.0f);
                                double cos2 = Math.cos(Math.toRadians(d6));
                                Double.isNaN(width2);
                                float f16 = centerX2 + ((float) (cos2 * width2));
                                float centerY2 = this.rectF.centerY();
                                double sin2 = Math.sin(Math.toRadians(d6));
                                Double.isNaN(width2);
                                float f17 = centerY2 + ((float) (width2 * sin2));
                                if (Build.VERSION.SDK_INT >= 21) {
                                    canvas2 = canvas;
                                    canvas2.drawPoint(f16, f17, this.data[i2].paint);
                                } else {
                                    canvas2 = canvas;
                                    this.data[i2].paint.setStyle(Paint.Style.FILL);
                                    canvas2.drawCircle(f16, f17, this.data[i2].paint.getStrokeWidth() / 2.0f, this.data[i2].paint);
                                }
                            } else {
                                canvas2 = canvas;
                                this.data[i2].paint.setStyle(Paint.Style.STROKE);
                                canvas.drawArc(this.rectF, (-90.0f) - (f12 * 360.0f), f15, false, this.data[i2].paint);
                                f12 += f13;
                                i2++;
                                canvas3 = canvas2;
                                i = 255;
                            }
                        } else {
                            canvas2 = canvas3;
                        }
                        f12 += f13;
                        i2++;
                        canvas3 = canvas2;
                        i = 255;
                    }
                }
                canvas2 = canvas3;
                i2++;
                canvas3 = canvas2;
                i = 255;
            }
            Canvas canvas4 = canvas3;
            if (this.layout1 != null) {
                canvas.save();
                canvas4.translate((getMeasuredWidth() - this.layout1.getWidth()) >> 1, (((getMeasuredHeight() - this.layout1.getHeight()) - this.layout2.getHeight()) >> 1) + AndroidUtilities.dp(2.0f));
                this.textPaint.setColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.textPaint2.setColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.layout1.draw(canvas4);
                canvas4.translate(0.0f, this.layout1.getHeight());
                this.layout2.draw(canvas4);
                canvas.restore();
            }
        }
    }

    public static class ClearViewData {
        public String color;
        Paint paint;
        private final StorageDiagramView parentView;
        public long size;
        public boolean clear = true;
        boolean firstDraw = false;

        public ClearViewData(StorageDiagramView storageDiagramView) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.parentView = storageDiagramView;
            paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
        }

        public void setClear(boolean z) {
            if (this.clear != z) {
                this.clear = z;
                this.parentView.updateDescription();
                this.firstDraw = true;
                this.parentView.update(true);
            }
        }
    }

    public void update(boolean z) {
        final ClearViewData[] clearViewDataArr = this.data;
        if (clearViewDataArr != null) {
            long j = 0;
            for (int i = 0; i < clearViewDataArr.length; i++) {
                if (clearViewDataArr[i] != null && clearViewDataArr[i].clear) {
                    j += clearViewDataArr[i].size;
                }
            }
            this.enabledCount = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < clearViewDataArr.length; i2++) {
                if (clearViewDataArr[i2] != null && clearViewDataArr[i2].clear) {
                    this.enabledCount++;
                }
                if (clearViewDataArr[i2] == null || !clearViewDataArr[i2].clear) {
                    this.animateToPercentage[i2] = 0.0f;
                } else {
                    float f3 = ((float) clearViewDataArr[i2].size) / ((float) j);
                    if (f3 < 0.02777f) {
                        f3 = 0.02777f;
                    }
                    f += f3;
                    if (f3 > f2 && clearViewDataArr[i2].clear) {
                        f2 = f3;
                    }
                    this.animateToPercentage[i2] = f3;
                }
            }
            if (f > 1.0f) {
                float f4 = 1.0f / f;
                for (int i3 = 0; i3 < clearViewDataArr.length; i3++) {
                    if (clearViewDataArr[i3] != null) {
                        float[] fArr = this.animateToPercentage;
                        fArr[i3] = fArr[i3] * f4;
                    }
                }
            }
            if (!z) {
                System.arraycopy(this.animateToPercentage, 0, this.drawingPercentage, 0, clearViewDataArr.length);
                return;
            }
            System.arraycopy(this.drawingPercentage, 0, this.startFromPercentage, 0, clearViewDataArr.length);
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.valueAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StorageDiagramView.this.lambda$update$0(clearViewDataArr, valueAnimator2);
                }
            });
            this.valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                @Override
                public void onAnimationEnd(Animator animator) {
                    int i4 = 0;
                    while (true) {
                        ClearViewData[] clearViewDataArr2 = clearViewDataArr;
                        if (i4 < clearViewDataArr2.length) {
                            if (clearViewDataArr2[i4] != null) {
                                clearViewDataArr2[i4].firstDraw = false;
                            }
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
            });
            this.valueAnimator.setDuration(450L);
            this.valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
            this.valueAnimator.start();
        }
    }

    public void lambda$update$0(ClearViewData[] clearViewDataArr, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < clearViewDataArr.length; i++) {
            this.drawingPercentage[i] = (this.startFromPercentage[i] * (1.0f - floatValue)) + (this.animateToPercentage[i] * floatValue);
        }
        invalidate();
    }

    public void updateDescription() {
        if (this.data != null) {
            long j = 0;
            int i = 0;
            while (true) {
                ClearViewData[] clearViewDataArr = this.data;
                if (i >= clearViewDataArr.length) {
                    break;
                }
                if (clearViewDataArr[i] != null && clearViewDataArr[i].clear) {
                    j += clearViewDataArr[i].size;
                }
                i++;
            }
            String str = " ";
            String[] split = AndroidUtilities.formatFileSize(j).split(str);
            if (split.length > 1) {
                this.layout1 = new StaticLayout(j == 0 ? str : split[0], this.textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                if (j != 0) {
                    str = split[1];
                }
                this.layout2 = new StaticLayout(str, this.textPaint2, getMeasuredWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
        }
    }
}
