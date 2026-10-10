package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class i31 implements me.d, Utilities.Callback5, Utilities.Callback5Return {
    public final d41 f27223a;

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f27223a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(d41.c(this.f27223a, (q61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        d41.a(this.f27223a, (q61) obj);
    }

    @Override
    public void A(float f7, int i10) {
    }
}
