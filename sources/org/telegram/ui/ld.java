package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class ld extends RadialProgressView {
    public final int K;
    public final Object L;

    public ld(org.telegram.ui.Components.t40 t40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = t40Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                xu0 xu0Var = ((PhotoViewer) this.L).f30950e0;
                if (xu0Var != null) {
                    xu0Var.invalidate();
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
                ((nd) this.L).f36045f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((n70) this.L).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((jf0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                xu0 xu0Var = ((PhotoViewer) this.L).f30950e0;
                if (xu0Var != null) {
                    xu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
