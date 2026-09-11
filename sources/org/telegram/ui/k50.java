package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k50 extends s4.o {
    public final j60 f37916b;

    public k50(j60 j60Var) {
        this.f37916b = j60Var;
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
        j60 j60Var = this.f37916b;
        d60 d60Var = j60Var.P;
        int i17 = d60Var.f35683w;
        if (i17 >= 0) {
            int i18 = j60Var.f37546h3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = d60Var.f35684x;
        if (i19 >= 0) {
            int i20 = j60Var.f37598u3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = d60Var.f35685y;
        if (i21 >= 0) {
            int i22 = j60Var.f37602v3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = d60Var.K;
        if (i23 >= 0) {
            int i24 = j60Var.f37542g3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = d60Var.J;
        if (i25 >= 0) {
            int i26 = j60Var.f37594t3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = d60Var.I;
        if (i27 >= 0 && i27 == i11 && i10 == j60Var.f37590s3) {
            return true;
        }
        int i28 = j60Var.I0;
        if (i10 == i28 - 1 && i11 == d60Var.F - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != d60Var.F - 1) {
            if (i11 >= d60Var.G && i11 < d60Var.H && i10 >= (i16 = j60Var.f37580q3) && i10 < j60Var.f37585r3) {
                return ((ChatObject.VideoParticipant) j60Var.E0.get(i10 - i16)).equals((ChatObject.VideoParticipant) j60Var.f37577q0.get(i11 - j60Var.P.G));
            }
            if (i11 >= d60Var.d && i11 < d60Var.f35678e && i10 >= (i15 = j60Var.f37550i3) && i10 < j60Var.j3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) j60Var.D0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(j60Var.f37513a1.visibleParticipants.get(i11 - j60Var.P.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= d60Var.f35679f && i11 < d60Var.h && i10 >= (i14 = j60Var.f37557k3) && i10 < j60Var.f37560l3) {
                return ((Long) j60Var.F0.get(i10 - i14)).equals(j60Var.f37513a1.invitedUsers.get(i11 - j60Var.P.f35679f));
            } else {
                if (i11 >= d60Var.f35680n && i11 < d60Var.f35681r && i10 >= (i13 = j60Var.f37563m3) && i10 < j60Var.f37568n3) {
                    return ((Long) j60Var.G0.get(i10 - i13)).equals(j60Var.f37513a1.shadyJoinParticipants.get(i11 - j60Var.P.f35680n));
                }
                if (i11 >= d60Var.f35682s && i11 < d60Var.v && i10 >= (i12 = j60Var.f37572o3) && i10 < j60Var.f37576p3) {
                    return ((Long) j60Var.H0.get(i10 - i12)).equals(j60Var.f37513a1.shadyLeftParticipants.get(i11 - j60Var.P.f35682s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37916b.P.F;
    }

    @Override
    public final int e() {
        return this.f37916b.I0;
    }
}
