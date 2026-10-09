package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ig0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public bd0 I;
    public TextPaint f27372a;
    public TextPaint f27373b;
    public StaticLayout f27374c;
    public float d;
    public float f27375e;
    public StaticLayout f27376f;
    public float h;
    public float f27377n;
    public boolean f27378r;
    public g6 f27379s;
    public boolean v;
    public kg0 f27380w;
    public ci.ha f27381x;
    public boolean f27382y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f27379s.e(this.f27378r);
        if (e7 > 0.0f && this.f27374c != null && this.f27376f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e7 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f27375e, getHeight() * 0.22f);
            this.f27374c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27377n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27376f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27372a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27373b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27374c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27374c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f27374c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f27374c.getLineCount() > 0) {
                f10 = this.f27374c.getLineLeft(0);
            }
            this.f27375e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(kg0 kg0Var) {
        this.f27380w = kg0Var;
    }
}
