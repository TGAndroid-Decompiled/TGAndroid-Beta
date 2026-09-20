package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class j9 extends View {
    public final i9 f25302a;
    public rg.z0 f25303b;
    public u01 f25304c;
    public Paint d;

    public j9(Context context, boolean z10) {
        super(context);
        this.f25302a = new i9(this, z10);
    }

    public final void a(boolean z10) {
        this.f25302a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f25302a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25302a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25302a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25302a.i(canvas);
        if (this.f25304c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f25303b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f25303b.f42854f);
            this.f25304c.c(rectF.centerX() - (this.f25304c.f28493c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        i9 i9Var = this.f25302a;
        i9Var.f24958p = measuredWidth;
        i9Var.f24957o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f25302a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f25302a.f24954l = z10;
    }

    public void setCount(int i10) {
        this.f25302a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f25302a.f24952j = runnable;
    }

    public void setSize(int i10) {
        this.f25302a.f24961s = i10;
    }

    public void setStepFactor(float f7) {
        this.f25302a.f24962t = f7;
    }

    public void setStyle(int i10) {
        i9 i9Var = this.f25302a;
        i9Var.f24953k = i10;
        i9Var.f();
    }
}
