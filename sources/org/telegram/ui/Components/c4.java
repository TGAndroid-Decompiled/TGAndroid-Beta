package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f22908a = 1;
    public boolean f22909b;
    public final tc0 f22910c;
    public final Object d;
    public final tc0 e;
    public final tc0 f22911f;

    public c4(Context context, c5 c5Var, tc0 tc0Var, tg.i iVar, tg.j jVar) {
        super(context);
        this.f22910c = tc0Var;
        this.e = iVar;
        this.f22911f = jVar;
        this.f22909b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f22922a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f22908a) {
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
        switch (this.f22908a) {
            case 0:
                tc0 tc0Var = (tc0) this.d;
                this.f22909b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                tc0 tc0Var2 = this.f22910c;
                tc0Var2.setItemCount(i12);
                tc0Var.setItemCount(i12);
                tc0 tc0Var3 = this.e;
                tc0Var3.setItemCount(i12);
                tc0 tc0Var4 = this.f22911f;
                tc0Var4.setItemCount(i12);
                tc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f22909b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.j jVar = (tg.j) this.f22911f;
                tg.i iVar = (tg.i) this.e;
                this.f22909b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                tc0 tc0Var5 = this.f22910c;
                tc0Var5.setItemCount(i13);
                iVar.setItemCount(i13);
                jVar.setItemCount(i13);
                tc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                jVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f22909b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f22908a) {
            case 0:
                if (!this.f22909b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22909b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, tc0 tc0Var4) {
        super(context);
        this.f22910c = tc0Var;
        this.d = tc0Var2;
        this.e = tc0Var3;
        this.f22911f = tc0Var4;
        this.f22909b = false;
    }
}
