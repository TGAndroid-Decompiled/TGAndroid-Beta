package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class fd extends RadialProgressView {
    public final int G;
    public final Object H;

    public fd(org.telegram.ui.Components.r40 r40Var, Context context, int i10) {
        super(context, null);
        this.G = i10;
        this.H = r40Var;
    }

    @Override
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                rt0 rt0Var = ((PhotoViewer) this.H).f35647a0;
                if (rt0Var != null) {
                    rt0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void setAlpha(float f9) {
        switch (this.G) {
            case 0:
                super.setAlpha(f9);
                ((hd) this.H).f38858f.invalidate();
                return;
            case 1:
                super.setAlpha(f9);
                ((t60) this.H).f42560e.invalidate();
                return;
            case 2:
                super.setAlpha(f9);
                ((pe0) this.H).h.invalidate();
                return;
            default:
                super.setAlpha(f9);
                rt0 rt0Var = ((PhotoViewer) this.H).f35647a0;
                if (rt0Var != null) {
                    rt0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public fd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
