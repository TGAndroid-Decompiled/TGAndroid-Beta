package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.sc;
public final class g2 implements qb {
    public final m2 f20672a;

    public g2(m2 m2Var) {
        this.f20672a = m2Var;
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
        if (this.f20672a.isSupportEdgeToEdge()) {
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
    public final void b(sc scVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(sc scVar) {
    }
}
