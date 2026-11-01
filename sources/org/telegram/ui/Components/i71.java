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
public final class i71 extends View {
    public ShapeDrawable f27019a;
    public Drawable f27020b;
    public StaticLayout f27021c;
    public TextPaint d;
    public long e;
    public float f27022f;
    public float h;
    public boolean f27023n;
    public int f27024r;

    public final void a(boolean z10) {
        this.f27023n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f27020b;
        this.d.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20940dg, false));
        ShapeDrawable shapeDrawable = this.f27019a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20957eg, false), shapeDrawable);
        } else {
            this.f27019a = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20957eg, false));
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20957eg, false);
        if (x02 == this.f27024r && drawable.getColorFilter() != null) {
            return;
        }
        this.f27024r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Drawable drawable = this.f27020b;
        if (this.f27021c != null) {
            if (this.f27023n) {
                float f10 = this.h;
                if (f10 != 1.0f) {
                    float f11 = f10 + 0.12f;
                    this.h = f11;
                    if (f11 > 1.0f) {
                        this.h = 1.0f;
                    }
                    invalidate();
                }
            } else {
                float f12 = this.h;
                if (f12 != 0.0f) {
                    float f13 = f12 - 0.12f;
                    this.h = f13;
                    if (f13 < 0.0f) {
                        this.h = 0.0f;
                    }
                    invalidate();
                }
                if (this.h == 0.0f) {
                    return;
                }
            }
            float f14 = this.h;
            if (f14 > 0.5f) {
                f7 = 1.0f;
            } else {
                f7 = f14 / 0.5f;
            }
            int i10 = (int) (f7 * 255.0f);
            canvas.save();
            float f15 = this.h;
            canvas.scale(f15, f15, this.f27022f, getMeasuredHeight());
            canvas.translate(this.f27022f - (this.f27021c.getWidth() / 2.0f), 0.0f);
            this.f27019a.setBounds(-org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f) + this.f27021c.getWidth(), (int) (org.telegram.messenger.i0.N(4.0f) + this.f27021c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.f1.z(2, this.f27021c.getWidth() / 2, drawable), (int) (org.telegram.messenger.i0.N(4.0f) + this.f27021c.getHeight()), org.telegram.ui.Cells.f1.w(2, this.f27021c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.i0.N(4.0f) + this.f27021c.getHeight())));
            drawable.setAlpha(i10);
            this.f27019a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f27019a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.i0.N(1.0f));
            this.f27021c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f27020b.getIntrinsicHeight() + org.telegram.messenger.i0.L(4.0f) + this.f27021c.getHeight(), 1073741824));
    }

    public void setCx(float f7) {
        this.f27022f = f7;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.e) {
            this.e = j10;
            String g02 = org.telegram.messenger.i0.g0(i10, false, false);
            TextPaint textPaint = this.d;
            this.f27021c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
