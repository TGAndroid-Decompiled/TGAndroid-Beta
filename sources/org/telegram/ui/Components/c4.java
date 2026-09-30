package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f23147a = 1;
    public boolean f23148b;
    public final hd0 f23149c;
    public final Object d;
    public final hd0 e;
    public final hd0 f23150f;

    public c4(Context context, c5 c5Var, hd0 hd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f23149c = hd0Var;
        this.e = gVar;
        this.f23150f = hVar;
        this.f23148b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f23154a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f23147a) {
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
        switch (this.f23147a) {
            case 0:
                hd0 hd0Var = (hd0) this.d;
                this.f23148b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                hd0 hd0Var2 = this.f23149c;
                hd0Var2.setItemCount(i12);
                hd0Var.setItemCount(i12);
                hd0 hd0Var3 = this.e;
                hd0Var3.setItemCount(i12);
                hd0 hd0Var4 = this.f23150f;
                hd0Var4.setItemCount(i12);
                hd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                hd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                hd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                hd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f23148b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f23150f;
                tg.g gVar = (tg.g) this.e;
                this.f23148b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                hd0 hd0Var5 = this.f23149c;
                hd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                hd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f23148b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f23147a) {
            case 0:
                if (!this.f23148b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f23148b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3, hd0 hd0Var4) {
        super(context);
        this.f23149c = hd0Var;
        this.d = hd0Var2;
        this.e = hd0Var3;
        this.f23150f = hd0Var4;
        this.f23148b = false;
    }
}
