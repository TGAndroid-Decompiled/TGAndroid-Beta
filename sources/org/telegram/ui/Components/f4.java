package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class f4 extends LinearLayout {
    public final int f35080a = 0;
    public boolean f35081b;
    public final tb0 f35082c;
    public final Object d;
    public final tb0 f35083e;
    public final tb0 f35084f;

    public f4(Context context, z4 z4Var, tb0 tb0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f35082c = tb0Var;
        this.f35083e = fVar;
        this.f35084f = gVar;
        this.f35081b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(z4Var.f42667a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f35080a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f35083e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f35080a) {
            case 0:
                tb0 tb0Var = (tb0) this.d;
                this.f35081b = true;
                Point point = org.telegram.messenger.g0.f24146q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                tb0 tb0Var2 = this.f35082c;
                tb0Var2.setItemCount(i11);
                tb0Var.setItemCount(i11);
                tb0 tb0Var3 = this.f35083e;
                tb0Var3.setItemCount(i11);
                tb0 tb0Var4 = this.f35084f;
                tb0Var4.setItemCount(i11);
                tb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                tb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                tb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                tb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f35081b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f35084f;
                wg.f fVar = (wg.f) this.f35083e;
                this.f35081b = true;
                Point point2 = org.telegram.messenger.g0.f24146q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                tb0 tb0Var5 = this.f35082c;
                tb0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                tb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f35081b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f35080a) {
            case 0:
                if (!this.f35081b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f35081b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public f4(Context context, tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, tb0 tb0Var4) {
        super(context);
        this.f35082c = tb0Var;
        this.d = tb0Var2;
        this.f35083e = tb0Var3;
        this.f35084f = tb0Var4;
        this.f35081b = false;
    }
}
