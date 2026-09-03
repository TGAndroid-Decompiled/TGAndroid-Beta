package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class m81 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final v81 f38881a;

    public m81(v81 v81Var) {
        this.f38881a = v81Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        v81 v81Var = this.f38881a;
        v81Var.P = i10;
        v81Var.f42046c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f7758b, 0, v81Var.P + v81Var.Q);
        return r0.m1.f46482b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(v81.U(this.f38881a, (org.telegram.ui.Components.h51) obj, (View) obj2));
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v81.e0(this.f38881a, (org.telegram.ui.Components.h51) obj);
    }
}
