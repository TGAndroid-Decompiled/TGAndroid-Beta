package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class li1 implements RequestDelegate {
    public final int f38759a;
    public final Object f38760b;
    public final Object f38761c;

    public li1(int i10, Object obj, Object obj2) {
        this.f38759a = i10;
        this.f38760b = obj;
        this.f38761c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mg1(4, (mi1) this.f38760b, (int[]) this.f38761c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.n1) this.f38760b, (String) this.f38761c, tLObject, 12));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.z2) this.f38760b, tLObject, (MessagesController) this.f38761c, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((qh.x7) this.f38760b, tLObject, (MessagesController) this.f38761c, 18));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((boolean[]) this.f38760b, tLObject, (sh.j1) this.f38761c, 22));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((sh.d3) this.f38760b, tLObject, (org.telegram.ui.ActionBar.d2) this.f38761c, 25));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yx0(21, (uf.c) this.f38760b, tL_error, tLObject, (String) this.f38761c));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.o71((uf.u0) this.f38760b, (String) this.f38761c, tLObject, 28));
                return;
            case 8:
                uf.l1 l1Var = (uf.l1) this.f38760b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f38761c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new uf.h1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 1));
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.t) this.f38760b, tLObject, (TL_account.TL_businessChatLink) this.f38761c, 4));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new vf.d0(0, (vf.f0) this.f38760b, (org.telegram.ui.Components.jm) this.f38761c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uf.h1((vf.s1) this.f38760b, tLObject, (SharedPreferences) this.f38761c, 9));
                return;
        }
    }
}
