package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i30 extends v4.o {
    public final f40 f48539b;

    public i30(f40 f40Var) {
        this.f48539b = f40Var;
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
        f40 f40Var = this.f48539b;
        z30 z30Var = f40Var.K1;
        int i16 = z30Var.f54361x;
        if (i16 >= 0) {
            int i17 = f40Var.f47459g5;
            if (i7 == i17 && i10 == i16) {
                return true;
            }
            if ((i7 == i17 && i10 != i16) || (i7 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = z30Var.f54362y;
        if (i18 >= 0) {
            int i19 = f40Var.f47515t5;
            if (i7 == i19 && i10 == i18) {
                return true;
            }
            if ((i7 == i19 && i10 != i18) || (i7 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = z30Var.E;
        if (i20 >= 0) {
            int i21 = f40Var.f47520u5;
            if (i7 == i21 && i10 == i20) {
                return true;
            }
            if ((i7 == i21 && i10 != i20) || (i7 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = z30Var.L;
        if (i22 >= 0) {
            int i23 = f40Var.f47455f5;
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
        if (i26 >= 0 && i26 == i10 && i7 == f40Var.f47506r5) {
            return true;
        }
        int i27 = f40Var.D2;
        if (i7 == i27 - 1 && i10 == z30Var.G - 1) {
            return true;
        }
        if (i7 != i27 - 1 && i10 != z30Var.G - 1) {
            if (i10 >= z30Var.H && i10 < z30Var.I && i7 >= (i15 = f40Var.f47496p5) && i7 < f40Var.f47501q5) {
                return ((org.telegram.messenger.u3) f40Var.f47542z2.get(i7 - i15)).equals((org.telegram.messenger.u3) f40Var.f47475l2.get(i10 - f40Var.K1.H));
            }
            if (i10 >= z30Var.d && i10 < z30Var.f54355e && i7 >= (i14 = f40Var.f47463h5) && i7 < f40Var.f47467i5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.f47537y2.get(i7 - i14);
                if (org.telegram.messenger.gj.B1(groupCallParticipant.peer) != org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) f40Var.V2.f26918g.get(i10 - f40Var.K1.d)).peer) || (i7 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= z30Var.f54356f && i10 < z30Var.h && i7 >= (i13 = f40Var.f47470j5) && i7 < f40Var.f47474k5) {
                return ((Long) f40Var.A2.get(i7 - i13)).equals((Long) f40Var.V2.f26920j.get(i10 - f40Var.K1.f54356f));
            } else {
                if (i10 >= z30Var.f54357n && i10 < z30Var.f54358r && i7 >= (i12 = f40Var.f47478l5) && i7 < f40Var.f47483m5) {
                    return ((Long) f40Var.B2.get(i7 - i12)).equals((Long) f40Var.V2.f26923m.get(i10 - f40Var.K1.f54357n));
                }
                if (i10 >= z30Var.f54359s && i10 < z30Var.f54360w && i7 >= (i11 = f40Var.f47487n5) && i7 < f40Var.f47491o5) {
                    return ((Long) f40Var.C2.get(i7 - i11)).equals((Long) f40Var.V2.f26922l.get(i10 - f40Var.K1.f54359s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f48539b.K1.G;
    }

    @Override
    public final int e() {
        return this.f48539b.D2;
    }
}
