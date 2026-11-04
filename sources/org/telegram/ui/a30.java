package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class a30 extends u4.o {
    public final x30 f43583b;

    public a30(x30 x30Var) {
        this.f43583b = x30Var;
    }

    @Override
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        x30 x30Var = this.f43583b;
        r30 r30Var = x30Var.H1;
        int i16 = r30Var.f49020x;
        if (i16 >= 0) {
            int i17 = x30Var.Z4;
            if (i3 == i17 && i10 == i16) {
                return true;
            }
            if ((i3 == i17 && i10 != i16) || (i3 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = r30Var.f49021y;
        if (i18 >= 0) {
            int i19 = x30Var.f51767m5;
            if (i3 == i19 && i10 == i18) {
                return true;
            }
            if ((i3 == i19 && i10 != i18) || (i3 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = r30Var.E;
        if (i20 >= 0) {
            int i21 = x30Var.f51771n5;
            if (i3 == i21 && i10 == i20) {
                return true;
            }
            if ((i3 == i21 && i10 != i20) || (i3 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = r30Var.L;
        if (i22 >= 0) {
            int i23 = x30Var.Y4;
            if (i3 == i23 && i10 == i22) {
                return true;
            }
            if ((i3 == i23 && i10 != i22) || (i3 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = r30Var.K;
        if (i24 >= 0) {
            int i25 = x30Var.f51763l5;
            if (i3 == i25 && i10 == i24) {
                return true;
            }
            if ((i3 == i25 && i10 != i24) || (i3 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = r30Var.J;
        if (i26 >= 0 && i26 == i10 && i3 == x30Var.f51758k5) {
            return true;
        }
        int i27 = x30Var.A2;
        if (i3 == i27 - 1 && i10 == r30Var.G - 1) {
            return true;
        }
        if (i3 != i27 - 1 && i10 != r30Var.G - 1) {
            if (i10 >= r30Var.H && i10 < r30Var.I && i3 >= (i15 = x30Var.f51749i5) && i3 < x30Var.f51754j5) {
                return ((org.telegram.messenger.s3) x30Var.f51811w2.get(i3 - i15)).equals((org.telegram.messenger.s3) x30Var.f51747i2.get(i10 - x30Var.H1.H));
            }
            if (i10 >= r30Var.d && i10 < r30Var.f49014e && i3 >= (i14 = x30Var.f51719a5) && i3 < x30Var.f51723b5) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x30Var.f51807v2.get(i3 - i14);
                if (org.telegram.messenger.zi.C1(groupCallParticipant.peer) != org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) x30Var.S2.f25053g.get(i10 - x30Var.H1.d)).peer) || (i3 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= r30Var.f49015f && i10 < r30Var.h && i3 >= (i13 = x30Var.f51726c5) && i3 < x30Var.f51730d5) {
                return ((Long) x30Var.f51815x2.get(i3 - i13)).equals((Long) x30Var.S2.f25055j.get(i10 - x30Var.H1.f49015f));
            } else {
                if (i10 >= r30Var.f49016n && i10 < r30Var.f49017r && i3 >= (i12 = x30Var.f51734e5) && i3 < x30Var.f51738f5) {
                    return ((Long) x30Var.f51819y2.get(i3 - i12)).equals((Long) x30Var.S2.f25058m.get(i10 - x30Var.H1.f49016n));
                }
                if (i10 >= r30Var.f49018s && i10 < r30Var.f49019w && i3 >= (i11 = x30Var.f51742g5) && i3 < x30Var.f51746h5) {
                    return ((Long) x30Var.f51823z2.get(i3 - i11)).equals((Long) x30Var.S2.f25057l.get(i10 - x30Var.H1.f49018s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f43583b.H1.G;
    }

    @Override
    public final int e() {
        return this.f43583b.A2;
    }
}
