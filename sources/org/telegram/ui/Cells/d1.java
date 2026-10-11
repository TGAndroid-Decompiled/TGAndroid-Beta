package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.kv0;
public final class d1 extends Property {
    public final int f21953a;

    public d1(Class cls, String str, int i10) {
        super(cls, str);
        this.f21953a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21953a) {
            case 0:
                return Float.valueOf(((u1) obj).Ae);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((ml0) obj).v);
            default:
                return Float.valueOf(((kv0) obj).f39427a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f21953a) {
            case 0:
                ((u1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((ml0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((kv0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
