package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class k11 implements ud.b, Utilities.Callback5, Utilities.Callback5Return {

    public final d21 f29896a;

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.f29896a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(d21.c(this.f29896a, (n41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        d21.a(this.f29896a, (n41) obj);
    }

    @Override
    public void A(float f10, int i10) {
    }
}
