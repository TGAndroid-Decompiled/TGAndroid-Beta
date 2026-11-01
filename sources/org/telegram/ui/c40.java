package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class c40 extends s4.n {
    public final a50 f36181b;

    public c40(a50 a50Var) {
        this.f36181b = a50Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        a50 a50Var = this.f36181b;
        u40 u40Var = a50Var.G1;
        int i17 = u40Var.f41793x;
        if (i17 >= 0) {
            int i18 = a50Var.Y4;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = u40Var.f41794y;
        if (i19 >= 0) {
            int i20 = a50Var.f35627l5;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = u40Var.D;
        if (i21 >= 0) {
            int i22 = a50Var.f35632m5;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = u40Var.K;
        if (i23 >= 0) {
            int i24 = a50Var.X4;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = u40Var.J;
        if (i25 >= 0) {
            int i26 = a50Var.f35624k5;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = u40Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == a50Var.f35619j5) {
            return true;
        }
        int i28 = a50Var.f35687z2;
        if (i10 == i28 - 1 && i11 == u40Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != u40Var.F - 1) {
            if (i11 >= u40Var.G && i11 < u40Var.H && i10 >= (i16 = a50Var.f35609h5) && i10 < a50Var.f35614i5) {
                return ((org.telegram.messenger.v3) a50Var.f35672v2.get(i10 - i16)).equals((org.telegram.messenger.v3) a50Var.f35606h2.get(i11 - a50Var.G1.G));
            }
            if (i11 >= u40Var.d && i11 < u40Var.e && i10 >= (i15 = a50Var.Z4) && i10 < a50Var.f35581a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) a50Var.f35668u2.get(i10 - i15);
                if (org.telegram.messenger.kj.C1(groupCallParticipant.peer) != org.telegram.messenger.kj.C1(((TLRPC.GroupCallParticipant) a50Var.R2.f18364g.get(i11 - a50Var.G1.d)).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= u40Var.f41788f && i11 < u40Var.h && i10 >= (i14 = a50Var.f35585b5) && i10 < a50Var.f35589c5) {
                return ((Long) a50Var.f35676w2.get(i10 - i14)).equals((Long) a50Var.R2.f18366j.get(i11 - a50Var.G1.f41788f));
            } else {
                if (i11 >= u40Var.f41789n && i11 < u40Var.f41790r && i10 >= (i13 = a50Var.f35593d5) && i10 < a50Var.f35597e5) {
                    return ((Long) a50Var.f35680x2.get(i10 - i13)).equals((Long) a50Var.R2.f18369m.get(i11 - a50Var.G1.f41789n));
                }
                if (i11 >= u40Var.f41791s && i11 < u40Var.f41792w && i10 >= (i12 = a50Var.f35601f5) && i10 < a50Var.f35605g5) {
                    return ((Long) a50Var.f35684y2.get(i10 - i12)).equals((Long) a50Var.R2.f18368l.get(i11 - a50Var.G1.f41791s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36181b.G1.F;
    }

    @Override
    public final int e() {
        return this.f36181b.f35687z2;
    }
}
