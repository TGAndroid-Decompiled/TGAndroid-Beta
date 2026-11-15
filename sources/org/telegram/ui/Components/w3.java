package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class w3 extends LinearLayout {
    public final int f41236a = 0;
    public boolean f41237b;
    public final ib0 f41238c;
    public final Object d;
    public final ib0 f41239e;
    public final ib0 f41240f;

    public w3(Context context, q4 q4Var, ib0 ib0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f41238c = ib0Var;
        this.f41239e = fVar;
        this.f41240f = gVar;
        this.f41237b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(q4Var.f38480a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f41236a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f41239e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
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
        switch (this.f41236a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                this.f41237b = true;
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                ib0 ib0Var2 = this.f41238c;
                ib0Var2.setItemCount(i11);
                ib0Var.setItemCount(i11);
                ib0 ib0Var3 = this.f41239e;
                ib0Var3.setItemCount(i11);
                ib0 ib0Var4 = this.f41240f;
                ib0Var4.setItemCount(i11);
                ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f41237b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f41240f;
                wg.f fVar = (wg.f) this.f41239e;
                this.f41237b = true;
                Point point2 = org.telegram.messenger.g0.f23609q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ib0 ib0Var5 = this.f41238c;
                ib0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                ib0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f41237b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f41236a) {
            case 0:
                if (!this.f41237b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f41237b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public w3(Context context, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4) {
        super(context);
        this.f41238c = ib0Var;
        this.d = ib0Var2;
        this.f41239e = ib0Var3;
        this.f41240f = ib0Var4;
        this.f41237b = false;
    }
}
