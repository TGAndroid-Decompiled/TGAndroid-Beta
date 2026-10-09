package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class i7 extends o61 {
    public static final int f22275a = 0;

    static {
        o61.setup(new o61());
    }

    public static p61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        p61 J = p61.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        j7 j7Var = (j7) view;
        Object obj = p61Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = p61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(p61Var.f29728e, false);
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d && p61Var.G == p61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        j7 j7Var = new j7(context, 0, e6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d && p61Var.G == p61Var2.G) {
            return true;
        }
        return false;
    }
}
