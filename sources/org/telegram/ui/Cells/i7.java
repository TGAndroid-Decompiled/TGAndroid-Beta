package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class i7 extends x51 {
    public static final int f20479a = 0;

    static {
        x51.setup(new x51());
    }

    public static y51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        y51 J = y51.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        j7 j7Var = (j7) view;
        Object obj = y51Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = y51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(y51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d && y51Var.G == y51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        j7 j7Var = new j7(context, 0, d6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d && y51Var.G == y51Var2.G) {
            return true;
        }
        return false;
    }
}
