package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pf0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public jc0 I;
    public TextPaint f27283a;
    public TextPaint f27284b;
    public StaticLayout f27285c;
    public float d;
    public float e;
    public StaticLayout f27286f;
    public float h;
    public float f27287n;
    public boolean f27288r;
    public d6 f27289s;
    public boolean v;
    public rf0 f27290w;
    public ci.ka f27291x;
    public boolean f27292y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f27289s.e(this.f27288r);
        if (e > 0.0f && this.f27285c != null && this.f27286f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f27285c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27287n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27286f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27283a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27284b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27285c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27285c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f27285c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f27285c.getLineCount() > 0) {
                f10 = this.f27285c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(rf0 rf0Var) {
        this.f27290w = rf0Var;
    }
}
