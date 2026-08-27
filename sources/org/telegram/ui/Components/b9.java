package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

public class b9 extends View {

    public final a9 f27049a;

    public ag.i2 f27050b;

    public pz0 f27051c;
    public Paint d;

    public b9(Context context, boolean z10) {
        super(context);
        this.f27049a = new a9(this, z10);
    }

    public final void a(boolean z10) {
        this.f27049a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f27049a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27049a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27049a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27049a.i(canvas);
        if (this.f27051c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f27050b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f27050b.f458f);
            this.f27051c.c(rectF.centerX() - (this.f27051c.f31697c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        a9 a9Var = this.f27049a;
        a9Var.f26675p = measuredWidth;
        a9Var.f26674o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f27049a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f27049a.f26671l = z10;
    }

    public void setCount(int i10) {
        this.f27049a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f27049a.f26669j = runnable;
    }

    public void setSize(int i10) {
        this.f27049a.f26678s = i10;
    }

    public void setStepFactor(float f10) {
        this.f27049a.f26679t = f10;
    }

    public void setStyle(int i10) {
        a9 a9Var = this.f27049a;
        a9Var.f26670k = i10;
        a9Var.f();
    }
}
