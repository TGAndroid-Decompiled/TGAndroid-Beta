package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

public final class k6 extends l6 {

    public final int f30003b;

    public k6(String str, int i10) {
        super(str, 1);
        this.f30003b = i10;
    }

    @Override
    public final void b(int i10, Object obj) {
        switch (this.f30003b) {
            case 0:
                ((Paint) obj).setAlpha(i10);
                break;
            case 1:
                ((Paint) obj).setColor(i10);
                break;
            case 2:
                ((Drawable) obj).setAlpha(i10);
                break;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i10);
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30003b) {
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
