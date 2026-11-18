package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class e1 extends FrameLayout {
    public final Drawable f28887a;

    public e1(Context context, i6 i6Var) {
        this(n6.H8, context, i6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f28887a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    public e1(int i7, Context context, i6 i6Var) {
        super(context);
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.f29358b7, i6Var);
        this.f28887a = n6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
