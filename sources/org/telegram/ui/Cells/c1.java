package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.jv0;
public final class c1 extends Property {
    public final int f21699a;

    public c1(Class cls, String str, int i10) {
        super(cls, str);
        this.f21699a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21699a) {
            case 0:
                return Float.valueOf(((t1) obj).f23254ze);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((fk0) obj).v);
            default:
                return Float.valueOf(((jv0) obj).f37873a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f21699a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((fk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((jv0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
