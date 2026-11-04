package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class ik extends UndoView {
    public final int f46276k0 = 1;
    public final Object f46277l0;

    public ik(u10 u10Var, Context context) {
        super(context);
        this.f46277l0 = u10Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f46276k0) {
            case 0:
                ((wm) this.f46277l0).j8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f46276k0) {
            case 1:
                super.invalidate();
                ((u10) this.f46277l0).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f10;
        int i10;
        switch (this.f46276k0) {
            case 0:
                hj hjVar = ((wm) this.f46277l0).f51395m2;
                if (hjVar != null && (((i10 = hjVar.V) == 1 || i10 == 3) && hjVar.U)) {
                    f10 = org.telegram.messenger.g0.L(hjVar.getStyleHeight());
                } else {
                    f10 = 0.0f;
                }
                setAdditionalTranslationY(f10);
                super.k(j10, i3, obj, obj2, runnable, runnable2);
                return;
            default:
                super.k(j10, i3, obj, obj2, runnable, runnable2);
                return;
        }
    }

    public ik(wm wmVar, Activity activity, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, wmVar2, true, e6Var);
        this.f46277l0 = wmVar;
    }
}
