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
public final class e91 extends View {
    public ShapeDrawable f25637a;
    public Drawable f25638b;
    public StaticLayout f25639c;
    public TextPaint d;
    public long f25640e;
    public float f25641f;
    public float h;
    public boolean f25642n;

    public final void a(boolean z10) {
        this.f25642n = z10;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20788pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20807qf;
        this.f25637a = org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f25638b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Drawable drawable = this.f25638b;
        if (this.f25639c != null) {
            if (this.f25642n) {
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
            canvas.scale(f15, f15, this.f25641f, getMeasuredHeight());
            canvas.translate(this.f25641f - (this.f25639c.getWidth() / 2.0f), 0.0f);
            this.f25637a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.f25639c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.f25639c.getHeight()));
            drawable.setBounds(org.telegram.messenger.am.z(2, this.f25639c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.f25639c.getHeight()), org.telegram.ui.Cells.c1.r(2, this.f25639c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.f25639c.getHeight())));
            drawable.setAlpha(i10);
            this.f25637a.setAlpha(i10);
            this.d.setAlpha(i10);
            drawable.draw(canvas);
            this.f25637a.draw(canvas);
            canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
            this.f25639c.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.f25638b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.f25639c.getHeight(), 1073741824));
    }

    public void setCx(float f7) {
        this.f25641f = f7;
        invalidate();
    }

    public void setTime(int i10) {
        long j3 = i10;
        if (j3 != this.f25640e) {
            this.f25640e = j3;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.f25639c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
