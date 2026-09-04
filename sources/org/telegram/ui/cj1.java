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
    public final int f35163a;
    public final Object f35164b;
    public final Object f35165c;

    public cj1(int i10, Object obj, Object obj2) {
        this.f35163a = i10;
        this.f35164b = obj;
        this.f35165c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35163a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w81(23, (dj1) this.f35164b, (int[]) this.f35165c));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new es0((rg.o2) this.f35164b, tLObject, (rg.m2) this.f35165c, tL_error, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.er0(tLObject, (MessagesController) this.f35164b, (ug.y0) this.f35165c, 26));
                return;
            case 3:
                MessagesController messagesController = (MessagesController) this.f35164b;
                oj0 oj0Var = (oj0) this.f35165c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.f20016id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ug.r(1, oj0Var, arrayList));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new wh.n((org.telegram.ui.Components.nr0) this.f35164b, tL_error, (org.telegram.ui.ActionBar.n2) this.f35165c, 1));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new wh.n((yh.t3) this.f35164b, tLObject, (TL_stars.getResaleStarGifts) this.f35165c, 4));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new wh.n((zh.g) this.f35164b, tLObject, (Context) this.f35165c, 5));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new es0((zh.w3) this.f35164b, tLObject, (wh.n) this.f35165c, tL_error, 29));
                return;
            case 8:
                zh.w3.f1((zh.w3) this.f35164b, (TL_stars.InputSavedStarGift) this.f35165c, tLObject, tL_error);
                return;
            case 9:
                zh.w3.V0((zh.w3) this.f35164b, (org.telegram.ui.ActionBar.b2) this.f35165c, tLObject, tL_error);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new wh.n((zh.s5) this.f35164b, tLObject, tL_error, (Utilities.Callback) this.f35165c, 14));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh.n((zh.s5) this.f35164b, tLObject, (Runnable) this.f35165c, 15));
                return;
        }
    }
}
