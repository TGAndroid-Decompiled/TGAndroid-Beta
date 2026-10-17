package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d4 extends LinearLayout {
    public final int f25476a = 1;
    public boolean f25477b;
    public final od0 f25478c;
    public final Object d;
    public final od0 e;
    public final od0 f25479f;

    public d4(Context context, d5 d5Var, od0 od0Var, ug.f fVar, ug.g gVar) {
        super(context);
        this.f25478c = od0Var;
        this.e = fVar;
        this.f25479f = gVar;
        this.f25477b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.f25481a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25476a) {
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
        switch (this.f25476a) {
            case 0:
                od0 od0Var = (od0) this.d;
                this.f25477b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                od0 od0Var2 = this.f25478c;
                od0Var2.setItemCount(i12);
                od0Var.setItemCount(i12);
                od0 od0Var3 = this.e;
                od0Var3.setItemCount(i12);
                od0 od0Var4 = this.f25479f;
                od0Var4.setItemCount(i12);
                od0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                od0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f25477b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.g gVar = (ug.g) this.f25479f;
                ug.f fVar = (ug.f) this.e;
                this.f25477b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                od0 od0Var5 = this.f25478c;
                od0Var5.setItemCount(i13);
                fVar.setItemCount(i13);
                gVar.setItemCount(i13);
                od0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f25477b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f25476a) {
            case 0:
                if (!this.f25477b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f25477b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public d4(Context context, od0 od0Var, od0 od0Var2, od0 od0Var3, od0 od0Var4) {
        super(context);
        this.f25478c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f25479f = od0Var4;
        this.f25477b = false;
    }
}
