package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.b40;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f28157a;
    public final b40 f28158b;

    public h0(b40 b40Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f28158b = b40Var;
        this.f28157a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b40 b40Var = this.f28158b;
        j9 j9Var = b40Var.J;
        TextView textView = b40Var.K;
        float f7 = b40Var.O;
        ShapeDrawable shapeDrawable = this.f28157a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            j9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - wr.f28819f.getInterpolation(f7);
            float left = (b40Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((b40Var.R - getRight()) * interpolation)), getMeasuredHeight());
            j9Var.setTranslationX(left);
            textView.setTranslationX(-((b40Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
