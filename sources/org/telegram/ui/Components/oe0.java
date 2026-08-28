package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class oe0 extends View {
    public long A;
    public float B;
    public float C;
    public float D;
    public ib0 E;
    public TextPaint f31365a;
    public TextPaint f31366b;
    public StaticLayout f31367c;
    public float d;
    public float f31368e;
    public StaticLayout f31369f;
    public float h;
    public float f31370n;
    public boolean f31371r;
    public y5 f31372s;
    public boolean v;
    public qe0 f31373w;
    public kh.v9 f31374x;
    public boolean f31375y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f31372s.e(this.f31371r);
        if (e10 > 0.0f && this.f31367c != null && this.f31369f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e10 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f31368e, getHeight() * 0.22f);
            this.f31367c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f31370n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f31369f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.f31365a;
        textPaint.setColor(-1);
        float f11 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f31366b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f31367c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f31367c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f10 = this.f31367c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f31367c.getLineCount() > 0) {
                f11 = this.f31367c.getLineLeft(0);
            }
            this.f31368e = f11;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(qe0 qe0Var) {
        this.f31373w = qe0Var;
    }
}
