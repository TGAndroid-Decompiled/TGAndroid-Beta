package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z10 extends sj0 {
    public final Context f40891c;
    public final d20 d;

    public z10(d20 d20Var, Context context) {
        this.d = d20Var;
        this.f40891c = context;
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.X1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i3 = d1Var.f55544f;
            if (i3 == 0 || i3 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f32916j2;
    }

    @Override
    public final int d(int i3) {
        d20 d20Var = this.d;
        if ((i3 >= d20Var.c2 && i3 < d20Var.f32910d2) || (i3 >= d20Var.f32912f2 && i3 < d20Var.f32913g2)) {
            return 0;
        }
        if (i3 == d20Var.f32908a2) {
            return 1;
        }
        if (i3 != d20Var.f32914h2 && i3 != d20Var.f32911e2) {
            d20Var.getClass();
            if (i3 == 0) {
                return 3;
            }
            if (i3 == d20Var.f32909b2) {
                return 4;
            }
            if (i3 != d20Var.f32915i2) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLObject tLObject;
        int i10;
        long j10;
        d20 d20Var = this.d;
        ArrayList arrayList = d20Var.P1;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i3 == d20Var.f32914h2) {
                        x3Var.setText(org.telegram.messenger.bd.M0(2131752336, null));
                        return;
                    } else if (i3 == d20Var.f32911e2) {
                        if (d20Var.Z1) {
                            x3Var.setText(org.telegram.messenger.bd.M0(2131742835, null));
                            return;
                        } else {
                            x3Var.setText(org.telegram.messenger.bd.M0(2131749464, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i3 == d20Var.f32908a2) {
                if ((!d20Var.U1 || d20Var.V1) && d20Var.f32914h2 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                x4Var.b(2131232203, 7, org.telegram.messenger.bd.M0(2131743400, null), z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i3));
        int i12 = d20Var.c2;
        if (i3 >= i12 && i3 < d20Var.f32910d2) {
            tLObject = (TLObject) arrayList.get(i3 - i12);
        } else {
            int i13 = d20Var.f32912f2;
            if (i3 >= i13 && i3 < d20Var.f32913g2) {
                tLObject = (TLObject) d20Var.Q1.get(i3 - i13);
            } else {
                tLObject = null;
            }
        }
        if (i3 < d20Var.c2 || i3 >= (i10 = d20Var.f32910d2)) {
            i10 = d20Var.f32913g2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f27150id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User a22 = org.telegram.messenger.hp.s1(d20Var.f28583a).a2(Long.valueOf(j10));
        if (a22 != null) {
            a5Var.setCustomImageVisible(d20Var.X1.contains(Long.valueOf(a22.f27150id)));
            if (i3 != i10 - 1) {
                z10 = true;
            }
            a5Var.c(a22, null, null, z10);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i3 != 0) {
            Context context = this.f40891c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? izVar = new iz(context, null);
                            izVar.setViewType(6);
                            izVar.setIsSingleCell(true);
                            izVar.e(org.telegram.ui.ActionBar.k6.Tg, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Xg);
                            a5Var = izVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Xg, x3Var, null);
                    x3Var.setTextColor(org.telegram.ui.ActionBar.k6.Eh);
                    a5Var = x3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.k6.f27889dh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f40891c, 6, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27853bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27889dh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
            a5Var = a5Var2;
        }
        return new u4.d1(a5Var);
    }
}
