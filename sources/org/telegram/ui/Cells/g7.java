package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class g7 extends h51 {
    public static final int f21107a = 0;

    static {
        h51.setup(new h51());
    }

    public static i51 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        i51 J = i51.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        h7 h7Var = (h7) view;
        Object obj = i51Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z4);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z4);
        }
        Object obj2 = i51Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(i51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d && i51Var.G == i51Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        h7 h7Var = new h7(context, 0, f6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d && i51Var.G == i51Var2.G) {
            return true;
        }
        return false;
    }
}
