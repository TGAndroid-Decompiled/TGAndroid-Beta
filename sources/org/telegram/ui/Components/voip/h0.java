package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.x30;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f28946a;
    public final x30 f28947b;

    public h0(x30 x30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f28947b = x30Var;
        this.f28946a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.f28947b;
        k9 k9Var = x30Var.J;
        TextView textView = x30Var.K;
        float f7 = x30Var.O;
        ShapeDrawable shapeDrawable = this.f28946a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - rr.f27701f.getInterpolation(f7);
            float left = (x30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((x30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((x30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
