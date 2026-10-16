package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class e31 implements ne.d, Utilities.Callback5, Utilities.Callback5Return {
    public final y31 f24281a;

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        this.f24281a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(y31.c(this.f24281a, (m61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y31.a(this.f24281a, (m61) obj);
    }

    @Override
    public void A(float f7, int i10) {
    }
}
