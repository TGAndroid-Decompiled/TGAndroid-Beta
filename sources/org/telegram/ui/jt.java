package org.telegram.ui;

import android.view.ViewGroup;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final ot f34985o;

    public jt(ot otVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34985o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f34985o.f36366a;
        stVar.f37536k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
