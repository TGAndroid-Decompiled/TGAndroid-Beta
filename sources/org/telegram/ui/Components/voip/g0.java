package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.m9;
import org.telegram.ui.m30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f33808a;
    public final m30 f33809b;

    public g0(m30 m30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f33809b = m30Var;
        this.f33808a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m30 m30Var = this.f33809b;
        m9 m9Var = m30Var.J;
        TextView textView = m30Var.K;
        float f7 = m30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f33808a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            m9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - ds.f27586f.getInterpolation(f7);
            float left = (m30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((m30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            m9Var.setTranslationX(left);
            textView.setTranslationX(-((m30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
