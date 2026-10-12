package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final Drawable f20386a;

    public j1(Context context, c6 c6Var) {
        this(context, g6.H8, c6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f20386a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public j1(Context context, int i10, c6 c6Var) {
        super(context);
        int w02 = g6.w0(i10, c6Var);
        int w03 = g6.w0(g6.f19863b7, c6Var);
        this.f20386a = g6.V0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
