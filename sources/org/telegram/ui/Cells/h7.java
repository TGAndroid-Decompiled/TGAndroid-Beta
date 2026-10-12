package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class h7 extends t61 {
    public static final int f21977a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        u61 J = u61.J(h7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        i7 i7Var = (i7) view;
        Object obj = u61Var.G;
        if (obj instanceof MessageObject) {
            i7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            i7Var.setTag(audioEntry);
            i7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = u61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            i7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        i7Var.e(u61Var.f31065e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d && u61Var.G == u61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        i7 i7Var = new i7(context, 0, c6Var);
        i7Var.setCheckForButtonPress(true);
        return i7Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d && u61Var.G == u61Var2.G) {
            return true;
        }
        return false;
    }
}
