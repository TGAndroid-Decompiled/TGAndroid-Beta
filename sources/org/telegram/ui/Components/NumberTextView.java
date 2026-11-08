package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
public class NumberTextView extends View {
    public final ArrayList f31414a;
    public final ArrayList f31415b;
    public final TextPaint f31416c;
    public ObjectAnimator d;
    public float f31417e;
    public int f31418f;
    public boolean h;
    public boolean f31419n;
    public float f31420r;
    public float f31421s;

    public NumberTextView(Context context) {
        super(context);
        this.f31414a = new ArrayList();
        this.f31415b = new ArrayList();
        this.f31416c = new TextPaint(1);
        this.f31417e = 0.0f;
        this.f31418f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f31421s;
    }

    public float getProgress() {
        return this.f31417e;
    }

    public float getTextWidth() {
        return this.f31420r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f31414a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = height;
        }
        if (this.f31419n) {
            f11 = (getMeasuredWidth() - this.f31420r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f31421s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f31415b;
        int max = Math.max(size, arrayList2.size());
        for (int i7 = 0; i7 < max; i7++) {
            canvas.save();
            StaticLayout staticLayout2 = null;
            if (i7 < arrayList2.size()) {
                staticLayout = (StaticLayout) arrayList2.get(i7);
            } else {
                staticLayout = null;
            }
            if (i7 < arrayList.size()) {
                staticLayout2 = (StaticLayout) arrayList.get(i7);
            }
            float f13 = this.f31417e;
            int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f31416c;
            if (i10 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f31417e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f31417e) * 255.0f));
                        canvas.translate(0.0f, this.f31417e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f31417e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i7 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f31417e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f31417e * f10);
                    }
                }
            } else if (staticLayout2 != null) {
                textPaint.setAlpha(255);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            if (staticLayout2 != null) {
                lineWidth = staticLayout2.getLineWidth(0);
            } else {
                lineWidth = staticLayout.getLineWidth(0) + org.telegram.messenger.g0.L(1.0f);
            }
            canvas.translate(lineWidth, 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f12 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f12;
            }
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z9) {
        this.f31419n = z9;
    }

    public void setProgress(float f10) {
        if (this.f31417e == f10) {
            return;
        }
        this.f31417e = f10;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.f31416c.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        this.f31416c.setTextSize(org.telegram.messenger.g0.L(i7));
        this.f31415b.clear();
        this.f31414a.clear();
        a(this.f31418f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f31416c.setTypeface(typeface);
        this.f31415b.clear();
        this.f31414a.clear();
        a(this.f31418f, false);
    }

    public void setOnTextWidthProgressChangedListener(ib0 ib0Var) {
    }
}
