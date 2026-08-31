package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class qi implements Utilities.Callback5, Utilities.Callback5Return {
    public final xi f30396a;

    public qi(xi xiVar) {
        this.f30396a = xiVar;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30396a.M((j51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f30396a.M((j51) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
