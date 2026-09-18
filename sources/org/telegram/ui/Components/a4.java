package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a4 extends LinearLayout {
    public final int f22311a = 1;
    public boolean f22312b;
    public final uc0 f22313c;
    public final Object d;
    public final uc0 e;
    public final uc0 f22314f;

    public a4(Context context, a5 a5Var, uc0 uc0Var, tg.i iVar, tg.j jVar) {
        super(context);
        this.f22313c = uc0Var;
        this.e = iVar;
        this.f22314f = jVar;
        this.f22312b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(a5Var.f22319a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f22311a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.i) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        switch (this.f22311a) {
            case 0:
                uc0 uc0Var = (uc0) this.d;
                this.f22312b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                uc0 uc0Var2 = this.f22313c;
                uc0Var2.setItemCount(i12);
                uc0Var.setItemCount(i12);
                uc0 uc0Var3 = this.e;
                uc0Var3.setItemCount(i12);
                uc0 uc0Var4 = this.f22314f;
                uc0Var4.setItemCount(i12);
                uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f22312b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.j jVar = (tg.j) this.f22314f;
                tg.i iVar = (tg.i) this.e;
                this.f22312b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                uc0 uc0Var5 = this.f22313c;
                uc0Var5.setItemCount(i13);
                iVar.setItemCount(i13);
                jVar.setItemCount(i13);
                uc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                jVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f22312b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f22311a) {
            case 0:
                if (!this.f22312b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22312b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public a4(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, uc0 uc0Var4) {
        super(context);
        this.f22313c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.f22314f = uc0Var4;
        this.f22312b = false;
    }
}
