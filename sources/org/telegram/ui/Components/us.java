package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class us extends s4.j {
    public final ws F;

    public us(ws wsVar) {
        this.F = wsVar;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
