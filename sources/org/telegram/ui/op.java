package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class op extends org.telegram.ui.Components.m80 {
    public final TLRPC.Chat f36858w;
    public final pp f36859x;

    public op(pp ppVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36859x = ppVar;
        this.f36858w = chat2;
    }

    @Override
    public final boolean a(boolean z4, org.telegram.ui.Components.k80 k80Var) {
        sp spVar = this.f36859x.d;
        if (spVar.M) {
            return false;
        }
        spVar.M = true;
        e(new np(2, this, k80Var), new cg.u0(this, this.f36858w, z4, k80Var, 11));
        return true;
    }

    @Override
    public final boolean b(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        sp spVar = this.f36859x.d;
        if (spVar.L) {
            return false;
        }
        spVar.L = true;
        e(new np(2, this, l80Var), new cg.u0(this, this.f36858w, z4, l80Var, 10));
        return true;
    }

    public final void e(np npVar, Runnable runnable) {
        sp spVar = this.f36859x.d;
        if (!ChatObject.isChannel(spVar.f38284f)) {
            spVar.getMessagesController().convertToMegaGroup(spVar.getParentActivity(), this.f36858w.f19159id, spVar, new mg.w(24, this, runnable), npVar);
        } else {
            runnable.run();
        }
    }
}
