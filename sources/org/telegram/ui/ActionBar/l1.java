package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
public final class l1 extends FrameLayout {
    public final Drawable f22825a;

    public l1(Context context, u6 u6Var) {
        this(context, y6.H8, u6Var);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f22825a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    public void setColor(int i10) {
        setBackgroundColor(i10);
    }

    public l1(Context context, int i10, u6 u6Var) {
        super(context);
        int w02 = y6.w0(i10, u6Var);
        int w03 = y6.w0(y6.f23319b7, u6Var);
        this.f22825a = y6.W0(getContext(), R.drawable.greydivider, w03);
        setBackgroundColor(w02);
    }
}
