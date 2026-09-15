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
    public final int f32210a;
    public final Object f32211b;
    public final Object f32212c;

    public bj1(int i10, Object obj, Object obj2) {
        this.f32210a = i10;
        this.f32211b = obj;
        this.f32212c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f32210a) {
            case 0:
                AndroidUtilities.runOnUIThread(new nb1(17, (cj1) this.f32211b, (int[]) this.f32212c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fs0((qg.p2) this.f32211b, tLObject, (qg.n2) this.f32212c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(tLObject, (MessagesController) this.f32211b, (tg.y0) this.f32212c, 25));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f32211b;
                mj0 mj0Var = (mj0) this.f32212c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f18259id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p2.b(19, mj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new w9.v((org.telegram.ui.Components.nr0) this.f32211b, tL_error, (org.telegram.ui.ActionBar.n2) this.f32212c, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new w9.v((xh.u3) this.f32211b, tLObject, (TL_stars.getResaleStarGifts) this.f32212c, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new w9.v((yh.g) this.f32211b, tLObject, (Context) this.f32212c, 5));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fs0((yh.a4) this.f32211b, tLObject, (w9.v) this.f32212c, tL_error, 29));
                return;
            case 8:
                yh.a4.f1((yh.a4) this.f32211b, (TL_stars.InputSavedStarGift) this.f32212c, tLObject, tL_error);
                return;
            case 9:
                yh.a4.V0((yh.a4) this.f32211b, (org.telegram.ui.ActionBar.b2) this.f32212c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new w9.v((yh.v5) this.f32211b, tLObject, tL_error, (Utilities.Callback) this.f32212c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w9.v((yh.v5) this.f32211b, tLObject, (Runnable) this.f32212c, 15));
                return;
        }
    }
}
