package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class m7 extends t61 {
    public static final int f24486a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        u61 K = u61.K(m7.class);
        K.G = audioEntry;
        K.H = callbackReturn;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        n7 n7Var = (n7) view;
        Object obj = u61Var.G;
        if (obj instanceof MessageObject) {
            n7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            n7Var.setTag(audioEntry);
            n7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = u61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            n7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        n7Var.e(u61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d && u61Var.G == u61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        n7 n7Var = new n7(context, 0, u6Var);
        n7Var.setCheckForButtonPress(true);
        return n7Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d && u61Var.G == u61Var2.G) {
            return true;
        }
        return false;
    }
}
