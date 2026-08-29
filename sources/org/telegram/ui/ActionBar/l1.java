package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class l1 extends FrameLayout {
    public final Drawable f23640a;

    public l1(Context context, c6 c6Var) {
        this(context, g6.H8, c6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f23640a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public l1(Context context, int i10, c6 c6Var) {
        super(context);
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.f23028b7, c6Var);
        this.f23640a = g6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
