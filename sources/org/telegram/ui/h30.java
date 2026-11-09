package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class h30 extends v4.o {
    public final e40 f46137b;

    public h30(e40 e40Var) {
        this.f46137b = e40Var;
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
        e40 e40Var = this.f46137b;
        y30 y30Var = e40Var.G1;
        int i16 = y30Var.f51844x;
        if (i16 >= 0) {
            int i17 = e40Var.Y4;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = y30Var.f51845y;
        if (i18 >= 0) {
            int i19 = e40Var.f45236l5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = y30Var.D;
        if (i20 >= 0) {
            int i21 = e40Var.f45241m5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = y30Var.K;
        if (i22 >= 0) {
            int i23 = e40Var.X4;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = y30Var.J;
        if (i24 >= 0) {
            int i25 = e40Var.f45232k5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = y30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == e40Var.f45227j5) {
            return true;
        }
        int i27 = e40Var.f45295z2;
        if (i7 == i27 - 1 && i10 == y30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != y30Var.F - 1) {
            if (i10 >= y30Var.G && i10 < y30Var.H && i7 >= (i15 = e40Var.f45218h5) && i7 < e40Var.f45223i5) {
                return ((org.telegram.messenger.s3) e40Var.f45279v2.get(i7 - i15)).equals((org.telegram.messenger.s3) e40Var.f45215h2.get(i10 - e40Var.G1.G));
            }
            if (i10 >= y30Var.d && i10 < y30Var.f51838e && i7 >= (i14 = e40Var.Z4) && i7 < e40Var.f45191a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.f45275u2.get(i7 - i14);
                if (org.telegram.messenger.ij.B1(groupCallParticipant.peer) != org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) e40Var.R2.f25226g.get(i10 - e40Var.G1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= y30Var.f51839f && i10 < y30Var.h && i7 >= (i13 = e40Var.f45195b5) && i7 < e40Var.f45199c5) {
                return ((Long) e40Var.f45283w2.get(i7 - i13)).equals((Long) e40Var.R2.f25228j.get(i10 - e40Var.G1.f51839f));
            } else {
                if (i10 >= y30Var.f51840n && i10 < y30Var.f51841r && i7 >= (i12 = e40Var.f45202d5) && i7 < e40Var.f45206e5) {
                    return ((Long) e40Var.f45287x2.get(i7 - i12)).equals((Long) e40Var.R2.f25231m.get(i10 - e40Var.G1.f51840n));
                }
                if (i10 >= y30Var.f51842s && i10 < y30Var.f51843w && i7 >= (i11 = e40Var.f45210f5) && i7 < e40Var.f45214g5) {
                    return ((Long) e40Var.f45291y2.get(i7 - i11)).equals((Long) e40Var.R2.f25230l.get(i10 - e40Var.G1.f51842s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46137b.G1.F;
    }

    @Override
    public final int e() {
        return this.f46137b.f45295z2;
    }
}
