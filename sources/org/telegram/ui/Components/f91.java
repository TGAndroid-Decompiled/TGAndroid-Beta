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
import org.telegram.messenger.AndroidUtilities;
public final class f91 extends View {
    public ShapeDrawable f28103a;
    public Drawable f28104b;
    public StaticLayout f28105c;
    public TextPaint d;
    public long e;
    public float f28106f;
    public float h;
    public boolean f28107n;
    public int f28108r;

    public final void a(boolean z10) {
        this.f28107n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.f28104b;
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23585pf, false));
        ShapeDrawable shapeDrawable = this.f28103a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23602qf, false), shapeDrawable);
        } else {
            this.f28103a = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23602qf, false));
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23602qf, false);
        if (x02 == this.f28108r && drawable.getColorFilter() != null) {
            return;
        }
        this.f28108r = x02;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Drawable drawable = this.f28104b;
        if (this.f28105c != null) {
            if (this.f28107n) {
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
            canvas.scale(f15, f15, this.f28106f, getMeasuredHeight());
            canvas.translate(this.f28106f - (this.f28105c.getWidth() / 2.0f), 0.0f);
            this.f28103a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f28105c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f28105c.getHeight()));
            drawable.setBounds(org.telegram.ui.d3.x(2, this.f28105c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f28105c.getHeight()), org.telegram.ui.d3.C(2, this.f28105c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f28105c.getHeight())));
            drawable.setAlpha(i10);
            this.f28103a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f28103a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f28105c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f28104b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f28105c.getHeight(), 1073741824));
    }

    public void setCx(float f7) {
        this.f28106f = f7;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.e) {
            this.e = j10;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f28105c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
