package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e4 extends LinearLayout {
    public final int f24282a = 1;
    public boolean f24283b;
    public final ud0 f24284c;
    public final Object d;
    public final ud0 e;
    public final ud0 f24285f;

    public e4(Context context, e5 e5Var, ud0 ud0Var, ug.h hVar, ug.i iVar) {
        super(context);
        this.f24284c = ud0Var;
        this.e = hVar;
        this.f24285f = iVar;
        this.f24283b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(e5Var.f24306a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f24282a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.h) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
        switch (this.f24282a) {
            case 0:
                ud0 ud0Var = (ud0) this.d;
                this.f24283b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                ud0 ud0Var2 = this.f24284c;
                ud0Var2.setItemCount(i12);
                ud0Var.setItemCount(i12);
                ud0 ud0Var3 = this.e;
                ud0Var3.setItemCount(i12);
                ud0 ud0Var4 = this.f24285f;
                ud0Var4.setItemCount(i12);
                ud0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ud0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ud0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                ud0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f24283b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                ug.i iVar = (ug.i) this.f24285f;
                ug.h hVar = (ug.h) this.e;
                this.f24283b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                ud0 ud0Var5 = this.f24284c;
                ud0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                ud0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f24283b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f24282a) {
            case 0:
                if (!this.f24283b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f24283b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, ud0 ud0Var4) {
        super(context);
        this.f24284c = ud0Var;
        this.d = ud0Var2;
        this.e = ud0Var3;
        this.f24285f = ud0Var4;
        this.f24283b = false;
    }
}
