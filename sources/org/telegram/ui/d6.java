package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 extends bg.c {
    public final f6 d;

    public d6(f6 f6Var) {
        this.d = f6Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f33961c.size();
    }

    @Override
    public final int j(int i10) {
        return ((e6) this.d.f33961c.get(i10)).f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        f6 f6Var = this.d;
        ArrayList arrayList = f6Var.f33961c;
        if (((e6) arrayList.get(i10)).f1830a == 2) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) l1Var.f5774a;
            CacheByChatsController.KeepMediaException keepMediaException = ((e6) arrayList.get(i10)).f33616c;
            TLObject userOrChat = f6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                if (user.self) {
                    str = LocaleController.getString(R.string.SavedMessages);
                } else {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
            } else if (userOrChat instanceof TLRPC.Chat) {
                str = ((TLRPC.Chat) userOrChat).title;
            } else {
                str = null;
            }
            boolean z4 = true;
            uaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((e6) arrayList.get(i10 + 1)).f1830a != 2) {
                z4 = false;
            }
            uaVar.d(userOrChat, str, keepMediaString, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        n8Var2.e(-1, org.telegram.ui.ActionBar.j6.f20097p7);
                        n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        n8Var = n8Var2;
                    }
                } else {
                    n8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
                }
            } else {
                View uaVar = new org.telegram.ui.Cells.ua(4, 0, viewGroup.getContext(), null, false, false);
                uaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                view = uaVar;
            }
            return ai.n(view, view, -1, -2);
        }
        org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
        n8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        n8Var3.e(org.telegram.ui.ActionBar.j6.f20200v6, org.telegram.ui.ActionBar.j6.f20182u6);
        n8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        n8Var = n8Var3;
        view = n8Var;
        return ai.n(view, view, -1, -2);
    }
}
