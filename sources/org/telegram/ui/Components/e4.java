package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f27716a = 1;
    public boolean f27717b;
    public final md0 f27718c;
    public final Object d;
    public final md0 e;
    public final md0 f27719f;

    public e4(Context context, d5 d5Var, md0 md0Var, vg.h hVar, vg.i iVar) {
        super(context);
        this.f27718c = md0Var;
        this.e = hVar;
        this.f27719f = iVar;
        this.f27717b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.f27391a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27716a) {
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
        switch (this.f27716a) {
            case 0:
                md0 md0Var = (md0) this.d;
                this.f27717b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                md0 md0Var2 = this.f27718c;
                md0Var2.setItemCount(i12);
                md0Var.setItemCount(i12);
                md0 md0Var3 = this.e;
                md0Var3.setItemCount(i12);
                md0 md0Var4 = this.f27719f;
                md0Var4.setItemCount(i12);
                md0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f27717b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                vg.i iVar = (vg.i) this.f27719f;
                vg.h hVar = (vg.h) this.e;
                this.f27717b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                md0 md0Var5 = this.f27718c;
                md0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                md0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f27717b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f27716a) {
            case 0:
                if (!this.f27717b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f27717b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, md0 md0Var, md0 md0Var2, md0 md0Var3, md0 md0Var4) {
        super(context);
        this.f27718c = md0Var;
        this.d = md0Var2;
        this.e = md0Var3;
        this.f27719f = md0Var4;
        this.f27717b = false;
    }
}
