package org.telegram.ui;

import android.view.ViewGroup;
public final class jt extends org.telegram.ui.ActionBar.n1 {
    public final ot f37869o;

    public jt(ot otVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37869o = otVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        st stVar = this.f37869o.f39337a;
        stVar.f40565k = null;
        stVar.K = false;
        if (stVar.R) {
            stVar.n();
        }
    }
}
