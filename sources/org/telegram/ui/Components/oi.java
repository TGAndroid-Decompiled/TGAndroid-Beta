package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class oi implements Utilities.Callback5, Utilities.Callback5Return {
    public final vi f31387a;

    public oi(vi viVar) {
        this.f31387a = viVar;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f31387a.L((l41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f31387a.L((l41) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
