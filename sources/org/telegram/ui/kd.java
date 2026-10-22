package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class kd extends RadialProgressView {
    public final int K;
    public final Object L;

    public kd(org.telegram.ui.Components.d50 d50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = d50Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                bu0 bu0Var = ((PhotoViewer) this.L).f33282e0;
                if (bu0Var != null) {
                    bu0Var.invalidate();
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
                ((md) this.L).f39189f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((s60) this.L).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((ne0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                bu0 bu0Var = ((PhotoViewer) this.L).f33282e0;
                if (bu0Var != null) {
                    bu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper, d6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
