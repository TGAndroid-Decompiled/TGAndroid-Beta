package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e21 implements xd.b, Utilities.Callback5, Utilities.Callback5Return {
    public final w21 f24441a;

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f24441a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w21.c(this.f24441a, (i51) obj, (View) obj2));
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w21.a(this.f24441a, (i51) obj);
    }

    @Override
    public void z(float f10, int i10) {
    }
}
