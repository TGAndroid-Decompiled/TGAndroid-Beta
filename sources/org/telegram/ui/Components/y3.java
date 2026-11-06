package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class y3 extends LinearLayout {
    public final int f40483a = 0;
    public boolean f40484b;
    public final hb0 f40485c;
    public final Object d;
    public final hb0 f40486e;
    public final hb0 f40487f;

    public y3(Context context, s4 s4Var, hb0 hb0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f40485c = hb0Var;
        this.f40486e = fVar;
        this.f40487f = gVar;
        this.f40484b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(s4Var.f37931a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40483a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f40486e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
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
        switch (this.f40483a) {
            case 0:
                hb0 hb0Var = (hb0) this.d;
                this.f40484b = true;
                Point point = org.telegram.messenger.g0.f22537q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                hb0 hb0Var2 = this.f40485c;
                hb0Var2.setItemCount(i11);
                hb0Var.setItemCount(i11);
                hb0 hb0Var3 = this.f40486e;
                hb0Var3.setItemCount(i11);
                hb0 hb0Var4 = this.f40487f;
                hb0Var4.setItemCount(i11);
                hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                hb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f40487f;
                wg.f fVar = (wg.f) this.f40486e;
                this.f40484b = true;
                Point point2 = org.telegram.messenger.g0.f22537q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                hb0 hb0Var5 = this.f40485c;
                hb0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                hb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f40484b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f40483a) {
            case 0:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f40484b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public y3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, hb0 hb0Var4) {
        super(context);
        this.f40485c = hb0Var;
        this.d = hb0Var2;
        this.f40486e = hb0Var3;
        this.f40487f = hb0Var4;
        this.f40484b = false;
    }
}
