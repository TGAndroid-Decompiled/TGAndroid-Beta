package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class ld extends RadialProgressView {
    public final int H;
    public final Object I;

    public ld(org.telegram.ui.Components.v40 v40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = v40Var;
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 3:
                super.invalidate();
                bu0 bu0Var = ((PhotoViewer) this.I).f31705b0;
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
    public final void setAlpha(float f10) {
        switch (this.H) {
            case 0:
                super.setAlpha(f10);
                ((nd) this.I).f36584f.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((e70) this.I).e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((ze0) this.I).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                bu0 bu0Var = ((PhotoViewer) this.I).f31705b0;
                if (bu0Var != null) {
                    bu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
