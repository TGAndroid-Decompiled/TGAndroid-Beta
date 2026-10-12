package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class m9 extends View {
    public final l9 f28445a;
    public rg.a1 f28446b;
    public r11 f28447c;
    public Paint d;

    public m9(Context context, boolean z10) {
        super(context);
        this.f28445a = new l9(this, z10);
    }

    public final void a(boolean z10) {
        this.f28445a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f28445a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28445a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28445a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28445a.i(canvas);
        if (this.f28447c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f28446b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f28446b.f47393f);
            this.f28447c.c(rectF.centerX() - (this.f28447c.f29988c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        l9 l9Var = this.f28445a;
        l9Var.f28122p = measuredWidth;
        l9Var.f28121o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f28445a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f28445a.f28118l = z10;
    }

    public void setCount(int i10) {
        this.f28445a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f28445a.f28116j = runnable;
    }

    public void setSize(int i10) {
        this.f28445a.f28125s = i10;
    }

    public void setStepFactor(float f7) {
        this.f28445a.f28126t = f7;
    }

    public void setStyle(int i10) {
        l9 l9Var = this.f28445a;
        l9Var.f28117k = i10;
        l9Var.f();
    }
}
