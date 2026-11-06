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
    public final ArrayList f31409a;
    public final ArrayList f31410b;
    public final TextPaint f31411c;
    public ObjectAnimator d;
    public float f31412e;
    public int f31413f;
    public boolean h;
    public boolean f31414n;
    public float f31415r;
    public float f31416s;

    public NumberTextView(Context context) {
        super(context);
        this.f31409a = new ArrayList();
        this.f31410b = new ArrayList();
        this.f31411c = new TextPaint(1);
        this.f31412e = 0.0f;
        this.f31413f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f31416s;
    }

    public float getProgress() {
        return this.f31412e;
    }

    public float getTextWidth() {
        return this.f31415r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f31409a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = height;
        }
        if (this.f31414n) {
            f11 = (getMeasuredWidth() - this.f31415r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f31416s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f31410b;
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
            float f13 = this.f31412e;
            int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f31411c;
            if (i10 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f31412e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f31412e) * 255.0f));
                        canvas.translate(0.0f, this.f31412e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f31412e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i7 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f31412e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f31412e * f10);
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
        this.f31414n = z9;
    }

    public void setProgress(float f10) {
        if (this.f31412e == f10) {
            return;
        }
        this.f31412e = f10;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.f31411c.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        this.f31411c.setTextSize(org.telegram.messenger.g0.L(i7));
        this.f31410b.clear();
        this.f31409a.clear();
        a(this.f31413f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f31411c.setTypeface(typeface);
        this.f31410b.clear();
        this.f31409a.clear();
        a(this.f31413f, false);
    }

    public void setOnTextWidthProgressChangedListener(ib0 ib0Var) {
    }
}
