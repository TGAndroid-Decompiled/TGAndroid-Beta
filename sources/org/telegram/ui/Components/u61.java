package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class u61 extends View {
    public ShapeDrawable f40273a;
    public Drawable f40274b;
    public StaticLayout f40275c;
    public TextPaint d;
    public long f40276e;
    public float f40277f;
    public float h;
    public boolean f40278n;
    public int f40279r;

    public final void a(boolean z10) {
        this.f40278n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f40274b;
        this.d.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29446gg, false));
        ShapeDrawable shapeDrawable = this.f40273a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hg, false), shapeDrawable);
        } else {
            this.f40273a = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hg, false));
        }
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hg, false);
        if (x02 == this.f40279r && drawable.getColorFilter() != null) {
            return;
        }
        this.f40279r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f40274b;
        if (this.f40275c != null) {
            if (this.f40278n) {
                float f11 = this.h;
                if (f11 != 1.0f) {
                    float f12 = f11 + 0.12f;
                    this.h = f12;
                    if (f12 > 1.0f) {
                        this.h = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f13 = this.h;
                if (f13 != 0.0f) {
                    float f14 = f13 - 0.12f;
                    this.h = f14;
                    if (f14 < 0.0f) {
                        this.h = 0.0f;
                    }
                    invalidate();
                }
                if (this.h == 0.0f) {
                    return;
                }
            }
            float f15 = this.h;
            if (f15 > 0.5f) {
                f10 = 1.0f;
            } else {
                f10 = f15 / 0.5f;
            }
            int i7 = (int) (f10 * 255.0f);
            canvas.save();
            float f16 = this.h;
            canvas.scale(f16, f16, this.f40277f, getMeasuredHeight());
            canvas.translate(this.f40277f - (this.f40275c.getWidth() / 2.0f), 0.0f);
            this.f40273a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.f40275c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40275c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, this.f40275c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40275c.getHeight()), org.telegram.ui.Cells.c0.y(2, this.f40275c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.f40275c.getHeight())));
            drawable.setAlpha(i7);
            this.f40273a.setAlpha(i7);
            this.d.setAlpha(i7);
            drawable.draw(canvas);
            this.f40273a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
            this.f40275c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f40274b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.f40275c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f40277f = f10;
        invalidate();
    }

    public void setTime(int i7) {
        long j3 = i7;
        if (j3 != this.f40276e) {
            this.f40276e = j3;
            String g02 = org.telegram.messenger.g0.g0(i7, false, false);
            TextPaint textPaint = this.d;
            this.f40275c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
