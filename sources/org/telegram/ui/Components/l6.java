package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class l6 extends m6 {
    public final int f28646b;

    public l6(String str, int i10) {
        super(str, 1);
        this.f28646b = i10;
    }

    @Override
    public final void a(int i10, Object obj) {
        switch (this.f28646b) {
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
        switch (this.f28646b) {
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
