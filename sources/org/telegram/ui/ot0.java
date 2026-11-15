package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ot0 extends org.telegram.ui.Components.tj0 {
    public final Context f50057c;
    public final pt0 d;

    public ot0(pt0 pt0Var, Context context) {
        this.d = pt0Var;
        this.f50057c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 0 && i7 != 2 && i7 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.f50364e;
    }

    @Override
    public final int d(int i7) {
        pt0 pt0Var = this.d;
        if (i7 == pt0Var.f50370x) {
            return 4;
        }
        if (i7 == pt0Var.f50366n) {
            return 3;
        }
        if (i7 == pt0Var.f50365f) {
            return 2;
        }
        if (i7 != pt0Var.h && i7 != pt0Var.f50369w) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        String M0;
        String M02;
        pt0 pt0Var = this.d;
        int i10 = pt0Var.E;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                        if (i7 == pt0Var.f50366n) {
                            if (i10 == 1) {
                                n4Var.setText(org.telegram.messenger.hd.G(pt0Var.getMessagesController().I0, "BlockedUsersCount", new Object[0]));
                                return;
                            } else {
                                n4Var.setText(org.telegram.messenger.hd.M0(2131746840, null));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
                x4Var.a(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
                if (i10 == 1) {
                    x4Var.b(2131232100, 5, org.telegram.messenger.hd.M0(2131753692, null), false);
                    return;
                } else {
                    org.telegram.messenger.hd.M0(2131746868, null);
                    throw null;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i7 == pt0Var.h) {
                if (i10 == 1) {
                    y8Var.setFixedSize(0);
                    y8Var.setText(org.telegram.messenger.hd.M0(2131753677, null));
                    return;
                }
                y8Var.setFixedSize(8);
                y8Var.setText(null);
                return;
            } else if (i7 == pt0Var.f50369w) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        if (i10 == 1) {
            long keyAt = pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.f50367r);
            a5Var.setTag(Long.valueOf(keyAt));
            if (keyAt > 0) {
                TLRPC.User a22 = pt0Var.getMessagesController().a2(Long.valueOf(keyAt));
                if (a22 != null) {
                    if (a22.bot) {
                        M02 = org.telegram.messenger.hd.M0(2131753156, null).substring(0, 1).toUpperCase() + org.telegram.messenger.hd.M0(2131753156, null).substring(1);
                    } else {
                        String str = a22.phone;
                        if (str != null && str.length() != 0) {
                            M02 = org.telegram.messenger.k5.h(new StringBuilder("+"), a22.phone, pf.b.c());
                        } else {
                            M02 = org.telegram.messenger.hd.M0(2131747832, null);
                        }
                    }
                    if (i7 != pt0Var.f50368s - 1) {
                        z10 = true;
                    }
                    a5Var.c(a22, null, M02, z10);
                    return;
                }
                return;
            }
            TLRPC.Chat M03 = pt0Var.getMessagesController().M0(Long.valueOf(-keyAt));
            if (M03 != null) {
                int i12 = M03.participants_count;
                if (i12 != 0) {
                    M0 = org.telegram.messenger.hd.G(i12, "Members", new Object[0]);
                } else if (M03.has_geo) {
                    M0 = org.telegram.messenger.hd.M0(2131748642, null);
                } else if (!org.telegram.messenger.t3.t0(M03)) {
                    M0 = org.telegram.messenger.hd.M0(2131748641, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131748638, null);
                }
                if (i7 != pt0Var.f50368s - 1) {
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
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n4 n4Var;
        FrameLayout y8Var;
        if (i7 != 0) {
            Context context = this.f50057c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(this.f50057c, org.telegram.ui.ActionBar.j6.L6, 21, 11, false, null);
                        n4Var2.setHeight(43);
                        n4Var = n4Var2;
                    } else {
                        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var.k(org.telegram.messenger.hd.M0(2131747915, null), false);
                        l8Var.g(-1, org.telegram.ui.ActionBar.j6.f29070p7);
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
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.f50057c, 7, 6, true, null);
            a5Var.setDelegate(new ni0(this, 9));
            n4Var = a5Var;
        }
        return new v4.e1(n4Var);
    }
}
