package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class d1 extends FrameLayout {
    public final Drawable f27420a;

    public d1(Context context, f6 f6Var) {
        this(k6.H8, context, f6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f27420a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i7) {
        setBackgroundColor(i7);
    }

    public d1(int i7, Context context, f6 f6Var) {
        super(context);
        int w02 = k6.w0(i7, f6Var);
        int w03 = k6.w0(k6.f27813b7, f6Var);
        this.f27420a = k6.X0(getContext(), 2131231229, w03);
        setBackgroundColor(w02);
    }
}
