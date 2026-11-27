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
    public final ArrayList a;
    public final ArrayList b;
    public final TextPaint c;
    public ObjectAnimator d;
    public float e;
    public int f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;

    public NumberTextView(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new TextPaint(1);
        this.e = 0.0f;
        this.f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.s;
    }

    public float getProgress() {
        return this.e;
    }

    public float getTextWidth() {
        return this.r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f = hl.L(4.0f);
        } else {
            f = height;
        }
        if (this.n) {
            f2 = (getMeasuredWidth() - this.r) / 2.0f;
            f3 = ((getMeasuredWidth() - this.s) / 2.0f) - f2;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f2, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.b;
        int max = Math.max(size, arrayList2.size());
        for (int i = 0; i < max; i++) {
            canvas.save();
            StaticLayout staticLayout2 = null;
            if (i < arrayList2.size()) {
                staticLayout = (StaticLayout) arrayList2.get(i);
            } else {
                staticLayout = null;
            }
            if (i < arrayList.size()) {
                staticLayout2 = (StaticLayout) arrayList.get(i);
            }
            float f4 = this.e;
            int i2 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.c;
            if (i2 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f4 * 255.0f));
                    canvas.save();
                    canvas.translate(f3, (this.e - 1.0f) * f);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.e) * 255.0f));
                        canvas.translate(0.0f, this.e * f);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f4 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f4) * 255.0f));
                    canvas.save();
                    canvas.translate(f3, (this.e + 1.0f) * f);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.e * f);
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
                lineWidth = staticLayout.getLineWidth(0) + hl.L(1.0f);
            }
            canvas.translate(lineWidth, 0.0f);
            if (staticLayout2 != null && staticLayout != null) {
                f3 = (staticLayout.getLineWidth(0) - staticLayout2.getLineWidth(0)) + f3;
            }
        }
        canvas.restore();
    }

    public void setCenterAlign(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        if (this.e == f) {
            return;
        }
        this.e = f;
        invalidate();
    }

    public void setTextColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        this.c.setTextSize(hl.L(i));
        this.b.clear();
        this.a.clear();
        a(this.f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
        this.b.clear();
        this.a.clear();
        a(this.f, false);
    }

    public void setOnTextWidthProgressChangedListener(iq7 iq7Var) {
    }
}
