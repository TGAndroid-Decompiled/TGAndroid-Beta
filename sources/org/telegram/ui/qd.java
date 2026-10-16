package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class qd extends RadialProgressView {
    public final int K;
    public final Object L;

    public qd(org.telegram.ui.Components.h50 h50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = h50Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                bv0 bv0Var = ((PhotoViewer) this.L).f31928e0;
                if (bv0Var != null) {
                    bv0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void setAlpha(float f7) {
        switch (this.K) {
            case 0:
                super.setAlpha(f7);
                ((sd) this.L).f39768f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((p70) this.L).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((lf0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                bv0 bv0Var = ((PhotoViewer) this.L).f31928e0;
                if (bv0Var != null) {
                    bv0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public qd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
