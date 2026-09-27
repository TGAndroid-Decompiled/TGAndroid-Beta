package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h50 extends s4.o {
    public final g60 f34137b;

    public h50(g60 g60Var) {
        this.f34137b = g60Var;
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
        g60 g60Var = this.f34137b;
        a60 a60Var = g60Var.P;
        int i17 = a60Var.f31977w;
        if (i17 >= 0) {
            int i18 = g60Var.f33758h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = a60Var.f31978x;
        if (i19 >= 0) {
            int i20 = g60Var.f33810u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = a60Var.f31979y;
        if (i21 >= 0) {
            int i22 = g60Var.f33814v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = a60Var.K;
        if (i23 >= 0) {
            int i24 = g60Var.f33754g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = a60Var.J;
        if (i25 >= 0) {
            int i26 = g60Var.f33806t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = a60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == g60Var.f33802s3) {
            return true;
        }
        int i28 = g60Var.I0;
        if (i10 == i28 - 1 && i11 == a60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != a60Var.F - 1) {
            if (i11 >= a60Var.G && i11 < a60Var.H && i10 >= (i16 = g60Var.f33792q3) && i10 < g60Var.f33797r3) {
                return ((ChatObject.VideoParticipant) g60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) g60Var.f33789q0.get(i11 - g60Var.P.G));
            }
            if (i11 >= a60Var.d && i11 < a60Var.e && i10 >= (i15 = g60Var.f33762i3) && i10 < g60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) g60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(g60Var.f33726a1.visibleParticipants.get(i11 - g60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= a60Var.f31973f && i11 < a60Var.h && i10 >= (i14 = g60Var.f33769k3) && i10 < g60Var.f33772l3) {
                return ((Long) g60Var.F0.get(i10 - i14)).equals(g60Var.f33726a1.invitedUsers.get(i11 - g60Var.P.f31973f));
            } else {
                if (i11 >= a60Var.f31974n && i11 < a60Var.f31975r && i10 >= (i13 = g60Var.f33775m3) && i10 < g60Var.f33780n3) {
                    return ((Long) g60Var.G0.get(i10 - i13)).equals(g60Var.f33726a1.shadyJoinParticipants.get(i11 - g60Var.P.f31974n));
                }
                if (i11 >= a60Var.f31976s && i11 < a60Var.v && i10 >= (i12 = g60Var.f33784o3) && i10 < g60Var.f33788p3) {
                    return ((Long) g60Var.H0.get(i10 - i12)).equals(g60Var.f33726a1.shadyLeftParticipants.get(i11 - g60Var.P.f31976s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34137b.P.F;
    }

    @Override
    public final int e() {
        return this.f34137b.I0;
    }
}
