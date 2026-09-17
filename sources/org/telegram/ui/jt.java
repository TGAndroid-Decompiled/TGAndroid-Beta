package org.telegram.ui;

import android.view.ViewGroup;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final ot f37842o;

    public jt(ot otVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37842o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f37842o.f39310a;
        stVar.f40538k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
