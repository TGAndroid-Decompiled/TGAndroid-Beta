package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f25191a = 1;
    public boolean f25192b;
    public final gd0 f25193c;
    public final Object d;
    public final gd0 f25194e;
    public final gd0 f25195f;

    public c4(Context context, c5 c5Var, gd0 gd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f25193c = gd0Var;
        this.f25194e = gVar;
        this.f25195f = hVar;
        this.f25192b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f25220a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25191a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.g) this.f25194e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f25191a) {
            case 0:
                gd0 gd0Var = (gd0) this.d;
                this.f25192b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                gd0 gd0Var2 = this.f25193c;
                gd0Var2.setItemCount(i12);
                gd0Var.setItemCount(i12);
                gd0 gd0Var3 = this.f25194e;
                gd0Var3.setItemCount(i12);
                gd0 gd0Var4 = this.f25195f;
                gd0Var4.setItemCount(i12);
                gd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                gd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                gd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                gd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25192b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f25195f;
                tg.g gVar = (tg.g) this.f25194e;
                this.f25192b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                gd0 gd0Var5 = this.f25193c;
                gd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                gd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25192b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25191a) {
            case 0:
                if (!this.f25192b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25192b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gd0 gd0Var4) {
        super(context);
        this.f25193c = gd0Var;
        this.d = gd0Var2;
        this.f25194e = gd0Var3;
        this.f25195f = gd0Var4;
        this.f25192b = false;
    }
}
