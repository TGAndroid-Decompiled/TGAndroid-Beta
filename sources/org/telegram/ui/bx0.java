package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class bx0 extends org.telegram.ui.Components.yk0 {

    public final Context f36896c;
    public final cx0 d;

    public bx0(cx0 cx0Var, Context context) {
        this.d = cx0Var;
        this.f36896c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override
    public final int h() {
        return this.d.f37183e;
    }

    @Override
    public final int j(int i10) {
        cx0 cx0Var = this.d;
        if (i10 == cx0Var.f37188w) {
            return 4;
        }
        if (i10 == cx0Var.f37185n) {
            return 3;
        }
        if (i10 == cx0Var.f37184f) {
            return 2;
        }
        return (i10 == cx0Var.h || i10 == cx0Var.v) ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        String string2;
        cx0 cx0Var = this.d;
        int i11 = cx0Var.f37190y;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 == 0) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i11 != 1) {
                throw null;
            }
            long jKeyAt = cx0Var.getMessagesController().blockePeers.keyAt(i10 - cx0Var.f37186r);
            y4Var.setTag(Long.valueOf(jKeyAt));
            if (jKeyAt <= 0) {
                TLRPC.Chat chat = cx0Var.getMessagesController().getChat(Long.valueOf(-jKeyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    if (i13 != 0) {
                        string = LocaleController.formatPluralString("Members", i13, new Object[0]);
                    } else if (chat.has_geo) {
                        string = LocaleController.getString(R.string.MegaLocation);
                    } else {
                        string = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic);
                    }
                    y4Var.b(chat, null, string, i10 != cx0Var.f37187s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = cx0Var.getMessagesController().getUser(Long.valueOf(jKeyAt));
            if (user != null) {
                if (user.bot) {
                    string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    if (str == null || str.length() == 0) {
                        string2 = LocaleController.getString(R.string.NumberUnknown);
                    } else {
                        string2 = org.telegram.messenger.y1.k(new StringBuilder("+"), user.phone, oe.b.c());
                    }
                }
                y4Var.b(user, null, string2, i10 != cx0Var.f37187s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 != cx0Var.h) {
                if (i10 == cx0Var.v) {
                    x8Var.setFixedSize(12);
                    x8Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                x8Var.setFixedSize(0);
                x8Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                x8Var.setFixedSize(8);
                x8Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.v4 v4Var = (org.telegram.ui.Cells.v4) view;
            v4Var.a(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
            if (i11 == 1) {
                v4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        if (i10 == cx0Var.f37185n) {
            if (i11 == 1) {
                j4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", cx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                j4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View x8Var;
        if (i10 != 0) {
            Context context = this.f36896c;
            if (i10 == 1) {
                x8Var = new org.telegram.ui.Cells.x8(context);
            } else if (i10 == 2) {
                x8Var = new org.telegram.ui.Cells.v4(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(this.f36896c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                j4Var.setHeight(43);
                view = j4Var;
            } else {
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                l8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                l8Var.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                view = l8Var;
            }
            view = x8Var;
        } else {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(7, 6, this.f36896c, null, true);
            y4Var.setDelegate(new dl0(this, 10));
            view = y4Var;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
