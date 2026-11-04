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
public final class y51 extends View {
    public ShapeDrawable f40625a;
    public Drawable f40626b;
    public StaticLayout f40627c;
    public TextPaint d;
    public long f40628e;
    public float f40629f;
    public float h;
    public boolean f40630n;
    public int f40631r;

    public final void a(boolean z10) {
        this.f40630n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f40626b;
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27888dg, false));
        ShapeDrawable shapeDrawable = this.f40625a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27907eg, false), shapeDrawable);
        } else {
            this.f40625a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27907eg, false));
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27907eg, false);
        if (x02 == this.f40631r && drawable.getColorFilter() != null) {
            return;
        }
        this.f40631r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f40626b;
        if (this.f40627c != null) {
            if (this.f40630n) {
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
            int i3 = (int) (f10 * 255.0f);
            canvas.save();
            float f16 = this.h;
            canvas.scale(f16, f16, this.f40629f, getMeasuredHeight());
            canvas.translate(this.f40629f - (this.f40627c.getWidth() / 2.0f), 0.0f);
            this.f40625a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.f40627c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40627c.getHeight()));
            drawable.setBounds(org.telegram.ui.Cells.f1.C(2, this.f40627c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.f40627c.getHeight()), org.telegram.ui.Cells.f1.z(2, this.f40627c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.f40627c.getHeight())));
            drawable.setAlpha(i3);
            this.f40625a.setAlpha(i3);
            this.d.setAlpha(i3);
            drawable.draw(canvas);
            this.f40625a.draw(canvas);
            canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
            this.f40627c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(this.f40626b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.f40627c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f40629f = f10;
        invalidate();
    }

    public void setTime(int i3) {
        long j10 = i3;
        if (j10 != this.f40628e) {
            this.f40628e = j10;
            String g02 = org.telegram.messenger.g0.g0(i3, false, false);
            TextPaint textPaint = this.d;
            this.f40627c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
