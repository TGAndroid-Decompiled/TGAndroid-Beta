package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g20 extends tj0 {
    public final Context f34784c;
    public final k20 d;

    public g20(k20 k20Var, Context context) {
        this.d = k20Var;
        this.f34784c = context;
    }

    @Override
    public final void A(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        View view = e1Var.f58535a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.f36242a2.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i7 = e1Var.f58539f;
            if (i7 == 0 || i7 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f36253m2;
    }

    @Override
    public final int d(int i7) {
        k20 k20Var = this.d;
        if ((i7 >= k20Var.f36246f2 && i7 < k20Var.f36247g2) || (i7 >= k20Var.f36249i2 && i7 < k20Var.f36250j2)) {
            return 0;
        }
        if (i7 == k20Var.d2) {
            return 1;
        }
        if (i7 != k20Var.f36251k2 && i7 != k20Var.f36248h2) {
            k20Var.getClass();
            if (i7 == 0) {
                return 3;
            }
            if (i7 == k20Var.f36245e2) {
                return 4;
            }
            if (i7 != k20Var.f36252l2) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        TLObject tLObject;
        int i10;
        long j3;
        k20 k20Var = this.d;
        ArrayList arrayList = k20Var.S1;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == k20Var.f36251k2) {
                        x3Var.setText(org.telegram.messenger.hd.M0(2131752336, null));
                        return;
                    } else if (i7 == k20Var.f36248h2) {
                        if (k20Var.f36244c2) {
                            x3Var.setText(org.telegram.messenger.hd.M0(2131742825, null));
                            return;
                        } else {
                            x3Var.setText(org.telegram.messenger.hd.M0(2131749456, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i7 == k20Var.d2) {
                if ((!k20Var.X1 || k20Var.Y1) && k20Var.f36251k2 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                x4Var.b(2131232204, 7, org.telegram.messenger.hd.M0(2131743390, null), z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i7));
        int i12 = k20Var.f36246f2;
        if (i7 >= i12 && i7 < k20Var.f36247g2) {
            tLObject = (TLObject) arrayList.get(i7 - i12);
        } else {
            int i13 = k20Var.f36249i2;
            if (i7 >= i13 && i7 < k20Var.f36250j2) {
                tLObject = (TLObject) k20Var.T1.get(i7 - i13);
            } else {
                tLObject = null;
            }
        }
        if (i7 < k20Var.f36246f2 || i7 >= (i10 = k20Var.f36247g2)) {
            i10 = k20Var.f36250j2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f28200id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User a22 = org.telegram.messenger.np.s1(k20Var.f29679a).a2(Long.valueOf(j3));
        if (a22 != null) {
            a5Var.setCustomImageVisible(k20Var.f36242a2.contains(Long.valueOf(a22.f28200id)));
            if (i7 != i10 - 1) {
                z10 = true;
            }
            a5Var.c(a22, null, null, z10);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f34784c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? pzVar = new pz(context, null);
                            pzVar.setViewType(6);
                            pzVar.setIsSingleCell(true);
                            pzVar.e(org.telegram.ui.ActionBar.j6.Wg, org.telegram.ui.ActionBar.j6.Ih, org.telegram.ui.ActionBar.j6.f28802ah);
                            a5Var = pzVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                        a5Var = view;
                    }
                } else {
                    ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28802ah, x3Var, null);
                    x3Var.setTextColor(org.telegram.ui.ActionBar.j6.Hh);
                    a5Var = x3Var;
                }
            } else {
                ?? x4Var = new org.telegram.ui.Cells.x4(context);
                int i10 = org.telegram.ui.ActionBar.j6.f28915gh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.j6.Xg);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f34784c, 6, 2, false, null);
            a5Var2.setCustomRightImage(2131232193);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28878eh, false));
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28842ch, false);
            int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28915gh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.j6.Xg);
            a5Var = a5Var2;
        }
        return new v4.e1(a5Var);
    }
}
