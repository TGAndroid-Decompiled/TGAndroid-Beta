package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class ne0 extends View {
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public eb0 I;
    public TextPaint f28800a;
    public TextPaint f28801b;
    public StaticLayout f28802c;
    public float d;
    public float e;
    public StaticLayout f28803f;
    public float h;
    public float f28804n;
    public boolean f28805r;
    public t5 f28806s;
    public boolean f28807w;
    public oe0 f28808x;
    public vh.y6 f28809y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f28806s.d(this.f28805r);
        if (d > 0.0f && this.f28802c != null && this.f28803f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f28802c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f28804n, (getHeight() * 0.22f) + org.telegram.messenger.i0.L(60.0f));
            this.f28803f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f28800a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.i0.L(34.0f));
        TextPaint textPaint2 = this.f28801b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.i0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(58.0f));
        if (this.f28802c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.dd.L0(2131751127, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f28802c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f28802c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f28802c.getLineCount() > 0) {
                f10 = this.f28802c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.f28807w = z10;
    }

    public void setFilterView(oe0 oe0Var) {
        this.f28808x = oe0Var;
    }
}
