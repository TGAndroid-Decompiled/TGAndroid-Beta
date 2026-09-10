package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nx;
public final class j extends n {
    public final int d = 0;
    public final FrameLayout e;

    public j(nx nxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = nxVar;
    }

    @Override
    public final void e(le.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                bi.l4 l4Var = ((l) this.e).F0;
                if (l4Var != null) {
                    l4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
            default:
                super.e(lVar);
                ((nx) this.e).invalidate();
                return;
        }
    }

    public j(l lVar, Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context, f6Var, mVar);
        this.e = lVar;
    }
}
