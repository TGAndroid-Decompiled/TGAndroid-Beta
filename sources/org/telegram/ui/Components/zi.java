package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class zi implements Utilities.Callback5, Utilities.Callback5Return {
    public final gj f30598a;

    public zi(gj gjVar) {
        this.f30598a = gjVar;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30598a.M((i51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30598a.M((i51) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
