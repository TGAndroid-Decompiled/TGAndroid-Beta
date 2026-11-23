package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class nk extends UndoView {
    public final int f50211k0 = 1;
    public final Object f50212l0;

    public nk(b20 b20Var, Context context) {
        super(context);
        this.f50212l0 = b20Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f50211k0) {
            case 0:
                ((bn) this.f50212l0).l8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f50211k0) {
            case 1:
                super.invalidate();
                ((b20) this.f50212l0).invalidate();
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
        switch (this.f50211k0) {
            case 0:
                mj mjVar = ((bn) this.f50212l0).f46065m2;
                if (mjVar != null && (((i10 = mjVar.V) == 1 || i10 == 3) && mjVar.U)) {
                    f10 = org.telegram.messenger.g0.L(mjVar.getStyleHeight());
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

    public nk(bn bnVar, Activity activity, bn bnVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, bnVar2, true, h6Var);
        this.f50212l0 = bnVar;
    }
}
