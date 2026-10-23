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
public final class ar0 extends lm0 {
    public final Context f24830c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final ir0 f24831f;

    public ar0(ir0 ir0Var, Context context) {
        this.f24831f = ir0Var;
        this.f24830c = context;
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f != 1) {
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
        ir0 ir0Var = this.f24831f;
        i10 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        long j10 = UserConfig.getInstance(i10).clientUserId;
        if (ir0Var.f27406a0) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f20347id = Long.MAX_VALUE;
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f20347id);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            hVar.k(dialog2, dialog2.f20347id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j11 = dialog3.f20347id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (!DialogObject.isUserDialog(dialog3.f20347id)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f20347id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            hVar.k(dialog3, dialog3.f20347id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        hVar.k(dialog3, dialog3.f20347id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.sn snVar = ir0Var.f27418g0;
        if (snVar != null) {
            int i16 = snVar.f41447a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) i2.o1.i(1, arrayList));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ar0.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View yq0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        float f7;
        ir0 ir0Var = this.f24831f;
        Context context = this.f24830c;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            yq0Var = new yq0(this, context, g6Var);
            yq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            yq0Var = new View(context);
            if (ir0Var.f27420i0 && ir0Var.f27427p0[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            yq0Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(f7)));
        }
        return new s4.b1(yq0Var);
    }
}
