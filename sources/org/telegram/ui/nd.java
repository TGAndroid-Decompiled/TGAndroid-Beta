package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;
public final class nd extends RadialProgressView {
    public final int H;
    public final Object I;

    public nd(org.telegram.ui.Components.w40 w40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = w40Var;
    }

    @Override
    public void invalidate() {
        switch (this.H) {
            case 3:
                super.invalidate();
                iu0 iu0Var = ((PhotoViewer) this.I).f31679b0;
                if (iu0Var != null) {
                    iu0Var.invalidate();
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
                ((pd) this.I).f37083f.invalidate();
                return;
            case 1:
                super.setAlpha(f10);
                ((g70) this.I).e.invalidate();
                return;
            case 2:
                super.setAlpha(f10);
                ((bf0) this.I).h.invalidate();
                return;
            default:
                super.setAlpha(f10);
                iu0 iu0Var = ((PhotoViewer) this.I).f31679b0;
                if (iu0Var != null) {
                    iu0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public nd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
