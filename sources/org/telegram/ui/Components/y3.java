package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class y3 extends LinearLayout {
    public final int f40551a = 0;
    public boolean f40552b;
    public final ib0 f40553c;
    public final Object d;
    public final ib0 f40554e;
    public final ib0 f40555f;

    public y3(Context context, s4 s4Var, ib0 ib0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f40553c = ib0Var;
        this.f40554e = fVar;
        this.f40555f = gVar;
        this.f40552b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(s4Var.f37900a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40551a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f40554e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
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
        switch (this.f40551a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                this.f40552b = true;
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                ib0 ib0Var2 = this.f40553c;
                ib0Var2.setItemCount(i11);
                ib0Var.setItemCount(i11);
                ib0 ib0Var3 = this.f40554e;
                ib0Var3.setItemCount(i11);
                ib0 ib0Var4 = this.f40555f;
                ib0Var4.setItemCount(i11);
                ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f40552b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f40555f;
                wg.f fVar = (wg.f) this.f40554e;
                this.f40552b = true;
                Point point2 = org.telegram.messenger.g0.f22563q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ib0 ib0Var5 = this.f40553c;
                ib0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                ib0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f40552b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f40551a) {
            case 0:
                if (!this.f40552b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f40552b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public y3(Context context, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4) {
        super(context);
        this.f40553c = ib0Var;
        this.d = ib0Var2;
        this.f40554e = ib0Var3;
        this.f40555f = ib0Var4;
        this.f40552b = false;
    }
}
