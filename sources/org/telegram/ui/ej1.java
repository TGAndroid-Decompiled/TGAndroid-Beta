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
public final class ej1 implements RequestDelegate {
    public final int f37322a;
    public final Object f37323b;
    public final Object f37324c;

    public ej1(int i10, Object obj, Object obj2) {
        this.f37322a = i10;
        this.f37323b = obj;
        this.f37324c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37322a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii1(20, (fj1) this.f37323b, (int[]) this.f37324c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rr0((qg.o2) this.f37323b, tLObject, (qg.m2) this.f37324c, tL_error, 25));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new tg.q(tLObject, (MessagesController) this.f37323b, (tg.x0) this.f37324c, 1));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f37323b;
                ft ftVar = (ft) this.f37324c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20189id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(24, ftVar, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q((org.telegram.ui.Components.ss0) this.f37323b, tL_error, (org.telegram.ui.ActionBar.n2) this.f37324c, 7));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q((xh.v3) this.f37323b, tLObject, (TL_stars.getResaleStarGifts) this.f37324c, 10));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q((yh.g) this.f37323b, tLObject, (Context) this.f37324c, 11));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.i1((yh.s3) this.f37323b, tLObject, (tg.q) this.f37324c, tL_error, 0));
                return;
            case 8:
                yh.s3.g1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.f37324c, (yh.s3) this.f37323b);
                return;
            case 9:
                yh.s3.W0((yh.s3) this.f37323b, (org.telegram.ui.ActionBar.b2) this.f37324c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.q((yh.m5) this.f37323b, tLObject, tL_error, (Utilities.Callback) this.f37324c, 20));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.q((yh.m5) this.f37323b, tLObject, (Runnable) this.f37324c, 21));
                return;
        }
    }
}
