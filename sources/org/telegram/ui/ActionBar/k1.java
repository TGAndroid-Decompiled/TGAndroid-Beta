package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class k1 extends FrameLayout {
    public final Drawable f19343a;

    public k1(Context context, e6 e6Var) {
        this(context, i6.H8, e6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f19343a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public k1(Context context, int i10, e6 e6Var) {
        super(context);
        int v02 = i6.v0(i10, e6Var);
        int v03 = i6.v0(i6.f18800b7, e6Var);
        this.f19343a = i6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
