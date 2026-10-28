package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f27697a = 1;
    public boolean f27698b;
    public final nd0 f27699c;
    public final Object d;
    public final nd0 e;
    public final nd0 f27700f;

    public e4(Context context, d5 d5Var, nd0 nd0Var, vg.h hVar, vg.i iVar) {
        super(context);
        this.f27699c = nd0Var;
        this.e = hVar;
        this.f27700f = iVar;
        this.f27698b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.f27339a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27697a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((vg.h) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f27697a) {
            case 0:
                nd0 nd0Var = (nd0) this.d;
                this.f27698b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                nd0 nd0Var2 = this.f27699c;
                nd0Var2.setItemCount(i12);
                nd0Var.setItemCount(i12);
                nd0 nd0Var3 = this.e;
                nd0Var3.setItemCount(i12);
                nd0 nd0Var4 = this.f27700f;
                nd0Var4.setItemCount(i12);
                nd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27698b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                vg.i iVar = (vg.i) this.f27700f;
                vg.h hVar = (vg.h) this.e;
                this.f27698b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                nd0 nd0Var5 = this.f27699c;
                nd0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                nd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27698b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27697a) {
            case 0:
                if (!this.f27698b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27698b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, nd0 nd0Var4) {
        super(context);
        this.f27699c = nd0Var;
        this.d = nd0Var2;
        this.e = nd0Var3;
        this.f27700f = nd0Var4;
        this.f27698b = false;
    }
}
