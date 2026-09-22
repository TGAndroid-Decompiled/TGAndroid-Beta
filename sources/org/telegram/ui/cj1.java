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
    public final int f32812a;
    public final Object f32813b;
    public final Object f32814c;

    public cj1(int i10, Object obj, Object obj2) {
        this.f32812a = i10;
        this.f32813b = obj;
        this.f32814c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32812a) {
            case 0:
                AndroidUtilities.runOnUIThread(new pb1(17, (dj1) this.f32813b, (int[]) this.f32814c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new es0((qg.p2) this.f32813b, tLObject, (qg.n2) this.f32814c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(tLObject, (MessagesController) this.f32813b, (tg.y0) this.f32814c, 25));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f32813b;
                mj0 mj0Var = (mj0) this.f32814c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18256id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(19, mj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new w9.v((org.telegram.ui.Components.nr0) this.f32813b, tL_error, (org.telegram.ui.ActionBar.n2) this.f32814c, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new w9.v((xh.u3) this.f32813b, tLObject, (TL_stars.getResaleStarGifts) this.f32814c, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new w9.v((yh.g) this.f32813b, tLObject, (Context) this.f32814c, 5));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new es0((yh.z3) this.f32813b, tLObject, (w9.v) this.f32814c, tL_error, 29));
                return;
            case 8:
                yh.z3.f1((yh.z3) this.f32813b, (TL_stars.InputSavedStarGift) this.f32814c, tLObject, tL_error);
                return;
            case 9:
                yh.z3.V0((yh.z3) this.f32813b, (org.telegram.ui.ActionBar.b2) this.f32814c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new w9.v((yh.u5) this.f32813b, tLObject, tL_error, (Utilities.Callback) this.f32814c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w9.v((yh.u5) this.f32813b, tLObject, (Runnable) this.f32814c, 15));
                return;
        }
    }
}
