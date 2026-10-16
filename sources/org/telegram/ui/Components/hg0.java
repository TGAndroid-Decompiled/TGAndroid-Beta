package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public yc0 I;
    public TextPaint f25303a;
    public TextPaint f25304b;
    public StaticLayout f25305c;
    public float d;
    public float e;
    public StaticLayout f25306f;
    public float h;
    public float f25307n;
    public boolean f25308r;
    public g6 f25309s;
    public boolean v;
    public jg0 f25310w;
    public di.ga f25311x;
    public boolean f25312y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25309s.e(this.f25308r);
        if (e > 0.0f && this.f25305c != null && this.f25306f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f25305c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f25307n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f25306f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f25303a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f25304b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f25305c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f25305c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f25305c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f25305c.getLineCount() > 0) {
                f10 = this.f25305c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(jg0 jg0Var) {
        this.f25310w = jg0Var;
    }
}
