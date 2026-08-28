package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class l1 extends FrameLayout {
    public final Drawable f23618a;

    public l1(Context context, b6 b6Var) {
        this(context, f6.H8, b6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f23618a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i9) {
        setBackgroundColor(i9);
    }

    public l1(Context context, int i9, b6 b6Var) {
        super(context);
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.f22966b7, b6Var);
        this.f23618a = f6.U0(getContext(), R.drawable.greydivider, v03);
        setBackgroundColor(v02);
    }
}
