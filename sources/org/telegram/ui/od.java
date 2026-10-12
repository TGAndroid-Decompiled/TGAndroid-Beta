package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class od extends RadialProgressView {
    public final int K;
    public final Object L;

    public od(org.telegram.ui.Components.o50 o50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = o50Var;
    }

    @Override
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                yu0 yu0Var = ((PhotoViewer) this.L).f33741e0;
                if (yu0Var != null) {
                    yu0Var.invalidate();
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
                ((qd) this.L).f41279f.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((l70) this.L).f39653e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((hf0) this.L).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                yu0 yu0Var = ((PhotoViewer) this.L).f33741e0;
                if (yu0Var != null) {
                    yu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public od(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
