package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final Drawable f20990a;

    public j1(Context context, c6 c6Var) {
        this(context, h6.H8, c6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f20990a;
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
        int w02 = h6.w0(i10, c6Var);
        int w03 = h6.w0(h6.f20524b7, c6Var);
        this.f20990a = h6.V0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
