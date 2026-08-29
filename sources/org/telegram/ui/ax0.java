package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ax0 extends org.telegram.ui.Components.il0 {
    public final Context f36617c;
    public final bx0 d;

    public ax0(bx0 bx0Var, Context context) {
        this.d = bx0Var;
        this.f36617c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f36934e;
    }

    @Override
    public final int j(int i10) {
        bx0 bx0Var = this.d;
        if (i10 == bx0Var.f36939w) {
            return 4;
        }
        if (i10 == bx0Var.f36936n) {
            return 3;
        }
        if (i10 == bx0Var.f36935f) {
            return 2;
        }
        if (i10 != bx0Var.h && i10 != bx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        String string;
        String string2;
        bx0 bx0Var = this.d;
        int i11 = bx0Var.f36941y;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                        if (i10 == bx0Var.f36936n) {
                            if (i11 == 1) {
                                k4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", bx0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                k4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.w4 w4Var = (org.telegram.ui.Cells.w4) view;
                w4Var.a(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
                if (i11 == 1) {
                    w4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == bx0Var.h) {
                if (i11 == 1) {
                    y8Var.setFixedSize(0);
                    y8Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            } else if (i10 == bx0Var.v) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
        if (i11 == 1) {
            long keyAt = bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.f36937r);
            z4Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = bx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.x3.k(new StringBuilder("+"), user.phone, qe.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != bx0Var.f36938s - 1) {
                        z10 = true;
                    }
                    z4Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = bx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != bx0Var.f36938s - 1) {
                    z10 = true;
                }
                z4Var.b(chat, null, string, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k4 k4Var;
        FrameLayout y8Var;
        if (i10 != 0) {
            Context context = this.f36617c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(this.f36617c, org.telegram.ui.ActionBar.g6.L6, 21, 11, false, null);
                        k4Var2.setHeight(43);
                        k4Var = k4Var2;
                    } else {
                        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        m8Var.e(-1, org.telegram.ui.ActionBar.g6.f23279p7);
                        k4Var = m8Var;
                    }
                } else {
                    y8Var = new org.telegram.ui.Cells.w4(context);
                }
            } else {
                y8Var = new org.telegram.ui.Cells.y8(context);
            }
            k4Var = y8Var;
        } else {
            org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(7, 6, this.f36617c, null, true);
            z4Var.setDelegate(new zk0(this, 10));
            k4Var = z4Var;
        }
        return new f2.n1(k4Var);
    }
}
