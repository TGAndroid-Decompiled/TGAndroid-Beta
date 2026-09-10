package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.lv0;
public final class c1 extends Property {
    public final int f18958a;

    public c1(Class cls, String str, int i10) {
        super(cls, str);
        this.f18958a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f18958a) {
            case 0:
                return Float.valueOf(((t1) obj).f20425ze);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((pk0) obj).v);
            default:
                return Float.valueOf(((lv0) obj).f34786a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f18958a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((pk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((lv0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
