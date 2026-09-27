package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class ld extends RadialProgressView {
    public final int K;
    public final Object L;

    public ld(org.telegram.ui.Components.w40 w40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = w40Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                qu0 qu0Var = ((PhotoViewer) this.L).f31225e0;
                if (qu0Var != null) {
                    qu0Var.invalidate();
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
                ((nd) this.L).f35942f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((j70) this.L).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((ef0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                qu0 qu0Var = ((PhotoViewer) this.L).f31225e0;
                if (qu0Var != null) {
                    qu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper, e6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
