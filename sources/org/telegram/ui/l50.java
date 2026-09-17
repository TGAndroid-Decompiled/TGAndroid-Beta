package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l50 extends s4.o {
    public final k60 f35449b;

    public l50(k60 k60Var) {
        this.f35449b = k60Var;
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
        k60 k60Var = this.f35449b;
        e60 e60Var = k60Var.P;
        int i17 = e60Var.f33296w;
        if (i17 >= 0) {
            int i18 = k60Var.f35044h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = e60Var.f33297x;
        if (i19 >= 0) {
            int i20 = k60Var.f35096u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = e60Var.f33298y;
        if (i21 >= 0) {
            int i22 = k60Var.f35100v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = e60Var.K;
        if (i23 >= 0) {
            int i24 = k60Var.f35040g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = e60Var.J;
        if (i25 >= 0) {
            int i26 = k60Var.f35092t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = e60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == k60Var.f35088s3) {
            return true;
        }
        int i28 = k60Var.I0;
        if (i10 == i28 - 1 && i11 == e60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != e60Var.F - 1) {
            if (i11 >= e60Var.G && i11 < e60Var.H && i10 >= (i16 = k60Var.f35078q3) && i10 < k60Var.f35083r3) {
                return ((ChatObject.VideoParticipant) k60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) k60Var.f35075q0.get(i11 - k60Var.P.G));
            }
            if (i11 >= e60Var.d && i11 < e60Var.e && i10 >= (i15 = k60Var.f35048i3) && i10 < k60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) k60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(k60Var.f35012a1.visibleParticipants.get(i11 - k60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= e60Var.f33292f && i11 < e60Var.h && i10 >= (i14 = k60Var.f35055k3) && i10 < k60Var.f35058l3) {
                return ((Long) k60Var.F0.get(i10 - i14)).equals(k60Var.f35012a1.invitedUsers.get(i11 - k60Var.P.f33292f));
            } else {
                if (i11 >= e60Var.f33293n && i11 < e60Var.f33294r && i10 >= (i13 = k60Var.f35061m3) && i10 < k60Var.f35066n3) {
                    return ((Long) k60Var.G0.get(i10 - i13)).equals(k60Var.f35012a1.shadyJoinParticipants.get(i11 - k60Var.P.f33293n));
                }
                if (i11 >= e60Var.f33295s && i11 < e60Var.v && i10 >= (i12 = k60Var.f35070o3) && i10 < k60Var.f35074p3) {
                    return ((Long) k60Var.H0.get(i10 - i12)).equals(k60Var.f35012a1.shadyLeftParticipants.get(i11 - k60Var.P.f33295s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35449b.P.F;
    }

    @Override
    public final int e() {
        return this.f35449b.I0;
    }
}
