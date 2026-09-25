package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f23178a = 1;
    public boolean f23179b;
    public final ed0 f23180c;
    public final Object d;
    public final ed0 e;
    public final ed0 f23181f;

    public c4(Context context, c5 c5Var, ed0 ed0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f23180c = ed0Var;
        this.e = gVar;
        this.f23181f = hVar;
        this.f23179b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f23192a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f23178a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.g) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f23178a) {
            case 0:
                ed0 ed0Var = (ed0) this.d;
                this.f23179b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ed0 ed0Var2 = this.f23180c;
                ed0Var2.setItemCount(i12);
                ed0Var.setItemCount(i12);
                ed0 ed0Var3 = this.e;
                ed0Var3.setItemCount(i12);
                ed0 ed0Var4 = this.f23181f;
                ed0Var4.setItemCount(i12);
                ed0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ed0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ed0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ed0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f23179b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f23181f;
                tg.g gVar = (tg.g) this.e;
                this.f23179b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                ed0 ed0Var5 = this.f23180c;
                ed0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                ed0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f23179b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f23178a) {
            case 0:
                if (!this.f23179b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f23179b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, ed0 ed0Var4) {
        super(context);
        this.f23180c = ed0Var;
        this.d = ed0Var2;
        this.e = ed0Var3;
        this.f23181f = ed0Var4;
        this.f23179b = false;
    }
}
