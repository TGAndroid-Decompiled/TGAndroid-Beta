package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class mc1 extends FrameLayout {
    public final int f35534a;
    public final RectF f35535b;
    public final od1 f35536c;

    public mc1(od1 od1Var, Context context, int i10) {
        super(context);
        this.f35534a = i10;
        switch (i10) {
            case 1:
                this.f35536c = od1Var;
                super(context);
                this.f35535b = new RectF();
                return;
            default:
                this.f35536c = od1Var;
                this.f35535b = new RectF();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f35534a) {
            case 0:
                RectF rectF = this.f35535b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                od1 od1Var = this.f35536c;
                mc1 mc1Var = od1Var.D0;
                dd1 dd1Var = od1Var.f36208x0;
                oc1 oc1Var = od1Var.f36146a;
                org.telegram.ui.ActionBar.h6.s(mc1Var, dd1Var, oc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, oc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, oc1Var.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
            default:
                RectF rectF2 = this.f35535b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                od1 od1Var2 = this.f35536c;
                mc1 mc1Var2 = od1Var2.E0;
                dd1 dd1Var2 = od1Var2.f36208x0;
                oc1 oc1Var2 = od1Var2.f36146a;
                org.telegram.ui.ActionBar.h6.s(mc1Var2, dd1Var2, oc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, oc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.h6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, oc1Var2.G("paintChatActionBackgroundDarken"));
                    return;
                }
                return;
        }
    }
}
