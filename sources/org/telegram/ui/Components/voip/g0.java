package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.n9;
import org.telegram.ui.e40;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f29855a;
    public final e40 f29856b;

    public g0(e40 e40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f29856b = e40Var;
        this.f29855a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e40 e40Var = this.f29856b;
        n9 n9Var = e40Var.J;
        TextView textView = e40Var.K;
        float f7 = e40Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f29855a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            n9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - es.f24465f.getInterpolation(f7);
            float left = (e40Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((e40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            n9Var.setTranslationX(left);
            textView.setTranslationX(-((e40Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
