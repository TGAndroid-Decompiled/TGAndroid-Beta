package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.mr;
import org.telegram.ui.x30;
public final class f0 extends FrameLayout {
    public final ShapeDrawable f29597a;
    public final x30 f29598b;

    public f0(x30 x30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f29598b = x30Var;
        this.f29597a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.f29598b;
        d9 d9Var = x30Var.G;
        TextView textView = x30Var.H;
        float f10 = x30Var.L;
        ShapeDrawable shapeDrawable = this.f29597a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            d9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - mr.f27122f.getInterpolation(f10);
            float left = (x30Var.M - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((x30Var.O - getRight()) * interpolation)), getMeasuredHeight());
            d9Var.setTranslationX(left);
            textView.setTranslationX(-((x30Var.N - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
