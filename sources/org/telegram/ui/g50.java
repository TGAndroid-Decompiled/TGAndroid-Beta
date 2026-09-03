package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g50 extends f2.q {
    public final e60 f34327b;

    public g50(e60 e60Var) {
        this.f34327b = e60Var;
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
        e60 e60Var = this.f34327b;
        y50 y50Var = e60Var.M;
        int i17 = y50Var.f40147w;
        if (i17 >= 0) {
            int i18 = e60Var.f33636e3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = y50Var.f40148x;
        if (i19 >= 0) {
            int i20 = e60Var.f33689r3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = y50Var.f40149y;
        if (i21 >= 0) {
            int i22 = e60Var.f33694s3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = y50Var.H;
        if (i23 >= 0) {
            int i24 = e60Var.f33632d3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = y50Var.G;
        if (i25 >= 0) {
            int i26 = e60Var.f33684q3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = y50Var.F;
        if (i27 >= 0 && i27 == i11 && i10 == e60Var.f33680p3) {
            return true;
        }
        int i28 = e60Var.F0;
        if (i10 == i28 - 1 && i11 == y50Var.C - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != y50Var.C - 1) {
            if (i11 >= y50Var.D && i11 < y50Var.E && i10 >= (i16 = e60Var.f33672n3) && i10 < e60Var.f33676o3) {
                return ((ChatObject.VideoParticipant) e60Var.B0.get(i10 - i16)).equals((ChatObject.VideoParticipant) e60Var.f33669n0.get(i11 - e60Var.M.D));
            }
            if (i11 >= y50Var.d && i11 < y50Var.e && i10 >= (i15 = e60Var.f33641f3) && i10 < e60Var.f33645g3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) e60Var.A0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(e60Var.X0.visibleParticipants.get(i11 - e60Var.M.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= y50Var.f40143f && i11 < y50Var.h && i10 >= (i14 = e60Var.f33649h3) && i10 < e60Var.f33653i3) {
                return ((Long) e60Var.C0.get(i10 - i14)).equals(e60Var.X0.invitedUsers.get(i11 - e60Var.M.f40143f));
            } else {
                if (i11 >= y50Var.f40144n && i11 < y50Var.f40145r && i10 >= (i13 = e60Var.f33657j3) && i10 < e60Var.f33661k3) {
                    return ((Long) e60Var.D0.get(i10 - i13)).equals(e60Var.X0.shadyJoinParticipants.get(i11 - e60Var.M.f40144n));
                }
                if (i11 >= y50Var.f40146s && i11 < y50Var.v && i10 >= (i12 = e60Var.f33664l3) && i10 < e60Var.f33667m3) {
                    return ((Long) e60Var.E0.get(i10 - i12)).equals(e60Var.X0.shadyLeftParticipants.get(i11 - e60Var.M.f40146s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34327b.M.C;
    }

    @Override
    public final int e() {
        return this.f34327b.F0;
    }
}
