package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f30 extends v4.o {
    public final c40 f45468b;

    public f30(c40 c40Var) {
        this.f45468b = c40Var;
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
        c40 c40Var = this.f45468b;
        w30 w30Var = c40Var.G1;
        int i16 = w30Var.f50905x;
        if (i16 >= 0) {
            int i17 = c40Var.Y4;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = w30Var.f50906y;
        if (i18 >= 0) {
            int i19 = c40Var.f44573l5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = w30Var.D;
        if (i20 >= 0) {
            int i21 = c40Var.f44578m5;
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
            int i25 = c40Var.f44569k5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = w30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == c40Var.f44564j5) {
            return true;
        }
        int i27 = c40Var.f44632z2;
        if (i7 == i27 - 1 && i10 == w30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != w30Var.F - 1) {
            if (i10 >= w30Var.G && i10 < w30Var.H && i7 >= (i15 = c40Var.f44555h5) && i7 < c40Var.f44560i5) {
                return ((org.telegram.messenger.s3) c40Var.f44616v2.get(i7 - i15)).equals((org.telegram.messenger.s3) c40Var.f44552h2.get(i10 - c40Var.G1.G));
            }
            if (i10 >= w30Var.d && i10 < w30Var.f50899e && i7 >= (i14 = c40Var.Z4) && i7 < c40Var.f44528a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.f44612u2.get(i7 - i14);
                if (org.telegram.messenger.ij.C1(groupCallParticipant.peer) != org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) c40Var.R2.f25205g.get(i10 - c40Var.G1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= w30Var.f50900f && i10 < w30Var.h && i7 >= (i13 = c40Var.f44532b5) && i7 < c40Var.f44536c5) {
                return ((Long) c40Var.f44620w2.get(i7 - i13)).equals((Long) c40Var.R2.f25207j.get(i10 - c40Var.G1.f50900f));
            } else {
                if (i10 >= w30Var.f50901n && i10 < w30Var.f50902r && i7 >= (i12 = c40Var.f44539d5) && i7 < c40Var.f44543e5) {
                    return ((Long) c40Var.f44624x2.get(i7 - i12)).equals((Long) c40Var.R2.f25210m.get(i10 - c40Var.G1.f50901n));
                }
                if (i10 >= w30Var.f50903s && i10 < w30Var.f50904w && i7 >= (i11 = c40Var.f44547f5) && i7 < c40Var.f44551g5) {
                    return ((Long) c40Var.f44628y2.get(i7 - i11)).equals((Long) c40Var.R2.f25209l.get(i10 - c40Var.G1.f50903s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f45468b.G1.F;
    }

    @Override
    public final int e() {
        return this.f45468b.f44632z2;
    }
}
