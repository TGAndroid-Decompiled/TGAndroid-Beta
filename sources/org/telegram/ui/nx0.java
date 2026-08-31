package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class nx0 extends org.telegram.ui.Components.sl0 {
    public final Context f39541c;
    public final ox0 d;

    public nx0(ox0 ox0Var, Context context) {
        this.d = ox0Var;
        this.f39541c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f39858e;
    }

    @Override
    public final int j(int i10) {
        ox0 ox0Var = this.d;
        if (i10 == ox0Var.f39863w) {
            return 4;
        }
        if (i10 == ox0Var.f39860n) {
            return 3;
        }
        if (i10 == ox0Var.f39859f) {
            return 2;
        }
        if (i10 != ox0Var.h && i10 != ox0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        String string;
        String string2;
        ox0 ox0Var = this.d;
        int i11 = ox0Var.f39865y;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z4 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                        if (i10 == ox0Var.f39860n) {
                            if (i11 == 1) {
                                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", ox0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                m4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
                y4Var.a(org.telegram.ui.ActionBar.k6.f21979v6, org.telegram.ui.ActionBar.k6.f21961u6);
                if (i11 == 1) {
                    y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == ox0Var.h) {
                if (i11 == 1) {
                    a9Var.setFixedSize(0);
                    a9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                a9Var.setFixedSize(8);
                a9Var.setText(null);
                return;
            } else if (i10 == ox0Var.v) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i11 == 1) {
            long keyAt = ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.f39861r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = ox0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.y3.j(new StringBuilder("+"), user.phone, se.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != ox0Var.f39862s - 1) {
                        z4 = true;
                    }
                    b5Var.b(user, null, string2, z4);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = ox0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
            if (chat != null) {
                int i13 = chat.participants_count;
                if (i13 != 0) {
                    string = LocaleController.formatPluralString("Members", i13, new Object[0]);
                } else if (chat.has_geo) {
                    string = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    string = LocaleController.getString(R.string.MegaPrivate);
                } else {
                    string = LocaleController.getString(R.string.MegaPublic);
                }
                if (i10 != ox0Var.f39862s - 1) {
                    z4 = true;
                }
                b5Var.b(chat, null, string, z4);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        FrameLayout a9Var;
        if (i10 != 0) {
            Context context = this.f39541c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(this.f39541c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                        m4Var2.setHeight(43);
                        m4Var = m4Var2;
                    } else {
                        org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                        o8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21876p7);
                        m4Var = o8Var;
                    }
                } else {
                    a9Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                a9Var = new org.telegram.ui.Cells.a9(context);
            }
            m4Var = a9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.f39541c, null, true);
            b5Var.setDelegate(new kl0(this, 10));
            m4Var = b5Var;
        }
        return new f2.m1(m4Var);
    }
}
