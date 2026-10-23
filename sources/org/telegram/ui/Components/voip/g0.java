package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k9;
import org.telegram.ui.k30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f31605a;
    public final k30 f31606b;

    public g0(k30 k30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f31606b = k30Var;
        this.f31605a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k30 k30Var = this.f31606b;
        k9 k9Var = k30Var.J;
        TextView textView = k30Var.K;
        float f7 = k30Var.O;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.f31605a;
        if (i10 == 0) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - bs.f25133f.getInterpolation(f7);
            float left = (k30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((k30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((k30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
