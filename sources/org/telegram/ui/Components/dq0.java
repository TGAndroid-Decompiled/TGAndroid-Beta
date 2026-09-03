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
public final class dq0 extends ql0 {
    public final Context f24339c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final lq0 f24340f;

    public dq0(lq0 lq0Var, Context context) {
        this.f24340f = lq0Var;
        this.f24339c = context;
        E();
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 1) {
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
        a0.h hVar = this.e;
        hVar.b();
        lq0 lq0Var = this.f24340f;
        i10 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (lq0Var.W) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f19163id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f19163id);
        }
        i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f19163id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f19163id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f19163id)) {
                        i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f19163id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f19163id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f19163id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.zn znVar = lq0Var.f26836c0;
        if (znVar != null) {
            int i16 = znVar.f40510a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) kf.k0.i(1, arrayList));
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
    public final void v(f2.l1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dq0.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View bq0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        lq0 lq0Var = this.f24340f;
        Context context = this.f24339c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            bq0Var = new bq0(this, context, f6Var);
            bq0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            bq0Var = new View(context);
            if (lq0Var.f26838e0 && lq0Var.f26846l0[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            bq0Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(f10)));
        }
        return new f2.l1(bq0Var);
    }
}
