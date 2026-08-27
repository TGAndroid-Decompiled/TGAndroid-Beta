package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class jz0 extends f2.q {

    public int f39544b;

    public final SparseIntArray f39545c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();

    public final ArrayList f39546e = new ArrayList();

    public final ArrayList f39547f = new ArrayList();

    public int f39548g;
    public int h;

    public final ProfileActivity f39549i;

    public jz0(ProfileActivity profileActivity) {
        this.f39549i = profileActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        ProfileActivity profileActivity = this.f39549i;
        if (i11 < profileActivity.f36038q4 || i11 >= profileActivity.f36045r4 || i10 < this.f39548g || i10 >= this.h) {
            int i12 = this.f39545c.get(i10, -1);
            return i12 == this.d.get(i11, -1) && i12 >= 0;
        }
        ArrayList arrayList = this.f39547f;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f39546e;
        return (!zIsEmpty ? (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f39548g)).intValue()) : (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f39548g)).user_id == (!profileActivity.f36089y2.isEmpty() ? (TLRPC.ChatParticipant) profileActivity.M4.get(((Integer) profileActivity.N4.get(i11 - profileActivity.f36038q4)).intValue()) : (TLRPC.ChatParticipant) profileActivity.M4.get(i11 - profileActivity.f36038q4)).user_id;
    }

    @Override
    public final int d() {
        return this.f39549i.J2;
    }

    @Override
    public final int e() {
        return this.f39544b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39549i;
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
        g(15, profileActivity.f35931b3, sparseIntArray);
        g(16, profileActivity.f35939c3, sparseIntArray);
        g(17, profileActivity.Y3, sparseIntArray);
        g(18, profileActivity.Z3, sparseIntArray);
        g(19, profileActivity.f35932b4, sparseIntArray);
        g(20, profileActivity.f35947d4, sparseIntArray);
        g(21, profileActivity.f35940c4, sparseIntArray);
        g(22, profileActivity.f35946d3, sparseIntArray);
        g(23, profileActivity.f35954e3, sparseIntArray);
        g(24, profileActivity.f35976h3, sparseIntArray);
        g(25, profileActivity.f35962f3, sparseIntArray);
        g(26, profileActivity.f35969g3, sparseIntArray);
        g(27, profileActivity.f35983i3, sparseIntArray);
        g(28, profileActivity.f35990j3, sparseIntArray);
        g(29, profileActivity.f35997k3, sparseIntArray);
        g(30, profileActivity.f36003l3, sparseIntArray);
        g(31, profileActivity.f36009m3, sparseIntArray);
        g(32, profileActivity.f36017n3, sparseIntArray);
        g(33, profileActivity.f36024o3, sparseIntArray);
        g(34, profileActivity.f36031p3, sparseIntArray);
        g(35, profileActivity.f36037q3, sparseIntArray);
        g(36, profileActivity.f36044r3, sparseIntArray);
        g(37, profileActivity.f36052s3, sparseIntArray);
        g(38, profileActivity.f36058t3, sparseIntArray);
        g(39, profileActivity.f36064u3, sparseIntArray);
        g(40, profileActivity.f36070v3, sparseIntArray);
        g(41, profileActivity.f36076w3, sparseIntArray);
        g(42, profileActivity.f36083x3, sparseIntArray);
        g(43, profileActivity.f36090y3, sparseIntArray);
        g(44, profileActivity.f36096z3, sparseIntArray);
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
        g(59, profileActivity.f35963f4, sparseIntArray);
        g(60, profileActivity.Q3, sparseIntArray);
        g(61, profileActivity.R3, sparseIntArray);
        g(62, profileActivity.S3, sparseIntArray);
        g(63, profileActivity.T3, sparseIntArray);
        g(64, profileActivity.V3, sparseIntArray);
        g(65, profileActivity.f36010m4, sparseIntArray);
        g(66, profileActivity.f36018n4, sparseIntArray);
        g(67, profileActivity.f36025o4, sparseIntArray);
        g(68, profileActivity.f36032p4, sparseIntArray);
        g(69, profileActivity.f36053s4, sparseIntArray);
        g(70, profileActivity.f36059t4, sparseIntArray);
        g(71, profileActivity.f36065u4, sparseIntArray);
        g(72, profileActivity.v4, sparseIntArray);
        g(73, profileActivity.f36077w4, sparseIntArray);
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
        g(88, profileActivity.f36084x4, sparseIntArray);
        g(89, profileActivity.f36091y4, sparseIntArray);
        g(90, profileActivity.f36097z4, sparseIntArray);
        g(91, profileActivity.B4, sparseIntArray);
        g(92, profileActivity.f35955e4, sparseIntArray);
        g(93, profileActivity.f35991j4, sparseIntArray);
        g(94, profileActivity.botPermissionLocation, sparseIntArray);
        g(95, profileActivity.botPermissionEmojiStatus, sparseIntArray);
        g(96, profileActivity.botPermissionBiometry, sparseIntArray);
        g(97, profileActivity.f36004l4, sparseIntArray);
        g(98, profileActivity.N2, sparseIntArray);
        g(99, profileActivity.f35970g4, sparseIntArray);
        g(100, profileActivity.f35977h4, sparseIntArray);
        g(101, profileActivity.f35984i4, sparseIntArray);
    }
}
