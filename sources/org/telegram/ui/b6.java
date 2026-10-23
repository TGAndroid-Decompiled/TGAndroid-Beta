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
public final class b6 extends pg.b {
    public final d6 d;

    public b6(d6 d6Var) {
        this.d = d6Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f36519c.size();
    }

    @Override
    public final int j(int i10) {
        return ((c6) this.d.f36519c.get(i10)).f44713a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        d6 d6Var = this.d;
        ArrayList arrayList = d6Var.f36519c;
        if (((c6) arrayList.get(i10)).f44713a == 2) {
            org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) b1Var.f46343a;
            CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).f36248c;
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
            boolean z10 = true;
            waVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((c6) arrayList.get(i10 + 1)).f44713a != 2) {
                z10 = false;
            }
            waVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.g(-1, org.telegram.ui.ActionBar.k6.f21404p7);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var2, null);
                        r8Var = r8Var2;
                    }
                } else {
                    r8Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                }
            } else {
                View waVar = new org.telegram.ui.Cells.wa(4, 0, viewGroup.getContext(), null, false, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, waVar, null);
                view = waVar;
            }
            return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
        }
        org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
        r8Var3.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        r8Var3.g(org.telegram.ui.ActionBar.k6.f21516v6, org.telegram.ui.ActionBar.k6.f21499u6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var3, null);
        r8Var = r8Var3;
        view = r8Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
