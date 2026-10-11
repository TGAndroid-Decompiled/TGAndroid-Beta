package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class m9 extends View {
    public final l9 f28627a;
    public rg.a1 f28628b;
    public n11 f28629c;
    public Paint d;

    public m9(Context context, boolean z10) {
        super(context);
        this.f28627a = new l9(this, z10);
    }

    public final void a(boolean z10) {
        this.f28627a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f28627a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28627a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28627a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28627a.i(canvas);
        if (this.f28629c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f28628b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f28628b.f47269f);
            this.f28629c.c(rectF.centerX() - (this.f28629c.f28902c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        l9 l9Var = this.f28627a;
        l9Var.f28251p = measuredWidth;
        l9Var.f28250o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f28627a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f28627a.f28247l = z10;
    }

    public void setCount(int i10) {
        this.f28627a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f28627a.f28245j = runnable;
    }

    public void setSize(int i10) {
        this.f28627a.f28254s = i10;
    }

    public void setStepFactor(float f7) {
        this.f28627a.f28255t = f7;
    }

    public void setStyle(int i10) {
        l9 l9Var = this.f28627a;
        l9Var.f28246k = i10;
        l9Var.f();
    }
}
