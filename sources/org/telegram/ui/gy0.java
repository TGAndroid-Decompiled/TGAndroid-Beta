package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gy0 extends org.telegram.ui.Components.ul0 {
    public final Context f34004c;
    public final hy0 d;

    public gy0(hy0 hy0Var, Context context) {
        this.d = hy0Var;
        this.f34004c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42977f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.e;
    }

    @Override
    public final int j(int i10) {
        hy0 hy0Var = this.d;
        if (i10 == hy0Var.f34318w) {
            return 4;
        }
        if (i10 == hy0Var.f34315n) {
            return 3;
        }
        if (i10 == hy0Var.f34314f) {
            return 2;
        }
        if (i10 != hy0Var.h && i10 != hy0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        hy0 hy0Var = this.d;
        int i11 = hy0Var.f34320y;
        int i12 = c1Var.f42977f;
        View view = c1Var.f42974a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                        if (i10 == hy0Var.f34315n) {
                            if (i11 == 1) {
                                n4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", hy0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                n4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
                z4Var.a(org.telegram.ui.ActionBar.j6.f19425v6, org.telegram.ui.ActionBar.j6.f19407u6);
                if (i11 == 1) {
                    z4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == hy0Var.h) {
                if (i11 == 1) {
                    f9Var.setFixedSize(0);
                    f9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                f9Var.setFixedSize(8);
                f9Var.setText(null);
                return;
            } else if (i10 == hy0Var.v) {
                f9Var.setFixedSize(12);
                f9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
        if (i11 == 1) {
            long keyAt = hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f34316r);
            c5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = hy0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.rk.h(new StringBuilder("+"), user.phone, gf.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != hy0Var.f34317s - 1) {
                        z10 = true;
                    }
                    c5Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = hy0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != hy0Var.f34317s - 1) {
                    z10 = true;
                }
                c5Var.b(chat, null, string, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n4 n4Var;
        FrameLayout f9Var;
        if (i10 != 0) {
            Context context = this.f34004c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this.f34004c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                        n4Var2.setHeight(43);
                        n4Var = n4Var2;
                    } else {
                        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                        s8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        s8Var.e(-1, org.telegram.ui.ActionBar.j6.f19315p7);
                        n4Var = s8Var;
                    }
                } else {
                    f9Var = new org.telegram.ui.Cells.z4(context);
                }
            } else {
                f9Var = new org.telegram.ui.Cells.f9(context);
            }
            n4Var = f9Var;
        } else {
            org.telegram.ui.Cells.c5 c5Var = new org.telegram.ui.Cells.c5(7, 6, this.f34004c, null, true);
            c5Var.setDelegate(new ol0(this, 11));
            n4Var = c5Var;
        }
        return new s4.c1(n4Var);
    }
}
