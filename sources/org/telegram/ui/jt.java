package org.telegram.ui;

import android.view.ViewGroup;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final ot f37868o;

    public jt(ot otVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37868o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f37868o.f39336a;
        stVar.f40564k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
