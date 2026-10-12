package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class jy0 implements GenericProvider, org.telegram.ui.Components.cm0, f70 {
    public final my0 f37458a;

    public jy0(my0 my0Var) {
        this.f37458a = my0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        my0 my0Var = this.f37458a;
        if (i10 >= my0Var.f38378r && i10 < my0Var.f38379s) {
            if (my0Var.f38382y == 1) {
                my0Var.U(Long.valueOf(my0Var.getMessagesController().blockePeers.keyAt(i10 - my0Var.f38378r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f37458a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public Object provide(Object obj) {
        my0 my0Var = this.f37458a;
        my0Var.getClass();
        if (((Integer) obj).intValue() != my0Var.f38380w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false)));
    }
}
