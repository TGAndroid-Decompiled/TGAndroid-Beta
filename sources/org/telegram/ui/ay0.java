package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ay0 extends org.telegram.ui.Components.yl0 {
    public final Context f34939c;
    public final by0 d;

    public ay0(by0 by0Var, Context context) {
        this.d = by0Var;
        this.f34939c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f46528f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f35208e;
    }

    @Override
    public final int j(int i10) {
        by0 by0Var = this.d;
        if (i10 == by0Var.f35213w) {
            return 4;
        }
        if (i10 == by0Var.f35210n) {
            return 3;
        }
        if (i10 == by0Var.f35209f) {
            return 2;
        }
        if (i10 != by0Var.h && i10 != by0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        by0 by0Var = this.d;
        int i11 = by0Var.f35215y;
        int i12 = c1Var.f46528f;
        View view = c1Var.f46524a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                        if (i10 == by0Var.f35210n) {
                            if (i11 == 1) {
                                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", by0Var.getMessagesController().totalBlockedCount, new Object[0]));
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
                y4Var.a(org.telegram.ui.ActionBar.i6.f21153v6, org.telegram.ui.ActionBar.i6.f21135u6);
                if (i11 == 1) {
                    y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == by0Var.h) {
                if (i11 == 1) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                e9Var.setFixedSize(8);
                e9Var.setText(null);
                return;
            } else if (i10 == by0Var.v) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i11 == 1) {
            long keyAt = by0Var.getMessagesController().blockePeers.keyAt(i10 - by0Var.f35211r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = by0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.ok.h(new StringBuilder("+"), user.phone, gf.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != by0Var.f35212s - 1) {
                        z10 = true;
                    }
                    b5Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = by0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != by0Var.f35212s - 1) {
                    z10 = true;
                }
                b5Var.b(chat, null, string, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m4 m4Var;
        FrameLayout e9Var;
        if (i10 != 0) {
            Context context = this.f34939c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(this.f34939c, org.telegram.ui.ActionBar.i6.L6, 21, 11, false, null);
                        m4Var2.setHeight(43);
                        m4Var = m4Var2;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var.e(-1, org.telegram.ui.ActionBar.i6.f21040p7);
                        m4Var = r8Var;
                    }
                } else {
                    e9Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                e9Var = new org.telegram.ui.Cells.e9(context);
            }
            m4Var = e9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.f34939c, null, true);
            b5Var.setDelegate(new jl0(this, 11));
            m4Var = b5Var;
        }
        return new s4.c1(m4Var);
    }
}
