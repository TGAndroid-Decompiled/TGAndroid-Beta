package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class d40 extends s4.n {
    public final b50 f36613b;

    public d40(b50 b50Var) {
        this.f36613b = b50Var;
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
        b50 b50Var = this.f36613b;
        v40 v40Var = b50Var.G1;
        int i17 = v40Var.f42603x;
        if (i17 >= 0) {
            int i18 = b50Var.Y4;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = v40Var.f42604y;
        if (i19 >= 0) {
            int i20 = b50Var.f36043l5;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = v40Var.D;
        if (i21 >= 0) {
            int i22 = b50Var.f36048m5;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = v40Var.K;
        if (i23 >= 0) {
            int i24 = b50Var.X4;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = v40Var.J;
        if (i25 >= 0) {
            int i26 = b50Var.f36040k5;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = v40Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == b50Var.f36035j5) {
            return true;
        }
        int i28 = b50Var.f36103z2;
        if (i10 == i28 - 1 && i11 == v40Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != v40Var.F - 1) {
            if (i11 >= v40Var.G && i11 < v40Var.H && i10 >= (i16 = b50Var.f36025h5) && i10 < b50Var.f36030i5) {
                return ((org.telegram.messenger.v3) b50Var.f36088v2.get(i10 - i16)).equals((org.telegram.messenger.v3) b50Var.f36022h2.get(i11 - b50Var.G1.G));
            }
            if (i11 >= v40Var.d && i11 < v40Var.e && i10 >= (i15 = b50Var.Z4) && i10 < b50Var.f35997a5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) b50Var.f36084u2.get(i10 - i15);
                if (org.telegram.messenger.jj.C1(groupCallParticipant.peer) != org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) b50Var.R2.f18231g.get(i11 - b50Var.G1.d)).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= v40Var.f42598f && i11 < v40Var.h && i10 >= (i14 = b50Var.f36001b5) && i10 < b50Var.f36005c5) {
                return ((Long) b50Var.f36092w2.get(i10 - i14)).equals((Long) b50Var.R2.f18233j.get(i11 - b50Var.G1.f42598f));
            } else {
                if (i11 >= v40Var.f42599n && i11 < v40Var.f42600r && i10 >= (i13 = b50Var.f36009d5) && i10 < b50Var.f36013e5) {
                    return ((Long) b50Var.f36096x2.get(i10 - i13)).equals((Long) b50Var.R2.f18236m.get(i11 - b50Var.G1.f42599n));
                }
                if (i11 >= v40Var.f42601s && i11 < v40Var.f42602w && i10 >= (i12 = b50Var.f36017f5) && i10 < b50Var.f36021g5) {
                    return ((Long) b50Var.f36100y2.get(i10 - i12)).equals((Long) b50Var.R2.f18235l.get(i11 - b50Var.G1.f42601s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36613b.G1.F;
    }

    @Override
    public final int e() {
        return this.f36613b.f36103z2;
    }
}
