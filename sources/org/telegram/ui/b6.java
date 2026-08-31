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
public final class b6 extends cg.c {
    public final d6 d;

    public b6(d6 d6Var) {
        this.d = d6Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36009c.size();
    }

    @Override
    public final int j(int i10) {
        return ((c6) this.d.f36009c.get(i10)).f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        d6 d6Var = this.d;
        ArrayList arrayList = d6Var.f36009c;
        if (((c6) arrayList.get(i10)).f2505a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) m1Var.f5875a;
            CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).f35683c;
            TLObject userOrChat = d6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
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
            vaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((c6) arrayList.get(i10 + 1)).f2505a != 2) {
                z4 = false;
            }
            vaVar.d(userOrChat, str, keepMediaString, z4);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.o8 o8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                        o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        o8Var2.e(-1, org.telegram.ui.ActionBar.k6.f21876p7);
                        o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                        o8Var = o8Var2;
                    }
                } else {
                    o8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                }
            } else {
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                view = vaVar;
            }
            return yh.o(view, view, -1, -2);
        }
        org.telegram.ui.Cells.o8 o8Var3 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
        o8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        o8Var3.e(org.telegram.ui.ActionBar.k6.f21979v6, org.telegram.ui.ActionBar.k6.f21961u6);
        o8Var3.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        o8Var = o8Var3;
        view = o8Var;
        return yh.o(view, view, -1, -2);
    }
}
