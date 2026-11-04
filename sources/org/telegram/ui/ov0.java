package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ov0 extends u4.o {
    public int f48357b;
    public final SparseIntArray f48358c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f48359e = new ArrayList();
    public final ArrayList f48360f = new ArrayList();
    public int f48361g;
    public int h;
    public final ProfileActivity f48362i;

    public ov0(ProfileActivity profileActivity) {
        this.f48362i = profileActivity;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override
    public final boolean a(int i3, int i10) {
        return b(i3, i10);
    }

    @Override
    public final boolean b(int i3, int i10) {
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatParticipant chatParticipant2;
        ProfileActivity profileActivity = this.f48362i;
        if (i10 >= profileActivity.f41863u4 && i10 < profileActivity.f41870v4 && i3 >= this.f48361g && i3 < this.h) {
            ArrayList arrayList = this.f48360f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f48359e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i3 - this.f48361g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i3 - this.f48361g);
            }
            if (!profileActivity.C2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.R4.get(((Integer) profileActivity.S4.get(i10 - profileActivity.f41863u4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.R4.get(i10 - profileActivity.f41863u4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i11 = this.f48358c.get(i3, -1);
        if (i11 != this.d.get(i10, -1) || i11 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f48362i.N2;
    }

    @Override
    public final int e() {
        return this.f48357b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i3;
        int i10;
        int i11;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f48362i;
        g(1, profileActivity.O2, sparseIntArray);
        g(2, profileActivity.P2, sparseIntArray);
        g(3, profileActivity.S2, sparseIntArray);
        g(4, profileActivity.T2, sparseIntArray);
        g(5, profileActivity.V2, sparseIntArray);
        g(6, profileActivity.W2, sparseIntArray);
        g(7, profileActivity.f41723a3, sparseIntArray);
        g(8, profileActivity.X2, sparseIntArray);
        g(9, profileActivity.f41738c3, sparseIntArray);
        g(10, profileActivity.f41731b3, sparseIntArray);
        g(11, profileActivity.Y2, sparseIntArray);
        g(12, profileActivity.Z2, sparseIntArray);
        g(13, profileActivity.f41745d3, sparseIntArray);
        g(14, profileActivity.f41753e3, sparseIntArray);
        g(15, profileActivity.f41761f3, sparseIntArray);
        g(16, profileActivity.f41768g3, sparseIntArray);
        g(17, profileActivity.f41739c4, sparseIntArray);
        g(18, profileActivity.f41746d4, sparseIntArray);
        g(19, profileActivity.f41762f4, sparseIntArray);
        g(20, profileActivity.f41776h4, sparseIntArray);
        g(21, profileActivity.f41769g4, sparseIntArray);
        g(22, profileActivity.f41775h3, sparseIntArray);
        g(23, profileActivity.i3, sparseIntArray);
        g(24, profileActivity.f41801l3, sparseIntArray);
        g(25, profileActivity.f41788j3, sparseIntArray);
        g(26, profileActivity.f41794k3, sparseIntArray);
        g(27, profileActivity.f41806m3, sparseIntArray);
        g(28, profileActivity.f41814n3, sparseIntArray);
        g(29, profileActivity.f41820o3, sparseIntArray);
        g(30, profileActivity.f41827p3, sparseIntArray);
        g(31, profileActivity.f41834q3, sparseIntArray);
        g(32, profileActivity.f41842r3, sparseIntArray);
        g(33, profileActivity.f41849s3, sparseIntArray);
        g(34, profileActivity.f41855t3, sparseIntArray);
        g(35, profileActivity.f41862u3, sparseIntArray);
        g(36, profileActivity.f41869v3, sparseIntArray);
        g(37, profileActivity.f41877w3, sparseIntArray);
        g(38, profileActivity.f41885x3, sparseIntArray);
        g(39, profileActivity.f41893y3, sparseIntArray);
        g(40, profileActivity.f41900z3, sparseIntArray);
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
        g(59, profileActivity.f41789j4, sparseIntArray);
        g(60, profileActivity.U3, sparseIntArray);
        g(61, profileActivity.V3, sparseIntArray);
        g(62, profileActivity.W3, sparseIntArray);
        g(63, profileActivity.X3, sparseIntArray);
        g(64, profileActivity.Z3, sparseIntArray);
        g(65, profileActivity.f41835q4, sparseIntArray);
        g(66, profileActivity.f41843r4, sparseIntArray);
        g(67, profileActivity.f41850s4, sparseIntArray);
        g(68, profileActivity.f41856t4, sparseIntArray);
        g(69, profileActivity.f41878w4, sparseIntArray);
        g(70, profileActivity.f41886x4, sparseIntArray);
        g(71, profileActivity.f41894y4, sparseIntArray);
        g(72, profileActivity.f41901z4, sparseIntArray);
        g(73, profileActivity.A4, sparseIntArray);
        g(74, profileActivity.G4, sparseIntArray);
        g(75, profileActivity.H4, sparseIntArray);
        g(76, profileActivity.E4, sparseIntArray);
        g(77, profileActivity.K4, sparseIntArray);
        g(78, profileActivity.L4, sparseIntArray);
        g(79, profileActivity.f41724a4, sparseIntArray);
        g(80, profileActivity.f41732b4, sparseIntArray);
        g(81, profileActivity.M4, sparseIntArray);
        g(82, profileActivity.N4, sparseIntArray);
        g(83, profileActivity.Q3, sparseIntArray);
        g(84, profileActivity.O3, sparseIntArray);
        g(85, profileActivity.P3, sparseIntArray);
        g(86, profileActivity.U2, sparseIntArray);
        g(87, profileActivity.Q2, sparseIntArray);
        g(88, profileActivity.B4, sparseIntArray);
        g(89, profileActivity.C4, sparseIntArray);
        g(90, profileActivity.D4, sparseIntArray);
        g(91, profileActivity.F4, sparseIntArray);
        g(92, profileActivity.f41782i4, sparseIntArray);
        g(93, profileActivity.n4, sparseIntArray);
        i3 = profileActivity.botPermissionLocation;
        g(94, i3, sparseIntArray);
        i10 = profileActivity.botPermissionEmojiStatus;
        g(95, i10, sparseIntArray);
        i11 = profileActivity.botPermissionBiometry;
        g(96, i11, sparseIntArray);
        g(97, profileActivity.f41828p4, sparseIntArray);
        g(98, profileActivity.R2, sparseIntArray);
        g(99, profileActivity.f41795k4, sparseIntArray);
        g(100, profileActivity.f41802l4, sparseIntArray);
        g(101, profileActivity.f41807m4, sparseIntArray);
    }
}
