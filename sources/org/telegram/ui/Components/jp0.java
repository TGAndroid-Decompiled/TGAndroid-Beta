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
public final class jp0 extends vk0 {
    public final Context f29816c;
    public final ArrayList d = new ArrayList();
    public final a0.h f29817e = new a0.h();
    public final rp0 f29818f;

    public jp0(rp0 rp0Var, Context context) {
        this.f29818f = rp0Var;
        this.f29816c = context;
        E();
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 1) {
            return true;
        }
        return false;
    }

    public final void E() {
        int i9;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i13;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f29817e;
        hVar.b();
        rp0 rp0Var = this.f29818f;
        i9 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        long j10 = UserConfig.getInstance(i9).clientUserId;
        if (rp0Var.V) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f22384id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f22384id);
        }
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        if (!MessagesController.getInstance(i10).dialogsForward.isEmpty()) {
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i13).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f22384id);
        }
        ArrayList arrayList2 = new ArrayList();
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i11).getAllDialogs();
        for (int i14 = 0; i14 < allDialogs.size(); i14++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i14);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f22384id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f22384id)) {
                        i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-dialog3.f22384id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f22384id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f22384id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.qn qnVar = rp0Var.f32243b0;
        if (qnVar != null) {
            int i15 = qnVar.f41839a;
            if (i15 != 1) {
                if (i15 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) j3.r0.j(1, arrayList));
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
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View hp0Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        rp0 rp0Var = this.f29818f;
        Context context = this.f29816c;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            hp0Var = new hp0(this, context, b6Var);
            hp0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
        } else {
            hp0Var = new View(context);
            if (rp0Var.f32246d0 && rp0Var.f32255k0[1] != null) {
                f10 = 109.0f;
            } else {
                f10 = 56.0f;
            }
            hp0Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(f10)));
        }
        return new f2.q1(hp0Var);
    }
}
