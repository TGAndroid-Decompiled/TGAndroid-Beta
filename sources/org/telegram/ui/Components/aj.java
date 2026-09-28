package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class aj implements Utilities.Callback5, Utilities.Callback5Return {
    public final ij f22664a;

    public aj(ij ijVar) {
        this.f22664a = ijVar;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f22664a.M((x51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f22664a.M((x51) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
