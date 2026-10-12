package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class lj1 implements RequestDelegate {
    public final int f38032a;
    public final Object f38033b;
    public final Object f38034c;

    public lj1(int i10, Object obj, Object obj2) {
        this.f38032a = i10;
        this.f38033b = obj;
        this.f38034c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38032a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t8(1, (mj1) this.f38033b, (int[]) this.f38034c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ss0((rg.p2) this.f38033b, tLObject, (rg.n2) this.f38034c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.webrtc.i(tLObject, (MessagesController) this.f38033b, (ug.x0) this.f38034c, 9));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f38033b;
                mt mtVar = (mt) this.f38034c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19363id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new s9.b(12, mtVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.webrtc.i((org.telegram.ui.Components.ns0) this.f38033b, tL_error, (org.telegram.ui.ActionBar.m2) this.f38034c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.webrtc.i((yh.t3) this.f38033b, tLObject, (TL_stars.getResaleStarGifts) this.f38034c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.webrtc.i((zh.g) this.f38033b, tLObject, (Context) this.f38034c, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ss0((zh.r3) this.f38033b, tLObject, (org.webrtc.i) this.f38034c, tL_error, 29));
                return;
            case 8:
                zh.r3.g1((zh.r3) this.f38033b, (TL_stars.InputSavedStarGift) this.f38034c, tLObject, tL_error);
                return;
            case 9:
                zh.r3.W0((zh.r3) this.f38033b, (org.telegram.ui.ActionBar.a2) this.f38034c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.webrtc.i((zh.n5) this.f38033b, tLObject, tL_error, (Utilities.Callback) this.f38034c, 28));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.webrtc.i((zh.n5) this.f38033b, tLObject, (Runnable) this.f38034c, 29));
                return;
        }
    }
}
