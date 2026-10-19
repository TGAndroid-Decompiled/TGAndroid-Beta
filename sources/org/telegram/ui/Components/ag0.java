package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ag0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public rc0 I;
    public TextPaint f24559a;
    public TextPaint f24560b;
    public StaticLayout f24561c;
    public float d;
    public float e;
    public StaticLayout f24562f;
    public float h;
    public float f24563n;
    public boolean f24564r;
    public f6 f24565s;
    public boolean v;
    public cg0 f24566w;
    public ei.t9 f24567x;
    public boolean f24568y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f24565s.e(this.f24564r);
        if (e > 0.0f && this.f24561c != null && this.f24562f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f24561c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f24563n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f24562f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f24559a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f24560b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f24561c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f24561c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f24561c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f24561c.getLineCount() > 0) {
                f10 = this.f24561c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(cg0 cg0Var) {
        this.f24566w = cg0Var;
    }
}
