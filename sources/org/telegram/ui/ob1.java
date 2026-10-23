package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ob1 extends FrameLayout {
    public final int f40126a;
    public final RectF f40127b;
    public final qc1 f40128c;

    public ob1(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.f40126a = i10;
        switch (i10) {
            case 1:
                this.f40128c = qc1Var;
                super(context);
                this.f40127b = new RectF();
                return;
            default:
                this.f40128c = qc1Var;
                this.f40127b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40126a) {
            case 0:
                RectF rectF = this.f40127b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qc1 qc1Var = this.f40128c;
                ob1 ob1Var = qc1Var.E0;
                fc1 fc1Var = qc1Var.f40779y0;
                qb1 qb1Var = qc1Var.f40713a;
                org.telegram.ui.ActionBar.k6.s(ob1Var, fc1Var, qb1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f40127b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                qc1 qc1Var2 = this.f40128c;
                ob1 ob1Var2 = qc1Var2.F0;
                fc1 fc1Var2 = qc1Var2.f40779y0;
                qb1 qb1Var2 = qc1Var2.f40713a;
                org.telegram.ui.ActionBar.k6.s(ob1Var2, fc1Var2, qb1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, qb1Var2.d("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
