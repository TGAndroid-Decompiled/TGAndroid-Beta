package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class d1 extends FrameLayout {
    public final Drawable f28502a;

    public d1(Context context, e6 e6Var) {
        this(j6.H8, context, e6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f28502a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    public d1(int i7, Context context, e6 e6Var) {
        super(context);
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.f28813b7, e6Var);
        this.f28502a = j6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
