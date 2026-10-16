package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f91 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final o91 f35488a;

    public f91(o91 o91Var) {
        this.f35488a = o91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        o91 o91Var = this.f35488a;
        o91Var.S = i10;
        o91Var.f38579c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10893b, 0, o91Var.S + o91Var.T);
        return r0.l1.f43496b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o91.U(this.f35488a, (org.telegram.ui.Components.m61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o91.f0(this.f35488a, (org.telegram.ui.Components.m61) obj);
    }
}
