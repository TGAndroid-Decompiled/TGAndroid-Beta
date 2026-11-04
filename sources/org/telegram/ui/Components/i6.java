package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class i6 extends j6 {
    public final int f34620b;

    public i6(String str, int i3) {
        super(str, 1);
        this.f34620b = i3;
    }

    @Override
    public final void b(int i3, Object obj) {
        switch (this.f34620b) {
            case 0:
                ((Paint) obj).setAlpha(i3);
                return;
            case 1:
                ((Paint) obj).setColor(i3);
                return;
            case 2:
                ((Drawable) obj).setAlpha(i3);
                return;
            default:
                ((ShapeDrawable) obj).getPaint().setAlpha(i3);
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34620b) {
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
