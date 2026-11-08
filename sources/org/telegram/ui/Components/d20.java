package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d20 extends oj0 {
    public final Context f32765c;
    public final h20 d;

    public d20(h20 h20Var, Context context) {
        this.d = h20Var;
        this.f32765c = context;
    }

    @Override
    public final void A(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        View view = d1Var.f57043a;
        if (!(view instanceof org.telegram.ui.Cells.a5) || !this.d.W1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) {
            int i7 = d1Var.f57047f;
            if (i7 == 0 || i7 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.f34101i2;
    }

    @Override
    public final int d(int i7) {
        h20 h20Var = this.d;
        if ((i7 >= h20Var.f34095b2 && i7 < h20Var.f34096c2) || (i7 >= h20Var.f34097e2 && i7 < h20Var.f34098f2)) {
            return 0;
        }
        if (i7 == h20Var.Z1) {
            return 1;
        }
        if (i7 != h20Var.f34099g2 && i7 != h20Var.d2) {
            h20Var.getClass();
            if (i7 == 0) {
                return 3;
            }
            if (i7 == h20Var.f34094a2) {
                return 4;
            }
            if (i7 != h20Var.f34100h2) {
                return 0;
            }
            return 5;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLObject tLObject;
        int i10;
        long j3;
        h20 h20Var = this.d;
        ArrayList arrayList = h20Var.O1;
        int i11 = d1Var.f57047f;
        View view = d1Var.f57043a;
        boolean z9 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 == h20Var.f34099g2) {
                        x3Var.setText(org.telegram.messenger.id.M0(2131752336, null));
                        return;
                    } else if (i7 == h20Var.d2) {
                        if (h20Var.Y1) {
                            x3Var.setText(org.telegram.messenger.id.M0(2131742828, null));
                            return;
                        } else {
                            x3Var.setText(org.telegram.messenger.id.M0(2131749457, null));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (i7 == h20Var.Z1) {
                if ((!h20Var.T1 || h20Var.U1) && h20Var.f34099g2 == -1 && !arrayList.isEmpty()) {
                    z9 = true;
                }
                x4Var.b(2131232203, 7, org.telegram.messenger.id.M0(2131743393, null), z9);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
        a5Var.setTag(Integer.valueOf(i7));
        int i12 = h20Var.f34095b2;
        if (i7 >= i12 && i7 < h20Var.f34096c2) {
            tLObject = (TLObject) arrayList.get(i7 - i12);
        } else {
            int i13 = h20Var.f34097e2;
            if (i7 >= i13 && i7 < h20Var.f34098f2) {
                tLObject = (TLObject) h20Var.P1.get(i7 - i13);
            } else {
                tLObject = null;
            }
        }
        if (i7 < h20Var.f34095b2 || i7 >= (i10 = h20Var.f34096c2)) {
            i10 = h20Var.f34098f2;
        }
        if (tLObject instanceof TLRPC.TL_contact) {
            j3 = ((TLRPC.TL_contact) tLObject).user_id;
        } else if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f27105id;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            j3 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject).peer);
        } else {
            j3 = ((TLRPC.ChatParticipant) tLObject).user_id;
        }
        TLRPC.User a22 = org.telegram.messenger.qp.s1(h20Var.f28616a).a2(Long.valueOf(j3));
        if (a22 != null) {
            a5Var.setCustomImageVisible(h20Var.W1.contains(Long.valueOf(a22.f27105id)));
            if (i7 != i10 - 1) {
                z9 = true;
            }
            a5Var.c(a22, null, null, z9);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.f32765c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 5) {
                            a5Var = new View(context);
                        } else {
                            ?? mzVar = new mz(context, null);
                            mzVar.setViewType(6);
                            mzVar.setIsSingleCell(true);
                            mzVar.e(org.telegram.ui.ActionBar.k6.Tg, org.telegram.ui.ActionBar.k6.Fh, org.telegram.ui.ActionBar.k6.Xg);
                            a5Var = mzVar;
                        }
                    } else {
                        ?? view = new View(context);
                        view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
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
                int i10 = org.telegram.ui.ActionBar.k6.f27862dh;
                x4Var.a(i10, i10);
                x4Var.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
                a5Var = x4Var;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.f32765c, 6, 2, false, null);
            a5Var2.setCustomRightImage(2131232192);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27825bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27862dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.Ug);
            a5Var = a5Var2;
        }
        return new v4.d1(a5Var);
    }
}
