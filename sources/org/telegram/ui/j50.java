package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j50 extends s4.o {
    public final h60 f37581b;

    public j50(h60 h60Var) {
        this.f37581b = h60Var;
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
        h60 h60Var = this.f37581b;
        b60 b60Var = h60Var.P;
        int i17 = b60Var.f35006w;
        if (i17 >= 0) {
            int i18 = h60Var.f36906h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = b60Var.f35007x;
        if (i19 >= 0) {
            int i20 = h60Var.f36958u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = b60Var.f35008y;
        if (i21 >= 0) {
            int i22 = h60Var.f36962v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = b60Var.K;
        if (i23 >= 0) {
            int i24 = h60Var.f36902g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = b60Var.J;
        if (i25 >= 0) {
            int i26 = h60Var.f36954t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = b60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == h60Var.f36950s3) {
            return true;
        }
        int i28 = h60Var.I0;
        if (i10 == i28 - 1 && i11 == b60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != b60Var.F - 1) {
            if (i11 >= b60Var.G && i11 < b60Var.H && i10 >= (i16 = h60Var.f36940q3) && i10 < h60Var.f36945r3) {
                return ((ChatObject.VideoParticipant) h60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) h60Var.f36937q0.get(i11 - h60Var.P.G));
            }
            if (i11 >= b60Var.d && i11 < b60Var.f35001e && i10 >= (i15 = h60Var.f36910i3) && i10 < h60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) h60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(h60Var.f36873a1.visibleParticipants.get(i11 - h60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= b60Var.f35002f && i11 < b60Var.h && i10 >= (i14 = h60Var.f36917k3) && i10 < h60Var.f36920l3) {
                return ((Long) h60Var.F0.get(i10 - i14)).equals(h60Var.f36873a1.invitedUsers.get(i11 - h60Var.P.f35002f));
            } else {
                if (i11 >= b60Var.f35003n && i11 < b60Var.f35004r && i10 >= (i13 = h60Var.f36923m3) && i10 < h60Var.f36928n3) {
                    return ((Long) h60Var.G0.get(i10 - i13)).equals(h60Var.f36873a1.shadyJoinParticipants.get(i11 - h60Var.P.f35003n));
                }
                if (i11 >= b60Var.f35005s && i11 < b60Var.v && i10 >= (i12 = h60Var.f36932o3) && i10 < h60Var.f36936p3) {
                    return ((Long) h60Var.H0.get(i10 - i12)).equals(h60Var.f36873a1.shadyLeftParticipants.get(i11 - h60Var.P.f35005s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37581b.P.F;
    }

    @Override
    public final int e() {
        return this.f37581b.I0;
    }
}
