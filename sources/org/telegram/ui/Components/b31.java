package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b31 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final w31 f24833a;

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f24833a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w31.c(this.f24833a, (h61) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w31.a(this.f24833a, (h61) obj);
    }

    @Override
    public void V(float f7, int i10) {
    }
}
