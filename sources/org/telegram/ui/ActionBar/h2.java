package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.tc;
public final class h2 implements rb {
    public final n2 f20682a;

    public h2(n2 n2Var) {
        this.f20682a = n2Var;
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
        if (this.f20682a.isSupportEdgeToEdge()) {
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
    public final void b(tc tcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(tc tcVar) {
    }
}
