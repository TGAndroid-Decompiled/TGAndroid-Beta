package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class m9 extends View {
    public final l9 f30459a;
    public tg.a1 f30460b;
    public q11 f30461c;
    public Paint d;

    public m9(Context context, boolean z10) {
        super(context);
        this.f30459a = new l9(this, z10);
    }

    public final void a(boolean z10) {
        this.f30459a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f30459a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30459a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30459a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f30459a.i(canvas);
        if (this.f30461c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f30460b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f30460b.f48797f);
            this.f30461c.c(rectF.centerX() - (this.f30461c.f31790c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        l9 l9Var = this.f30459a;
        l9Var.f30121p = measuredWidth;
        l9Var.f30120o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f30459a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f30459a.f30117l = z10;
    }

    public void setCount(int i10) {
        this.f30459a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f30459a.f30115j = runnable;
    }

    public void setSize(int i10) {
        this.f30459a.f30124s = i10;
    }

    public void setStepFactor(float f7) {
        this.f30459a.f30125t = f7;
    }

    public void setStyle(int i10) {
        l9 l9Var = this.f30459a;
        l9Var.f30116k = i10;
        l9Var.f();
    }
}
