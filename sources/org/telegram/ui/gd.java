package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

public final class gd extends RadialProgressView {
    public final int G;
    public final Object H;

    public gd(org.telegram.ui.Components.i40 i40Var, Context context, int i10) {
        super(context, null);
        this.G = i10;
        this.H = i40Var;
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                ut0 ut0Var = ((PhotoViewer) this.H).f35583a0;
                if (ut0Var != null) {
                    ut0Var.invalidate();
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override
    public final void setAlpha(float f10) {
        switch (this.G) {
            case 0:
                super.setAlpha(f10);
                ((id) this.H).f39038f.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((u60) this.H).f43136e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((te0) this.H).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                ut0 ut0Var = ((PhotoViewer) this.H).f35583a0;
                if (ut0Var != null) {
                    ut0Var.invalidate();
                }
                break;
        }
    }

    public gd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
