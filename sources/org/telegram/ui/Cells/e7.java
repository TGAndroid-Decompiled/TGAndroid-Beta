package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class e7 extends v41 {
    public static final int f24299a = 0;

    static {
        v41.setup(new v41());
    }

    public static w41 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        w41 J = w41.J(e7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        f7 f7Var = (f7) view;
        Object obj = w41Var.G;
        if (obj instanceof MessageObject) {
            f7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            f7Var.setTag(audioEntry);
            f7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = w41Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            f7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        f7Var.e(w41Var.f34294e, false);
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d && w41Var.G == w41Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        f7 f7Var = new f7(context, 0, c6Var);
        f7Var.setCheckForButtonPress(true);
        return f7Var;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d && w41Var.G == w41Var2.G) {
            return true;
        }
        return false;
    }
}
