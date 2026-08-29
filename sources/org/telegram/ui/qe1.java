package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class qe1 implements RequestDelegate {
    public final int f41711a;
    public final Object f41712b;
    public final Object f41713c;

    public qe1(int i10, Object obj, Object obj2) {
        this.f41711a = i10;
        this.f41713c = obj;
        this.f41712b = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41711a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sc1((ve1) this.f41713c, (String) this.f41712b, tLObject, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new lx0((cg1) this.f41713c, tLObject, (String) this.f41712b, tL_error, 13));
                return;
            case 2:
                cg1 cg1Var = (cg1) this.f41713c;
                byte[] bArr = (byte[]) this.f41712b;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new wf1(cg1Var, bArr, 1));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new yf1(cg1Var, tL_error, 3));
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new t31(26, (wh1) this.f41713c, (int[]) this.f41712b));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((boolean[]) this.f41713c, tLObject, (ph.j1) this.f41712b, 20));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((ph.d3) this.f41713c, tLObject, (org.telegram.ui.ActionBar.c2) this.f41712b, 23));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new lx0((rf.c) this.f41713c, tL_error, (String) this.f41712b, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0((rf.v0) this.f41713c, (String) this.f41712b, tLObject, 26));
                return;
            case 8:
                rf.l1 l1Var = (rf.l1) this.f41713c;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f41712b;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw0(l1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 29));
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((sf.u) this.f41713c), tLObject, (Object) ((TL_account.TL_businessChatLink) this.f41712b), 2));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(27, (sf.f0) this.f41713c, (org.telegram.ui.Components.i8) this.f41712b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((sf.v1) this.f41713c), tLObject, (Object) ((SharedPreferences) this.f41712b), 7));
                return;
        }
    }
}
