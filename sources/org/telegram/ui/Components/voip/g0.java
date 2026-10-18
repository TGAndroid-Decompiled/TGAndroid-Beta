package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k9;
import org.telegram.ui.j30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f31466a;
    public final j30 f31467b;

    public g0(j30 j30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f31467b = j30Var;
        this.f31466a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f31467b;
        k9 k9Var = j30Var.J;
        TextView textView = j30Var.K;
        float f7 = j30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f31466a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - bs.f25037f.getInterpolation(f7);
            float left = (j30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((j30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((j30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
