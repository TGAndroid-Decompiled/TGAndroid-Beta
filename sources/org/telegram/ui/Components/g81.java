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
public final class g81 extends View {
    public ShapeDrawable f24390a;
    public Drawable f24391b;
    public StaticLayout f24392c;
    public TextPaint d;
    public long e;
    public float f24393f;
    public float h;
    public boolean f24394n;

    public final void a(boolean z10) {
        this.f24394n = z10;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19287pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f19306qf;
        this.f24390a = org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.f24391b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Drawable drawable = this.f24391b;
        if (this.f24392c != null) {
            if (this.f24394n) {
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
            canvas.scale(f15, f15, this.f24393f, getMeasuredHeight());
            canvas.translate(this.f24393f - (this.f24392c.getWidth() / 2.0f), 0.0f);
            this.f24390a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f24392c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f24392c.getHeight()));
            drawable.setBounds(org.telegram.messenger.ok.z(2, this.f24392c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f24392c.getHeight()), org.telegram.ui.Cells.c1.t(2, this.f24392c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f24392c.getHeight())));
            drawable.setAlpha(i10);
            this.f24390a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f24390a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f24392c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f24391b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f24392c.getHeight(), 1073741824));
    }

    public void setCx(float f7) {
        this.f24393f = f7;
        invalidate();
    }

    public void setTime(int i10) {
        long j3 = i10;
        if (j3 != this.e) {
            this.e = j3;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f24392c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
