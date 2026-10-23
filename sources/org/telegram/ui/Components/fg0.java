package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fg0 extends View {
    public long E;
    public float F;
    public float G;
    public float H;
    public yb0 I;
    public TextPaint f26313a;
    public TextPaint f26314b;
    public StaticLayout f26315c;
    public float d;
    public float e;
    public StaticLayout f26316f;
    public float h;
    public float f26317n;
    public boolean f26318r;
    public f6 f26319s;
    public boolean v;
    public hg0 f26320w;
    public ei.t9 f26321x;
    public boolean f26322y;

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f26319s.e(this.f26318r);
        if (e > 0.0f && this.f26315c != null && this.f26316f != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
            this.f26315c.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.h) / 2.0f) - this.f26317n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.f26316f.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.f26313a;
        textPaint.setColor(-1);
        float f10 = 0.0f;
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.f26314b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.f26315c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f26315c = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                f7 = this.f26315c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f26315c.getLineCount() > 0) {
                f10 = this.f26315c.getLineLeft(0);
            }
            this.e = f10;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.v = z10;
    }

    public void setFilterView(hg0 hg0Var) {
        this.f26320w = hg0Var;
    }
}
