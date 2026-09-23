package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g50 extends s4.o {
    public final f60 f33465b;

    public g50(f60 f60Var) {
        this.f33465b = f60Var;
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
        f60 f60Var = this.f33465b;
        z50 z50Var = f60Var.P;
        int i17 = z50Var.f39966w;
        if (i17 >= 0) {
            int i18 = f60Var.f33131h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = z50Var.f39967x;
        if (i19 >= 0) {
            int i20 = f60Var.f33183u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = z50Var.f39968y;
        if (i21 >= 0) {
            int i22 = f60Var.f33187v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = z50Var.K;
        if (i23 >= 0) {
            int i24 = f60Var.f33127g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = z50Var.J;
        if (i25 >= 0) {
            int i26 = f60Var.f33179t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = z50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == f60Var.f33175s3) {
            return true;
        }
        int i28 = f60Var.I0;
        if (i10 == i28 - 1 && i11 == z50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != z50Var.F - 1) {
            if (i11 >= z50Var.G && i11 < z50Var.H && i10 >= (i16 = f60Var.f33165q3) && i10 < f60Var.f33170r3) {
                return ((ChatObject.VideoParticipant) f60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) f60Var.f33162q0.get(i11 - f60Var.P.G));
            }
            if (i11 >= z50Var.d && i11 < z50Var.e && i10 >= (i15 = f60Var.f33135i3) && i10 < f60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) f60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(f60Var.f33099a1.visibleParticipants.get(i11 - f60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= z50Var.f39962f && i11 < z50Var.h && i10 >= (i14 = f60Var.f33142k3) && i10 < f60Var.f33145l3) {
                return ((Long) f60Var.F0.get(i10 - i14)).equals(f60Var.f33099a1.invitedUsers.get(i11 - f60Var.P.f39962f));
            } else {
                if (i11 >= z50Var.f39963n && i11 < z50Var.f39964r && i10 >= (i13 = f60Var.f33148m3) && i10 < f60Var.f33153n3) {
                    return ((Long) f60Var.G0.get(i10 - i13)).equals(f60Var.f33099a1.shadyJoinParticipants.get(i11 - f60Var.P.f39963n));
                }
                if (i11 >= z50Var.f39965s && i11 < z50Var.v && i10 >= (i12 = f60Var.f33157o3) && i10 < f60Var.f33161p3) {
                    return ((Long) f60Var.H0.get(i10 - i12)).equals(f60Var.f33099a1.shadyLeftParticipants.get(i11 - f60Var.P.f39965s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33465b.P.F;
    }

    @Override
    public final int e() {
        return this.f33465b.I0;
    }
}
