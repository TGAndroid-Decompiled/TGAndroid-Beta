package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class f50 extends f2.q {
    public final d60 f36664b;

    public f50(d60 d60Var) {
        this.f36664b = d60Var;
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
        d60 d60Var = this.f36664b;
        x50 x50Var = d60Var.M;
        int i17 = x50Var.f42933w;
        if (i17 >= 0) {
            int i18 = d60Var.f36010e3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = x50Var.f42934x;
        if (i19 >= 0) {
            int i20 = d60Var.f36063r3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = x50Var.f42935y;
        if (i21 >= 0) {
            int i22 = d60Var.f36068s3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = x50Var.H;
        if (i23 >= 0) {
            int i24 = d60Var.f36005d3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = x50Var.G;
        if (i25 >= 0) {
            int i26 = d60Var.f36058q3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = x50Var.F;
        if (i27 >= 0 && i27 == i11 && i10 == d60Var.f36054p3) {
            return true;
        }
        int i28 = d60Var.F0;
        if (i10 == i28 - 1 && i11 == x50Var.C - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != x50Var.C - 1) {
            if (i11 >= x50Var.D && i11 < x50Var.E && i10 >= (i16 = d60Var.f36046n3) && i10 < d60Var.f36050o3) {
                return ((ChatObject.VideoParticipant) d60Var.B0.get(i10 - i16)).equals((ChatObject.VideoParticipant) d60Var.f36043n0.get(i11 - d60Var.M.D));
            }
            if (i11 >= x50Var.d && i11 < x50Var.f42928e && i10 >= (i15 = d60Var.f36015f3) && i10 < d60Var.f36019g3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) d60Var.A0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(d60Var.X0.visibleParticipants.get(i11 - d60Var.M.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= x50Var.f42929f && i11 < x50Var.h && i10 >= (i14 = d60Var.f36023h3) && i10 < d60Var.f36027i3) {
                return ((Long) d60Var.C0.get(i10 - i14)).equals(d60Var.X0.invitedUsers.get(i11 - d60Var.M.f42929f));
            } else {
                if (i11 >= x50Var.f42930n && i11 < x50Var.f42931r && i10 >= (i13 = d60Var.f36031j3) && i10 < d60Var.f36035k3) {
                    return ((Long) d60Var.D0.get(i10 - i13)).equals(d60Var.X0.shadyJoinParticipants.get(i11 - d60Var.M.f42930n));
                }
                if (i11 >= x50Var.f42932s && i11 < x50Var.v && i10 >= (i12 = d60Var.f36038l3) && i10 < d60Var.f36041m3) {
                    return ((Long) d60Var.E0.get(i10 - i12)).equals(d60Var.X0.shadyLeftParticipants.get(i11 - d60Var.M.f42932s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36664b.M.C;
    }

    @Override
    public final int e() {
        return this.f36664b.F0;
    }
}
