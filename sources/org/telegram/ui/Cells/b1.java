package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.gu0;
public final class b1 extends Property {
    public final int f24111a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f24111a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24111a) {
            case 0:
                return Float.valueOf(((s1) obj).f25578ve);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((fk0) obj).v);
            default:
                return Float.valueOf(((gu0) obj).f38666a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f24111a) {
            case 0:
                ((s1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((fk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((gu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
