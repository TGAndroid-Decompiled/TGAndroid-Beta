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
public final class fj1 implements RequestDelegate {
    public final int f37805a;
    public final Object f37806b;
    public final Object f37807c;

    public fj1(int i10, Object obj, Object obj2) {
        this.f37805a = i10;
        this.f37806b = obj;
        this.f37807c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37805a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s(17, (gj1) this.f37806b, (int[]) this.f37807c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gs0((qg.o2) this.f37806b, tLObject, (qg.m2) this.f37807c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pi.h(tLObject, (MessagesController) this.f37806b, (tg.w0) this.f37807c, 6));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f37806b;
                jt jtVar = (jt) this.f37807c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19949id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(26, jtVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new pi.h((org.telegram.ui.Components.xs0) this.f37806b, tL_error, (org.telegram.ui.ActionBar.m2) this.f37807c, 12));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new pi.h((xh.u3) this.f37806b, tLObject, (TL_stars.getResaleStarGifts) this.f37807c, 15));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new pi.h((yh.g) this.f37806b, tLObject, (Context) this.f37807c, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.i1((yh.s3) this.f37806b, tLObject, (pi.h) this.f37807c, tL_error, 0));
                return;
            case 8:
                yh.s3.g1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f37807c, (yh.s3) this.f37806b);
                return;
            case 9:
                yh.s3.W0((yh.s3) this.f37806b, (org.telegram.ui.ActionBar.a2) this.f37807c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new pi.h((yh.n5) this.f37806b, tLObject, tL_error, (Utilities.Callback) this.f37807c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pi.h((yh.n5) this.f37806b, tLObject, (Runnable) this.f37807c, 26));
                return;
        }
    }
}
