package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class mk extends UndoView {
    public final int f47819j0 = 0;
    public final Object f47820k0;

    public mk(z10 z10Var, Context context) {
        super(context);
        this.f47820k0 = z10Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f47819j0) {
            case 0:
                ((an) this.f47820k0).j8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f47819j0) {
            case 1:
                super.invalidate();
                ((z10) this.f47820k0).invalidate();
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
        switch (this.f47819j0) {
            case 0:
                lj ljVar = ((an) this.f47820k0).f43863l2;
                if (ljVar != null && (((i10 = ljVar.U) == 1 || i10 == 3) && ljVar.T)) {
                    f10 = org.telegram.messenger.g0.L(ljVar.getStyleHeight());
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

    public mk(an anVar, Activity activity, an anVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, anVar2, true, f6Var);
        this.f47820k0 = anVar;
    }
}
