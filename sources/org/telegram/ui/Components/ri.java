package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class ri implements Utilities.Callback5, Utilities.Callback5Return {
    public final yi f32313a;

    public ri(yi yiVar) {
        this.f32313a = yiVar;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f32313a.L((w41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f32313a.L((w41) obj, (View) obj2);
        return Boolean.TRUE;
    }
}
