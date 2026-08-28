package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.g30;
public final class f0 extends FrameLayout {
    public final ShapeDrawable f33503a;
    public final g30 f33504b;

    public f0(g30 g30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f33504b = g30Var;
        this.f33503a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g30 g30Var = this.f33504b;
        c9 c9Var = g30Var.F;
        TextView textView = g30Var.G;
        float f10 = g30Var.K;
        ShapeDrawable shapeDrawable = this.f33503a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            c9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - gr.f28844f.getInterpolation(f10);
            float left = (g30Var.L - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((g30Var.N - getRight()) * interpolation)), getMeasuredHeight());
            c9Var.setTranslationX(left);
            textView.setTranslationX(-((g30Var.M - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
