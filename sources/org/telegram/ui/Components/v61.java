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
public final class v61 extends View {
    public ShapeDrawable f40567a;
    public Drawable f40568b;
    public StaticLayout f40569c;
    public TextPaint d;
    public long f40570e;
    public float f40571f;
    public float h;
    public boolean f40572n;
    public int f40573r;

    public final void a(boolean z10) {
        this.f40572n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f40568b;
        this.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29516gg, false));
        ShapeDrawable shapeDrawable = this.f40567a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false), shapeDrawable);
        } else {
            this.f40567a = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false));
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hg, false);
        if (x02 == this.f40573r && drawable.getColorFilter() != null) {
            return;
        }
        this.f40573r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f40568b;
        if (this.f40569c != null) {
            if (this.f40572n) {
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
            canvas.scale(f16, f16, this.f40571f, getMeasuredHeight());
            canvas.translate(this.f40571f - (this.f40569c.getWidth() / 2.0f), 0.0f);
            this.f40567a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.f40569c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40569c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.c0.C(2, this.f40569c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40569c.getHeight()), org.telegram.ui.Cells.c0.y(2, this.f40569c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.f40569c.getHeight())));
            drawable.setAlpha(i7);
            this.f40567a.setAlpha(i7);
            this.d.setAlpha(i7);
            drawable.draw(canvas);
            this.f40567a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
            this.f40569c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.f40568b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.f40569c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f40571f = f10;
        invalidate();
    }

    public void setTime(int i7) {
        long j3 = i7;
        if (j3 != this.f40570e) {
            this.f40570e = j3;
            String g02 = org.telegram.messenger.g0.g0(i7, false, false);
            TextPaint textPaint = this.d;
            this.f40569c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
