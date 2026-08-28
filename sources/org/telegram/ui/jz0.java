package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jz0 extends f2.s {
    public int f39652b;
    public final SparseIntArray f39653c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39654e = new ArrayList();
    public final ArrayList f39655f = new ArrayList();
    public int f39656g;
    public int h;
    public final ProfileActivity f39657i;

    public jz0(ProfileActivity profileActivity) {
        this.f39657i = profileActivity;
    }

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override
    public final boolean a(int i9, int i10) {
        return b(i9, i10);
    }

    @Override
    public final boolean b(int i9, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f39657i;
        if (i10 >= profileActivity.f36034q4 && i10 < profileActivity.f36042r4 && i9 >= this.f39656g && i9 < this.h) {
            ArrayList arrayList = this.f39655f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f39654e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i9 - this.f39656g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i9 - this.f39656g);
            }
            if (!profileActivity.f36086y2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.M4.get(((Integer) profileActivity.N4.get(i10 - profileActivity.f36034q4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.M4.get(i10 - profileActivity.f36034q4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f39653c.get(i9, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39657i.J2;
    }

    @Override
    public final int e() {
        return this.f39652b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i9;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39657i;
        g(1, profileActivity.K2, sparseIntArray);
        g(2, profileActivity.L2, sparseIntArray);
        g(3, profileActivity.O2, sparseIntArray);
        g(4, profileActivity.P2, sparseIntArray);
        g(5, profileActivity.R2, sparseIntArray);
        g(6, profileActivity.S2, sparseIntArray);
        g(7, profileActivity.W2, sparseIntArray);
        g(8, profileActivity.T2, sparseIntArray);
        g(9, profileActivity.Y2, sparseIntArray);
        g(10, profileActivity.X2, sparseIntArray);
        g(11, profileActivity.U2, sparseIntArray);
        g(12, profileActivity.V2, sparseIntArray);
        g(13, profileActivity.Z2, sparseIntArray);
        g(14, profileActivity.a3, sparseIntArray);
        g(15, profileActivity.f35928b3, sparseIntArray);
        g(16, profileActivity.f35936c3, sparseIntArray);
        g(17, profileActivity.Y3, sparseIntArray);
        g(18, profileActivity.Z3, sparseIntArray);
        g(19, profileActivity.f35929b4, sparseIntArray);
        g(20, profileActivity.f35944d4, sparseIntArray);
        g(21, profileActivity.f35937c4, sparseIntArray);
        g(22, profileActivity.f35943d3, sparseIntArray);
        g(23, profileActivity.f35951e3, sparseIntArray);
        g(24, profileActivity.f35973h3, sparseIntArray);
        g(25, profileActivity.f35959f3, sparseIntArray);
        g(26, profileActivity.f35966g3, sparseIntArray);
        g(27, profileActivity.f35980i3, sparseIntArray);
        g(28, profileActivity.f35987j3, sparseIntArray);
        g(29, profileActivity.f35994k3, sparseIntArray);
        g(30, profileActivity.f36000l3, sparseIntArray);
        g(31, profileActivity.f36006m3, sparseIntArray);
        g(32, profileActivity.f36014n3, sparseIntArray);
        g(33, profileActivity.f36021o3, sparseIntArray);
        g(34, profileActivity.f36027p3, sparseIntArray);
        g(35, profileActivity.f36033q3, sparseIntArray);
        g(36, profileActivity.f36041r3, sparseIntArray);
        g(37, profileActivity.f36049s3, sparseIntArray);
        g(38, profileActivity.f36055t3, sparseIntArray);
        g(39, profileActivity.f36061u3, sparseIntArray);
        g(40, profileActivity.f36067v3, sparseIntArray);
        g(41, profileActivity.f36073w3, sparseIntArray);
        g(42, profileActivity.f36080x3, sparseIntArray);
        g(43, profileActivity.f36087y3, sparseIntArray);
        g(44, profileActivity.f36093z3, sparseIntArray);
        g(45, profileActivity.A3, sparseIntArray);
        g(46, profileActivity.B3, sparseIntArray);
        g(47, profileActivity.C3, sparseIntArray);
        g(48, profileActivity.D3, sparseIntArray);
        g(49, profileActivity.E3, sparseIntArray);
        g(50, profileActivity.F3, sparseIntArray);
        g(51, profileActivity.G3, sparseIntArray);
        g(52, profileActivity.H3, sparseIntArray);
        g(53, profileActivity.I3, sparseIntArray);
        g(54, profileActivity.U3, sparseIntArray);
        g(55, profileActivity.J3, sparseIntArray);
        g(56, profileActivity.N3, sparseIntArray);
        g(57, profileActivity.O3, sparseIntArray);
        g(58, profileActivity.P3, sparseIntArray);
        g(59, profileActivity.f35960f4, sparseIntArray);
        g(60, profileActivity.Q3, sparseIntArray);
        g(61, profileActivity.R3, sparseIntArray);
        g(62, profileActivity.S3, sparseIntArray);
        g(63, profileActivity.T3, sparseIntArray);
        g(64, profileActivity.V3, sparseIntArray);
        g(65, profileActivity.f36007m4, sparseIntArray);
        g(66, profileActivity.f36015n4, sparseIntArray);
        g(67, profileActivity.f36022o4, sparseIntArray);
        g(68, profileActivity.f36028p4, sparseIntArray);
        g(69, profileActivity.f36050s4, sparseIntArray);
        g(70, profileActivity.f36056t4, sparseIntArray);
        g(71, profileActivity.f36062u4, sparseIntArray);
        g(72, profileActivity.v4, sparseIntArray);
        g(73, profileActivity.f36074w4, sparseIntArray);
        g(74, profileActivity.C4, sparseIntArray);
        g(75, profileActivity.D4, sparseIntArray);
        g(76, profileActivity.A4, sparseIntArray);
        g(77, profileActivity.F4, sparseIntArray);
        g(78, profileActivity.G4, sparseIntArray);
        g(79, profileActivity.W3, sparseIntArray);
        g(80, profileActivity.X3, sparseIntArray);
        g(81, profileActivity.H4, sparseIntArray);
        g(82, profileActivity.I4, sparseIntArray);
        g(83, profileActivity.M3, sparseIntArray);
        g(84, profileActivity.K3, sparseIntArray);
        g(85, profileActivity.L3, sparseIntArray);
        g(86, profileActivity.Q2, sparseIntArray);
        g(87, profileActivity.M2, sparseIntArray);
        g(88, profileActivity.f36081x4, sparseIntArray);
        g(89, profileActivity.f36088y4, sparseIntArray);
        g(90, profileActivity.f36094z4, sparseIntArray);
        g(91, profileActivity.B4, sparseIntArray);
        g(92, profileActivity.f35952e4, sparseIntArray);
        g(93, profileActivity.f35988j4, sparseIntArray);
        i9 = profileActivity.botPermissionLocation;
        g(94, i9, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.f36001l4, sparseIntArray);
        g(98, profileActivity.N2, sparseIntArray);
        g(99, profileActivity.f35967g4, sparseIntArray);
        g(100, profileActivity.f35974h4, sparseIntArray);
        g(101, profileActivity.f35981i4, sparseIntArray);
    }
}
