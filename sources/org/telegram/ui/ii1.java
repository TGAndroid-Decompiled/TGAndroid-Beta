package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ii1 implements RequestDelegate {
    public final int f35128a;
    public final Object f35129b;
    public final Object f35130c;

    public ii1(int i10, Object obj, Object obj2) {
        this.f35128a = i10;
        this.f35129b = obj;
        this.f35130c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35128a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kg1(5, (ji1) this.f35129b, (int[]) this.f35130c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.n1) this.f35129b, (String) this.f35130c, tLObject, 12));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z2) this.f35129b, tLObject, (MessagesController) this.f35130c, 15));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((ph.z7) this.f35129b, tLObject, (MessagesController) this.f35130c, 18));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((boolean[]) this.f35129b, tLObject, (rh.k1) this.f35130c, 22));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((rh.e3) this.f35129b, tLObject, (org.telegram.ui.ActionBar.d2) this.f35130c, 25));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new wx0(20, (tf.c) this.f35129b, tL_error, tLObject, (String) this.f35130c));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.m71((tf.u0) this.f35129b, (String) this.f35130c, tLObject, 28));
                return;
            case 8:
                tf.l1 l1Var = (tf.l1) this.f35129b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f35130c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new tf.h1(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 1));
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new tf.h1((uf.t) this.f35129b, tLObject, (TL_account.TL_businessChatLink) this.f35130c, 4));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ph.f6(28, (uf.e0) this.f35129b, (org.telegram.ui.Components.hm) this.f35130c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tf.h1((uf.s1) this.f35129b, tLObject, (SharedPreferences) this.f35130c, 9));
                return;
        }
    }
}
