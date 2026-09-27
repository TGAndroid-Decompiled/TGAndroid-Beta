package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
public final class i2 implements ob {
    public final o2 f18976a;

    public i2(o2 o2Var) {
        this.f18976a = o2Var;
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
        if (this.f18976a.isSupportEdgeToEdge()) {
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
