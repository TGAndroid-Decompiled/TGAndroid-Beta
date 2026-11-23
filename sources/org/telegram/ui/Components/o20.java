package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o20 extends dk0 {
    public final Context f37992c;
    public final s20 d;

    public o20(s20 s20Var, Context context) {
        this.d = s20Var;
        this.f37992c = context;
    }

    @Override
    public final void A(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.f59245a;
        if (!(view instanceof org.telegram.ui.Cells.b5) || !this.d.f39467a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) {
            int i7 = f1Var.f59249f;
            if (i7 == 0 || i7 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f39478m2;
    }

    @Override
    public final int d(int i7) {
        s20 s20Var = this.d;
        if ((i7 >= s20Var.f39471f2 && i7 < s20Var.f39472g2) || (i7 >= s20Var.f39474i2 && i7 < s20Var.f39475j2)) {
            return 0;
        }
        if (i7 == s20Var.d2) {
            return 1;
        }
        if (i7 != s20Var.f39476k2 && i7 != s20Var.f39473h2) {
            s20Var.getClass();
            if (i7 == 0) {
                return 3;
            }
            if (i7 == s20Var.f39470e2) {
                return 4;
            }
            if (i7 != s20Var.f39477l2) {
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
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (i7 == s20Var.f39476k2) {
                        y3Var.setText(org.telegram.messenger.gd.N0(2131752324, null));
                        return;
                    } else if (i7 == s20Var.f39473h2) {
                        if (s20Var.f39469c2) {
                            y3Var.setText(org.telegram.messenger.gd.N0(2131742554, null));
                            return;
                        } else {
                            y3Var.setText(org.telegram.messenger.gd.N0(2131749263, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (i7 == s20Var.d2) {
                if ((!s20Var.X1 || s20Var.Y1) && s20Var.f39476k2 == -1 && !arrayList.isEmpty()) {
                    z10 = true;
                }
                y4Var.b(2131232208, 7, org.telegram.messenger.gd.N0(2131743140, null), z10);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
        b5Var.setTag(Integer.valueOf(i7));
        int i12 = s20Var.f39471f2;
        if (i7 >= i12 && i7 < s20Var.f39472g2) {
            tLObject = (TLObject) arrayList.get(i7 - i12);
        } else {
            int i13 = s20Var.f39474i2;
            if (i7 >= i13 && i7 < s20Var.f39475j2) {
                tLObject = (TLObject) s20Var.T1.get(i7 - i13);
            } else {
                tLObject = null;
            }
        }
        if (i7 < s20Var.f39471f2 || i7 >= (i10 = s20Var.f39472g2)) {
            i10 = s20Var.f39475j2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f28641id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User c22 = org.telegram.messenger.mp.u1(s20Var.f30223a).c2(Long.valueOf(j3));
        if (c22 != null) {
            b5Var.setCustomImageVisible(s20Var.f39467a2.contains(Long.valueOf(c22.f28641id)));
            if (i7 != i10 - 1) {
                z10 = true;
            }
            b5Var.c(c22, null, null, z10);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.f37992c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            b5Var = new View(context);
                        } else {
                            ?? vzVar = new vz(context, null);
                            vzVar.setViewType(6);
                            vzVar.setIsSingleCell(true);
                            vzVar.e(org.telegram.ui.ActionBar.n6.Wg, org.telegram.ui.ActionBar.n6.Ih, org.telegram.ui.ActionBar.n6.f29404ah);
                            b5Var = vzVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                        b5Var = view;
                    }
                } else {
                    ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29404ah, y3Var, null);
                    y3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                    b5Var = y3Var;
                }
            } else {
                ?? y4Var = new org.telegram.ui.Cells.y4(context);
                int i10 = org.telegram.ui.ActionBar.n6.f29517gh;
                y4Var.a(i10, i10);
                y4Var.setDividerColor(org.telegram.ui.ActionBar.n6.Xg);
                b5Var = y4Var;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.f37992c, 6, 2, false, null);
            b5Var2.setCustomRightImage(2131232197);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29480eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29444ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29517gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.Xg);
            b5Var = b5Var2;
        }
        return new v4.f1(b5Var);
    }
}
