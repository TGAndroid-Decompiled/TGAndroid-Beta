package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.m9;
import org.telegram.ui.a40;
public final class i0 extends FrameLayout {
    public final ShapeDrawable f31709a;
    public final a40 f31710b;

    public i0(a40 a40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f31710b = a40Var;
        this.f31709a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f31710b;
        m9 m9Var = a40Var.J;
        TextView textView = a40Var.K;
        float f7 = a40Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f31709a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - js.f27634f.getInterpolation(f7);
            float left = (a40Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((a40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-((a40Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
