package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class jd extends RadialProgressView {
    public final int K;
    public final Object L;

    public jd(org.telegram.ui.Components.m50 m50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = m50Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                vu0 vu0Var = ((PhotoViewer) this.L).f33932e0;
                if (vu0Var != null) {
                    vu0Var.invalidate();
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
                ((ld) this.L).f39601f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((j70) this.L).f38865e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((ff0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                vu0 vu0Var = ((PhotoViewer) this.L).f33932e0;
                if (vu0Var != null) {
                    vu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public jd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper, d6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
