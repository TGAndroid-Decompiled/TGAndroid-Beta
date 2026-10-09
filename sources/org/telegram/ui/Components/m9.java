package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class m9 extends View {
    public final l9 f28776a;
    public rg.a1 f28777b;
    public l11 f28778c;
    public Paint d;

    public m9(Context context, boolean z10) {
        super(context);
        this.f28776a = new l9(this, z10);
    }

    public final void a(boolean z10) {
        this.f28776a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f28776a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28776a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28776a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28776a.i(canvas);
        if (this.f28778c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f28777b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f28777b.f47177f);
            this.f28778c.c(rectF.centerX() - (this.f28778c.f28222c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        l9 l9Var = this.f28776a;
        l9Var.f28381p = measuredWidth;
        l9Var.f28380o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f28776a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f28776a.f28377l = z10;
    }

    public void setCount(int i10) {
        this.f28776a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f28776a.f28375j = runnable;
    }

    public void setSize(int i10) {
        this.f28776a.f28384s = i10;
    }

    public void setStepFactor(float f7) {
        this.f28776a.f28385t = f7;
    }

    public void setStyle(int i10) {
        l9 l9Var = this.f28776a;
        l9Var.f28376k = i10;
        l9Var.f();
    }
}
