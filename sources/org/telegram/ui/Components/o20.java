package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o20 extends bk0 {
    public final Context f37940c;
    public final s20 d;

    public o20(s20 s20Var, Context context) {
        this.d = s20Var;
        this.f37940c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.f59122a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.f39451a2.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i7 = f1Var.f59126f;
            if (i7 == 0 || i7 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f39462m2;
    }

    @Override
    public final int d(int i7) {
        s20 s20Var = this.d;
        if ((i7 >= s20Var.f39455f2 && i7 < s20Var.f39456g2) || (i7 >= s20Var.f39458i2 && i7 < s20Var.f39459j2)) {
            return 0;
        }
        if (i7 == s20Var.d2) {
            return 1;
        }
        if (i7 != s20Var.f39460k2 && i7 != s20Var.f39457h2) {
            s20Var.getClass();
            if (i7 == 0) {
                return 3;
            }
            if (i7 == s20Var.f39454e2) {
                return 4;
            }
            if (i7 != s20Var.f39461l2) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLObject tLObject;
        int i10;
        long j3;
        s20 s20Var = this.d;
        ArrayList arrayList = s20Var.S1;
        int i11 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == s20Var.f39460k2) {
                        x3Var.setText(org.telegram.messenger.gd.M0(2131752325, null));
                        return;
                    } else if (i7 == s20Var.f39457h2) {
                        if (s20Var.f39453c2) {
                            x3Var.setText(org.telegram.messenger.gd.M0(2131742567, null));
                            return;
                        } else {
                            x3Var.setText(org.telegram.messenger.gd.M0(2131749264, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i7 == s20Var.d2) {
                if ((!s20Var.X1 || s20Var.Y1) && s20Var.f39460k2 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                x4Var.b(2131232205, 7, org.telegram.messenger.gd.M0(2131743153, null), z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i7));
        int i12 = s20Var.f39455f2;
        if (i7 >= i12 && i7 < s20Var.f39456g2) {
            tLObject = (TLObject) arrayList.get(i7 - i12);
        } else {
            int i13 = s20Var.f39458i2;
            if (i7 >= i13 && i7 < s20Var.f39459j2) {
                tLObject = (TLObject) s20Var.T1.get(i7 - i13);
            } else {
                tLObject = null;
            }
        }
        if (i7 < s20Var.f39455f2 || i7 >= (i10 = s20Var.f39456g2)) {
            i10 = s20Var.f39459j2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f28554id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(s20Var.f30189a).c2(Long.valueOf(j3));
        if (c22 != null) {
            a5Var.setCustomImageVisible(s20Var.f39451a2.contains(Long.valueOf(c22.f28554id)));
            if (i7 != i10 - 1) {
                z10 = true;
            }
            a5Var.c(c22, null, null, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f37940c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? wzVar = new wz(context, null);
                            wzVar.setViewType(6);
                            wzVar.setIsSingleCell(true);
                            wzVar.e(org.telegram.ui.ActionBar.n6.Wg, org.telegram.ui.ActionBar.n6.Ih, org.telegram.ui.ActionBar.n6.f29349ah);
                            a5Var = wzVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29349ah, x3Var, null);
                    x3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                    a5Var = x3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.n6.f29462gh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.n6.Xg);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f37940c, 6, 2, false, null);
            a5Var2.setCustomRightImage(2131232194);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29389ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29462gh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.Xg);
            a5Var = a5Var2;
        }
        return new v4.f1(a5Var);
    }
}
