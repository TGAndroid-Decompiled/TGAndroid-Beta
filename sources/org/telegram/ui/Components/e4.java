package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f25583a = 1;
    public boolean f25584b;
    public final yd0 f25585c;
    public final Object d;
    public final yd0 f25586e;
    public final yd0 f25587f;

    public e4(Context context, e5 e5Var, yd0 yd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f25585c = yd0Var;
        this.f25586e = gVar;
        this.f25587f = hVar;
        this.f25584b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(e5Var.f25591a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25583a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.g) this.f25586e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f25583a) {
            case 0:
                yd0 yd0Var = (yd0) this.d;
                this.f25584b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                yd0 yd0Var2 = this.f25585c;
                yd0Var2.setItemCount(i12);
                yd0Var.setItemCount(i12);
                yd0 yd0Var3 = this.f25586e;
                yd0Var3.setItemCount(i12);
                yd0 yd0Var4 = this.f25587f;
                yd0Var4.setItemCount(i12);
                yd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                yd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                yd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                yd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25584b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f25587f;
                tg.g gVar = (tg.g) this.f25586e;
                this.f25584b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                yd0 yd0Var5 = this.f25585c;
                yd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                yd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25584b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25583a) {
            case 0:
                if (!this.f25584b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25584b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, yd0 yd0Var4) {
        super(context);
        this.f25585c = yd0Var;
        this.d = yd0Var2;
        this.f25586e = yd0Var3;
        this.f25587f = yd0Var4;
        this.f25584b = false;
    }
}
