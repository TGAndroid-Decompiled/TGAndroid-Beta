package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class mk extends UndoView {
    public final int f49240k0 = 0;
    public final Object f49241l0;

    public mk(y10 y10Var, Context context) {
        super(context);
        this.f49241l0 = y10Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f49240k0) {
            case 0:
                ((an) this.f49241l0).l8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f49240k0) {
            case 1:
                super.invalidate();
                ((y10) this.f49241l0).invalidate();
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
        switch (this.f49240k0) {
            case 0:
                lj ljVar = ((an) this.f49241l0).f45278m2;
                if (ljVar != null && (((i10 = ljVar.V) == 1 || i10 == 3) && ljVar.U)) {
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

    public mk(an anVar, Activity activity, an anVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, anVar2, true, e6Var);
        this.f49241l0 = anVar;
    }
}
