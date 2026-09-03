package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.w30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f32049a;
    public final w30 f32050b;

    public g0(w30 w30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f32050b = w30Var;
        this.f32049a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w30 w30Var = this.f32050b;
        d9 d9Var = w30Var.G;
        TextView textView = w30Var.H;
        float f10 = w30Var.L;
        ShapeDrawable shapeDrawable = this.f32049a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            d9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - pr.f30168f.getInterpolation(f10);
            float left = (w30Var.M - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((w30Var.O - getRight()) * interpolation)), getMeasuredHeight());
            d9Var.setTranslationX(left);
            textView.setTranslationX(-((w30Var.N - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
