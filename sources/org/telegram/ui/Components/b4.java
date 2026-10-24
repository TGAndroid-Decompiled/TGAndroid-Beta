package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b4 extends LinearLayout {
    public final int f24905a = 1;
    public boolean f24906b;
    public final od0 f24907c;
    public final Object d;
    public final od0 e;
    public final od0 f24908f;

    public b4(Context context, a5 a5Var, od0 od0Var, ug.f fVar, ug.g gVar) {
        super(context);
        this.f24907c = od0Var;
        this.e = fVar;
        this.f24908f = gVar;
        this.f24906b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(a5Var.f24623a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24905a) {
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
        switch (this.f24905a) {
            case 0:
                od0 od0Var = (od0) this.d;
                this.f24906b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                od0 od0Var2 = this.f24907c;
                od0Var2.setItemCount(i12);
                od0Var.setItemCount(i12);
                od0 od0Var3 = this.e;
                od0Var3.setItemCount(i12);
                od0 od0Var4 = this.f24908f;
                od0Var4.setItemCount(i12);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f24906b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.g gVar = (ug.g) this.f24908f;
                ug.f fVar = (ug.f) this.e;
                this.f24906b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                od0 od0Var5 = this.f24907c;
                od0Var5.setItemCount(i13);
                fVar.setItemCount(i13);
                gVar.setItemCount(i13);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f24906b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24905a) {
            case 0:
                if (!this.f24906b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24906b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public b4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4) {
        super(context);
        this.f24907c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f24908f = od0Var4;
        this.f24906b = false;
    }
}
