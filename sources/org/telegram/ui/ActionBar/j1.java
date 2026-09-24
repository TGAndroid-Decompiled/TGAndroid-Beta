package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class j1 extends FrameLayout {
    public final Drawable f19473a;

    public j1(Context context, d6 d6Var) {
        this(context, h6.H8, d6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f19473a;
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
        int v02 = h6.v0(i10, d6Var);
        int v03 = h6.v0(h6.f19009b7, d6Var);
        this.f19473a = h6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
