package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class kd extends RadialProgressView {
    public final int N;
    public final Object O;

    public kd(org.telegram.ui.Components.d50 d50Var, Context context, int i10) {
        super(context, null);
        this.N = i10;
        this.O = d50Var;
    }

    @Override
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                eu0 eu0Var = ((PhotoViewer) this.O).f33580e0;
                if (eu0Var != null) {
                    eu0Var.invalidate();
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
        switch (this.N) {
            case 0:
                super.setAlpha(f7);
                ((md) this.O).h.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((w60) this.O).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((ue0) this.O).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                eu0 eu0Var = ((PhotoViewer) this.O).f33580e0;
                if (eu0Var != null) {
                    eu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
