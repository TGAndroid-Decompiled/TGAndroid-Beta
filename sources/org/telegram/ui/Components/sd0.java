package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class sd0 extends View {
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public pb0 I;
    public TextPaint f38025a;
    public TextPaint f38026b;
    public StaticLayout f38027c;
    public float d;
    public float f38028e;
    public StaticLayout f38029f;
    public float h;
    public float f38030n;
    public boolean f38031r;
    public w5 f38032s;
    public boolean f38033w;
    public td0 f38034x;
    public fi.u8 f38035y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f38032s.d(this.f38031r);
        if (d > 0.0f && this.f38027c != null && this.f38029f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f38028e, getHeight() * 0.22f);
            this.f38027c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f38030n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f38029f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f38025a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f38026b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f38027c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.id.M0(2131751126, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f38027c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f38027c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f38027c.getLineCount() > 0) {
                f11 = this.f38027c.getLineLeft(0);
            }
            this.f38028e = f11;
        }
    }

    public void setAllowTouch(boolean z9) {
        this.f38033w = z9;
    }

    public void setFilterView(td0 td0Var) {
        this.f38034x = td0Var;
    }
}
