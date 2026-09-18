package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class nq0 extends vl0 {
    public final Context f26745c;
    public final ArrayList d = new ArrayList();
    public final a0.i e = new a0.i();
    public final vq0 f26746f;

    public nq0(vq0 vq0Var, Context context) {
        this.f26746f = vq0Var;
        this.f26745c = context;
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i14;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.i iVar = this.e;
        iVar.b();
        vq0 vq0Var = this.f26746f;
        i10 = ((org.telegram.ui.ActionBar.f3) vq0Var).currentAccount;
        long j3 = UserConfig.getInstance(i10).clientUserId;
        if (vq0Var.Z) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f18300id = Long.MAX_VALUE;
            arrayList.add(dialog);
            iVar.k(dialog, dialog.f18300id);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) vq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.f3) vq0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            iVar.k(dialog2, dialog2.f18300id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.f3) vq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f18300id;
                if (j10 != j3 && !DialogObject.isEncryptedDialog(j10)) {
                    if (!DialogObject.isUserDialog(dialog3.f18300id)) {
                        i13 = ((org.telegram.ui.ActionBar.f3) vq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f18300id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            iVar.k(dialog3, dialog3.f18300id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        iVar.k(dialog3, dialog3.f18300id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.zn znVar = vq0Var.f29720f0;
        if (znVar != null) {
            int i16 = znVar.f40199a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) hg.k0.g(1, arrayList));
                    }
                }
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            }
        }
        l();
    }

    @Override
    public final int h() {
        int size = this.d.size();
        if (size != 0) {
            return size + 1;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nq0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View lq0Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        vq0 vq0Var = this.f26746f;
        Context context = this.f26745c;
        if (i10 == 0) {
            e6Var = ((org.telegram.ui.ActionBar.f3) vq0Var).resourcesProvider;
            lq0Var = new lq0(this, context, e6Var);
            lq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            lq0Var = new View(context);
            if (vq0Var.f29722h0 && vq0Var.f29729o0[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            lq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(f7)));
        }
        return new s4.c1(lq0Var);
    }
}
