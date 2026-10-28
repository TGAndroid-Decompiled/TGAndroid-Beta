package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class lp extends org.telegram.ui.Components.h90 {
    public final TLRPC.Chat f41227w;
    public final mp f41228x;

    public lp(mp mpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f41228x = mpVar;
        this.f41227w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.f90 f90Var) {
        pp ppVar = this.f41228x.d;
        if (ppVar.P) {
            return false;
        }
        ppVar.P = true;
        e(new ed(29, this, f90Var), new bi.s9(this, this.f41227w, z10, f90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.g90 g90Var) {
        pp ppVar = this.f41228x.d;
        if (ppVar.O) {
            return false;
        }
        ppVar.O = true;
        e(new ed(29, this, g90Var), new bi.s9(this, this.f41227w, z10, g90Var, 15));
        return true;
    }

    public final void e(ed edVar, Runnable runnable) {
        pp ppVar = this.f41228x.d;
        if (!ChatObject.isChannel(ppVar.f42467f)) {
            ppVar.getMessagesController().convertToMegaGroup(ppVar.getParentActivity(), this.f41227w.f22028id, ppVar, new m4.s0(25, this, runnable), edVar);
        } else {
            runnable.run();
        }
    }
}
