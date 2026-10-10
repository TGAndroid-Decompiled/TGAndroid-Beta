package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class i7 extends p61 {
    public static final int f22279a = 0;

    static {
        p61.setup(new p61());
    }

    public static q61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        q61 J = q61.J(i7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        j7 j7Var = (j7) view;
        Object obj = q61Var.G;
        if (obj instanceof MessageObject) {
            j7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            j7Var.setTag(audioEntry);
            j7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = q61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            j7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        j7Var.e(q61Var.f30057e, false);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d && q61Var.G == q61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        j7 j7Var = new j7(context, 0, e6Var);
        j7Var.setCheckForButtonPress(true);
        return j7Var;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d && q61Var.G == q61Var2.G) {
            return true;
        }
        return false;
    }
}
