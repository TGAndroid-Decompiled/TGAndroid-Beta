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
public final class up0 extends il0 {
    public final Context f33288c;
    public final ArrayList d = new ArrayList();
    public final a0.h f33289e = new a0.h();
    public final dq0 f33290f;

    public up0(dq0 dq0Var, Context context) {
        this.f33290f = dq0Var;
        this.f33288c = context;
        E();
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 1) {
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
        a0.h hVar = this.f33289e;
        hVar.b();
        dq0 dq0Var = this.f33290f;
        i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (dq0Var.V) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f22396id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f22396id);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f22396id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f22396id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f22396id)) {
                        i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f22396id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f22396id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f22396id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.tn tnVar = dq0Var.f27829b0;
        if (tnVar != null) {
            int i16 = tnVar.f42736a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) j7.l1.i(1, arrayList));
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
    public final void v(f2.n1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.up0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View sp0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        dq0 dq0Var = this.f33290f;
        Context context = this.f33288c;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            sp0Var = new sp0(this, context, c6Var);
            sp0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            sp0Var = new View(context);
            if (dq0Var.f27832d0 && dq0Var.f27841k0[1] != null) {
                f9 = 109.0f;
            } else {
                f9 = 56.0f;
            }
            sp0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(f9)));
        }
        return new f2.n1(sp0Var);
    }
}
