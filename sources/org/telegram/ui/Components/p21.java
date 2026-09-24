package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class p21 implements le.e, Utilities.Callback5, Utilities.Callback5Return {
    public final k31 f27241a;

    @Override
    public void D(int i10, float f7, float f10, le.f fVar) {
        this.f27241a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(k31.c(this.f27241a, (v51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k31.a(this.f27241a, (v51) obj);
    }

    @Override
    public void C(float f7, int i10) {
    }
}
