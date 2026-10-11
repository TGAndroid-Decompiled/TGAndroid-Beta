package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public yc0 I;
    public TextPaint f27726a;
    public TextPaint f27727b;
    public StaticLayout f27728c;
    public float d;
    public float f27729e;
    public StaticLayout f27730f;
    public float h;
    public float f27731n;
    public boolean f27732r;
    public g6 f27733s;
    public boolean v;
    public lg0 f27734w;
    public ci.ha f27735x;
    public boolean f27736y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f27733s.e(this.f27732r);
        if (e7 > 0.0f && this.f27728c != null && this.f27730f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e7 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f27729e, getHeight() * 0.22f);
            this.f27728c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f27731n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f27730f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f27726a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f27727b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f27728c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f27728c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f27728c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f27728c.getLineCount() > 0) {
                f10 = this.f27728c.getLineLeft(0);
            }
            this.f27729e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(lg0 lg0Var) {
        this.f27734w = lg0Var;
    }
}
