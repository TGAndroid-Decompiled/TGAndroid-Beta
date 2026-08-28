package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class dp extends org.telegram.ui.Components.t70 {
    public final TLRPC.Chat f37575w;
    public final ep f37576x;

    public dp(ep epVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37576x = epVar;
        this.f37575w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        hp hpVar = this.f37576x.d;
        if (hpVar.L) {
            return false;
        }
        hpVar.L = true;
        e(new rd(27, this, r70Var), new bg.d(this, this.f37575w, z10, r70Var, 13));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.s70 s70Var) {
        hp hpVar = this.f37576x.d;
        if (hpVar.K) {
            return false;
        }
        hpVar.K = true;
        e(new rd(27, this, s70Var), new bg.d(this, this.f37575w, z10, s70Var, 12));
        return true;
    }

    public final void e(rd rdVar, Runnable runnable) {
        hp hpVar = this.f37576x.d;
        if (!ChatObject.isChannel(hpVar.f38885f)) {
            hpVar.getMessagesController().convertToMegaGroup(hpVar.getParentActivity(), this.f37575w.f22380id, hpVar, new ih.v3(25, this, runnable), rdVar);
        } else {
            runnable.run();
        }
    }
}
