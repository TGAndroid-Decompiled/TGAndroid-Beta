package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.sr;
import org.telegram.ui.y30;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f29320a;
    public final y30 f29321b;

    public h0(y30 y30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f29321b = y30Var;
        this.f29320a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y30 y30Var = this.f29321b;
        k9 k9Var = y30Var.J;
        TextView textView = y30Var.K;
        float f7 = y30Var.O;
        ShapeDrawable shapeDrawable = this.f29320a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - sr.f28359f.getInterpolation(f7);
            float left = (y30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((y30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
