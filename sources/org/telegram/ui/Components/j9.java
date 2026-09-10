package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class j9 extends View {
    public final i9 f24315a;
    public qg.c1 f24316b;
    public t01 f24317c;
    public Paint d;

    public j9(Context context, boolean z10) {
        super(context);
        this.f24315a = new i9(this, z10);
    }

    public final void a(boolean z10) {
        this.f24315a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f24315a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24315a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24315a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24315a.i(canvas);
        if (this.f24317c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f24316b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24316b.f40690f);
            this.f24317c.c(rectF.centerX() - (this.f24317c.f27247c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        i9 i9Var = this.f24315a;
        i9Var.f23947p = measuredWidth;
        i9Var.f23946o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f24315a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f24315a.f23943l = z10;
    }

    public void setCount(int i10) {
        this.f24315a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f24315a.f23941j = runnable;
    }

    public void setSize(int i10) {
        this.f24315a.f23950s = i10;
    }

    public void setStepFactor(float f7) {
        this.f24315a.f23951t = f7;
    }

    public void setStyle(int i10) {
        i9 i9Var = this.f24315a;
        i9Var.f23942k = i10;
        i9Var.f();
    }
}
