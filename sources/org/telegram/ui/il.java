package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.UndoView;
public final class il extends UndoView {
    public final int f38273j0 = 0;
    public final Object f38274k0;

    public il(y20 y20Var, Context context) {
        super(context);
        this.f38274k0 = y20Var;
    }

    @Override
    public void b(CharacterStyle characterStyle) {
        switch (this.f38273j0) {
            case 0:
                ((un) this.f38274k0).c8(characterStyle, false, null, null);
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f38273j0) {
            case 1:
                super.invalidate();
                ((y20) this.f38274k0).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        float f7;
        int i11;
        switch (this.f38273j0) {
            case 0:
                gk gkVar = ((un) this.f38274k0).f42318l2;
                if (gkVar != null && (((i11 = gkVar.U) == 1 || i11 == 3) && gkVar.T)) {
                    f7 = org.telegram.messenger.i0.L(gkVar.getStyleHeight());
                } else {
                    f7 = 0.0f;
                }
                setAdditionalTranslationY(f7);
                super.k(j10, i10, obj, obj2, runnable, runnable2);
                return;
            default:
                super.k(j10, i10, obj, obj2, runnable, runnable2);
                return;
        }
    }

    public il(un unVar, Activity activity, un unVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, unVar2, true, p6Var);
        this.f38274k0 = unVar;
    }
}
