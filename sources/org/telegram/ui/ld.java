package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class ld extends RadialProgressView {
    public final int H;
    public final Object I;

    public ld(org.telegram.ui.Components.x40 x40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = x40Var;
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 3:
                super.invalidate();
                du0 du0Var = ((PhotoViewer) this.I).f34230b0;
                if (du0Var != null) {
                    du0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void setAlpha(float f10) {
        switch (this.H) {
            case 0:
                super.setAlpha(f10);
                ((nd) this.I).f39392f.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((f70) this.I).f36774e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((af0) this.I).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                du0 du0Var = ((PhotoViewer) this.I).f34230b0;
                if (du0Var != null) {
                    du0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
