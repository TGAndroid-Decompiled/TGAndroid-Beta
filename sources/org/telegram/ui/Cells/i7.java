package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class i7 extends v51 {
    public static final int f20462a = 0;

    static {
        v51.setup(new v51());
    }

    public static w51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        w51 J = w51.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        j7 j7Var = (j7) view;
        Object obj = w51Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = w51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(w51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d && w51Var.G == w51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        j7 j7Var = new j7(context, 0, d6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d && w51Var.G == w51Var2.G) {
            return true;
        }
        return false;
    }
}
