package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.xu0;
public final class b1 extends Property {
    public final int f23892a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f23892a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23892a) {
            case 0:
                return Float.valueOf(((s1) obj).Be);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((fl0) obj).v);
            case 3:
                return Float.valueOf(((b31) obj).h);
            default:
                return Float.valueOf(((xu0) obj).f45858a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f23892a) {
            case 0:
                ((s1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((fl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                b31 b31Var = (b31) obj;
                b31Var.h = ((Float) obj2).floatValue();
                b31Var.invalidate();
                return;
            default:
                ((xu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
