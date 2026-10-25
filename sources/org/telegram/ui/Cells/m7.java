package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class m7 extends s61 {
    public static final int f24482a = 0;

    static {
        s61.setup(new s61());
    }

    public static t61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        t61 K = t61.K(m7.class);
        K.G = audioEntry;
        K.H = callbackReturn;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        n7 n7Var = (n7) view;
        Object obj = t61Var.G;
        if (obj instanceof MessageObject) {
            n7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            n7Var.setTag(audioEntry);
            n7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = t61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            n7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        n7Var.e(t61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d && t61Var.G == t61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        n7 n7Var = new n7(context, 0, u6Var);
        n7Var.setCheckForButtonPress(true);
        return n7Var;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d && t61Var.G == t61Var2.G) {
            return true;
        }
        return false;
    }
}
