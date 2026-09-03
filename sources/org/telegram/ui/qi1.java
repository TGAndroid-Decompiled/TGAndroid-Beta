package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qi1 implements RequestDelegate {
    public final int f37422a;
    public final Object f37423b;
    public final Object f37424c;

    public qi1(int i10, Object obj, Object obj2) {
        this.f37422a = i10;
        this.f37423b = obj;
        this.f37424c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37422a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sg1(4, (ri1) this.f37423b, (int[]) this.f37424c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.m1) this.f37423b, (String) this.f37424c, tLObject, 11));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z2) this.f37423b, tLObject, (MessagesController) this.f37424c, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.y7) this.f37423b, tLObject, (MessagesController) this.f37424c, 17));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((boolean[]) this.f37423b, tLObject, (rh.j1) this.f37424c, 21));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((rh.d3) this.f37423b, tLObject, (org.telegram.ui.ActionBar.d2) this.f37424c, 24));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dy0((Object) ((tf.c) this.f37423b), (Object) tL_error, (String) this.f37424c, (Object) tLObject, 21));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((tf.u0) this.f37423b, (String) this.f37424c, tLObject, 27));
                return;
            case 8:
                tf.l1 l1Var = (tf.l1) this.f37423b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f37424c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new tf.k1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 0));
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new tf.k1((uf.t) this.f37423b, tLObject, (TL_account.TL_businessChatLink) this.f37424c, 3));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new uf.d0(0, (uf.f0) this.f37423b, (org.telegram.ui.Components.dw) this.f37424c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tf.k1((uf.s1) this.f37423b, tLObject, (SharedPreferences) this.f37424c, 8));
                return;
        }
    }
}
