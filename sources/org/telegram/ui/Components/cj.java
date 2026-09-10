package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class cj implements Utilities.Callback5, Utilities.Callback5Return {
    public final jj f22138a;

    public cj(jj jjVar) {
        this.f22138a = jjVar;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f22138a.M((v51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f22138a.M((v51) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
