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
public final class kj1 implements RequestDelegate {
    public final int f37444a;
    public final Object f37445b;
    public final Object f37446c;

    public kj1(int i10, Object obj, Object obj2) {
        this.f37444a = i10;
        this.f37445b = obj;
        this.f37446c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37444a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wg1(26, (lj1) this.f37445b, (int[]) this.f37446c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yw0((Object) ((rg.p2) this.f37445b), tLObject, (Object) ((rg.n2) this.f37446c), tL_error, 23));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pi.g(tLObject, (MessagesController) this.f37445b, (ug.x0) this.f37446c, 9));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f37445b;
                mt mtVar = (mt) this.f37446c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19063id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new s9.b(12, mtVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new pi.g((org.telegram.ui.Components.ns0) this.f37445b, tL_error, (org.telegram.ui.ActionBar.m2) this.f37446c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new pi.g((yh.t3) this.f37445b, tLObject, (TL_stars.getResaleStarGifts) this.f37446c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new pi.g((zh.g) this.f37445b, tLObject, (Context) this.f37446c, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yw0((Object) ((zh.r3) this.f37445b), tLObject, (Object) ((pi.g) this.f37446c), tL_error, 29));
                return;
            case 8:
                zh.r3.g1((zh.r3) this.f37445b, (TL_stars.InputSavedStarGift) this.f37446c, tLObject, tL_error);
                return;
            case 9:
                zh.r3.W0((zh.r3) this.f37445b, (org.telegram.ui.ActionBar.a2) this.f37446c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new pi.g((zh.n5) this.f37445b, tLObject, tL_error, (Utilities.Callback) this.f37446c, 28));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pi.g((zh.n5) this.f37445b, tLObject, (Runnable) this.f37446c, 29));
                return;
        }
    }
}
