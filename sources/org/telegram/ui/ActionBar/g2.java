package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.rc;
public final class g2 implements pb {
    public final m2 f18931a;

    public g2(m2 m2Var) {
        this.f18931a = m2Var;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(int i10) {
        if (this.f18931a.isSupportEdgeToEdge()) {
            return AndroidUtilities.navigationBarHeight;
        }
        return 0;
    }

    @Override
    public final boolean g(int i10) {
        return false;
    }

    @Override
    public final int h(int i10) {
        return 0;
    }

    @Override
    public final void b(rc rcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(rc rcVar) {
    }
}
