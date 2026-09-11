package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gy0 extends org.telegram.ui.Components.kl0 {
    public final Context f36811c;
    public final hy0 d;

    public gy0(hy0 hy0Var, Context context) {
        this.d = hy0Var;
        this.f36811c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 0 && i10 != 2 && i10 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f37133e;
    }

    @Override
    public final int j(int i10) {
        hy0 hy0Var = this.d;
        if (i10 == hy0Var.f37138w) {
            return 4;
        }
        if (i10 == hy0Var.f37135n) {
            return 3;
        }
        if (i10 == hy0Var.f37134f) {
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
        int i11 = hy0Var.f37140y;
        int i12 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                        if (i10 == hy0Var.f37135n) {
                            if (i11 == 1) {
                                l4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", hy0Var.getMessagesController().totalBlockedCount, new Object[0]));
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
                x4Var.a(org.telegram.ui.ActionBar.j6.f20990v6, org.telegram.ui.ActionBar.j6.f20972u6);
                if (i11 == 1) {
                    x4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == hy0Var.h) {
                if (i11 == 1) {
                    e9Var.setFixedSize(0);
                    e9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                e9Var.setFixedSize(8);
                e9Var.setText(null);
                return;
            } else if (i10 == hy0Var.v) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i11 == 1) {
            long keyAt = hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f37136r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = hy0Var.getMessagesController().getUser(Long.valueOf(keyAt));
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
                    if (i10 != hy0Var.f37137s - 1) {
                        z10 = true;
                    }
                    a5Var.b(user, null, string2, z10);
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
                if (i10 != hy0Var.f37137s - 1) {
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
            Context context = this.f36811c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(this.f36811c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                        l4Var2.setHeight(43);
                        l4Var = l4Var2;
                    } else {
                        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.f20880p7);
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
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(7, 6, this.f36811c, null, true);
            a5Var.setDelegate(new vl0(this, 10));
            l4Var = a5Var;
        }
        return new s4.c1(l4Var);
    }
}
