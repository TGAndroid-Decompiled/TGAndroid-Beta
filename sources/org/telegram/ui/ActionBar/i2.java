package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.oc;
public final class i2 implements mb {
    public final o2 f18748a;

    public i2(o2 o2Var) {
        this.f18748a = o2Var;
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
        if (this.f18748a.isSupportEdgeToEdge()) {
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
    public final void b(oc ocVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(oc ocVar) {
    }
}
