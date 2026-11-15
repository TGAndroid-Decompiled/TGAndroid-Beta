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
public final class g61 extends View {
    public ShapeDrawable f34854a;
    public Drawable f34855b;
    public StaticLayout f34856c;
    public TextPaint d;
    public long f34857e;
    public float f34858f;
    public float h;
    public boolean f34859n;
    public int f34860r;

    public final void a(boolean z10) {
        this.f34859n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f34855b;
        this.d.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28914gg, false));
        ShapeDrawable shapeDrawable = this.f34854a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.hg, false), shapeDrawable);
        } else {
            this.f34854a = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.hg, false));
        }
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.hg, false);
        if (x02 == this.f34860r && drawable.getColorFilter() != null) {
            return;
        }
        this.f34860r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f34855b;
        if (this.f34856c != null) {
            if (this.f34859n) {
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
            canvas.scale(f16, f16, this.f34858f, getMeasuredHeight());
            canvas.translate(this.f34858f - (this.f34856c.getWidth() / 2.0f), 0.0f);
            this.f34854a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.f34856c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.f34856c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.y0.A(2, this.f34856c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.f34856c.getHeight()), org.telegram.ui.Cells.y0.w(2, this.f34856c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.f34856c.getHeight())));
            drawable.setAlpha(i7);
            this.f34854a.setAlpha(i7);
            this.d.setAlpha(i7);
            drawable.draw(canvas);
            this.f34854a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
            this.f34856c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f34855b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.f34856c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f34858f = f10;
        invalidate();
    }

    public void setTime(int i7) {
        long j3 = i7;
        if (j3 != this.f34857e) {
            this.f34857e = j3;
            String g02 = org.telegram.messenger.g0.g0(i7, false, false);
            TextPaint textPaint = this.d;
            this.f34856c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
