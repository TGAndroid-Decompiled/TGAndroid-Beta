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
public final class c6 extends pg.b {
    public final e6 d;

    public c6(e6 e6Var) {
        this.d = e6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36406c.size();
    }

    @Override
    public final int j(int i10) {
        return ((d6) this.d.f36406c.get(i10)).f44314a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        e6 e6Var = this.d;
        ArrayList arrayList = e6Var.f36406c;
        if (((d6) arrayList.get(i10)).f44314a == 2) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) b1Var.f45938a;
            CacheByChatsController.KeepMediaException keepMediaException = ((d6) arrayList.get(i10)).f36079c;
            TLObject userOrChat = e6Var.getMessagesController().getUserOrChat(keepMediaException.dialogId);
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
            vaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((d6) arrayList.get(i10 + 1)).f44314a != 2) {
                z10 = false;
            }
            vaVar.e(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q8 q8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                        q8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        q8Var2.e(-1, org.telegram.ui.ActionBar.h6.f21207p7);
                        q8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                        q8Var = q8Var2;
                    }
                } else {
                    q8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.t0) null);
                }
            } else {
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                view = vaVar;
            }
            return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
        }
        org.telegram.ui.Cells.q8 q8Var3 = new org.telegram.ui.Cells.q8(viewGroup.getContext());
        q8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        q8Var3.e(org.telegram.ui.ActionBar.h6.f21319v6, org.telegram.ui.ActionBar.h6.f21302u6);
        q8Var3.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
        q8Var = q8Var3;
        view = q8Var;
        return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
    }
}
