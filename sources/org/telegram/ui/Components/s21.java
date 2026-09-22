package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class s21 implements le.d, Utilities.Callback5, Utilities.Callback5Return {
    public final n31 f28111a;

    @Override
    public void H(int i10, float f7, float f10, le.e eVar) {
        this.f28111a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(n31.c(this.f28111a, (y51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n31.a(this.f28111a, (y51) obj);
    }

    @Override
    public void C(float f7, int i10) {
    }
}
