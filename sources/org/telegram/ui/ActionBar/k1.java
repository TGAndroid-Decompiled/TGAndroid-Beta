package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;

public final class k1 extends FrameLayout {

    public final Drawable f23606a;

    public k1(Context context, c6 c6Var) {
        this(context, g6.H8, c6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f23606a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public k1(Context context, int i10, c6 c6Var) {
        super(context);
        int iV0 = g6.v0(i10, c6Var);
        int iV1 = g6.v0(g6.f23018b7, c6Var);
        this.f23606a = g6.U0(getContext(), R.drawable.greydivider, iV1);
        setBackgroundColor(iV0);
    }
}
