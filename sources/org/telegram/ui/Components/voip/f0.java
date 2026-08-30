package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.v30;
public final class f0 extends FrameLayout {
    public final ShapeDrawable f29625a;
    public final v30 f29626b;

    public f0(v30 v30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f29626b = v30Var;
        this.f29625a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29626b;
        d9 d9Var = v30Var.G;
        TextView textView = v30Var.H;
        float f10 = v30Var.L;
        ShapeDrawable shapeDrawable = this.f29625a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            d9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - nr.f27346f.getInterpolation(f10);
            float left = (v30Var.M - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((v30Var.O - getRight()) * interpolation)), getMeasuredHeight());
            d9Var.setTranslationX(left);
            textView.setTranslationX(-((v30Var.N - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
