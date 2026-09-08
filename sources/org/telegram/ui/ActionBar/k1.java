package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class k1 extends FrameLayout {
    public final Drawable f21156a;

    public k1(Context context, f6 f6Var) {
        this(context, j6.H8, f6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f21156a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public k1(Context context, int i10, f6 f6Var) {
        super(context);
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.f20654b7, f6Var);
        this.f21156a = j6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
