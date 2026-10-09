package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.m9;
import org.telegram.ui.y30;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f31965a;
    public final y30 f31966b;

    public h0(y30 y30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f31966b = y30Var;
        this.f31965a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f31966b;
        m9 m9Var = y30Var.J;
        TextView textView = y30Var.K;
        float f7 = y30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f31965a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - hs.f27118f.getInterpolation(f7);
            float left = (y30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-((y30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
