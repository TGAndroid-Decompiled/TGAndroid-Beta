package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lx0 extends org.telegram.ui.Components.hm0 {
    public final Context f38988c;
    public final mx0 d;

    public lx0(mx0 mx0Var, Context context) {
        this.d = mx0Var;
        this.f38988c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
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
        mx0 mx0Var = this.d;
        if (i10 == mx0Var.f39293w) {
            return 4;
        }
        if (i10 == mx0Var.f39290n) {
            return 3;
        }
        if (i10 == mx0Var.f39289f) {
            return 2;
        }
        if (i10 != mx0Var.h && i10 != mx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String string;
        String string2;
        mx0 mx0Var = this.d;
        int i11 = mx0Var.f39295y;
        int i12 = b1Var.f45961f;
        View view = b1Var.f45958a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                        if (i10 == mx0Var.f39290n) {
                            if (i11 == 1) {
                                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", mx0Var.getMessagesController().totalBlockedCount, new Object[0]));
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
                x4Var.a(org.telegram.ui.ActionBar.h6.f21326v6, org.telegram.ui.ActionBar.h6.f21309u6);
                if (i11 == 1) {
                    x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == mx0Var.h) {
                if (i11 == 1) {
                    d9Var.setFixedSize(0);
                    d9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                d9Var.setFixedSize(8);
                d9Var.setText(null);
                return;
            } else if (i10 == mx0Var.v) {
                d9Var.setFixedSize(12);
                d9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i11 == 1) {
            long keyAt = mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.f39291r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = mx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.kk.g(new StringBuilder("+"), user.phone, jf.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i10 != mx0Var.f39292s - 1) {
                        z10 = true;
                    }
                    a5Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = mx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
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
                if (i10 != mx0Var.f39292s - 1) {
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l4 l4Var;
        FrameLayout d9Var;
        if (i10 != 0) {
            Context context = this.f38988c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(this.f38988c, org.telegram.ui.ActionBar.h6.L6, 21, 11, false, null);
                        l4Var2.setHeight(43);
                        l4Var = l4Var2;
                    } else {
                        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(viewGroup.getContext());
                        q8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        q8Var.e(-1, org.telegram.ui.ActionBar.h6.f21214p7);
                        l4Var = q8Var;
                    }
                } else {
                    d9Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                d9Var = new org.telegram.ui.Cells.d9(context);
            }
            l4Var = d9Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.f38988c, null, true);
            a5Var.setDelegate(new rp0(this, 9));
            l4Var = a5Var;
        }
        return new s4.b1(l4Var);
    }
}
