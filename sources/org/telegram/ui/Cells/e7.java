package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.gj;
import org.telegram.messenger.we;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class e7 extends a41 {
    public static final int f30187b = 0;

    static {
        a41.h(new a41());
    }

    public static b41 i(we weVar, a20 a20Var) {
        b41 K = b41.K(e7.class);
        K.G = weVar;
        K.H = a20Var;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        f7 f7Var = (f7) view;
        Object obj = b41Var.G;
        if (obj instanceof gj) {
            f7Var.f((gj) obj, z10);
        } else if (obj instanceof we) {
            we weVar = (we) obj;
            f7Var.setTag(weVar);
            f7Var.f(weVar.f27340e, z10);
        }
        Object obj2 = b41Var.H;
        if (obj2 instanceof a20) {
            f7Var.setNeedPlayMessageListener((a20) obj2);
        }
        f7Var.e(b41Var.f33178e, false);
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d && b41Var.G == b41Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        f7 f7Var = new f7(0, context, e6Var);
        f7Var.setCheckForButtonPress(true);
        return f7Var;
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d && b41Var.G == b41Var2.G) {
            return true;
        }
        return false;
    }
}
