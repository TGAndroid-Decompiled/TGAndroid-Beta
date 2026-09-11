package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o01 extends s4.o {
    public int f39068b;
    public final SparseIntArray f39069c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39070e = new ArrayList();
    public final ArrayList f39071f = new ArrayList();
    public int f39072g;
    public int h;
    public final ProfileActivity f39073i;

    public o01(ProfileActivity profileActivity) {
        this.f39073i = profileActivity;
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
        ProfileActivity profileActivity = this.f39073i;
        if (i11 >= profileActivity.f34001u4 && i11 < profileActivity.f34008v4 && i10 >= this.f39072g && i10 < this.h) {
            ArrayList arrayList = this.f39071f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f39070e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f39072g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f39072g);
            }
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i11 - profileActivity.f34001u4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i11 - profileActivity.f34001u4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f39069c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39073i.N2;
    }

    @Override
    public final int e() {
        return this.f39068b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39073i;
        g(1, profileActivity.O2, sparseIntArray);
        g(2, profileActivity.P2, sparseIntArray);
        g(3, profileActivity.S2, sparseIntArray);
        g(4, profileActivity.T2, sparseIntArray);
        g(5, profileActivity.V2, sparseIntArray);
        g(6, profileActivity.W2, sparseIntArray);
        g(7, profileActivity.f33859a3, sparseIntArray);
        g(8, profileActivity.X2, sparseIntArray);
        g(9, profileActivity.f33875c3, sparseIntArray);
        g(10, profileActivity.f33867b3, sparseIntArray);
        g(11, profileActivity.Y2, sparseIntArray);
        g(12, profileActivity.Z2, sparseIntArray);
        g(13, profileActivity.f33882d3, sparseIntArray);
        g(14, profileActivity.f33890e3, sparseIntArray);
        g(15, profileActivity.f33898f3, sparseIntArray);
        g(16, profileActivity.f33905g3, sparseIntArray);
        g(17, profileActivity.f33876c4, sparseIntArray);
        g(18, profileActivity.f33883d4, sparseIntArray);
        g(19, profileActivity.f33899f4, sparseIntArray);
        g(20, profileActivity.f33913h4, sparseIntArray);
        g(21, profileActivity.f33906g4, sparseIntArray);
        g(22, profileActivity.f33912h3, sparseIntArray);
        g(23, profileActivity.f33919i3, sparseIntArray);
        g(24, profileActivity.f33938l3, sparseIntArray);
        g(25, profileActivity.j3, sparseIntArray);
        g(26, profileActivity.f33932k3, sparseIntArray);
        g(27, profileActivity.f33943m3, sparseIntArray);
        g(28, profileActivity.f33951n3, sparseIntArray);
        g(29, profileActivity.f33958o3, sparseIntArray);
        g(30, profileActivity.f33965p3, sparseIntArray);
        g(31, profileActivity.f33971q3, sparseIntArray);
        g(32, profileActivity.f33978r3, sparseIntArray);
        g(33, profileActivity.f33986s3, sparseIntArray);
        g(34, profileActivity.f33993t3, sparseIntArray);
        g(35, profileActivity.f34000u3, sparseIntArray);
        g(36, profileActivity.f34007v3, sparseIntArray);
        g(37, profileActivity.f34015w3, sparseIntArray);
        g(38, profileActivity.f34022x3, sparseIntArray);
        g(39, profileActivity.y3, sparseIntArray);
        g(40, profileActivity.f34034z3, sparseIntArray);
        g(41, profileActivity.A3, sparseIntArray);
        g(42, profileActivity.B3, sparseIntArray);
        g(43, profileActivity.C3, sparseIntArray);
        g(44, profileActivity.D3, sparseIntArray);
        g(45, profileActivity.E3, sparseIntArray);
        g(46, profileActivity.F3, sparseIntArray);
        g(47, profileActivity.G3, sparseIntArray);
        g(48, profileActivity.H3, sparseIntArray);
        g(49, profileActivity.I3, sparseIntArray);
        g(50, profileActivity.J3, sparseIntArray);
        g(51, profileActivity.K3, sparseIntArray);
        g(52, profileActivity.L3, sparseIntArray);
        g(53, profileActivity.M3, sparseIntArray);
        g(54, profileActivity.Y3, sparseIntArray);
        g(55, profileActivity.N3, sparseIntArray);
        g(56, profileActivity.R3, sparseIntArray);
        g(57, profileActivity.S3, sparseIntArray);
        g(58, profileActivity.T3, sparseIntArray);
        g(59, profileActivity.f33926j4, sparseIntArray);
        g(60, profileActivity.U3, sparseIntArray);
        g(61, profileActivity.V3, sparseIntArray);
        g(62, profileActivity.W3, sparseIntArray);
        g(63, profileActivity.X3, sparseIntArray);
        g(64, profileActivity.Z3, sparseIntArray);
        g(65, profileActivity.f33972q4, sparseIntArray);
        g(66, profileActivity.f33979r4, sparseIntArray);
        g(67, profileActivity.f33987s4, sparseIntArray);
        g(68, profileActivity.f33994t4, sparseIntArray);
        g(69, profileActivity.f34016w4, sparseIntArray);
        g(70, profileActivity.f34023x4, sparseIntArray);
        g(71, profileActivity.f34029y4, sparseIntArray);
        g(72, profileActivity.f34035z4, sparseIntArray);
        g(73, profileActivity.A4, sparseIntArray);
        g(74, profileActivity.G4, sparseIntArray);
        g(75, profileActivity.H4, sparseIntArray);
        g(76, profileActivity.E4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.f33860a4, sparseIntArray);
        g(80, profileActivity.f33868b4, sparseIntArray);
        g(81, profileActivity.L4, sparseIntArray);
        g(82, profileActivity.M4, sparseIntArray);
        g(83, profileActivity.Q3, sparseIntArray);
        g(84, profileActivity.O3, sparseIntArray);
        g(85, profileActivity.P3, sparseIntArray);
        g(86, profileActivity.U2, sparseIntArray);
        g(87, profileActivity.Q2, sparseIntArray);
        g(88, profileActivity.B4, sparseIntArray);
        g(89, profileActivity.C4, sparseIntArray);
        g(90, profileActivity.D4, sparseIntArray);
        g(91, profileActivity.F4, sparseIntArray);
        g(92, profileActivity.f33920i4, sparseIntArray);
        g(93, profileActivity.f33952n4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f33966p4, sparseIntArray);
        g(98, profileActivity.R2, sparseIntArray);
        g(99, profileActivity.f33933k4, sparseIntArray);
        g(100, profileActivity.l4, sparseIntArray);
        g(101, profileActivity.f33944m4, sparseIntArray);
    }
}
