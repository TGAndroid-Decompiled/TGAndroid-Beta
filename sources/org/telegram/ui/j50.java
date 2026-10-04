package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j50 extends s4.o {
    public final h60 f37587b;

    public j50(h60 h60Var) {
        this.f37587b = h60Var;
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
        h60 h60Var = this.f37587b;
        b60 b60Var = h60Var.P;
        int i17 = b60Var.f35012w;
        if (i17 >= 0) {
            int i18 = h60Var.f36912h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = b60Var.f35013x;
        if (i19 >= 0) {
            int i20 = h60Var.f36964u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = b60Var.f35014y;
        if (i21 >= 0) {
            int i22 = h60Var.f36968v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = b60Var.K;
        if (i23 >= 0) {
            int i24 = h60Var.f36908g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = b60Var.J;
        if (i25 >= 0) {
            int i26 = h60Var.f36960t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = b60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == h60Var.f36956s3) {
            return true;
        }
        int i28 = h60Var.I0;
        if (i10 == i28 - 1 && i11 == b60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != b60Var.F - 1) {
            if (i11 >= b60Var.G && i11 < b60Var.H && i10 >= (i16 = h60Var.f36946q3) && i10 < h60Var.f36951r3) {
                return ((ChatObject.VideoParticipant) h60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) h60Var.f36943q0.get(i11 - h60Var.P.G));
            }
            if (i11 >= b60Var.d && i11 < b60Var.f35007e && i10 >= (i15 = h60Var.f36916i3) && i10 < h60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) h60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(h60Var.f36879a1.visibleParticipants.get(i11 - h60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= b60Var.f35008f && i11 < b60Var.h && i10 >= (i14 = h60Var.f36923k3) && i10 < h60Var.f36926l3) {
                return ((Long) h60Var.F0.get(i10 - i14)).equals(h60Var.f36879a1.invitedUsers.get(i11 - h60Var.P.f35008f));
            } else {
                if (i11 >= b60Var.f35009n && i11 < b60Var.f35010r && i10 >= (i13 = h60Var.f36929m3) && i10 < h60Var.f36934n3) {
                    return ((Long) h60Var.G0.get(i10 - i13)).equals(h60Var.f36879a1.shadyJoinParticipants.get(i11 - h60Var.P.f35009n));
                }
                if (i11 >= b60Var.f35011s && i11 < b60Var.v && i10 >= (i12 = h60Var.f36938o3) && i10 < h60Var.f36942p3) {
                    return ((Long) h60Var.H0.get(i10 - i12)).equals(h60Var.f36879a1.shadyLeftParticipants.get(i11 - h60Var.P.f35011s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37587b.P.F;
    }

    @Override
    public final int e() {
        return this.f37587b.I0;
    }
}
