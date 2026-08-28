package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.iu0;
public final class c1 extends Property {
    public final int f24180a;

    public c1(Class cls, String str, int i9) {
        super(cls, str);
        this.f24180a = i9;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24180a) {
            case 0:
                return Float.valueOf(((t1) obj).f25611ve);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((uj0) obj).v);
            default:
                return Float.valueOf(((iu0) obj).f39285a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f24180a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((uj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((iu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
