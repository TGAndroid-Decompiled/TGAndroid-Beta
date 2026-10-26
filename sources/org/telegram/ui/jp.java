package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class jp extends org.telegram.ui.Components.g90 {
    public final TLRPC.Chat f40712w;
    public final kp f40713x;

    public jp(kp kpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f40713x = kpVar;
        this.f40712w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.e90 e90Var) {
        np npVar = this.f40713x.d;
        if (npVar.P) {
            return false;
        }
        npVar.P = true;
        e(new ed(29, this, e90Var), new bi.s9(this, this.f40712w, z10, e90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.f90 f90Var) {
        np npVar = this.f40713x.d;
        if (npVar.O) {
            return false;
        }
        npVar.O = true;
        e(new ed(29, this, f90Var), new bi.s9(this, this.f40712w, z10, f90Var, 15));
        return true;
    }

    public final void e(ed edVar, Runnable runnable) {
        np npVar = this.f40713x.d;
        if (!ChatObject.isChannel(npVar.f41964f)) {
            npVar.getMessagesController().convertToMegaGroup(npVar.getParentActivity(), this.f40712w.f22027id, npVar, new m4.s0(25, this, runnable), edVar);
        } else {
            runnable.run();
        }
    }
}
