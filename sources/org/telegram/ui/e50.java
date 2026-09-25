package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class e50 extends s4.o {
    public final d60 f33276b;

    public e50(d60 d60Var) {
        this.f33276b = d60Var;
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
        d60 d60Var = this.f33276b;
        x50 x50Var = d60Var.P;
        int i17 = x50Var.f39837w;
        if (i17 >= 0) {
            int i18 = d60Var.f32968h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = x50Var.f39838x;
        if (i19 >= 0) {
            int i20 = d60Var.f33020u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = x50Var.f39839y;
        if (i21 >= 0) {
            int i22 = d60Var.f33024v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = x50Var.K;
        if (i23 >= 0) {
            int i24 = d60Var.f32964g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = x50Var.J;
        if (i25 >= 0) {
            int i26 = d60Var.f33016t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = x50Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == d60Var.f33012s3) {
            return true;
        }
        int i28 = d60Var.I0;
        if (i10 == i28 - 1 && i11 == x50Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != x50Var.F - 1) {
            if (i11 >= x50Var.G && i11 < x50Var.H && i10 >= (i16 = d60Var.f33002q3) && i10 < d60Var.f33007r3) {
                return ((ChatObject.VideoParticipant) d60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) d60Var.f32999q0.get(i11 - d60Var.P.G));
            }
            if (i11 >= x50Var.d && i11 < x50Var.e && i10 >= (i15 = d60Var.f32972i3) && i10 < d60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) d60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(d60Var.f32936a1.visibleParticipants.get(i11 - d60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= x50Var.f39833f && i11 < x50Var.h && i10 >= (i14 = d60Var.f32979k3) && i10 < d60Var.f32982l3) {
                return ((Long) d60Var.F0.get(i10 - i14)).equals(d60Var.f32936a1.invitedUsers.get(i11 - d60Var.P.f39833f));
            } else {
                if (i11 >= x50Var.f39834n && i11 < x50Var.f39835r && i10 >= (i13 = d60Var.f32985m3) && i10 < d60Var.f32990n3) {
                    return ((Long) d60Var.G0.get(i10 - i13)).equals(d60Var.f32936a1.shadyJoinParticipants.get(i11 - d60Var.P.f39834n));
                }
                if (i11 >= x50Var.f39836s && i11 < x50Var.v && i10 >= (i12 = d60Var.f32994o3) && i10 < d60Var.f32998p3) {
                    return ((Long) d60Var.H0.get(i10 - i12)).equals(d60Var.f32936a1.shadyLeftParticipants.get(i11 - d60Var.P.f39836s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33276b.P.F;
    }

    @Override
    public final int e() {
        return this.f33276b.I0;
    }
}
