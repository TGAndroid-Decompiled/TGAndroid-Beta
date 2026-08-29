package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class u11 implements vd.b, Utilities.Callback5, Utilities.Callback5Return {
    public final m21 f33098a;

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.f33098a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(m21.c(this.f33098a, (w41) obj, (View) obj2));
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m21.a(this.f33098a, (w41) obj);
    }

    @Override
    public void z(float f9, int i10) {
    }
}
