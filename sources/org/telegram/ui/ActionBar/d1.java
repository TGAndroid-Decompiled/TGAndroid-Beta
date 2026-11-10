package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class d1 extends FrameLayout {
    public final Drawable f27387a;

    public d1(Context context, h6 h6Var) {
        this(m6.H8, context, h6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f27387a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    public d1(int i7, Context context, h6 h6Var) {
        super(context);
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.f27854b7, h6Var);
        this.f27387a = m6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
