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
public final class xq0 extends im0 {
    public final Context f32467c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final fr0 f32468f;

    public xq0(fr0 fr0Var, Context context) {
        this.f32468f = fr0Var;
        this.f32467c = context;
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45923f != 1) {
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
        fr0 fr0Var = this.f32468f;
        i10 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (fr0Var.f26366a0) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f20283id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f20283id);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f20283id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f20283id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f20283id)) {
                        i13 = ((org.telegram.ui.ActionBar.f3) fr0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f20283id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f20283id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f20283id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.qn qnVar = fr0Var.f26376g0;
        if (qnVar != null) {
            int i16 = qnVar.f40614a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) i2.e.h(1, arrayList));
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
    public final void v(s4.b1 r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xq0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View vq0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        fr0 fr0Var = this.f32468f;
        Context context = this.f32467c;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.f3) fr0Var).resourcesProvider;
            vq0Var = new vq0(this, context, d6Var);
            vq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            vq0Var = new View(context);
            if (fr0Var.f26378i0 && fr0Var.f26385p0[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            vq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(f7)));
        }
        return new s4.b1(vq0Var);
    }
}
