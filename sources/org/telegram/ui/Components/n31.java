package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class n31 implements oe.d, Utilities.Callback5, Utilities.Callback5Return {
    public final f41 f30728a;

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f30728a.h();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f41.c(this.f30728a, (u61) obj, (View) obj2));
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f41.a(this.f30728a, (u61) obj);
    }

    @Override
    public void z(float f7, int i10) {
    }
}
