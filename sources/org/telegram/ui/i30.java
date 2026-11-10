package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i30 extends v4.o {
    public final f40 f46474b;

    public i30(f40 f40Var) {
        this.f46474b = f40Var;
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
        f40 f40Var = this.f46474b;
        z30 z30Var = f40Var.J1;
        int i16 = z30Var.f52202x;
        if (i16 >= 0) {
            int i17 = f40Var.f45511b5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = z30Var.f52203y;
        if (i18 >= 0) {
            int i19 = f40Var.f45562o5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = z30Var.D;
        if (i20 >= 0) {
            int i21 = f40Var.f45567p5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = z30Var.K;
        if (i22 >= 0) {
            int i23 = f40Var.f45507a5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = z30Var.J;
        if (i24 >= 0) {
            int i25 = f40Var.f45558n5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = z30Var.I;
        if (i26 >= 0 && i26 == i10 && i7 == f40Var.f45554m5) {
            return true;
        }
        int i27 = f40Var.C2;
        if (i7 == i27 - 1 && i10 == z30Var.F - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != z30Var.F - 1) {
            if (i10 >= z30Var.G && i10 < z30Var.H && i7 >= (i15 = f40Var.f45545k5) && i7 < f40Var.f45549l5) {
                return ((org.telegram.messenger.s3) f40Var.f45607y2.get(i7 - i15)).equals((org.telegram.messenger.s3) f40Var.f45542k2.get(i10 - f40Var.J1.G));
            }
            if (i10 >= z30Var.d && i10 < z30Var.f52196e && i7 >= (i14 = f40Var.f45515c5) && i7 < f40Var.f45518d5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.f45603x2.get(i7 - i14);
                if (org.telegram.messenger.ij.B1(groupCallParticipant.peer) != org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) f40Var.U2.f25230g.get(i10 - f40Var.J1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= z30Var.f52197f && i10 < z30Var.h && i7 >= (i13 = f40Var.f45522e5) && i7 < f40Var.f45526f5) {
                return ((Long) f40Var.f45611z2.get(i7 - i13)).equals((Long) f40Var.U2.f25232j.get(i10 - f40Var.J1.f52197f));
            } else {
                if (i10 >= z30Var.f52198n && i10 < z30Var.f52199r && i7 >= (i12 = f40Var.f45530g5) && i7 < f40Var.f45534h5) {
                    return ((Long) f40Var.A2.get(i7 - i12)).equals((Long) f40Var.U2.f25235m.get(i10 - f40Var.J1.f52198n));
                }
                if (i10 >= z30Var.f52200s && i10 < z30Var.f52201w && i7 >= (i11 = f40Var.f45538i5) && i7 < f40Var.f45541j5) {
                    return ((Long) f40Var.B2.get(i7 - i11)).equals((Long) f40Var.U2.f25234l.get(i10 - f40Var.J1.f52200s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46474b.J1.F;
    }

    @Override
    public final int e() {
        return this.f46474b.C2;
    }
}
