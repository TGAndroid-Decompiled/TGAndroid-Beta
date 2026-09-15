package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.qr;
import org.telegram.ui.a40;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f28975a;
    public final a40 f28976b;

    public h0(a40 a40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f28976b = a40Var;
        this.f28975a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a40 a40Var = this.f28976b;
        i9 i9Var = a40Var.J;
        TextView textView = a40Var.K;
        float f7 = a40Var.O;
        ShapeDrawable shapeDrawable = this.f28975a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - qr.f27423f.getInterpolation(f7);
            float left = (a40Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((a40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            i9Var.setTranslationX(left);
            textView.setTranslationX(-((a40Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
