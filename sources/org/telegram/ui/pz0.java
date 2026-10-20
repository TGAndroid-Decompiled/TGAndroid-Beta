package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pz0 extends s4.o {
    public int f40321b;
    public final SparseIntArray f40322c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f40323f = new ArrayList();
    public int f40324g;
    public int h;
    public final ProfileActivity f40325i;

    public pz0(ProfileActivity profileActivity) {
        this.f40325i = profileActivity;
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
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f40325i;
        if (i11 >= profileActivity.f33732v4 && i11 < profileActivity.f33740w4 && i10 >= this.f40324g && i10 < this.h) {
            ArrayList arrayList = this.f40323f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f40324g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f40324g);
            }
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(((Integer) profileActivity.T4.get(i11 - profileActivity.f33732v4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(i11 - profileActivity.f33732v4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f40322c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f40325i.O2;
    }

    @Override
    public final int e() {
        return this.f40321b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f40325i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.f33591b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.f33606d3, sparseIntArray);
        g(10, profileActivity.f33599c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.f33583a3, sparseIntArray);
        g(13, profileActivity.f33613e3, sparseIntArray);
        g(14, profileActivity.f33621f3, sparseIntArray);
        g(15, profileActivity.f33628g3, sparseIntArray);
        g(16, profileActivity.f33635h3, sparseIntArray);
        g(17, profileActivity.f33607d4, sparseIntArray);
        g(18, profileActivity.f33614e4, sparseIntArray);
        g(19, profileActivity.f33629g4, sparseIntArray);
        g(20, profileActivity.f33643i4, sparseIntArray);
        g(21, profileActivity.f33636h4, sparseIntArray);
        g(22, profileActivity.f33642i3, sparseIntArray);
        g(23, profileActivity.f33649j3, sparseIntArray);
        g(24, profileActivity.f33667m3, sparseIntArray);
        g(25, profileActivity.f33656k3, sparseIntArray);
        g(26, profileActivity.f33662l3, sparseIntArray);
        g(27, profileActivity.f33675n3, sparseIntArray);
        g(28, profileActivity.f33682o3, sparseIntArray);
        g(29, profileActivity.f33689p3, sparseIntArray);
        g(30, profileActivity.f33695q3, sparseIntArray);
        g(31, profileActivity.f33702r3, sparseIntArray);
        g(32, profileActivity.f33710s3, sparseIntArray);
        g(33, profileActivity.f33717t3, sparseIntArray);
        g(34, profileActivity.f33724u3, sparseIntArray);
        g(35, profileActivity.f33731v3, sparseIntArray);
        g(36, profileActivity.f33739w3, sparseIntArray);
        g(37, profileActivity.f33747x3, sparseIntArray);
        g(38, profileActivity.y3, sparseIntArray);
        g(39, profileActivity.f33761z3, sparseIntArray);
        g(40, profileActivity.A3, sparseIntArray);
        g(41, profileActivity.B3, sparseIntArray);
        g(42, profileActivity.C3, sparseIntArray);
        g(43, profileActivity.D3, sparseIntArray);
        g(44, profileActivity.E3, sparseIntArray);
        g(45, profileActivity.F3, sparseIntArray);
        g(46, profileActivity.G3, sparseIntArray);
        g(47, profileActivity.H3, sparseIntArray);
        g(48, profileActivity.I3, sparseIntArray);
        g(49, profileActivity.J3, sparseIntArray);
        g(50, profileActivity.K3, sparseIntArray);
        g(51, profileActivity.L3, sparseIntArray);
        g(52, profileActivity.M3, sparseIntArray);
        g(53, profileActivity.N3, sparseIntArray);
        g(54, profileActivity.Z3, sparseIntArray);
        g(55, profileActivity.O3, sparseIntArray);
        g(56, profileActivity.S3, sparseIntArray);
        g(57, profileActivity.T3, sparseIntArray);
        g(58, profileActivity.U3, sparseIntArray);
        g(59, profileActivity.f33657k4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.f33584a4, sparseIntArray);
        g(65, profileActivity.f33703r4, sparseIntArray);
        g(66, profileActivity.f33711s4, sparseIntArray);
        g(67, profileActivity.f33718t4, sparseIntArray);
        g(68, profileActivity.f33725u4, sparseIntArray);
        g(69, profileActivity.f33748x4, sparseIntArray);
        g(70, profileActivity.f33755y4, sparseIntArray);
        g(71, profileActivity.f33762z4, sparseIntArray);
        g(72, profileActivity.A4, sparseIntArray);
        g(73, profileActivity.B4, sparseIntArray);
        g(74, profileActivity.H4, sparseIntArray);
        g(75, profileActivity.I4, sparseIntArray);
        g(76, profileActivity.F4, sparseIntArray);
        g(77, profileActivity.L4, sparseIntArray);
        g(78, profileActivity.M4, sparseIntArray);
        g(79, profileActivity.f33592b4, sparseIntArray);
        g(80, profileActivity.f33600c4, sparseIntArray);
        g(81, profileActivity.N4, sparseIntArray);
        g(82, profileActivity.O4, sparseIntArray);
        g(83, profileActivity.R3, sparseIntArray);
        g(84, profileActivity.P3, sparseIntArray);
        g(85, profileActivity.Q3, sparseIntArray);
        g(86, profileActivity.V2, sparseIntArray);
        g(87, profileActivity.R2, sparseIntArray);
        g(88, profileActivity.C4, sparseIntArray);
        g(89, profileActivity.D4, sparseIntArray);
        g(90, profileActivity.E4, sparseIntArray);
        g(91, profileActivity.G4, sparseIntArray);
        g(92, profileActivity.f33650j4, sparseIntArray);
        g(93, profileActivity.f33683o4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f33696q4, sparseIntArray);
        g(98, profileActivity.S2, sparseIntArray);
        g(99, profileActivity.l4, sparseIntArray);
        g(100, profileActivity.f33668m4, sparseIntArray);
        g(101, profileActivity.f33676n4, sparseIntArray);
    }
}
