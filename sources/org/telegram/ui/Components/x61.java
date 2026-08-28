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
public final class x61 extends View {
    public ShapeDrawable f34587a;
    public Drawable f34588b;
    public StaticLayout f34589c;
    public TextPaint d;
    public long f34590e;
    public float f34591f;
    public float h;
    public boolean f34592n;

    public final void a(boolean z10) {
        this.f34592n = z10;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23219pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23238qf;
        this.f34587a = org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f34588b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Drawable drawable = this.f34588b;
        if (this.f34589c != null) {
            if (this.f34592n) {
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
            int i9 = (int) (f10 * 255.0f);
            canvas.save();
            float f16 = this.h;
            canvas.scale(f16, f16, this.f34591f, getMeasuredHeight());
            canvas.translate(this.f34591f - (this.f34589c.getWidth() / 2.0f), 0.0f);
            this.f34587a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f34589c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f34589c.getHeight()));
            drawable.setBounds(org.telegram.messenger.ll.x(2, this.f34589c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f34589c.getHeight()), org.telegram.messenger.ll.B(2, this.f34589c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f34589c.getHeight())));
            drawable.setAlpha(i9);
            this.f34587a.setAlpha(i9);
            this.d.setAlpha(i9);
            drawable.draw(canvas);
            this.f34587a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f34589c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(this.f34588b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f34589c.getHeight(), 1073741824));
    }

    public void setCx(float f10) {
        this.f34591f = f10;
        invalidate();
    }

    public void setTime(int i9) {
        long j10 = i9;
        if (j10 != this.f34590e) {
            this.f34590e = j10;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i9);
            TextPaint textPaint = this.d;
            this.f34589c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
