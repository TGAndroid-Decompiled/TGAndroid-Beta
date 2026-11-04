package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class w3 extends LinearLayout {
    public final int f39867a = 0;
    public boolean f39868b;
    public final cb0 f39869c;
    public final Object d;
    public final cb0 f39870e;
    public final cb0 f39871f;

    public w3(Context context, q4 q4Var, cb0 cb0Var, xg.h hVar, xg.i iVar) {
        super(context);
        this.f39869c = cb0Var;
        this.f39870e = hVar;
        this.f39871f = iVar;
        this.f39868b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(q4Var.f37335a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f39867a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((xg.h) this.f39870e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        switch (this.f39867a) {
            case 0:
                cb0 cb0Var = (cb0) this.d;
                this.f39868b = true;
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                cb0 cb0Var2 = this.f39869c;
                cb0Var2.setItemCount(i11);
                cb0Var.setItemCount(i11);
                cb0 cb0Var3 = this.f39870e;
                cb0Var3.setItemCount(i11);
                cb0 cb0Var4 = this.f39871f;
                cb0Var4.setItemCount(i11);
                cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f39868b = false;
                super.onMeasure(i3, i10);
                return;
            default:
                xg.i iVar = (xg.i) this.f39871f;
                xg.h hVar = (xg.h) this.f39870e;
                this.f39868b = true;
                Point point2 = org.telegram.messenger.g0.f22608q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                cb0 cb0Var5 = this.f39869c;
                cb0Var5.setItemCount(i12);
                hVar.setItemCount(i12);
                iVar.setItemCount(i12);
                cb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                hVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                iVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f39868b = false;
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f39867a) {
            case 0:
                if (!this.f39868b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f39868b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public w3(Context context, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4) {
        super(context);
        this.f39869c = cb0Var;
        this.d = cb0Var2;
        this.f39870e = cb0Var3;
        this.f39871f = cb0Var4;
        this.f39868b = false;
    }
}
