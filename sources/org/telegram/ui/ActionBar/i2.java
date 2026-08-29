package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;
public final class i2 implements kb {
    public final o2 f23521a;

    public i2(o2 o2Var) {
        this.f23521a = o2Var;
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
        if (this.f23521a.isSupportEdgeToEdge()) {
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
    public final void b(mc mcVar) {
    }

    @Override
    public final void c(float f9) {
    }

    @Override
    public final void d(mc mcVar) {
    }
}
