package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class p6 extends q6 {
    public final int f26043b;

    public p6(String str, int i10) {
        super(str, 1);
        this.f26043b = i10;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f26043b) {
            case 0:
                ((Paint) obj).setAlpha(i10);
                return;
            case 1:
                ((Paint) obj).setColor(i10);
                return;
            case 2:
                ((Drawable) obj).setAlpha(i10);
                return;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i10);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f26043b) {
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
