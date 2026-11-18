package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i30 extends v4.o {
    public final f40 f48525b;

    public i30(f40 f40Var) {
        this.f48525b = f40Var;
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
        f40 f40Var = this.f48525b;
        z30 z30Var = f40Var.K1;
        int i16 = z30Var.f54350x;
        if (i16 >= 0) {
            int i17 = f40Var.f47425g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = z30Var.f54351y;
        if (i18 >= 0) {
            int i19 = f40Var.f47481t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = z30Var.E;
        if (i20 >= 0) {
            int i21 = f40Var.f47486u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = z30Var.L;
        if (i22 >= 0) {
            int i23 = f40Var.f47421f5;
            if (i7 == i23 && i10 == i22) {
                return true;
            }
            if ((i7 == i23 && i10 != i22) || (i7 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = z30Var.K;
        if (i24 >= 0) {
            int i25 = f40Var.s5;
            if (i7 == i25 && i10 == i24) {
                return true;
            }
            if ((i7 == i25 && i10 != i24) || (i7 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = z30Var.J;
        if (i26 >= 0 && i26 == i10 && i7 == f40Var.f47472r5) {
            return true;
        }
        int i27 = f40Var.D2;
        if (i7 == i27 - 1 && i10 == z30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != z30Var.G - 1) {
            if (i10 >= z30Var.H && i10 < z30Var.I && i7 >= (i15 = f40Var.f47462p5) && i7 < f40Var.f47467q5) {
                return ((org.telegram.messenger.u3) f40Var.f47508z2.get(i7 - i15)).equals((org.telegram.messenger.u3) f40Var.f47441l2.get(i10 - f40Var.K1.H));
            }
            if (i10 >= z30Var.d && i10 < z30Var.f54344e && i7 >= (i14 = f40Var.f47429h5) && i7 < f40Var.f47433i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.f47503y2.get(i7 - i14);
                if (org.telegram.messenger.fj.B1(groupCallParticipant.peer) != org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) f40Var.V2.f26939g.get(i10 - f40Var.K1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= z30Var.f54345f && i10 < z30Var.h && i7 >= (i13 = f40Var.f47436j5) && i7 < f40Var.f47440k5) {
                return ((Long) f40Var.A2.get(i7 - i13)).equals((Long) f40Var.V2.f26941j.get(i10 - f40Var.K1.f54345f));
            } else {
                if (i10 >= z30Var.f54346n && i10 < z30Var.f54347r && i7 >= (i12 = f40Var.f47444l5) && i7 < f40Var.f47449m5) {
                    return ((Long) f40Var.B2.get(i7 - i12)).equals((Long) f40Var.V2.f26944m.get(i10 - f40Var.K1.f54346n));
                }
                if (i10 >= z30Var.f54348s && i10 < z30Var.f54349w && i7 >= (i11 = f40Var.f47453n5) && i7 < f40Var.f47457o5) {
                    return ((Long) f40Var.C2.get(i7 - i11)).equals((Long) f40Var.V2.f26943l.get(i10 - f40Var.K1.f54348s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f48525b.K1.G;
    }

    @Override
    public final int e() {
        return this.f48525b.D2;
    }
}
