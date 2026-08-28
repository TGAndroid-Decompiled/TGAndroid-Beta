package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p40 extends f2.s {
    public final o50 f41339b;

    public p40(o50 o50Var) {
        this.f41339b = o50Var;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        o50 o50Var = this.f41339b;
        i50 i50Var = o50Var.L;
        int i16 = i50Var.f39016w;
        if (i16 >= 0) {
            int i17 = o50Var.f40896d3;
            if (i9 == i17 && i10 == i16) {
                return true;
            }
            if ((i9 == i17 && i10 != i16) || (i9 != i17 && i10 == i16)) {
                return false;
            }
        }
        int i18 = i50Var.f39017x;
        if (i18 >= 0) {
            int i19 = o50Var.f40949q3;
            if (i9 == i19 && i10 == i18) {
                return true;
            }
            if ((i9 == i19 && i10 != i18) || (i9 != i19 && i10 == i18)) {
                return false;
            }
        }
        int i20 = i50Var.f39018y;
        if (i20 >= 0) {
            int i21 = o50Var.f40954r3;
            if (i9 == i21 && i10 == i20) {
                return true;
            }
            if ((i9 == i21 && i10 != i20) || (i9 != i21 && i10 == i20)) {
                return false;
            }
        }
        int i22 = i50Var.G;
        if (i22 >= 0) {
            int i23 = o50Var.f40892c3;
            if (i9 == i23 && i10 == i22) {
                return true;
            }
            if ((i9 == i23 && i10 != i22) || (i9 != i23 && i10 == i22)) {
                return false;
            }
        }
        int i24 = i50Var.F;
        if (i24 >= 0) {
            int i25 = o50Var.f40945p3;
            if (i9 == i25 && i10 == i24) {
                return true;
            }
            if ((i9 == i25 && i10 != i24) || (i9 != i25 && i10 == i24)) {
                return false;
            }
        }
        int i26 = i50Var.E;
        if (i26 >= 0 && i26 == i10 && i9 == o50Var.f40941o3) {
            return true;
        }
        int i27 = o50Var.E0;
        if (i9 == i27 - 1 && i10 == i50Var.B - 1) {
            return true;
        }
        if (i9 != i27 - 1 && i10 != i50Var.B - 1) {
            if (i10 >= i50Var.C && i10 < i50Var.D && i9 >= (i15 = o50Var.f40932m3) && i9 < o50Var.f40937n3) {
                return ((ChatObject.VideoParticipant) o50Var.A0.get(i9 - i15)).equals((ChatObject.VideoParticipant) o50Var.m0.get(i10 - o50Var.L.C));
            }
            if (i10 >= i50Var.d && i10 < i50Var.f39011e && i9 >= (i14 = o50Var.f40901e3) && i9 < o50Var.f40906f3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) o50Var.f40987z0.get(i9 - i14);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(o50Var.W0.visibleParticipants.get(i10 - o50Var.L.d).peer) || (i9 != i10 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i10 >= i50Var.f39012f && i10 < i50Var.h && i9 >= (i13 = o50Var.f40910g3) && i9 < o50Var.f40914h3) {
                return ((Long) o50Var.B0.get(i9 - i13)).equals(o50Var.W0.invitedUsers.get(i10 - o50Var.L.f39012f));
            } else {
                if (i10 >= i50Var.f39013n && i10 < i50Var.f39014r && i9 >= (i12 = o50Var.f40918i3) && i9 < o50Var.f40922j3) {
                    return ((Long) o50Var.C0.get(i9 - i12)).equals(o50Var.W0.shadyJoinParticipants.get(i10 - o50Var.L.f39013n));
                }
                if (i10 >= i50Var.f39015s && i10 < i50Var.v && i9 >= (i11 = o50Var.f40926k3) && i9 < o50Var.f40929l3) {
                    return ((Long) o50Var.D0.get(i9 - i11)).equals(o50Var.W0.shadyLeftParticipants.get(i10 - o50Var.L.f39015s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41339b.L.B;
    }

    @Override
    public final int e() {
        return this.f41339b.E0;
    }
}
