package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class g6 extends org.telegram.ui.Components.xb0 {

    public final z6 f38325z0;

    public g6(z6 z6Var, Context context) {
        super(context);
        this.f38325z0 = z6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        boolean Z = Z();
        z6 z6Var = this.f38325z0;
        if (Z) {
            float f11 = z6Var.f45047f0;
            if (f11 != 0.0f) {
                z6Var.f45047f0 = f11 - 0.16f;
                invalidate();
            } else if (!Z) {
                f10 = z6Var.f45047f0;
                if (f10 != 1.0f) {
                    z6Var.f45047f0 = f10 + 0.16f;
                    invalidate();
                }
            }
        } else if (!Z) {
            f10 = z6Var.f45047f0;
            if (f10 != 1.0f) {
                z6Var.f45047f0 = f10 + 0.16f;
                invalidate();
            }
        }
        z6Var.f45047f0 = Utilities.clamp(z6Var.f45047f0, 1.0f, 0.0f);
        if (((org.telegram.ui.ActionBar.n2) z6Var).parentLayout != null) {
            org.telegram.ui.ActionBar.b5 b5Var = ((org.telegram.ui.ActionBar.n2) z6Var).parentLayout;
            ActionBarLayout actionBarLayout = (ActionBarLayout) b5Var;
            actionBarLayout.p(canvas, (int) (z6Var.f45043d0 * 255.0f * z6Var.f45047f0), org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        }
    }
}
