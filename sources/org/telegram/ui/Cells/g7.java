package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class g7 extends k41 {
    public static final int f24403a = 0;

    static {
        k41.setup(new k41());
    }

    public static l41 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        l41 J = l41.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        h7 h7Var = (h7) view;
        Object obj = l41Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = l41Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(l41Var.f30333e, false);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d && l41Var.G == l41Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        h7 h7Var = new h7(context, 0, b6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d && l41Var.G == l41Var2.G) {
            return true;
        }
        return false;
    }
}
