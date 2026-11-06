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
public final class f61 extends View {
    public ShapeDrawable f33470a;
    public Drawable f33471b;
    public StaticLayout f33472c;
    public TextPaint d;
    public long f33473e;
    public float f33474f;
    public float h;
    public boolean f33475n;
    public int f33476r;

    public final void a(boolean z9) {
        this.f33475n = z9;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f33471b;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27858dg, false));
        ShapeDrawable shapeDrawable = this.f33470a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27877eg, false), shapeDrawable);
        } else {
            this.f33470a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27877eg, false));
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27877eg, false);
        if (x02 == this.f33476r && drawable.getColorFilter() != null) {
            return;
        }
        this.f33476r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f33471b;
        if (this.f33472c != null) {
            if (this.f33475n) {
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
            canvas.scale(f16, f16, this.f33474f, getMeasuredHeight());
            canvas.translate(this.f33474f - (this.f33472c.getWidth() / 2.0f), 0.0f);
            this.f33470a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.f33472c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.f33472c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, this.f33472c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.f33472c.getHeight()), org.telegram.ui.Cells.f1.w(2, this.f33472c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.f33472c.getHeight())));
            drawable.setAlpha(i7);
            this.f33470a.setAlpha(i7);
            this.d.setAlpha(i7);
            drawable.draw(canvas);
            this.f33470a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
            this.f33472c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f33471b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.f33472c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f33474f = f10;
        invalidate();
    }

    public void setTime(int i7) {
        long j3 = i7;
        if (j3 != this.f33473e) {
            this.f33473e = j3;
            String g02 = org.telegram.messenger.g0.g0(i7, false, false);
            TextPaint textPaint = this.d;
            this.f33472c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
