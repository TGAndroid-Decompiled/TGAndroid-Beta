package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final z71 f40292a;

    public q71(z71 z71Var) {
        this.f40292a = z71Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        z71 z71Var = this.f40292a;
        z71Var.S = i10;
        z71Var.f43644c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f12285b, 0, z71Var.S + z71Var.T);
        return r0.k1.f44826b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(z71.U(this.f40292a, (org.telegram.ui.Components.f61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z71.f0(this.f40292a, (org.telegram.ui.Components.f61) obj);
    }
}
