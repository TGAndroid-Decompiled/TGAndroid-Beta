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
public final class aj1 implements RequestDelegate {
    public final int f32082a;
    public final Object f32083b;
    public final Object f32084c;

    public aj1(int i10, Object obj, Object obj2) {
        this.f32082a = i10;
        this.f32083b = obj;
        this.f32084c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32082a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x81(21, (bj1) this.f32083b, (int[]) this.f32084c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fs0((qg.m2) this.f32083b, tLObject, (qg.k2) this.f32084c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dn0(tLObject, (MessagesController) this.f32083b, (tg.x0) this.f32084c, 28));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f32083b;
                nj0 nj0Var = (nj0) this.f32084c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18443id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.p1(23, nj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.zr0) this.f32083b, tL_error, (org.telegram.ui.ActionBar.n2) this.f32084c, 4));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.v3) this.f32083b, tLObject, (TL_stars.getResaleStarGifts) this.f32084c, 7));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.f32083b, tLObject, (Context) this.f32084c, 8));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fs0((yh.y3) this.f32083b, tLObject, (tg.r) this.f32084c, tL_error, 29));
                return;
            case 8:
                yh.y3.f1((yh.y3) this.f32083b, (TL_stars.InputSavedStarGift) this.f32084c, tLObject, tL_error);
                return;
            case 9:
                yh.y3.V0((yh.y3) this.f32083b, (org.telegram.ui.ActionBar.b2) this.f32084c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.t5) this.f32083b, tLObject, tL_error, (Utilities.Callback) this.f32084c, 17));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.t5) this.f32083b, tLObject, (Runnable) this.f32084c, 18));
                return;
        }
    }
}
