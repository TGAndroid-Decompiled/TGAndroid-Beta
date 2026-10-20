package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d4 extends LinearLayout {
    public final int f25327a = 1;
    public boolean f25328b;
    public final od0 f25329c;
    public final Object d;
    public final od0 e;
    public final od0 f25330f;

    public d4(Context context, d5 d5Var, od0 od0Var, ug.g gVar, ug.h hVar) {
        super(context);
        this.f25329c = od0Var;
        this.e = gVar;
        this.f25330f = hVar;
        this.f25328b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.f25331a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25327a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.g) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f25327a) {
            case 0:
                od0 od0Var = (od0) this.d;
                this.f25328b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                od0 od0Var2 = this.f25329c;
                od0Var2.setItemCount(i12);
                od0Var.setItemCount(i12);
                od0 od0Var3 = this.e;
                od0Var3.setItemCount(i12);
                od0 od0Var4 = this.f25330f;
                od0Var4.setItemCount(i12);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25328b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.h hVar = (ug.h) this.f25330f;
                ug.g gVar = (ug.g) this.e;
                this.f25328b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                od0 od0Var5 = this.f25329c;
                od0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25328b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25327a) {
            case 0:
                if (!this.f25328b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25328b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public d4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4) {
        super(context);
        this.f25329c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f25330f = od0Var4;
        this.f25328b = false;
    }
}
