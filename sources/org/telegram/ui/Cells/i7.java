package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class i7 extends g61 {
    public static final int f22284a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        h61 K = h61.K(i7.class);
        K.G = audioEntry;
        K.H = callbackReturn;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        j7 j7Var = (j7) view;
        Object obj = h61Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = h61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(h61Var.f27087e, false);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d && h61Var.G == h61Var2.G) {
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
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d && h61Var.G == h61Var2.G) {
            return true;
        }
        return false;
    }
}
