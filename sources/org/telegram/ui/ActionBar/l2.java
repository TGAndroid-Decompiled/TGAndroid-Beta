package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class l2 implements ob {
    public final r2 f22825a;

    public l2(r2 r2Var) {
        this.f22825a = r2Var;
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
        if (this.f22825a.isSupportEdgeToEdge()) {
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
    public final void b(qc qcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(qc qcVar) {
    }
}
