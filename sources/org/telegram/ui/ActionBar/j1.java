package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final Drawable f20989a;

    public j1(Context context, g6 g6Var) {
        this(context, k6.H8, g6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f20989a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public j1(Context context, int i10, g6 g6Var) {
        super(context);
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.f21146b7, g6Var);
        this.f20989a = k6.W0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
