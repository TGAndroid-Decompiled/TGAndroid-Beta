package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class d7 extends m41 {

    public static final int f24226a = 0;

    static {
        m41.setup(new d7());
    }

    public static n41 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        n41 n41VarJ = n41.J(d7.class);
        n41VarJ.G = audioEntry;
        n41VarJ.H = callbackReturn;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        e7 e7Var = (e7) view;
        Object obj = n41Var.G;
        if (obj instanceof MessageObject) {
            e7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            e7Var.setTag(audioEntry);
            e7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = n41Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            e7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        e7Var.e(n41Var.f30838e, false);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d && n41Var.G == n41Var2.G;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        e7 e7Var = new e7(context, 0, c6Var);
        e7Var.setCheckForButtonPress(true);
        return e7Var;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d && n41Var.G == n41Var2.G;
    }
}
