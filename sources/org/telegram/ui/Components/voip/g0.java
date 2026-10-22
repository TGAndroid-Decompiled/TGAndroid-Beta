package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k9;
import org.telegram.ui.h30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f31423a;
    public final h30 f31424b;

    public g0(h30 h30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f31424b = h30Var;
        this.f31423a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h30 h30Var = this.f31424b;
        k9 k9Var = h30Var.J;
        TextView textView = h30Var.K;
        float f7 = h30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f31423a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - bs.f25024f.getInterpolation(f7);
            float left = (h30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((h30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((h30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
