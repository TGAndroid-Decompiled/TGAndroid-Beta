package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hf0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public cc0 I;
    public TextPaint f26720a;
    public TextPaint f26721b;
    public StaticLayout f26722c;
    public float d;
    public float f26723e;
    public StaticLayout f26724f;
    public float h;
    public float f26725n;
    public boolean f26726r;
    public e6 f26727s;
    public boolean v;
    public jf0 f26728w;
    public di.ka f26729x;
    public boolean f26730y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f26727s.e(this.f26726r);
        if (e7 > 0.0f && this.f26722c != null && this.f26724f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e7 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f26723e, getHeight() * 0.22f);
            this.f26722c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f26725n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f26724f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f26720a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f26721b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f26722c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f26722c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f26722c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f26722c.getLineCount() > 0) {
                f10 = this.f26722c.getLineLeft(0);
            }
            this.f26723e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(jf0 jf0Var) {
        this.f26728w = jf0Var;
    }
}
