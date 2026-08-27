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

public final class z61 extends View {

    public ShapeDrawable f35169a;

    public Drawable f35170b;

    public StaticLayout f35171c;
    public TextPaint d;

    public long f35172e;

    public float f35173f;
    public float h;

    public boolean f35174n;

    public final void a(boolean z10) {
        this.f35174n = z10;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23274pf, false));
        int iDp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23291qf;
        this.f35169a = org.telegram.ui.ActionBar.g6.b0(iDp, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f35170b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.f35170b;
        if (this.f35171c == null) {
            return;
        }
        if (this.f35174n) {
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
        int i10 = (int) ((f14 > 0.5f ? 1.0f : f14 / 0.5f) * 255.0f);
        canvas.save();
        float f15 = this.h;
        canvas.scale(f15, f15, this.f35173f, getMeasuredHeight());
        canvas.translate(this.f35173f - (this.f35171c.getWidth() / 2.0f), 0.0f);
        this.f35169a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f35171c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f35171c.getHeight()));
        drawable.setBounds(org.telegram.messenger.rl.v(2, this.f35171c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f35171c.getHeight()), org.telegram.messenger.rl.A(2, this.f35171c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f35171c.getHeight())));
        drawable.setAlpha(i10);
        this.f35169a.setAlpha(i10);
        this.d.setAlpha(i10);
        drawable.draw(canvas);
        this.f35169a.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
        this.f35171c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f35170b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f35171c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f35173f = f10;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.f35172e) {
            this.f35172e = j10;
            String shortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f35171c = new StaticLayout(shortDuration, textPaint, (int) textPaint.measureText(shortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
