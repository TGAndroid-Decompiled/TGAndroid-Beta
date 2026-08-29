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
public final class j71 extends View {
    public ShapeDrawable f29607a;
    public Drawable f29608b;
    public StaticLayout f29609c;
    public TextPaint d;
    public long f29610e;
    public float f29611f;
    public float h;
    public boolean f29612n;

    public final void a(boolean z10) {
        this.f29612n = z10;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23301qf;
        this.f29607a = org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f29608b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        Drawable drawable = this.f29608b;
        if (this.f29609c != null) {
            if (this.f29612n) {
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
                f9 = 1.0f;
            } else {
                f9 = f14 / 0.5f;
            }
            int i10 = (int) (f9 * 255.0f);
            canvas.save();
            float f15 = this.h;
            canvas.scale(f15, f15, this.f29611f, getMeasuredHeight());
            canvas.translate(this.f29611f - (this.f29609c.getWidth() / 2.0f), 0.0f);
            this.f29607a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f29609c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f29609c.getHeight()));
            drawable.setBounds(org.telegram.ui.b.v(2, this.f29609c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f29609c.getHeight()), org.telegram.ui.b.A(2, this.f29609c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f29609c.getHeight())));
            drawable.setAlpha(i10);
            this.f29607a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f29607a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f29609c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f29608b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f29609c.getHeight(), 1073741824));
    }

    public void setCx(float f9) {
        this.f29611f = f9;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.f29610e) {
            this.f29610e = j10;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f29609c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
