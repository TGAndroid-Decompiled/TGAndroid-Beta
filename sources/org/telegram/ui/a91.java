package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a91 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final k91 f30840a;

    public a91(k91 k91Var) {
        this.f30840a = k91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        k91 k91Var = this.f30840a;
        k91Var.S = i10;
        k91Var.f34298c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10075b, 0, k91Var.S + k91Var.T);
        return r0.l1.f41073b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(k91.U(this.f30840a, (org.telegram.ui.Components.v51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k91.f0(this.f30840a, (org.telegram.ui.Components.v51) obj);
    }
}
