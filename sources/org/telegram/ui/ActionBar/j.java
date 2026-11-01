package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.tw;
public final class j extends n {
    public final int d = 0;
    public final FrameLayout e;

    public j(tw twVar, Context context, ac.a aVar) {
        super(context, null, aVar);
        this.e = twVar;
    }

    @Override
    public final void b(fe.m mVar) {
        switch (this.d) {
            case 0:
                super.b(mVar);
                float totalVisibility = getTotalVisibility();
                org.telegram.ui.Cells.a5 a5Var = ((kg.g1) this.e).F0;
                if (a5Var != null) {
                    a5Var.setTranslationY(totalVisibility * org.telegram.messenger.i0.L(-11.0f));
                    return;
                }
                return;
            default:
                super.b(mVar);
                ((tw) this.e).invalidate();
                return;
        }
    }

    public j(kg.g1 g1Var, Context context, p6 p6Var, ac.a aVar) {
        super(context, p6Var, aVar);
        this.e = g1Var;
    }
}
