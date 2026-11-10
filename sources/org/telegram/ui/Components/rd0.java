package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class rd0 extends View {
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public ob0 I;
    public TextPaint f37611a;
    public TextPaint f37612b;
    public StaticLayout f37613c;
    public float d;
    public float f37614e;
    public StaticLayout f37615f;
    public float h;
    public float f37616n;
    public boolean f37617r;
    public v5 f37618s;
    public boolean f37619w;
    public sd0 f37620x;
    public fi.u8 f37621y;

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f37618s.d(this.f37617r);
        if (d > 0.0f && this.f37613c != null && this.f37615f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f37614e, getHeight() * 0.22f);
            this.f37613c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f37616n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
            this.f37615f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f37611a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.f37612b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.f37613c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.id.M0(2131751126, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f37613c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f37613c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f37613c.getLineCount() > 0) {
                f11 = this.f37613c.getLineLeft(0);
            }
            this.f37614e = f11;
        }
    }

    public void setAllowTouch(boolean z9) {
        this.f37619w = z9;
    }

    public void setFilterView(sd0 sd0Var) {
        this.f37620x = sd0Var;
    }
}
