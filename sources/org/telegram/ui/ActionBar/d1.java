package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class d1 extends FrameLayout {
    public final Drawable f27407a;

    public d1(Context context, g6 g6Var) {
        this(l6.H8, context, g6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f27407a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    public d1(int i7, Context context, g6 g6Var) {
        super(context);
        int w02 = l6.w0(i7, g6Var);
        int w03 = l6.w0(l6.f27829b7, g6Var);
        this.f27407a = l6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
