package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class gd extends RadialProgressView {
    public final int G;
    public final Object H;

    public gd(org.telegram.ui.Components.d40 d40Var, Context context, int i9) {
        super(context, null);
        this.G = i9;
        this.H = d40Var;
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                tt0 tt0Var = ((PhotoViewer) this.H).f35580a0;
                if (tt0Var != null) {
                    tt0Var.invalidate();
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
        switch (this.G) {
            case 0:
                super.setAlpha(f10);
                ((id) this.H).f39110f.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((r60) this.H).f42280e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((qe0) this.H).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                tt0 tt0Var = ((PhotoViewer) this.H).f35580a0;
                if (tt0Var != null) {
                    tt0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public gd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.b6 b6Var) {
        super(contextThemeWrapper, b6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
