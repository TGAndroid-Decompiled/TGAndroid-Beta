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
    public final ArrayList f33022a;
    public final ArrayList f33023b;
    public final TextPaint f33024c;
    public ObjectAnimator d;
    public float f33025e;
    public int f33026f;
    public boolean h;
    public boolean f33027n;
    public float f33028r;
    public float f33029s;

    public NumberTextView(Context context) {
        super(context);
        this.f33022a = new ArrayList();
        this.f33023b = new ArrayList();
        this.f33024c = new TextPaint(1);
        this.f33025e = 0.0f;
        this.f33026f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f33029s;
    }

    public float getProgress() {
        return this.f33025e;
    }

    public float getTextWidth() {
        return this.f33028r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f33022a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = height;
        }
        if (this.f33027n) {
            f11 = (getMeasuredWidth() - this.f33028r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f33029s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f33023b;
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
            float f13 = this.f33025e;
            int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f33024c;
            if (i10 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f33025e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f33025e) * 255.0f));
                        canvas.translate(0.0f, this.f33025e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f33025e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i7 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f33025e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f33025e * f10);
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

    public void setCenterAlign(boolean z10) {
        this.f33027n = z10;
    }

    public void setProgress(float f10) {
        if (this.f33025e == f10) {
            return;
        }
        this.f33025e = f10;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.f33024c.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        this.f33024c.setTextSize(org.telegram.messenger.g0.L(i7));
        this.f33023b.clear();
        this.f33022a.clear();
        a(this.f33026f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f33024c.setTypeface(typeface);
        this.f33023b.clear();
        this.f33022a.clear();
        a(this.f33026f, false);
    }

    public void setOnTextWidthProgressChangedListener(ub0 ub0Var) {
    }
}
