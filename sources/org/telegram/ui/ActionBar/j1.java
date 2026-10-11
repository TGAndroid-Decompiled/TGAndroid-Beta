package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final Drawable f21251a;

    public j1(Context context, d6 d6Var) {
        this(context, h6.H8, d6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f21251a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public j1(Context context, int i10, d6 d6Var) {
        super(context);
        int w02 = h6.w0(i10, d6Var);
        int w03 = h6.w0(h6.f20786b7, d6Var);
        this.f21251a = h6.V0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
