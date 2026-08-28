package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class i11 implements td.b, Utilities.Callback5, Utilities.Callback5Return {
    public final b21 f29273a;

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.f29273a.g();
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(b21.c(this.f29273a, (l41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        b21.a(this.f29273a, (l41) obj);
    }

    @Override
    public void B(float f10, int i9) {
    }
}
