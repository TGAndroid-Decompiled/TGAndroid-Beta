package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class e4 extends LinearLayout {
    public final int f34563a = 0;
    public boolean f34564b;
    public final qb0 f34565c;
    public final Object d;
    public final qb0 f34566e;
    public final qb0 f34567f;

    public e4(Context context, y4 y4Var, qb0 qb0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f34565c = qb0Var;
        this.f34566e = fVar;
        this.f34567f = gVar;
        this.f34564b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(y4Var.f42316a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f34563a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f34566e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
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
        switch (this.f34563a) {
            case 0:
                qb0 qb0Var = (qb0) this.d;
                this.f34564b = true;
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                qb0 qb0Var2 = this.f34565c;
                qb0Var2.setItemCount(i11);
                qb0Var.setItemCount(i11);
                qb0 qb0Var3 = this.f34566e;
                qb0Var3.setItemCount(i11);
                qb0 qb0Var4 = this.f34567f;
                qb0Var4.setItemCount(i11);
                qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f34564b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f34567f;
                wg.f fVar = (wg.f) this.f34566e;
                this.f34564b = true;
                Point point2 = org.telegram.messenger.g0.f24226q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                qb0 qb0Var5 = this.f34565c;
                qb0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                qb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f34564b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f34563a) {
            case 0:
                if (!this.f34564b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f34564b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, qb0 qb0Var4) {
        super(context);
        this.f34565c = qb0Var;
        this.d = qb0Var2;
        this.f34566e = qb0Var3;
        this.f34567f = qb0Var4;
        this.f34564b = false;
    }
}
