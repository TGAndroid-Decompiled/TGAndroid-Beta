package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class g7 extends e61 {
    public static final int f22297a = 0;

    static {
        e61.setup(new e61());
    }

    public static f61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        f61 J = f61.J(g7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        h7 h7Var = (h7) view;
        Object obj = f61Var.G;
        if (obj instanceof MessageObject) {
            h7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            h7Var.setTag(audioEntry);
            h7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = f61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            h7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        h7Var.e(f61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d && f61Var.G == f61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        h7 h7Var = new h7(context, 0, d6Var);
        h7Var.setCheckForButtonPress(true);
        return h7Var;
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d && f61Var.G == f61Var2.G) {
            return true;
        }
        return false;
    }
}
