package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.v30;
public final class h0 extends FrameLayout {
    public final ShapeDrawable f29368a;
    public final v30 f29369b;

    public h0(v30 v30Var, Context context, ShapeDrawable shapeDrawable) {
        super(context);
        this.f29369b = v30Var;
        this.f29368a = shapeDrawable;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v30 v30Var = this.f29369b;
        k9 k9Var = v30Var.J;
        TextView textView = v30Var.K;
        float f7 = v30Var.O;
        ShapeDrawable shapeDrawable = this.f29368a;
        if (f7 == 1.0f) {
            shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            k9Var.setTranslationX(0.0f);
            textView.setTranslationX(0.0f);
        } else {
            float interpolation = 1.0f - rr.f28022f.getInterpolation(f7);
            float left = (v30Var.P - getLeft()) * interpolation;
            shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((v30Var.R - getRight()) * interpolation)), getMeasuredHeight());
            k9Var.setTranslationX(left);
            textView.setTranslationX(-((v30Var.Q - textView.getLeft()) * interpolation));
        }
        shapeDrawable.draw(canvas);
        super.dispatchDraw(canvas);
    }
}
