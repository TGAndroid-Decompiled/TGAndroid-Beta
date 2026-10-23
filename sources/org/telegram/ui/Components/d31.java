package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class d31 implements ne.d, Utilities.Callback5, Utilities.Callback5Return {
    public final w31 f25499a;

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        this.f25499a.h();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w31.c(this.f25499a, (m61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w31.a(this.f25499a, (m61) obj);
    }

    @Override
    public void H(float f7, int i10) {
    }
}
