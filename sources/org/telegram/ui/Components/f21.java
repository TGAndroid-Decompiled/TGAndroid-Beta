package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class f21 implements xd.b, Utilities.Callback5, Utilities.Callback5Return {
    public final x21 f26728a;

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f26728a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(x21.c(this.f26728a, (j51) obj, (View) obj2));
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x21.a(this.f26728a, (j51) obj);
    }

    @Override
    public void z(float f10, int i10) {
    }
}
