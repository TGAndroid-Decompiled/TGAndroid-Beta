package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class h1 extends FrameLayout {
    public final Drawable f20353a;

    public h1(Context context, p6 p6Var) {
        this(t6.H8, context, p6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f20353a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public h1(int i10, Context context, p6 p6Var) {
        super(context);
        int w02 = t6.w0(i10, p6Var);
        int w03 = t6.w0(t6.f20892b7, p6Var);
        this.f20353a = t6.X0(getContext(), 2131231230, w03);
        setBackgroundColor(w02);
    }
}
