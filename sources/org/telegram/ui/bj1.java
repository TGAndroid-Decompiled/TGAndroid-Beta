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
public final class bj1 implements RequestDelegate {
    public final int f32491a;
    public final Object f32492b;
    public final Object f32493c;

    public bj1(int i10, Object obj, Object obj2) {
        this.f32491a = i10;
        this.f32492b = obj;
        this.f32493c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32491a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w81(23, (cj1) this.f32492b, (int[]) this.f32493c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fs0((qg.n2) this.f32492b, tLObject, (qg.l2) this.f32493c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.en0(tLObject, (MessagesController) this.f32492b, (tg.x0) this.f32493c, 28));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f32492b;
                pj0 pj0Var = (pj0) this.f32493c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18490id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(25, pj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.bs0) this.f32492b, tL_error, (org.telegram.ui.ActionBar.n2) this.f32493c, 4));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.v3) this.f32492b, tLObject, (TL_stars.getResaleStarGifts) this.f32493c, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.f32492b, tLObject, (Context) this.f32493c, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fs0((yh.y3) this.f32492b, tLObject, (tg.r) this.f32493c, tL_error, 29));
                return;
            case 8:
                yh.y3.f1((yh.y3) this.f32492b, (TL_stars.InputSavedStarGift) this.f32493c, tLObject, tL_error);
                return;
            case 9:
                yh.y3.V0((yh.y3) this.f32492b, (org.telegram.ui.ActionBar.b2) this.f32493c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.u5) this.f32492b, tLObject, tL_error, (Utilities.Callback) this.f32493c, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.u5) this.f32492b, tLObject, (Runnable) this.f32493c, 18));
                return;
        }
    }
}
