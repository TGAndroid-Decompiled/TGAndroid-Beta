package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ht0 extends org.telegram.ui.Components.sj0 {
    public final Context f45986c;
    public final it0 d;

    public ht0(it0 it0Var, Context context) {
        this.d = it0Var;
        this.f45986c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 2 && i3 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f46413e;
    }

    @Override
    public final int d(int i3) {
        it0 it0Var = this.d;
        if (i3 == it0Var.f46419x) {
            return 4;
        }
        if (i3 == it0Var.f46415n) {
            return 3;
        }
        if (i3 == it0Var.f46414f) {
            return 2;
        }
        if (i3 != it0Var.h && i3 != it0Var.f46418w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String M0;
        String M02;
        it0 it0Var = this.d;
        int i10 = it0Var.E;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                        if (i3 == it0Var.f46415n) {
                            if (i10 == 1) {
                                n4Var.setText(org.telegram.messenger.bd.G(it0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                n4Var.setText(org.telegram.messenger.bd.M0(2131746848, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                if (i10 == 1) {
                    x4Var.b(2131232099, 5, org.telegram.messenger.bd.M0(2131753692, null), false);
                    return;
                } else {
                    org.telegram.messenger.bd.M0(2131746876, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == it0Var.h) {
                if (i10 == 1) {
                    y8Var.setFixedSize(0);
                    y8Var.setText(org.telegram.messenger.bd.M0(2131753677, null));
                    return;
                }
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            } else if (i3 == it0Var.f46418w) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i10 == 1) {
            long keyAt = it0Var.getMessagesController().H0.keyAt(i3 - it0Var.f46416r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User a22 = it0Var.getMessagesController().a2(Long.valueOf(keyAt));
                if (a22 != null) {
                    if (a22.bot) {
                        M02 = org.telegram.messenger.bd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.bd.M0(2131753156, null).substring(1);
                    } else {
                        String str = a22.phone;
                        if (str != null && str.length() != 0) {
                            M02 = org.telegram.messenger.k5.i(new StringBuilder("+"), a22.phone, mf.b.c());
                        } else {
                            M02 = org.telegram.messenger.bd.M0(2131747840, null);
                        }
                    }
                    if (i3 != it0Var.f46417s - 1) {
                        z10 = true;
                    }
                    a5Var.c(a22, null, M02, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat M03 = it0Var.getMessagesController().M0(Long.valueOf(-keyAt));
            if (M03 != null) {
                int i12 = M03.participants_count;
                if (i12 != 0) {
                    M0 = org.telegram.messenger.bd.G(i12, "Members", new Object[0]);
                } else if (M03.has_geo) {
                    M0 = org.telegram.messenger.bd.M0(2131748650, null);
                } else if (!org.telegram.messenger.t3.t0(M03)) {
                    M0 = org.telegram.messenger.bd.M0(2131748649, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131748646, null);
                }
                if (i3 != it0Var.f46417s - 1) {
                    z10 = true;
                }
                a5Var.c(M03, null, M0, z10);
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.n4 n4Var;
        FrameLayout y8Var;
        if (i3 != 0) {
            Context context = this.f45986c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this.f45986c, org.telegram.ui.ActionBar.k6.L6, 21, 11, false, null);
                        n4Var2.setHeight(43);
                        n4Var = n4Var2;
                    } else {
                        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                        l8Var.g(-1, org.telegram.ui.ActionBar.k6.f28102p7);
                        n4Var = l8Var;
                    }
                } else {
                    y8Var = new org.telegram.ui.Cells.x4(context);
                }
            } else {
                y8Var = new org.telegram.ui.Cells.y8(context);
            }
            n4Var = y8Var;
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f45986c, 7, 6, true, null);
            a5Var.setDelegate(new ci0(this, 10));
            n4Var = a5Var;
        }
        return new u4.d1(n4Var);
    }
}
