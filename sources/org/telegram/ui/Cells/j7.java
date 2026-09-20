package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class j7 extends v51 {
    public static final int f20504a = 0;

    static {
        v51.setup(new v51());
    }

    public static w51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        w51 J = w51.J(j7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        k7 k7Var = (k7) view;
        Object obj = w51Var.G;
        if (obj instanceof MessageObject) {
            k7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            k7Var.setTag(audioEntry);
            k7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = w51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            k7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        k7Var.e(w51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d && w51Var.G == w51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        k7 k7Var = new k7(context, 0, f6Var);
        k7Var.setCheckForButtonPress(true);
        return k7Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d && w51Var.G == w51Var2.G) {
            return true;
        }
        return false;
    }
}
