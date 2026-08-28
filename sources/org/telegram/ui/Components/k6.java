package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class k6 extends l6 {
    public final int f29973b;

    public k6(String str, int i9) {
        super(str, 1);
        this.f29973b = i9;
    }

    @Override
    public final void a(int i9, Object obj) {
        switch (this.f29973b) {
            case 0:
                ((Paint) obj).setAlpha(i9);
                return;
            case 1:
                ((Paint) obj).setColor(i9);
                return;
            case 2:
                ((Drawable) obj).setAlpha(i9);
                return;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i9);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29973b) {
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
