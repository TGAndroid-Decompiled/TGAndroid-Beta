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
public final class v71 extends View {
    public ShapeDrawable f29393a;
    public Drawable f29394b;
    public StaticLayout f29395c;
    public TextPaint d;
    public long e;
    public float f29396f;
    public float h;
    public boolean f29397n;

    public final void a(boolean z4) {
        this.f29397n = z4;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20105pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.j6.qf;
        this.f29393a = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f29394b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f29394b;
        if (this.f29395c != null) {
            if (this.f29397n) {
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
            int i10 = (int) (f10 * 255.0f);
            canvas.save();
            float f16 = this.h;
            canvas.scale(f16, f16, this.f29396f, getMeasuredHeight());
            canvas.translate(this.f29396f - (this.f29395c.getWidth() / 2.0f), 0.0f);
            this.f29393a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f29395c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f29395c.getHeight()));
            drawable.setBounds(org.telegram.ui.b.u(2, this.f29395c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f29395c.getHeight()), org.telegram.ui.b.A(2, this.f29395c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f29395c.getHeight())));
            drawable.setAlpha(i10);
            this.f29393a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f29393a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f29395c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29394b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f29395c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f29396f = f10;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.e) {
            this.e = j10;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f29395c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
