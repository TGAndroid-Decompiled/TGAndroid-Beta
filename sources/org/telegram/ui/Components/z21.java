package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class z21 implements ne.d, Utilities.Callback5, Utilities.Callback5Return {
    public final s31 f32817a;

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        this.f32817a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(s31.c(this.f32817a, (h61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        s31.a(this.f32817a, (h61) obj);
    }

    @Override
    public void H(float f7, int i10) {
    }
}
