package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bx0 extends org.telegram.ui.Components.vk0 {
    public final Context f37012c;
    public final cx0 d;

    public bx0(cx0 cx0Var, Context context) {
        this.d = cx0Var;
        this.f37012c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 2 && i9 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.f37342e;
    }

    @Override
    public final int j(int i9) {
        cx0 cx0Var = this.d;
        if (i9 == cx0Var.f37347w) {
            return 4;
        }
        if (i9 == cx0Var.f37344n) {
            return 3;
        }
        if (i9 == cx0Var.f37343f) {
            return 2;
        }
        if (i9 != cx0Var.h && i9 != cx0Var.v) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String string;
        String string2;
        cx0 cx0Var = this.d;
        int i10 = cx0Var.f37349y;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                        if (i9 == cx0Var.f37344n) {
                            if (i10 == 1) {
                                m4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", cx0Var.getMessagesController().totalBlockedCount, new Object[0]));
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
                y4Var.a(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
                if (i10 == 1) {
                    y4Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                    return;
                } else {
                    LocaleController.getString(R.string.PrivacyAddAnException);
                    throw null;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == cx0Var.h) {
                if (i10 == 1) {
                    b9Var.setFixedSize(0);
                    b9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                    return;
                }
                b9Var.setFixedSize(8);
                b9Var.setText(null);
                return;
            } else if (i9 == cx0Var.v) {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        if (i10 == 1) {
            long keyAt = cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.f37345r);
            b5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User user = cx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                    } else {
                        String str = user.phone;
                        if (str != null && str.length() != 0) {
                            string2 = org.telegram.messenger.ll.g(new StringBuilder("+"), user.phone, ne.b.c());
                        } else {
                            string2 = LocaleController.getString(R.string.NumberUnknown);
                        }
                    }
                    if (i9 != cx0Var.f37346s - 1) {
                        z10 = true;
                    }
                    b5Var.b(user, null, string2, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = cx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
            if (chat != null) {
                int i12 = chat.participants_count;
                if (i12 != 0) {
                    string = LocaleController.formatPluralString("Members", i12, new Object[0]);
                } else if (chat.has_geo) {
                    string = LocaleController.getString(R.string.MegaLocation);
                } else if (!ChatObject.isPublic(chat)) {
                    string = LocaleController.getString(R.string.MegaPrivate);
                } else {
                    string = LocaleController.getString(R.string.MegaPublic);
                }
                if (i9 != cx0Var.f37346s - 1) {
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
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.m4 m4Var;
        FrameLayout b9Var;
        if (i9 != 0) {
            Context context = this.f37012c;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(this.f37012c, org.telegram.ui.ActionBar.f6.L6, 21, 11, false, null);
                        m4Var2.setHeight(43);
                        m4Var = m4Var2;
                    } else {
                        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        p8Var.e(-1, org.telegram.ui.ActionBar.f6.f23212p7);
                        m4Var = p8Var;
                    }
                } else {
                    b9Var = new org.telegram.ui.Cells.y4(context);
                }
            } else {
                b9Var = new org.telegram.ui.Cells.b9(context);
            }
            m4Var = b9Var;
        } else {
            org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(7, 6, this.f37012c, null, true);
            b5Var.setDelegate(new dl0(this, 10));
            m4Var = b5Var;
        }
        return new f2.q1(m4Var);
    }
}
