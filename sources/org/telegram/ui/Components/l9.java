package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class l9 extends View {
    public final k9 f28148a;
    public sg.c1 f28149b;
    public f01 f28150c;
    public Paint d;

    public l9(Context context, boolean z10) {
        super(context);
        this.f28148a = new k9(this, z10);
    }

    public final void a(boolean z10) {
        this.f28148a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f28148a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28148a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28148a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28148a.i(canvas);
        if (this.f28150c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f28149b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f28149b.f46064f);
            this.f28150c.c(rectF.centerX() - (this.f28150c.f25875c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        k9 k9Var = this.f28148a;
        k9Var.f27797p = measuredWidth;
        k9Var.f27796o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f28148a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f28148a.f27793l = z10;
    }

    public void setCount(int i10) {
        this.f28148a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f28148a.f27791j = runnable;
    }

    public void setSize(int i10) {
        this.f28148a.f27800s = i10;
    }

    public void setStepFactor(float f7) {
        this.f28148a.f27801t = f7;
    }

    public void setStyle(int i10) {
        k9 k9Var = this.f28148a;
        k9Var.f27792k = i10;
        k9Var.f();
    }
}
