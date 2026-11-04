package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class c1 extends FrameLayout {
    public final Drawable f27446a;

    public c1(Context context, e6 e6Var) {
        this(k6.H8, context, e6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f27446a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i3) {
        setBackgroundColor(i3);
    }

    public c1(int i3, Context context, e6 e6Var) {
        super(context);
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.f27843b7, e6Var);
        this.f27446a = k6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
