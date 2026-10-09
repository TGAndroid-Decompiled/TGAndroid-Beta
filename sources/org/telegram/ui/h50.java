package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h50 extends s4.o {
    public final g60 f38211b;

    public h50(g60 g60Var) {
        this.f38211b = g60Var;
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
        g60 g60Var = this.f38211b;
        a60 a60Var = g60Var.P;
        int i17 = a60Var.f35847w;
        if (i17 >= 0) {
            int i18 = g60Var.f37820h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = a60Var.f35848x;
        if (i19 >= 0) {
            int i20 = g60Var.f37872u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = a60Var.f35849y;
        if (i21 >= 0) {
            int i22 = g60Var.f37876v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = a60Var.K;
        if (i23 >= 0) {
            int i24 = g60Var.f37816g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = a60Var.J;
        if (i25 >= 0) {
            int i26 = g60Var.f37868t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = a60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == g60Var.f37864s3) {
            return true;
        }
        int i28 = g60Var.I0;
        if (i10 == i28 - 1 && i11 == a60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != a60Var.F - 1) {
            if (i11 >= a60Var.G && i11 < a60Var.H && i10 >= (i16 = g60Var.f37854q3) && i10 < g60Var.f37859r3) {
                return ((ChatObject.VideoParticipant) g60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) g60Var.f37851q0.get(i11 - g60Var.P.G));
            }
            if (i11 >= a60Var.d && i11 < a60Var.f35842e && i10 >= (i15 = g60Var.f37824i3) && i10 < g60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) g60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(g60Var.f37787a1.visibleParticipants.get(i11 - g60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= a60Var.f35843f && i11 < a60Var.h && i10 >= (i14 = g60Var.f37831k3) && i10 < g60Var.f37834l3) {
                return ((Long) g60Var.F0.get(i10 - i14)).equals(g60Var.f37787a1.invitedUsers.get(i11 - g60Var.P.f35843f));
            } else {
                if (i11 >= a60Var.f35844n && i11 < a60Var.f35845r && i10 >= (i13 = g60Var.f37837m3) && i10 < g60Var.f37842n3) {
                    return ((Long) g60Var.G0.get(i10 - i13)).equals(g60Var.f37787a1.shadyJoinParticipants.get(i11 - g60Var.P.f35844n));
                }
                if (i11 >= a60Var.f35846s && i11 < a60Var.v && i10 >= (i12 = g60Var.f37846o3) && i10 < g60Var.f37850p3) {
                    return ((Long) g60Var.H0.get(i10 - i12)).equals(g60Var.f37787a1.shadyLeftParticipants.get(i11 - g60Var.P.f35846s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38211b.P.F;
    }

    @Override
    public final int e() {
        return this.f38211b.I0;
    }
}
