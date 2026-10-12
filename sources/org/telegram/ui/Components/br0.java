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
public final class br0 extends lm0 {
    public final Context f23839c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final jr0 f23840f;

    public br0(jr0 jr0Var, Context context) {
        this.f23840f = jr0Var;
        this.f23839c = context;
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f != 1) {
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
        jr0 jr0Var = this.f23840f;
        i10 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (jr0Var.Z) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f19220id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f19220id);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f19220id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f19220id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f19220id)) {
                        i13 = ((org.telegram.ui.ActionBar.e3) jr0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f19220id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f19220id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f19220id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.fo foVar = jr0Var.f26465f0;
        if (foVar != null) {
            int i16 = foVar.f35870a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) i2.d.g(1, arrayList));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.br0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View zq0Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        float f7;
        jr0 jr0Var = this.f23840f;
        Context context = this.f23839c;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) jr0Var).resourcesProvider;
            zq0Var = new zq0(this, context, c6Var);
            zq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            zq0Var = new View(context);
            if (jr0Var.f26467h0 && jr0Var.f26474o0[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            zq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(f7)));
        }
        return new s4.b1(zq0Var);
    }
}
