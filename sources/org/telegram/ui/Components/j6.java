package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class j6 extends k6 {
    public final int f34850b;

    public j6(String str, int i7) {
        super(str, 1);
        this.f34850b = i7;
    }

    @Override
    public final void b(int i7, Object obj) {
        switch (this.f34850b) {
            case 0:
                ((Paint) obj).setAlpha(i7);
                return;
            case 1:
                ((Paint) obj).setColor(i7);
                return;
            case 2:
                ((Drawable) obj).setAlpha(i7);
                return;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i7);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34850b) {
            case 0:
                return Integer.valueOf(((Paint) obj).getAlpha());
            case 1:
                return Integer.valueOf(((Paint) obj).getColor());
            case 2:
                return Integer.valueOf(((Drawable) obj).getAlpha());
            default:
                return Integer.valueOf(((ShapeDrawable) obj).getPaint().getAlpha());
        }
    }
}
