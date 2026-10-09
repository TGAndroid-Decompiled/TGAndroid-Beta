package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class kd extends RadialProgressView {
    public final int K;
    public final Object L;

    public kd(org.telegram.ui.Components.l50 l50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = l50Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                wu0 wu0Var = ((PhotoViewer) this.L).f33904e0;
                if (wu0Var != null) {
                    wu0Var.invalidate();
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
                ((md) this.L).f39847f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((j70) this.L).f38848e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((gf0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                wu0 wu0Var = ((PhotoViewer) this.L).f33904e0;
                if (wu0Var != null) {
                    wu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper, e6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
