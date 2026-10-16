package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o50 extends s4.o {
    public final n60 f38550b;

    public o50(n60 n60Var) {
        this.f38550b = n60Var;
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
        n60 n60Var = this.f38550b;
        h60 h60Var = n60Var.P;
        int i17 = h60Var.f36415w;
        if (i17 >= 0) {
            int i18 = n60Var.f38189h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = h60Var.f36416x;
        if (i19 >= 0) {
            int i20 = n60Var.f38242u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = h60Var.f36417y;
        if (i21 >= 0) {
            int i22 = n60Var.f38246v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = h60Var.K;
        if (i23 >= 0) {
            int i24 = n60Var.f38185g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = h60Var.J;
        if (i25 >= 0) {
            int i26 = n60Var.f38238t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = h60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == n60Var.f38234s3) {
            return true;
        }
        int i28 = n60Var.I0;
        if (i10 == i28 - 1 && i11 == h60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != h60Var.F - 1) {
            if (i11 >= h60Var.G && i11 < h60Var.H && i10 >= (i16 = n60Var.f38224q3) && i10 < n60Var.f38229r3) {
                return ((ChatObject.VideoParticipant) n60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) n60Var.f38221q0.get(i11 - n60Var.P.G));
            }
            if (i11 >= h60Var.d && i11 < h60Var.e && i10 >= (i15 = n60Var.f38193i3) && i10 < n60Var.f38197j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) n60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(n60Var.f38157a1.visibleParticipants.get(i11 - n60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= h60Var.f36411f && i11 < h60Var.h && i10 >= (i14 = n60Var.f38201k3) && i10 < n60Var.f38204l3) {
                return ((Long) n60Var.F0.get(i10 - i14)).equals(n60Var.f38157a1.invitedUsers.get(i11 - n60Var.P.f36411f));
            } else {
                if (i11 >= h60Var.f36412n && i11 < h60Var.f36413r && i10 >= (i13 = n60Var.f38207m3) && i10 < n60Var.f38212n3) {
                    return ((Long) n60Var.G0.get(i10 - i13)).equals(n60Var.f38157a1.shadyJoinParticipants.get(i11 - n60Var.P.f36412n));
                }
                if (i11 >= h60Var.f36414s && i11 < h60Var.v && i10 >= (i12 = n60Var.f38216o3) && i10 < n60Var.f38220p3) {
                    return ((Long) n60Var.H0.get(i10 - i12)).equals(n60Var.f38157a1.shadyLeftParticipants.get(i11 - n60Var.P.f36414s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38550b.P.F;
    }

    @Override
    public final int e() {
        return this.f38550b.I0;
    }
}
