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
public final class a6 extends og.b {
    public final c6 d;

    public a6(c6 c6Var) {
        this.d = c6Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.f32529c.size();
    }

    @Override
    public final int j(int i10) {
        return ((b6) this.d.f32529c.get(i10)).f15754a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        c6 c6Var = this.d;
        ArrayList arrayList = c6Var.f32529c;
        if (((b6) arrayList.get(i10)).f15754a == 2) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) c1Var.f43005a;
            CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).f32244c;
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
            zaVar.setSelfAsSavedMessages(true);
            String keepMediaString = CacheByChatsController.getKeepMediaString(keepMediaException.keepMedia);
            if (i10 != arrayList.size() - 1 && ((b6) arrayList.get(i10 + 1)).f15754a != 2) {
                z10 = false;
            }
            zaVar.d(userOrChat, str, keepMediaString, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.e(-1, org.telegram.ui.ActionBar.i6.f19278p7);
                        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                        r8Var = r8Var2;
                    }
                } else {
                    r8Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                }
            } else {
                View zaVar = new org.telegram.ui.Cells.za(4, 0, viewGroup.getContext(), null, false, false);
                zaVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                view = zaVar;
            }
            return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
        org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
        r8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
        r8Var3.e(org.telegram.ui.ActionBar.i6.f19390v6, org.telegram.ui.ActionBar.i6.f19372u6);
        r8Var3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        r8Var = r8Var3;
        view = r8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
