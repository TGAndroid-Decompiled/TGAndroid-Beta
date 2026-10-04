package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class bj implements Utilities.Callback5, Utilities.Callback5Return {
    public final jj f24980a;

    public bj(jj jjVar) {
        this.f24980a = jjVar;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f24980a.K((g61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f24980a.K((g61) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
