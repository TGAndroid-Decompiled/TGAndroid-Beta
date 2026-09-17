package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hy0 extends org.telegram.ui.Components.ll0 {
    public final Context f34381c;
    public final iy0 d;

    public hy0(iy0 iy0Var, Context context) {
        this.d = iy0Var;
        this.f34381c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
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
        iy0 iy0Var = this.d;
        if (i10 == iy0Var.f34713w) {
            return 4;
        }
        if (i10 == iy0Var.f34710n) {
            return 3;
        }
        if (i10 == iy0Var.f34709f) {
            return 2;
        }
        if (i10 != iy0Var.h && i10 != iy0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        iy0 iy0Var = this.d;
        int i11 = iy0Var.f34715y;
        int i12 = c1Var.f42700f;
        View view = c1Var.f42697a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                        if (i10 == iy0Var.f34710n) {
                            if (i11 == 1) {
                                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", iy0Var.getMessagesController().totalBlockedCount, new Object[0]));
                                return;
                            } else {
                                l4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.j6.f19192v6, org.telegram.ui.ActionBar.j6.f19174u6);
                if (i11 == 1) {
                    x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == iy0Var.h) {
                if (i11 == 1) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                e9Var.setFixedSize(8);
                e9Var.setText(null);
                return;
            } else if (i10 == iy0Var.v) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i11 == 1) {
            long keyAt = iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.f34711r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = iy0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.w1.j(new StringBuilder("+"), user.phone, gf.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != iy0Var.f34712s - 1) {
                        z10 = true;
                    }
                    a5Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = iy0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != iy0Var.f34712s - 1) {
                    z10 = true;
                }
                a5Var.b(chat, null, string, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        FrameLayout e9Var;
        if (i10 != 0) {
            Context context = this.f34381c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(this.f34381c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                        l4Var2.setHeight(43);
                        l4Var = l4Var2;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.f19082p7);
                        l4Var = r8Var;
                    }
                } else {
                    e9Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                e9Var = new org.telegram.ui.Cells.e9(context);
            }
            l4Var = e9Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.f34381c, null, true);
            a5Var.setDelegate(new nl0(this, 11));
            l4Var = a5Var;
        }
        return new s4.c1(l4Var);
    }
}
