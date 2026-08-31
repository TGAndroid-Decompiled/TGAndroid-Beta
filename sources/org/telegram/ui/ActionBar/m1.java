package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class m1 extends FrameLayout {
    public final Drawable f22128a;

    public m1(Context context, g6 g6Var) {
        this(context, k6.H8, g6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f22128a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public m1(Context context, int i10, g6 g6Var) {
        super(context);
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.f21624b7, g6Var);
        this.f22128a = k6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
