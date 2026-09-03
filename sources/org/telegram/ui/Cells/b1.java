package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.xu0;
public final class b1 extends Property {
    public final int f22588a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f22588a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22588a) {
            case 0:
                return Float.valueOf(((t1) obj).f24098we);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((qk0) obj).v);
            default:
                return Float.valueOf(((xu0) obj).f43454a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f22588a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((qk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((xu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
