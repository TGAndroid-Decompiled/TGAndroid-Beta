package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.su0;
public final class b1 extends Property {
    public final int f22586a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f22586a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22586a) {
            case 0:
                return Float.valueOf(((t1) obj).f24096we);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((rk0) obj).v);
            default:
                return Float.valueOf(((su0) obj).f41369a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f22586a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((rk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((su0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
