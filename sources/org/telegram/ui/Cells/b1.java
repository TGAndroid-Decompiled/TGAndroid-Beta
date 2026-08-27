package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.ju0;

public final class b1 extends Property {

    public final int f24092a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f24092a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24092a) {
            case 0:
                return Float.valueOf(((s1) obj).f25567ve);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((wj0) obj).v);
            default:
                return Float.valueOf(((ju0) obj).f39502a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f24092a) {
            case 0:
                ((s1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                break;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                break;
            case 2:
                ((wj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                break;
            default:
                ((ju0) obj).b(((Float) obj2).floatValue());
                break;
        }
    }
}
