package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b91 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final k91 f36115a;

    public b91(k91 k91Var) {
        this.f36115a = k91Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        k91 k91Var = this.f36115a;
        k91Var.S = i10;
        k91Var.f39417c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f11575b, 0, k91Var.S + k91Var.T);
        return r0.k1.f46991b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(k91.U(this.f36115a, (org.telegram.ui.Components.u61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k91.f0(this.f36115a, (org.telegram.ui.Components.u61) obj);
    }
}
