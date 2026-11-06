package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f30 extends v4.o {
    public final c40 f45472b;

    public f30(c40 c40Var) {
        this.f45472b = c40Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c40 c40Var = this.f45472b;
        w30 w30Var = c40Var.G1;
        int i16 = w30Var.f50910x;
        if (i16 >= 0) {
            int i17 = c40Var.Y4;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = w30Var.f50911y;
        if (i18 >= 0) {
            int i19 = c40Var.f44593l5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = w30Var.D;
        if (i20 >= 0) {
            int i21 = c40Var.f44598m5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = w30Var.K;
        if (i22 >= 0) {
            int i23 = c40Var.X4;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = w30Var.J;
        if (i24 >= 0) {
            int i25 = c40Var.f44589k5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = w30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == c40Var.f44584j5) {
            return true;
        }
        int i27 = c40Var.f44652z2;
        if (i7 == i27 - 1 && i10 == w30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != w30Var.F - 1) {
            if (i10 >= w30Var.G && i10 < w30Var.H && i7 >= (i15 = c40Var.f44575h5) && i7 < c40Var.f44580i5) {
                return ((org.telegram.messenger.s3) c40Var.f44636v2.get(i7 - i15)).equals((org.telegram.messenger.s3) c40Var.f44572h2.get(i10 - c40Var.G1.G));
            }
            if (i10 >= w30Var.d && i10 < w30Var.f50904e && i7 >= (i14 = c40Var.Z4) && i7 < c40Var.f44548a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.f44632u2.get(i7 - i14);
                if (org.telegram.messenger.ij.C1(groupCallParticipant.peer) != org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) c40Var.R2.f25213g.get(i10 - c40Var.G1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= w30Var.f50905f && i10 < w30Var.h && i7 >= (i13 = c40Var.f44552b5) && i7 < c40Var.f44556c5) {
                return ((Long) c40Var.f44640w2.get(i7 - i13)).equals((Long) c40Var.R2.f25215j.get(i10 - c40Var.G1.f50905f));
            } else {
                if (i10 >= w30Var.f50906n && i10 < w30Var.f50907r && i7 >= (i12 = c40Var.f44559d5) && i7 < c40Var.f44563e5) {
                    return ((Long) c40Var.f44644x2.get(i7 - i12)).equals((Long) c40Var.R2.f25218m.get(i10 - c40Var.G1.f50906n));
                }
                if (i10 >= w30Var.f50908s && i10 < w30Var.f50909w && i7 >= (i11 = c40Var.f44567f5) && i7 < c40Var.f44571g5) {
                    return ((Long) c40Var.f44648y2.get(i7 - i11)).equals((Long) c40Var.R2.f25217l.get(i10 - c40Var.G1.f50908s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f45472b.G1.F;
    }

    @Override
    public final int e() {
        return this.f45472b.f44652z2;
    }
}
