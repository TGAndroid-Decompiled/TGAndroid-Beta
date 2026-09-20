package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b4 extends LinearLayout {
    public final int f22872a = 1;
    public boolean f22873b;
    public final cd0 f22874c;
    public final Object d;
    public final cd0 e;
    public final cd0 f22875f;

    public b4(Context context, b5 b5Var, cd0 cd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f22874c = cd0Var;
        this.e = gVar;
        this.f22875f = hVar;
        this.f22873b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(b5Var.f22886a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f22872a) {
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
        switch (this.f22872a) {
            case 0:
                cd0 cd0Var = (cd0) this.d;
                this.f22873b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                cd0 cd0Var2 = this.f22874c;
                cd0Var2.setItemCount(i12);
                cd0Var.setItemCount(i12);
                cd0 cd0Var3 = this.e;
                cd0Var3.setItemCount(i12);
                cd0 cd0Var4 = this.f22875f;
                cd0Var4.setItemCount(i12);
                cd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                cd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                cd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                cd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f22873b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f22875f;
                tg.g gVar = (tg.g) this.e;
                this.f22873b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                cd0 cd0Var5 = this.f22874c;
                cd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                cd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f22873b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f22872a) {
            case 0:
                if (!this.f22873b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22873b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public b4(Context context, cd0 cd0Var, cd0 cd0Var2, cd0 cd0Var3, cd0 cd0Var4) {
        super(context);
        this.f22874c = cd0Var;
        this.d = cd0Var2;
        this.e = cd0Var3;
        this.f22875f = cd0Var4;
        this.f22873b = false;
    }
}
