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
public final class kq0 extends ul0 {
    public final Context f24797c;
    public final ArrayList d = new ArrayList();
    public final a0.i e = new a0.i();
    public final sq0 f24798f;

    public kq0(sq0 sq0Var, Context context) {
        this.f24798f = sq0Var;
        this.f24797c = context;
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f != 1) {
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
        sq0 sq0Var = this.f24798f;
        i10 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
        long j3 = UserConfig.getInstance(i10).clientUserId;
        if (sq0Var.Z) {
            TLRPC.Dialog dialog = new TLRPC.Dialog();
            dialog.f17199id = Long.MAX_VALUE;
            arrayList.add(dialog);
            iVar.k(dialog, dialog.f17199id);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
        if (!MessagesController.getInstance(i11).dialogsForward.isEmpty()) {
            i14 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
            TLRPC.Dialog dialog2 = MessagesController.getInstance(i14).dialogsForward.get(0);
            arrayList.add(dialog2);
            iVar.k(dialog2, dialog2.f17199id);
        }
        ArrayList arrayList2 = new ArrayList();
        i12 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i12).getAllDialogs();
        for (int i15 = 0; i15 < allDialogs.size(); i15++) {
            TLRPC.Dialog dialog3 = allDialogs.get(i15);
            if (dialog3 instanceof TLRPC.TL_dialog) {
                long j10 = dialog3.f17199id;
                if (j10 != j3 && !DialogObject.isEncryptedDialog(j10)) {
                    if (!DialogObject.isUserDialog(dialog3.f17199id)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) sq0Var).currentAccount;
                        TLRPC.Chat chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialog3.f17199id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog3.folder_id == 1) {
                                arrayList2.add(dialog3);
                            } else {
                                arrayList.add(dialog3);
                            }
                            iVar.k(dialog3, dialog3.f17199id);
                        }
                    } else {
                        if (dialog3.folder_id == 1) {
                            arrayList2.add(dialog3);
                        } else {
                            arrayList.add(dialog3);
                        }
                        iVar.k(dialog3, dialog3.f17199id);
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.eo eoVar = sq0Var.f27174f0;
        if (eoVar != null) {
            int i16 = eoVar.f32254a;
            if (i16 != 1) {
                if (i16 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) hc.b.i(1, arrayList));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kq0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View iq0Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        sq0 sq0Var = this.f24798f;
        Context context = this.f24797c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.h3) sq0Var).resourcesProvider;
            iq0Var = new iq0(this, context, f6Var);
            iq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            iq0Var = new View(context);
            if (sq0Var.f27176h0 && sq0Var.f27183o0[1] != null) {
                f7 = 109.0f;
            } else {
                f7 = 56.0f;
            }
            iq0Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(f7)));
        }
        return new s4.c1(iq0Var);
    }
}
