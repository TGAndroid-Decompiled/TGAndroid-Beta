package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m9;
import org.telegram.ui.y30;
public final class i0 extends FrameLayout {
    public final ShapeDrawable f32088a;
    public final y30 f32089b;

    public i0(y30 y30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f32089b = y30Var;
        this.f32088a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f32089b;
        m9 m9Var = y30Var.J;
        TextView textView = y30Var.K;
        float f7 = y30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f32088a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - is.f27500f.getInterpolation(f7);
            float left = (y30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-((y30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
