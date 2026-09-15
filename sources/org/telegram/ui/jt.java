package org.telegram.ui;

import android.view.ViewGroup;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final ot f34969o;

    public jt(ot otVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34969o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f34969o.f36336a;
        stVar.f37463k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
