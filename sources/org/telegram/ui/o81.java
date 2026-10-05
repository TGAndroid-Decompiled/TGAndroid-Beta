package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final y81 f39121a;

    public o81(y81 y81Var) {
        this.f39121a = y81Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        y81 y81Var = this.f39121a;
        y81Var.T = i10;
        int i11 = defaultWindowInsets.f11527b;
        if (y81Var.N != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = y81Var.N.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                y81Var.N.setLayoutParams(layoutParams);
            }
        }
        li.a.c(y81Var.f43140c, i11, defaultWindowInsets.d, AndroidUtilities.dp(12.0f), y81Var.U);
        return r0.l1.f45623b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(y81.S(this.f39121a, (org.telegram.ui.Components.h61) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y81.e0(this.f39121a, (org.telegram.ui.Components.h61) obj);
    }
}
