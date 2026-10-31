package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class id extends RadialProgressView {
    public final int N;
    public final Object O;

    public id(org.telegram.ui.Components.a40 a40Var, Context context, int i10) {
        super(context, null);
        this.N = i10;
        this.O = a40Var;
    }

    @Override
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                as0 as0Var = ((PhotoViewer) this.O).f33470e0;
                if (as0Var != null) {
                    as0Var.invalidate();
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
                ((kd) this.O).h.invalidate();
                return;
            case 1:
                super.setAlpha(f7);
                ((c60) this.O).e.invalidate();
                return;
            case 2:
                super.setAlpha(f7);
                ((wd0) this.O).h.invalidate();
                return;
            default:
                super.setAlpha(f7);
                as0 as0Var = ((PhotoViewer) this.O).f33470e0;
                if (as0Var != null) {
                    as0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public id(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.p6 p6Var) {
        super(contextThemeWrapper, p6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
