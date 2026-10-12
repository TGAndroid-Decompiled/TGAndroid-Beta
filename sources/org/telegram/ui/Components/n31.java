package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class n31 implements me.d, Utilities.Callback5, Utilities.Callback5Return {
    public final h41 f28725a;

    @Override
    public void n(int i10, float f7, float f10, me.e eVar) {
        this.f28725a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(h41.c(this.f28725a, (u61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h41.a(this.f28725a, (u61) obj);
    }

    @Override
    public void C(float f7, int i10) {
    }
}
