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
public final class dq0 extends rl0 {
    public final Context f26351c;
    public final ArrayList d = new ArrayList();
    public final a0.h f26352e = new a0.h();
    public final lq0 f26353f;

    public dq0(lq0 lq0Var, Context context) {
        this.f26353f = lq0Var;
        this.f26351c = context;
        E();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f != 1) {
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
        a0.h hVar = this.f26352e;
        hVar.b();
        lq0 lq0Var = this.f26353f;
        i10 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (lq0Var.W) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f20849id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f20849id);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f20849id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f20849id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f20849id)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f20849id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f20849id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f20849id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.xn xnVar = lq0Var.f28829c0;
        if (xnVar != null) {
            int i16 = xnVar.f43090a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) l.d.i(1, arrayList));
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
    public final void v(f2.m1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View bq0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        lq0 lq0Var = this.f26353f;
        Context context = this.f26351c;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) lq0Var).resourcesProvider;
            bq0Var = new bq0(this, context, g6Var);
            bq0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            bq0Var = new View(context);
            if (lq0Var.f28832e0 && lq0Var.f28840l0[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            bq0Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(f10)));
        }
        return new f2.m1(bq0Var);
    }
}
