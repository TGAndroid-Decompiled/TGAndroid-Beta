package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.er;
import org.telegram.ui.j30;

public final class f0 extends FrameLayout {

    public final ShapeDrawable f33553a;

    public final j30 f33554b;

    public f0(j30 j30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f33554b = j30Var;
        this.f33553a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f33554b;
        b9 b9Var = j30Var.F;
        TextView textView = j30Var.G;
        float f10 = j30Var.K;
        ShapeDrawable shapeDrawable = this.f33553a;
        if (f10 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            b9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - er.f28122f.getInterpolation(f10);
            float left = (j30Var.L - getLeft()) * interpolation;
            float left2 = (j30Var.M - textView.getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((j30Var.N - getRight()) * interpolation)), getMeasuredHeight());
            b9Var.setTranslationX(left);
            textView.setTranslationX(-left2);
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
