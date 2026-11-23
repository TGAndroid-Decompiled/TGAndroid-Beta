package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class h30 extends v4.p {
    public final e40 f48419b;

    public h30(e40 e40Var) {
        this.f48419b = e40Var;
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
        e40 e40Var = this.f48419b;
        y30 y30Var = e40Var.K1;
        int i16 = y30Var.f54181x;
        if (i16 >= 0) {
            int i17 = e40Var.f47347g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = y30Var.f54182y;
        if (i18 >= 0) {
            int i19 = e40Var.f47403t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = y30Var.E;
        if (i20 >= 0) {
            int i21 = e40Var.f47408u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = y30Var.L;
        if (i22 >= 0) {
            int i23 = e40Var.f47343f5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = y30Var.K;
        if (i24 >= 0) {
            int i25 = e40Var.s5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = y30Var.J;
        if (i26 >= 0 && i26 == i10 && i7 == e40Var.f47394r5) {
            return true;
        }
        int i27 = e40Var.D2;
        if (i7 == i27 - 1 && i10 == y30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != y30Var.G - 1) {
            if (i10 >= y30Var.H && i10 < y30Var.I && i7 >= (i15 = e40Var.f47384p5) && i7 < e40Var.f47389q5) {
                return ((org.telegram.messenger.u3) e40Var.f47430z2.get(i7 - i15)).equals((org.telegram.messenger.u3) e40Var.f47363l2.get(i10 - e40Var.K1.H));
            }
            if (i10 >= y30Var.d && i10 < y30Var.f54175e && i7 >= (i14 = e40Var.f47351h5) && i7 < e40Var.f47355i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e40Var.f47425y2.get(i7 - i14);
                if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) e40Var.V2.f27038g.get(i10 - e40Var.K1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= y30Var.f54176f && i10 < y30Var.h && i7 >= (i13 = e40Var.f47358j5) && i7 < e40Var.f47362k5) {
                return ((Long) e40Var.A2.get(i7 - i13)).equals((Long) e40Var.V2.f27040j.get(i10 - e40Var.K1.f54176f));
            } else {
                if (i10 >= y30Var.f54177n && i10 < y30Var.f54178r && i7 >= (i12 = e40Var.f47366l5) && i7 < e40Var.f47371m5) {
                    return ((Long) e40Var.B2.get(i7 - i12)).equals((Long) e40Var.V2.f27043m.get(i10 - e40Var.K1.f54177n));
                }
                if (i10 >= y30Var.f54179s && i10 < y30Var.f54180w && i7 >= (i11 = e40Var.f47375n5) && i7 < e40Var.f47379o5) {
                    return ((Long) e40Var.C2.get(i7 - i11)).equals((Long) e40Var.V2.f27042l.get(i10 - e40Var.K1.f54179s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f48419b.K1.G;
    }

    @Override
    public final int e() {
        return this.f48419b.D2;
    }
}
