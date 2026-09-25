package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final z81 f36819a;

    public q81(z81 z81Var) {
        this.f36819a = z81Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        z81 z81Var = this.f36819a;
        z81Var.S = i10;
        z81Var.f40413c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10577b, 0, z81Var.S + z81Var.T);
        return r0.l1.f42140b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(z81.U(this.f36819a, (org.telegram.ui.Components.v51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z81.f0(this.f36819a, (org.telegram.ui.Components.v51) obj);
    }
}
