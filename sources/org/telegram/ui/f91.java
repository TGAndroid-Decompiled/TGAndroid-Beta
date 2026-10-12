package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f91 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final o91 f35766a;

    public f91(o91 o91Var) {
        this.f35766a = o91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        o91 o91Var = this.f35766a;
        o91Var.S = i10;
        o91Var.f38897c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10889b, 0, o91Var.S + o91Var.T);
        return r0.l1.f43740b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o91.U(this.f35766a, (org.telegram.ui.Components.l61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o91.f0(this.f35766a, (org.telegram.ui.Components.l61) obj);
    }
}
