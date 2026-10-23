package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f25229a = 1;
    public boolean f25230b;
    public final qd0 f25231c;
    public final Object d;
    public final qd0 e;
    public final qd0 f25232f;

    public c4(Context context, c5 c5Var, qd0 qd0Var, ug.f fVar, ug.g gVar) {
        super(context);
        this.f25231c = qd0Var;
        this.e = fVar;
        this.f25232f = gVar;
        this.f25230b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f25238a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25229a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.f) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f25229a) {
            case 0:
                qd0 qd0Var = (qd0) this.d;
                this.f25230b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                qd0 qd0Var2 = this.f25231c;
                qd0Var2.setItemCount(i12);
                qd0Var.setItemCount(i12);
                qd0 qd0Var3 = this.e;
                qd0Var3.setItemCount(i12);
                qd0 qd0Var4 = this.f25232f;
                qd0Var4.setItemCount(i12);
                qd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25230b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.g gVar = (ug.g) this.f25232f;
                ug.f fVar = (ug.f) this.e;
                this.f25230b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                qd0 qd0Var5 = this.f25231c;
                qd0Var5.setItemCount(i13);
                fVar.setItemCount(i13);
                gVar.setItemCount(i13);
                qd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25230b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25229a) {
            case 0:
                if (!this.f25230b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25230b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, qd0 qd0Var4) {
        super(context);
        this.f25231c = qd0Var;
        this.d = qd0Var2;
        this.e = qd0Var3;
        this.f25232f = qd0Var4;
        this.f25230b = false;
    }
}
