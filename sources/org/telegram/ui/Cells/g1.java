package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.cr0;
public final class g1 extends Property {
    public final int f29136a;

    public g1(Class cls, String str, int i7) {
        super(cls, str);
        this.f29136a = i7;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29136a) {
            case 0:
                return Float.valueOf(((q1) obj).Vc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((ii0) obj).f34645w);
            case 3:
                return Float.valueOf(((wz0) obj).h);
            default:
                return Float.valueOf(((cr0) obj).f44878a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f29136a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((ii0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                wz0 wz0Var = (wz0) obj;
                wz0Var.h = ((Float) obj2).floatValue();
                wz0Var.invalidate();
                return;
            default:
                ((cr0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
