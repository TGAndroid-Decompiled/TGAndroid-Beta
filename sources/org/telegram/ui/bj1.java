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
    public final int f32195a;
    public final Object f32196b;
    public final Object f32197c;

    public bj1(int i10, Object obj, Object obj2) {
        this.f32195a = i10;
        this.f32196b = obj;
        this.f32197c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32195a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qb1(17, (cj1) this.f32196b, (int[]) this.f32197c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hs0((qg.p2) this.f32196b, tLObject, (qg.n2) this.f32197c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gr0(tLObject, (MessagesController) this.f32196b, (tg.y0) this.f32197c, 25));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f32196b;
                oj0 oj0Var = (oj0) this.f32197c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18268id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(19, oj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new w9.v((org.telegram.ui.Components.or0) this.f32196b, tL_error, (org.telegram.ui.ActionBar.o2) this.f32197c, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new w9.v((xh.u3) this.f32196b, tLObject, (TL_stars.getResaleStarGifts) this.f32197c, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new w9.v((yh.g) this.f32196b, tLObject, (Context) this.f32197c, 5));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new hs0((yh.a4) this.f32196b, tLObject, (w9.v) this.f32197c, tL_error, 29));
                return;
            case 8:
                yh.a4.f1((yh.a4) this.f32196b, (TL_stars.InputSavedStarGift) this.f32197c, tLObject, tL_error);
                return;
            case 9:
                yh.a4.V0((yh.a4) this.f32196b, (org.telegram.ui.ActionBar.c2) this.f32197c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new w9.v((yh.v5) this.f32196b, tLObject, tL_error, (Utilities.Callback) this.f32197c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w9.v((yh.v5) this.f32196b, tLObject, (Runnable) this.f32197c, 15));
                return;
        }
    }
}
