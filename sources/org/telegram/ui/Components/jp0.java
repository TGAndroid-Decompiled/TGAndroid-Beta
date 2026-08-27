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

public final class jp0 extends yk0 {

    public final Context f29772c;
    public final ArrayList d = new ArrayList();

    public final a0.h f29773e = new a0.h();

    public final sp0 f29774f;

    public jp0(sp0 sp0Var, Context context) {
        this.f29774f = sp0Var;
        this.f29772c = context;
        E();
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.f29773e;
        hVar.b();
        sp0 sp0Var = this.f29774f;
        long j10 = UserConfig.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).clientUserId;
        if (sp0Var.V) {
            ip0 ip0Var = new ip0();
            ip0Var.f22384id = Long.MAX_VALUE;
            arrayList.add(ip0Var);
            hVar.k(ip0Var, ip0Var.f22384id);
        }
        if (!MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).dialogsForward.isEmpty()) {
            TLRPC.Dialog dialog = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).dialogsForward.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.f22384id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog2 = allDialogs.get(i10);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j11 = dialog2.f22384id;
                if (j11 != j10 && !DialogObject.isEncryptedDialog(j11)) {
                    if (DialogObject.isUserDialog(dialog2.f22384id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.f22384id);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).getChat(Long.valueOf(-dialog2.f22384id));
                        if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            hVar.k(dialog2, dialog2.f22384id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.rn rnVar = sp0Var.f32521b0;
        if (rnVar != null) {
            int i11 = rnVar.f41974a;
            if (i11 == 1) {
                ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList3);
            } else if (i11 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) i0.a.i(1, arrayList));
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Dialog dialog;
        if (o1Var.f5793f == 0) {
            org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) o1Var.f5789a;
            int i11 = i10 - 1;
            if (i11 >= 0) {
                ArrayList arrayList = this.d;
                if (i11 >= arrayList.size()) {
                    dialog = null;
                } else {
                    dialog = (TLRPC.Dialog) arrayList.get(i11);
                }
            } else {
                dialog = null;
            }
            if (dialog == null) {
                return;
            }
            sp0 sp0Var = this.f29774f;
            b7Var.d((TLRPC.TL_forumTopic) sp0Var.R.get(dialog), MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount).isMonoForum(dialog.f22384id), false);
            long j10 = dialog.f22384id;
            b7Var.c(j10, sp0Var.Q.h(j10) >= 0, null);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View hp0Var;
        sp0 sp0Var = this.f29774f;
        Context context = this.f29772c;
        if (i10 != 0) {
            hp0Var = new View(context);
            hp0Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp((!sp0Var.f32524d0 || sp0Var.f32533k0[1] == null) ? 56.0f : 109.0f)));
        } else {
            hp0Var = new hp0(this, context, ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider);
            hp0Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(100.0f)));
        }
        return new lk0(hp0Var);
    }
}
