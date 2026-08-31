package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class g7 extends i51 {
    public static final int f22858a = 0;

    static {
        i51.setup(new i51());
    }

    public static j51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        j51 J = j51.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        h7 h7Var = (h7) view;
        Object obj = j51Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z4);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z4);
        }
        Object obj2 = j51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(j51Var.f28008e, false);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d && j51Var.G == j51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        h7 h7Var = new h7(context, 0, g6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d && j51Var.G == j51Var2.G) {
            return true;
        }
        return false;
    }
}
