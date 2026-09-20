package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j50 extends s4.o {
    public final i60 f34766b;

    public j50(i60 i60Var) {
        this.f34766b = i60Var;
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
        i60 i60Var = this.f34766b;
        c60 c60Var = i60Var.P;
        int i17 = c60Var.f32644w;
        if (i17 >= 0) {
            int i18 = i60Var.f34392h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = c60Var.f32645x;
        if (i19 >= 0) {
            int i20 = i60Var.f34444u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = c60Var.f32646y;
        if (i21 >= 0) {
            int i22 = i60Var.f34448v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = c60Var.K;
        if (i23 >= 0) {
            int i24 = i60Var.f34388g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = c60Var.J;
        if (i25 >= 0) {
            int i26 = i60Var.f34440t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = c60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == i60Var.f34436s3) {
            return true;
        }
        int i28 = i60Var.I0;
        if (i10 == i28 - 1 && i11 == c60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != c60Var.F - 1) {
            if (i11 >= c60Var.G && i11 < c60Var.H && i10 >= (i16 = i60Var.f34426q3) && i10 < i60Var.f34431r3) {
                return ((ChatObject.VideoParticipant) i60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) i60Var.f34423q0.get(i11 - i60Var.P.G));
            }
            if (i11 >= c60Var.d && i11 < c60Var.e && i10 >= (i15 = i60Var.f34396i3) && i10 < i60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) i60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(i60Var.f34360a1.visibleParticipants.get(i11 - i60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= c60Var.f32640f && i11 < c60Var.h && i10 >= (i14 = i60Var.f34403k3) && i10 < i60Var.f34406l3) {
                return ((Long) i60Var.F0.get(i10 - i14)).equals(i60Var.f34360a1.invitedUsers.get(i11 - i60Var.P.f32640f));
            } else {
                if (i11 >= c60Var.f32641n && i11 < c60Var.f32642r && i10 >= (i13 = i60Var.f34409m3) && i10 < i60Var.f34414n3) {
                    return ((Long) i60Var.G0.get(i10 - i13)).equals(i60Var.f34360a1.shadyJoinParticipants.get(i11 - i60Var.P.f32641n));
                }
                if (i11 >= c60Var.f32643s && i11 < c60Var.v && i10 >= (i12 = i60Var.f34418o3) && i10 < i60Var.f34422p3) {
                    return ((Long) i60Var.H0.get(i10 - i12)).equals(i60Var.f34360a1.shadyLeftParticipants.get(i11 - i60Var.P.f32643s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34766b.P.F;
    }

    @Override
    public final int e() {
        return this.f34766b.I0;
    }
}
