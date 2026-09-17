package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c4 extends LinearLayout {
    public final int f24882a = 1;
    public boolean f24883b;
    public final vc0 f24884c;
    public final Object d;
    public final vc0 f24885e;
    public final vc0 f24886f;

    public c4(Context context, c5 c5Var, vc0 vc0Var, ug.h hVar, ug.i iVar) {
        super(context);
        this.f24884c = vc0Var;
        this.f24885e = hVar;
        this.f24886f = iVar;
        this.f24883b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.f24888a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24882a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.h) this.f24885e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f24882a) {
            case 0:
                vc0 vc0Var = (vc0) this.d;
                this.f24883b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                vc0 vc0Var2 = this.f24884c;
                vc0Var2.setItemCount(i12);
                vc0Var.setItemCount(i12);
                vc0 vc0Var3 = this.f24885e;
                vc0Var3.setItemCount(i12);
                vc0 vc0Var4 = this.f24886f;
                vc0Var4.setItemCount(i12);
                vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f24883b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.i iVar = (ug.i) this.f24886f;
                ug.h hVar = (ug.h) this.f24885e;
                this.f24883b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                vc0 vc0Var5 = this.f24884c;
                vc0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                vc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f24883b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24882a) {
            case 0:
                if (!this.f24883b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24883b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public c4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, vc0 vc0Var4) {
        super(context);
        this.f24884c = vc0Var;
        this.d = vc0Var2;
        this.f24885e = vc0Var3;
        this.f24886f = vc0Var4;
        this.f24883b = false;
    }
}
