package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class j7 extends u51 {
    public static final int f19389a = 0;

    static {
        u51.setup(new u51());
    }

    public static v51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        v51 J = v51.J(j7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        k7 k7Var = (k7) view;
        Object obj = v51Var.G;
        if (obj instanceof MessageObject) {
            k7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            k7Var.setTag(audioEntry);
            k7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = v51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            k7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        k7Var.e(v51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d && v51Var.G == v51Var2.G) {
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
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d && v51Var.G == v51Var2.G) {
            return true;
        }
        return false;
    }
}
