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
    public final int f37802a;
    public final Object f37803b;
    public final Object f37804c;

    public fj1(int i10, Object obj, Object obj2) {
        this.f37802a = i10;
        this.f37803b = obj;
        this.f37804c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37802a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.s(18, (gj1) this.f37803b, (int[]) this.f37804c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gs0((qg.o2) this.f37803b, tLObject, (qg.m2) this.f37804c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pi.i(tLObject, (MessagesController) this.f37803b, (tg.x0) this.f37804c, 5));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f37803b;
                jt jtVar = (jt) this.f37804c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f19950id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(28, jtVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new pi.i((org.telegram.ui.Components.xs0) this.f37803b, tL_error, (org.telegram.ui.ActionBar.m2) this.f37804c, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new pi.i((xh.u3) this.f37803b, tLObject, (TL_stars.getResaleStarGifts) this.f37804c, 14));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new pi.i((yh.g) this.f37803b, tLObject, (Context) this.f37804c, 15));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.i1((yh.s3) this.f37803b, tLObject, (pi.i) this.f37804c, tL_error, 0));
                return;
            case 8:
                yh.s3.g1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f37804c, (yh.s3) this.f37803b);
                return;
            case 9:
                yh.s3.W0((yh.s3) this.f37803b, (org.telegram.ui.ActionBar.a2) this.f37804c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new pi.i((yh.n5) this.f37803b, tLObject, tL_error, (Utilities.Callback) this.f37804c, 24));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pi.i((yh.n5) this.f37803b, tLObject, (Runnable) this.f37804c, 25));
                return;
        }
    }
}
