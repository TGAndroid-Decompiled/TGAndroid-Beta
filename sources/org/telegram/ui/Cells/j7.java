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
import org.telegram.ui.Components.yl0;
public final class j7 extends x51 {
    public static final int f20519a = 0;

    static {
        x51.setup(new x51());
    }

    public static y51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        y51 J = y51.J(j7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        k7 k7Var = (k7) view;
        Object obj = y51Var.G;
        if (obj instanceof MessageObject) {
            k7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            k7Var.setTag(audioEntry);
            k7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = y51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            k7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        k7Var.e(y51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d && y51Var.G == y51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        k7 k7Var = new k7(context, 0, f6Var);
        k7Var.setCheckForButtonPress(true);
        return k7Var;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d && y51Var.G == y51Var2.G) {
            return true;
        }
        return false;
    }
}
