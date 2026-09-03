package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class np extends org.telegram.ui.Components.n80 {
    public final TLRPC.Chat f39420w;
    public final op f39421x;

    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f39421x = opVar;
        this.f39420w = chat2;
    }

    @Override
    public final boolean a(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        rp rpVar = this.f39421x.d;
        if (rpVar.M) {
            return false;
        }
        rpVar.M = true;
        e(new mp(1, this, l80Var), new dg.t0(this, this.f39420w, z4, l80Var, 11));
        return true;
    }

    @Override
    public final boolean b(boolean z4, org.telegram.ui.Components.m80 m80Var) {
        rp rpVar = this.f39421x.d;
        if (rpVar.L) {
            return false;
        }
        rpVar.L = true;
        e(new mp(1, this, m80Var), new dg.t0(this, this.f39420w, z4, m80Var, 10));
        return true;
    }

    public final void e(mp mpVar, Runnable runnable) {
        rp rpVar = this.f39421x.d;
        if (!ChatObject.isChannel(rpVar.f40897f)) {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.f39420w.f20845id, rpVar, new ng.w(24, this, runnable), mpVar);
        } else {
            runnable.run();
        }
    }
}
