package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b4 extends LinearLayout {
    public final int f21700a = 1;
    public boolean f21701b;
    public final dd0 f21702c;
    public final Object d;
    public final dd0 e;
    public final dd0 f21703f;

    public b4(Context context, b5 b5Var, dd0 dd0Var, sg.g gVar, sg.h hVar) {
        super(context);
        this.f21702c = dd0Var;
        this.e = gVar;
        this.f21703f = hVar;
        this.f21701b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(b5Var.f21721a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f21700a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((sg.g) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f21700a) {
            case 0:
                dd0 dd0Var = (dd0) this.d;
                this.f21701b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                dd0 dd0Var2 = this.f21702c;
                dd0Var2.setItemCount(i12);
                dd0Var.setItemCount(i12);
                dd0 dd0Var3 = this.e;
                dd0Var3.setItemCount(i12);
                dd0 dd0Var4 = this.f21703f;
                dd0Var4.setItemCount(i12);
                dd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                dd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f21701b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                sg.h hVar = (sg.h) this.f21703f;
                sg.g gVar = (sg.g) this.e;
                this.f21701b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                dd0 dd0Var5 = this.f21702c;
                dd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                dd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f21701b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f21700a) {
            case 0:
                if (!this.f21701b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f21701b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public b4(Context context, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, dd0 dd0Var4) {
        super(context);
        this.f21702c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f21703f = dd0Var4;
        this.f21701b = false;
    }
}
