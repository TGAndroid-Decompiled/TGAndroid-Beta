package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class ok extends UndoView {
    public final int f48459j0 = 1;
    public final Object f48460k0;

    public ok(b20 b20Var, Context context) {
        super(context);
        this.f48460k0 = b20Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f48459j0) {
            case 0:
                ((cn) this.f48460k0).k8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f48459j0) {
            case 1:
                super.invalidate();
                ((b20) this.f48460k0).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f10;
        int i10;
        switch (this.f48459j0) {
            case 0:
                nj njVar = ((cn) this.f48460k0).f44525l2;
                if (njVar != null && (((i10 = njVar.U) == 1 || i10 == 3) && njVar.T)) {
                    f10 = org.telegram.messenger.g0.L(njVar.getStyleHeight());
                } else {
                    f10 = 0.0f;
                }
                setAdditionalTranslationY(f10);
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                return;
            default:
                super.k(j3, i7, obj, obj2, runnable, runnable2);
                return;
        }
    }

    public ok(cn cnVar, Activity activity, cn cnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, cnVar2, true, g6Var);
        this.f48460k0 = cnVar;
    }
}
