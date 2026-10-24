package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
public class i9 extends View {
    public final h9 f27369a;
    public sg.a1 f27370b;
    public h11 f27371c;
    public Paint d;

    public i9(Context context, boolean z10) {
        super(context);
        this.f27369a = new h9(this, z10);
    }

    public final void a(boolean z10) {
        this.f27369a.b(z10, true);
    }

    public final void b(int i10, TLObject tLObject, int i11) {
        this.f27369a.l(i10, tLObject, i11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27369a.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27369a.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27369a.i(canvas);
        if (this.f27371c != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.f27370b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f27370b.f46618f);
            this.f27371c.c(rectF.centerX() - (this.f27371c.f26843c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        h9 h9Var = this.f27369a;
        h9Var.f26958p = measuredWidth;
        h9Var.f26957o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i10) {
        this.f27369a.j(i10);
    }

    public void setCentered(boolean z10) {
        this.f27369a.f26954l = z10;
    }

    public void setCount(int i10) {
        this.f27369a.k(i10);
    }

    public void setDelegate(Runnable runnable) {
        this.f27369a.f26952j = runnable;
    }

    public void setSize(int i10) {
        this.f27369a.f26961s = i10;
    }

    public void setStepFactor(float f7) {
        this.f27369a.f26962t = f7;
    }

    public void setStyle(int i10) {
        h9 h9Var = this.f27369a;
        h9Var.f26953k = i10;
        h9Var.f();
    }
}
