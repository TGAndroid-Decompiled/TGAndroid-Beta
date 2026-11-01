package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v20 extends tk0 {
    public final Context f31144c;
    public final z20 d;

    public v20(z20 z20Var, Context context) {
        this.d = z20Var;
        this.f31144c = context;
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        View view = c1Var.f47909a;
        if (!(view instanceof org.telegram.ui.Cells.e5) || !this.d.W1.contains(Long.valueOf(((org.telegram.ui.Cells.e5) view).getUserId()))) {
            int i10 = c1Var.f47912f;
            if (i10 == 0 || i10 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f32981i2;
    }

    @Override
    public final int d(int i10) {
        z20 z20Var = this.d;
        if ((i10 >= z20Var.f32974b2 && i10 < z20Var.f32975c2) || (i10 >= z20Var.f32977e2 && i10 < z20Var.f32978f2)) {
            return 0;
        }
        if (i10 == z20Var.Z1) {
            return 1;
        }
        if (i10 != z20Var.f32979g2 && i10 != z20Var.f32976d2) {
            z20Var.getClass();
            if (i10 == 0) {
                return 3;
            }
            if (i10 == z20Var.a2) {
                return 4;
            }
            if (i10 != z20Var.f32980h2) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        int i11;
        long j10;
        z20 z20Var = this.d;
        ArrayList arrayList = z20Var.O1;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z10 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
                    if (i10 == z20Var.f32979g2) {
                        z3Var.setText(org.telegram.messenger.dd.L0(2131752336, null));
                        return;
                    } else if (i10 == z20Var.f32976d2) {
                        if (z20Var.Y1) {
                            z3Var.setText(org.telegram.messenger.dd.L0(2131742850, null));
                            return;
                        } else {
                            z3Var.setText(org.telegram.messenger.dd.L0(2131749465, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (i10 == z20Var.Z1) {
                if ((!z20Var.T1 || z20Var.U1) && z20Var.f32979g2 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                b5Var.b(2131232202, 7, org.telegram.messenger.dd.L0(2131743416, null), z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
        e5Var.setTag(Integer.valueOf(i10));
        int i13 = z20Var.f32974b2;
        if (i10 >= i13 && i10 < z20Var.f32975c2) {
            tLObject = (TLObject) arrayList.get(i10 - i13);
        } else {
            int i14 = z20Var.f32977e2;
            if (i10 >= i14 && i10 < z20Var.f32978f2) {
                tLObject = (TLObject) z20Var.P1.get(i10 - i14);
            } else {
                tLObject = null;
            }
        }
        if (i10 < z20Var.f32974b2 || i10 >= (i11 = z20Var.f32975c2)) {
            i11 = z20Var.f32978f2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j10 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject).f19943id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j10 = org.telegram.messenger.kj.C1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j10 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User Z1 = org.telegram.messenger.wp.r1(z20Var.f21584a).Z1(Long.valueOf(j10));
        if (Z1 != null) {
            e5Var.setCustomImageVisible(z20Var.W1.contains(Long.valueOf(Z1.f19943id)));
            if (i10 != i11 - 1) {
                z10 = true;
            }
            e5Var.c(Z1, null, null, z10);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var;
        if (i10 != 0) {
            Context context = this.f31144c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 5) {
                            e5Var = new View(context);
                        } else {
                            ?? zzVar = new zz(context, null);
                            zzVar.setViewType(6);
                            zzVar.setIsSingleCell(true);
                            zzVar.e(org.telegram.ui.ActionBar.t6.Tg, org.telegram.ui.ActionBar.t6.Fh, org.telegram.ui.ActionBar.t6.Xg);
                            e5Var = zzVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                        e5Var = view;
                    }
                } else {
                    ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Xg, z3Var, null);
                    z3Var.setTextColor(org.telegram.ui.ActionBar.t6.Eh);
                    e5Var = z3Var;
                }
            } else {
                ?? b5Var = new org.telegram.ui.Cells.b5(context);
                int i11 = org.telegram.ui.ActionBar.t6.f20941dh;
                b5Var.a(i11, i11);
                b5Var.setDividerColor(org.telegram.ui.ActionBar.t6.Ug);
                e5Var = b5Var;
            }
        } else {
            org.telegram.ui.Cells.e5 e5Var2 = new org.telegram.ui.Cells.e5(6, 2, this.f31144c, null, false);
            e5Var2.setCustomRightImage(2131232191);
            e5Var2.setNameColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20902bh, false));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20941dh, false);
            e5Var2.O = true;
            e5Var2.H = x02;
            e5Var2.I = x03;
            e5Var2.setDividerColor(org.telegram.ui.ActionBar.t6.Ug);
            e5Var = e5Var2;
        }
        return new s4.c1(e5Var);
    }
}
