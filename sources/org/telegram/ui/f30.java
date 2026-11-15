package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f30 extends v4.o {
    public final c40 f46966b;

    public f30(c40 c40Var) {
        this.f46966b = c40Var;
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
        c40 c40Var = this.f46966b;
        w30 w30Var = c40Var.K1;
        int i16 = w30Var.f52390x;
        if (i16 >= 0) {
            int i17 = c40Var.f45911g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = w30Var.f52391y;
        if (i18 >= 0) {
            int i19 = c40Var.f45967t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = w30Var.E;
        if (i20 >= 0) {
            int i21 = c40Var.f45972u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = w30Var.L;
        if (i22 >= 0) {
            int i23 = c40Var.f45907f5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = w30Var.K;
        if (i24 >= 0) {
            int i25 = c40Var.s5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = w30Var.J;
        if (i26 >= 0 && i26 == i10 && i7 == c40Var.f45958r5) {
            return true;
        }
        int i27 = c40Var.D2;
        if (i7 == i27 - 1 && i10 == w30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != w30Var.G - 1) {
            if (i10 >= w30Var.H && i10 < w30Var.I && i7 >= (i15 = c40Var.f45948p5) && i7 < c40Var.f45953q5) {
                return ((org.telegram.messenger.s3) c40Var.f45994z2.get(i7 - i15)).equals((org.telegram.messenger.s3) c40Var.f45927l2.get(i10 - c40Var.K1.H));
            }
            if (i10 >= w30Var.d && i10 < w30Var.f52384e && i7 >= (i14 = c40Var.f45915h5) && i7 < c40Var.f45919i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.f45989y2.get(i7 - i14);
                if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) c40Var.V2.f26220g.get(i10 - c40Var.K1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= w30Var.f52385f && i10 < w30Var.h && i7 >= (i13 = c40Var.f45922j5) && i7 < c40Var.f45926k5) {
                return ((Long) c40Var.A2.get(i7 - i13)).equals((Long) c40Var.V2.f26222j.get(i10 - c40Var.K1.f52385f));
            } else {
                if (i10 >= w30Var.f52386n && i10 < w30Var.f52387r && i7 >= (i12 = c40Var.f45930l5) && i7 < c40Var.f45935m5) {
                    return ((Long) c40Var.B2.get(i7 - i12)).equals((Long) c40Var.V2.f26225m.get(i10 - c40Var.K1.f52386n));
                }
                if (i10 >= w30Var.f52388s && i10 < w30Var.f52389w && i7 >= (i11 = c40Var.f45939n5) && i7 < c40Var.f45943o5) {
                    return ((Long) c40Var.C2.get(i7 - i11)).equals((Long) c40Var.V2.f26224l.get(i10 - c40Var.K1.f52388s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46966b.K1.G;
    }

    @Override
    public final int e() {
        return this.f46966b.D2;
    }
}
