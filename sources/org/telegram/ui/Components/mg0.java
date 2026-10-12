package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public cd0 I;
    public TextPaint f28537a;
    public TextPaint f28538b;
    public StaticLayout f28539c;
    public float d;
    public float f28540e;
    public StaticLayout f28541f;
    public float h;
    public float f28542n;
    public boolean f28543r;
    public g6 f28544s;
    public boolean v;
    public og0 f28545w;
    public ci.ha f28546x;
    public boolean f28547y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f28544s.e(this.f28543r);
        if (e7 > 0.0f && this.f28539c != null && this.f28541f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e7 * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.f28540e, getHeight() * 0.22f);
            this.f28539c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f28542n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f28541f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f28537a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f28538b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f28539c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f28539c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f28539c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f28539c.getLineCount() > 0) {
                f10 = this.f28539c.getLineLeft(0);
            }
            this.f28540e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(og0 og0Var) {
        this.f28545w = og0Var;
    }
}
