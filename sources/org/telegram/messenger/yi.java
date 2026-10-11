package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yi implements Runnable {
    public final int f19920a = 0;
    public final int f19921b;
    public final boolean f19922c;
    public final boolean d;
    public final Object f19923e;
    public final Serializable f19924f;
    public final Object h;
    public final Object f19925n;
    public final TLObject f19926r;

    public yi(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.f19923e = sendMessagesHelper;
        this.f19924f = arrayList;
        this.f19922c = z10;
        this.d = z11;
        this.f19926r = message;
        this.h = arrayList2;
        this.f19925n = arrayList3;
        this.f19921b = i10;
    }

    @Override
    public final void run() {
        TLRPC.TL_username tL_username;
        switch (this.f19920a) {
            case 0:
                ((SendMessagesHelper) this.f19923e).lambda$performSendMessageRequest$99((ArrayList) this.f19924f, this.f19922c, this.d, (TLRPC.Message) this.f19926r, (ArrayList) this.h, (ArrayList) this.f19925n, this.f19921b);
                return;
            default:
                org.telegram.ui.fa faVar = (org.telegram.ui.fa) this.f19923e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f19925n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f19926r;
                org.telegram.ui.qa qaVar = faVar.f37613a;
                ArrayList arrayList = qaVar.f41086w;
                ArrayList arrayList2 = qaVar.v;
                arrayList.remove((String) this.f19924f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i10 = this.f19921b;
                boolean z11 = this.f19922c;
                if (z10) {
                    qaVar.i0(i10, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        qaVar.i0(i10, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qaVar.getParentActivity(), 0, qaVar.getResourceProvider());
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(faVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        qaVar.j0(tL_username2, z12, true);
                    }
                }
                TLRPC.User user = MessagesController.getInstance(org.telegram.ui.qa.c0(qaVar)).getUser(Long.valueOf(qaVar.g0()));
                qaVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (qaVar.f41087x != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        if (((TLRPC.TL_username) obj).active) {
                            return;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            Object obj2 = arrayList2.get(i12);
                            i12++;
                            tL_username = (TLRPC.TL_username) obj2;
                            if (tL_username.editable) {
                            }
                        } else {
                            tL_username = null;
                        }
                    }
                    if (tL_username != null) {
                        qaVar.j0(tL_username, true, false);
                        qaVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yi(org.telegram.ui.fa faVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f19923e = faVar;
        this.f19924f = str;
        this.h = tLObject;
        this.f19921b = i10;
        this.f19922c = z10;
        this.f19925n = tL_error;
        this.f19926r = tL_username;
        this.d = z11;
    }
}
