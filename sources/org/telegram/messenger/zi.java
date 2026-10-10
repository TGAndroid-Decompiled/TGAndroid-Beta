package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zi implements Runnable {
    public final int f20020a = 0;
    public final int f20021b;
    public final boolean f20022c;
    public final boolean d;
    public final Object f20023e;
    public final Serializable f20024f;
    public final Object h;
    public final Object f20025n;
    public final TLObject f20026r;

    public zi(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i10) {
        this.f20023e = sendMessagesHelper;
        this.f20024f = arrayList;
        this.f20022c = z10;
        this.d = z11;
        this.f20026r = message;
        this.h = arrayList2;
        this.f20025n = arrayList3;
        this.f20021b = i10;
    }

    @Override
    public final void run() {
        TLRPC.TL_username tL_username;
        switch (this.f20020a) {
            case 0:
                ((SendMessagesHelper) this.f20023e).lambda$performSendMessageRequest$99((ArrayList) this.f20024f, this.f20022c, this.d, (TLRPC.Message) this.f20026r, (ArrayList) this.h, (ArrayList) this.f20025n, this.f20021b);
                return;
            default:
                org.telegram.ui.ga gaVar = (org.telegram.ui.ga) this.f20023e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f20025n;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.f20026r;
                org.telegram.ui.ra raVar = gaVar.f37995a;
                ArrayList arrayList = raVar.f41370w;
                ArrayList arrayList2 = raVar.v;
                arrayList.remove((String) this.f20024f);
                boolean z10 = ((TLObject) this.h) instanceof TLRPC.TL_boolTrue;
                int i10 = this.f20021b;
                boolean z11 = this.f20022c;
                if (z10) {
                    raVar.i0(i10, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error != null && "USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        tL_username2.active = z11;
                        raVar.i0(i10, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(raVar.getParentActivity(), 0, raVar.getResourceProvider());
                        alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                        alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(gaVar, tL_username2, z12, 4));
                        alertDialog$Builder.o();
                    } else {
                        raVar.j0(tL_username2, z12, true);
                    }
                }
                TLRPC.User user = MessagesController.getInstance(org.telegram.ui.ra.c0(raVar)).getUser(Long.valueOf(raVar.g0()));
                raVar.getMessagesController().updateUsernameActiveness(user, tL_username2.username, tL_username2.active);
                if (raVar.f41371x != 0 && arrayList2 != null) {
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
                        raVar.j0(tL_username, true, false);
                        raVar.getMessagesController().updateUsernameActiveness(user, tL_username.username, tL_username.active);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public zi(org.telegram.ui.ga gaVar, String str, TLObject tLObject, int i10, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.f20023e = gaVar;
        this.f20024f = str;
        this.h = tLObject;
        this.f20021b = i10;
        this.f20022c = z10;
        this.f20025n = tL_error;
        this.f20026r = tL_username;
        this.d = z11;
    }
}
