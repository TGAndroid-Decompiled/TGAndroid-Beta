package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class e4 extends LinearLayout {
    public final int f34595a = 0;
    public boolean f34596b;
    public final sb0 f34597c;
    public final Object d;
    public final sb0 f34598e;
    public final sb0 f34599f;

    public e4(Context context, y4 y4Var, sb0 sb0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.f34597c = sb0Var;
        this.f34598e = fVar;
        this.f34599f = gVar;
        this.f34596b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(y4Var.f42288a);
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f34595a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.f34598e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        switch (this.f34595a) {
            case 0:
                sb0 sb0Var = (sb0) this.d;
                this.f34596b = true;
                Point point = org.telegram.messenger.g0.f24121q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                sb0 sb0Var2 = this.f34597c;
                sb0Var2.setItemCount(i11);
                sb0Var.setItemCount(i11);
                sb0 sb0Var3 = this.f34598e;
                sb0Var3.setItemCount(i11);
                sb0 sb0Var4 = this.f34599f;
                sb0Var4.setItemCount(i11);
                sb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                sb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                sb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                sb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f34596b = false;
                super.onMeasure(i7, i10);
                return;
            default:
                wg.g gVar = (wg.g) this.f34599f;
                wg.f fVar = (wg.f) this.f34598e;
                this.f34596b = true;
                Point point2 = org.telegram.messenger.g0.f24121q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                sb0 sb0Var5 = this.f34597c;
                sb0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                sb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f34596b = false;
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f34595a) {
            case 0:
                if (!this.f34596b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f34596b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public e4(Context context, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, sb0 sb0Var4) {
        super(context);
        this.f34597c = sb0Var;
        this.d = sb0Var2;
        this.f34598e = sb0Var3;
        this.f34599f = sb0Var4;
        this.f34596b = false;
    }
}
