package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.pc;
public final class j2 implements nb {
    public final p2 f17856a;

    public j2(p2 p2Var) {
        this.f17856a = p2Var;
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
        if (this.f17856a.isSupportEdgeToEdge()) {
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
    public final void b(pc pcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(pc pcVar) {
    }
}
