package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.m9;
import org.telegram.ui.o30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f33913a;
    public final o30 f33914b;

    public g0(o30 o30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f33914b = o30Var;
        this.f33913a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o30 o30Var = this.f33914b;
        m9 m9Var = o30Var.J;
        TextView textView = o30Var.K;
        float f7 = o30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f33913a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - ds.f27530f.getInterpolation(f7);
            float left = (o30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((o30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-((o30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
