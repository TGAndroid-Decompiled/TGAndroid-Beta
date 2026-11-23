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
    public final ArrayList f32991a;
    public final ArrayList f32992b;
    public final TextPaint f32993c;
    public ObjectAnimator d;
    public float f32994e;
    public int f32995f;
    public boolean h;
    public boolean f32996n;
    public float f32997r;
    public float f32998s;

    public NumberTextView(Context context) {
        super(context);
        this.f32991a = new ArrayList();
        this.f32992b = new ArrayList();
        this.f32993c = new TextPaint(1);
        this.f32994e = 0.0f;
        this.f32995f = 1;
    }

    public final void a(int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.NumberTextView.a(int, boolean):void");
    }

    public float getOldTextWidth() {
        return this.f32998s;
    }

    public float getProgress() {
        return this.f32994e;
    }

    public float getTextWidth() {
        return this.f32997r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float lineWidth;
        ArrayList arrayList = this.f32991a;
        if (arrayList.isEmpty()) {
            return;
        }
        float height = ((StaticLayout) arrayList.get(0)).getHeight();
        if (this.h) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            f10 = height;
        }
        if (this.f32996n) {
            f11 = (getMeasuredWidth() - this.f32997r) / 2.0f;
            f12 = ((getMeasuredWidth() - this.f32998s) / 2.0f) - f11;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + f11, (getMeasuredHeight() - height) / 2.0f);
        int size = arrayList.size();
        ArrayList arrayList2 = this.f32992b;
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
            float f13 = this.f32994e;
            int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f32993c;
            if (i10 > 0) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f32994e - 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        textPaint.setAlpha((int) ((1.0f - this.f32994e) * 255.0f));
                        canvas.translate(0.0f, this.f32994e * f10);
                    }
                } else {
                    textPaint.setAlpha(255);
                }
            } else if (f13 < 0.0f) {
                if (staticLayout != null) {
                    textPaint.setAlpha((int) ((-f13) * 255.0f));
                    canvas.save();
                    canvas.translate(f12, (this.f32994e + 1.0f) * f10);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i7 != max - 1 && staticLayout == null) {
                        textPaint.setAlpha(255);
                    } else {
                        textPaint.setAlpha((int) ((this.f32994e + 1.0f) * 255.0f));
                        canvas.translate(0.0f, this.f32994e * f10);
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
        this.f32996n = z10;
    }

    public void setProgress(float f10) {
        if (this.f32994e == f10) {
            return;
        }
        this.f32994e = f10;
        invalidate();
    }

    public void setTextColor(int i7) {
        this.f32993c.setColor(i7);
        invalidate();
    }

    public void setTextSize(int i7) {
        this.f32993c.setTextSize(org.telegram.messenger.g0.L(i7));
        this.f32992b.clear();
        this.f32991a.clear();
        a(this.f32995f, false);
    }

    public void setTypeface(Typeface typeface) {
        this.f32993c.setTypeface(typeface);
        this.f32992b.clear();
        this.f32991a.clear();
        a(this.f32995f, false);
    }

    public void setOnTextWidthProgressChangedListener(ub0 ub0Var) {
    }
}
