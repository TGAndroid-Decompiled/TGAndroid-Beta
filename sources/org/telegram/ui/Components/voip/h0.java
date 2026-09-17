package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.c40;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f28952a;
    public final c40 f28953b;

    public h0(c40 c40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f28953b = c40Var;
        this.f28952a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.f28953b;
        i9 i9Var = c40Var.J;
        TextView textView = c40Var.K;
        float f7 = c40Var.O;
        ShapeDrawable shapeDrawable = this.f28952a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - qr.f27380f.getInterpolation(f7);
            float left = (c40Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((c40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            i9Var.setTranslationX(left);
            textView.setTranslationX(-((c40Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
