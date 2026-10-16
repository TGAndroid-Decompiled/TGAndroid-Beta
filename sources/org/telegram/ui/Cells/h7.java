package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class h7 extends l61 {
    public static final int f20983a = 0;

    static {
        l61.setup(new l61());
    }

    public static m61 a(MediaController.AudioEntry audioEntry, Utilities.CallbackReturn callbackReturn) {
        m61 J = m61.J(h7.class);
        J.G = audioEntry;
        J.H = callbackReturn;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        i7 i7Var = (i7) view;
        Object obj = m61Var.G;
        if (obj instanceof MessageObject) {
            i7Var.f((MessageObject) obj, z10);
        } else if (obj instanceof MediaController.AudioEntry) {
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) obj;
            i7Var.setTag(audioEntry);
            i7Var.f(audioEntry.messageObject, z10);
        }
        Object obj2 = m61Var.H;
        if (obj2 instanceof Utilities.CallbackReturn) {
            i7Var.setNeedPlayMessageListener((Utilities.CallbackReturn) obj2);
        }
        i7Var.e(m61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d && m61Var.G == m61Var2.G) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        i7 i7Var = new i7(context, 0, c6Var);
        i7Var.setCheckForButtonPress(true);
        return i7Var;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d && m61Var.G == m61Var2.G) {
            return true;
        }
        return false;
    }
}
