package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.j30;
public final class g0 extends FrameLayout {
    public final ShapeDrawable f33703a;
    public final j30 f33704b;

    public g0(j30 j30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f33704b = j30Var;
        this.f33703a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.f33704b;
        h9 h9Var = j30Var.F;
        TextView textView = j30Var.G;
        float f9 = j30Var.K;
        ShapeDrawable shapeDrawable = this.f33703a;
        if (f9 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            h9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - jr.f29800f.getInterpolation(f9);
            float left = (j30Var.L - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((j30Var.N - getRight()) * interpolation)), getMeasuredHeight());
            h9Var.setTranslationX(left);
            textView.setTranslationX(-((j30Var.M - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
