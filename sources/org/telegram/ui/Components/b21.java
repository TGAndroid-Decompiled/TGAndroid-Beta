package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final w21 f24554a;

    @Override
    public void E(int i10, float f7, float f10, le.e eVar) {
        this.f24554a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w21.c(this.f24554a, (h51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w21.a(this.f24554a, (h51) obj);
    }

    @Override
    public void z(float f7, int i10) {
    }
}
