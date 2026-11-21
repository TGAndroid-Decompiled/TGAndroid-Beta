package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class de0 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public hb0 J;
    public TextPaint f34482a;
    public TextPaint f34483b;
    public StaticLayout f34484c;
    public float d;
    public float f34485e;
    public StaticLayout f34486f;
    public float h;
    public float f34487n;
    public boolean f34488r;
    public d6 f34489s;
    public boolean f34490w;
    public ee0 f34491x;
    public hi.r8 f34492y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f34489s.d(this.f34488r);
        if (d > 0.0f && this.f34484c != null && this.f34486f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f34485e, getHeight() * 0.22f);
            this.f34484c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f34487n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f34486f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f34482a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f34483b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f34484c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.gd.N0(2131751114, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f34484c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f34484c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f34484c.getLineCount() > 0) {
                f11 = this.f34484c.getLineLeft(0);
            }
            this.f34485e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f34490w = z10;
    }

    public void setFilterView(ee0 ee0Var) {
        this.f34491x = ee0Var;
    }
}
