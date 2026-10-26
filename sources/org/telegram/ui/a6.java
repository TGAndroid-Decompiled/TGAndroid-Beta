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
public final class a6 extends qg.b {
    public final c6 d;

    public a6(c6 c6Var) {
        this.d = c6Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f38275c.size();
    }

    @Override
    public final int j(int i10) {
        return ((b6) this.d.f38275c.get(i10)).f47040a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        c6 c6Var = this.d;
        ArrayList arrayList = c6Var.f38275c;
        if (((b6) arrayList.get(i10)).f47040a == 2) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) e1Var.f47738a;
            CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).f37981c;
            TLObject userOrChat = c6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
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
            boolean z10 = true;
            abVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((b6) arrayList.get(i10 + 1)).f47040a != 2) {
                z10 = false;
            }
            abVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                        v8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        v8Var2.g(-1, org.telegram.ui.ActionBar.y6.f23581p7);
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var2, null);
                        v8Var = v8Var2;
                    }
                } else {
                    v8Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                }
            } else {
                View abVar = new org.telegram.ui.Cells.ab(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, abVar, null);
                view = abVar;
            }
            return ic.a.n(view, view, -1, -2);
        }
        org.telegram.ui.Cells.v8 v8Var3 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
        v8Var3.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        v8Var3.g(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var3, null);
        v8Var = v8Var3;
        view = v8Var;
        return ic.a.n(view, view, -1, -2);
    }
}
