package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class l9 extends View {
    public final k9 f28120a;
    public sg.c1 f28121b;
    public f01 f28122c;
    public Paint d;

    public l9(Context context, boolean z10) {
        super(context);
        this.f28120a = new k9(this, z10);
    }

    public final void a(boolean z10) {
        this.f28120a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f28120a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28120a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28120a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28120a.i(canvas);
        if (this.f28122c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f28121b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f28121b.f46035f);
            this.f28122c.c(rectF.centerX() - (this.f28122c.f25847c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        k9 k9Var = this.f28120a;
        k9Var.f27769p = measuredWidth;
        k9Var.f27768o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f28120a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f28120a.f27765l = z10;
    }

    public void setCount(int i10) {
        this.f28120a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f28120a.f27763j = runnable;
    }

    public void setSize(int i10) {
        this.f28120a.f27772s = i10;
    }

    public void setStepFactor(float f7) {
        this.f28120a.f27773t = f7;
    }

    public void setStyle(int i10) {
        k9 k9Var = this.f28120a;
        k9Var.f27764k = i10;
        k9Var.f();
    }
}
