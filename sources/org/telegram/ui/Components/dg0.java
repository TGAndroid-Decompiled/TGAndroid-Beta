package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public xa0 I;
    public TextPaint f27430a;
    public TextPaint f27431b;
    public StaticLayout f27432c;
    public float d;
    public float e;
    public StaticLayout f27433f;
    public float h;
    public float f27434n;
    public boolean f27435r;
    public h6 f27436s;
    public boolean v;
    public fg0 f27437w;
    public fi.p9 f27438x;
    public boolean f27439y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f27436s.e(this.f27435r);
        if (e > 0.0f && this.f27432c != null && this.f27433f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f27432c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27434n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27433f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27430a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27431b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27432c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27432c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f27432c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f27432c.getLineCount() > 0) {
                f10 = this.f27432c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(fg0 fg0Var) {
        this.f27437w = fg0Var;
    }
}
