package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class b4 extends LinearLayout {
    public final int f22835a = 1;
    public boolean f22836b;
    public final fd0 f22837c;
    public final Object d;
    public final fd0 e;
    public final fd0 f22838f;

    public b4(Context context, b5 b5Var, fd0 fd0Var, tg.g gVar, tg.h hVar) {
        super(context);
        this.f22837c = fd0Var;
        this.e = gVar;
        this.f22838f = hVar;
        this.f22836b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(b5Var.f22852a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f22835a) {
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
        switch (this.f22835a) {
            case 0:
                fd0 fd0Var = (fd0) this.d;
                this.f22836b = true;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                fd0 fd0Var2 = this.f22837c;
                fd0Var2.setItemCount(i12);
                fd0Var.setItemCount(i12);
                fd0 fd0Var3 = this.e;
                fd0Var3.setItemCount(i12);
                fd0 fd0Var4 = this.f22838f;
                fd0Var4.setItemCount(i12);
                fd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                fd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                fd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                fd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.f22836b = false;
                super.onMeasure(i10, i11);
                return;
            default:
                tg.h hVar = (tg.h) this.f22838f;
                tg.g gVar = (tg.g) this.e;
                this.f22836b = true;
                Point point2 = AndroidUtilities.displaySize;
                if (point2.x > point2.y) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                fd0 fd0Var5 = this.f22837c;
                fd0Var5.setItemCount(i13);
                gVar.setItemCount(i13);
                hVar.setItemCount(i13);
                fd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.f22836b = false;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f22835a) {
            case 0:
                if (!this.f22836b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f22836b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public b4(Context context, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, fd0 fd0Var4) {
        super(context);
        this.f22837c = fd0Var;
        this.d = fd0Var2;
        this.e = fd0Var3;
        this.f22838f = fd0Var4;
        this.f22836b = false;
    }
}
