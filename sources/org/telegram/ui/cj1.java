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
public final class cj1 implements RequestDelegate {
    public final int f36759a;
    public final Object f36760b;
    public final Object f36761c;

    public cj1(int i10, Object obj, Object obj2) {
        this.f36759a = i10;
        this.f36760b = obj;
        this.f36761c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36759a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.i(19, (dj1) this.f36760b, (int[]) this.f36761c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ds0((qg.n2) this.f36760b, tLObject, (qg.l2) this.f36761c, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pi.h(tLObject, (MessagesController) this.f36760b, (tg.w0) this.f36761c, 2));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f36760b;
                et etVar = (et) this.f36761c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20179id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(26, etVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new pi.h((org.telegram.ui.Components.ts0) this.f36760b, tL_error, (org.telegram.ui.ActionBar.m2) this.f36761c, 8));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new pi.h((xh.v3) this.f36760b, tLObject, (TL_stars.getResaleStarGifts) this.f36761c, 11));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new pi.h((yh.g) this.f36760b, tLObject, (Context) this.f36761c, 12));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.i1((yh.s3) this.f36760b, tLObject, (pi.h) this.f36761c, tL_error, 0));
                return;
            case 8:
                yh.s3.g1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f36761c, (yh.s3) this.f36760b);
                return;
            case 9:
                yh.s3.W0((yh.s3) this.f36760b, (org.telegram.ui.ActionBar.a2) this.f36761c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new pi.h((yh.n5) this.f36760b, tLObject, tL_error, (Utilities.Callback) this.f36761c, 21));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pi.h((yh.n5) this.f36760b, tLObject, (Runnable) this.f36761c, 22));
                return;
        }
    }
}
