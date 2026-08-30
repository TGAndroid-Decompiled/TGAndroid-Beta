package org.telegram.ui;

import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class e50 extends f2.q {
    public final c60 f33898b;

    public e50(c60 c60Var) {
        this.f33898b = c60Var;
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
        c60 c60Var = this.f33898b;
        w50 w50Var = c60Var.M;
        int i17 = w50Var.f39336w;
        if (i17 >= 0) {
            int i18 = c60Var.f33117e3;
            if (i10 == i18 && i11 == i17) {
                return true;
            }
            if ((i10 == i18 && i11 != i17) || (i10 != i18 && i11 == i17)) {
                return false;
            }
        }
        int i19 = w50Var.f39337x;
        if (i19 >= 0) {
            int i20 = c60Var.f33170r3;
            if (i10 == i20 && i11 == i19) {
                return true;
            }
            if ((i10 == i20 && i11 != i19) || (i10 != i20 && i11 == i19)) {
                return false;
            }
        }
        int i21 = w50Var.f39338y;
        if (i21 >= 0) {
            int i22 = c60Var.f33175s3;
            if (i10 == i22 && i11 == i21) {
                return true;
            }
            if ((i10 == i22 && i11 != i21) || (i10 != i22 && i11 == i21)) {
                return false;
            }
        }
        int i23 = w50Var.H;
        if (i23 >= 0) {
            int i24 = c60Var.f33113d3;
            if (i10 == i24 && i11 == i23) {
                return true;
            }
            if ((i10 == i24 && i11 != i23) || (i10 != i24 && i11 == i23)) {
                return false;
            }
        }
        int i25 = w50Var.G;
        if (i25 >= 0) {
            int i26 = c60Var.f33165q3;
            if (i10 == i26 && i11 == i25) {
                return true;
            }
            if ((i10 == i26 && i11 != i25) || (i10 != i26 && i11 == i25)) {
                return false;
            }
        }
        int i27 = w50Var.F;
        if (i27 >= 0 && i27 == i11 && i10 == c60Var.f33161p3) {
            return true;
        }
        int i28 = c60Var.F0;
        if (i10 == i28 - 1 && i11 == w50Var.C - 1) {
            return true;
        }
        if (i10 != i28 - 1 && i11 != w50Var.C - 1) {
            if (i11 >= w50Var.D && i11 < w50Var.E && i10 >= (i16 = c60Var.f33153n3) && i10 < c60Var.f33157o3) {
                return ((ChatObject.VideoParticipant) c60Var.B0.get(i10 - i16)).equals((ChatObject.VideoParticipant) c60Var.f33150n0.get(i11 - c60Var.M.D));
            }
            if (i11 >= w50Var.d && i11 < w50Var.e && i10 >= (i15 = c60Var.f33122f3) && i10 < c60Var.f33126g3) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) c60Var.A0.get(i10 - i15);
                if (MessageObject.getPeerId(groupCallParticipant.peer) != MessageObject.getPeerId(c60Var.X0.visibleParticipants.get(i11 - c60Var.M.d).peer) || (i10 != i11 && groupCallParticipant.lastActiveDate != groupCallParticipant.active_date)) {
                    return false;
                }
                return true;
            } else if (i11 >= w50Var.f39332f && i11 < w50Var.h && i10 >= (i14 = c60Var.f33130h3) && i10 < c60Var.f33134i3) {
                return ((Long) c60Var.C0.get(i10 - i14)).equals(c60Var.X0.invitedUsers.get(i11 - c60Var.M.f39332f));
            } else {
                if (i11 >= w50Var.f39333n && i11 < w50Var.f39334r && i10 >= (i13 = c60Var.f33138j3) && i10 < c60Var.f33142k3) {
                    return ((Long) c60Var.D0.get(i10 - i13)).equals(c60Var.X0.shadyJoinParticipants.get(i11 - c60Var.M.f39333n));
                }
                if (i11 >= w50Var.f39335s && i11 < w50Var.v && i10 >= (i12 = c60Var.f33145l3) && i10 < c60Var.f33148m3) {
                    return ((Long) c60Var.E0.get(i10 - i12)).equals(c60Var.X0.shadyLeftParticipants.get(i11 - c60Var.M.f39335s));
                }
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f33898b.M.C;
    }

    @Override
    public final int e() {
        return this.f33898b.F0;
    }
}
