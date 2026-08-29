package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jz0 extends f2.q {
    public int f39710b;
    public final SparseIntArray f39711c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39712e = new ArrayList();
    public final ArrayList f39713f = new ArrayList();
    public int f39714g;
    public int h;
    public final ProfileActivity f39715i;

    public jz0(ProfileActivity profileActivity) {
        this.f39715i = profileActivity;
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
        ProfileActivity profileActivity = this.f39715i;
        if (i11 >= profileActivity.f36101q4 && i11 < profileActivity.f36108r4 && i10 >= this.f39714g && i10 < this.h) {
            ArrayList arrayList = this.f39713f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f39712e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f39714g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f39714g);
            }
            if (!profileActivity.f36151y2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.M4.get(((Integer) profileActivity.N4.get(i11 - profileActivity.f36101q4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.M4.get(i11 - profileActivity.f36101q4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f39711c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f39715i.J2;
    }

    @Override
    public final int e() {
        return this.f39710b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f39715i;
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
        g(14, profileActivity.f35987a3, sparseIntArray);
        g(15, profileActivity.f35995b3, sparseIntArray);
        g(16, profileActivity.c3, sparseIntArray);
        g(17, profileActivity.Y3, sparseIntArray);
        g(18, profileActivity.Z3, sparseIntArray);
        g(19, profileActivity.f35996b4, sparseIntArray);
        g(20, profileActivity.f36009d4, sparseIntArray);
        g(21, profileActivity.f36003c4, sparseIntArray);
        g(22, profileActivity.f36008d3, sparseIntArray);
        g(23, profileActivity.f36016e3, sparseIntArray);
        g(24, profileActivity.f36038h3, sparseIntArray);
        g(25, profileActivity.f36024f3, sparseIntArray);
        g(26, profileActivity.f36031g3, sparseIntArray);
        g(27, profileActivity.f36045i3, sparseIntArray);
        g(28, profileActivity.f36052j3, sparseIntArray);
        g(29, profileActivity.f36059k3, sparseIntArray);
        g(30, profileActivity.f36065l3, sparseIntArray);
        g(31, profileActivity.f36071m3, sparseIntArray);
        g(32, profileActivity.f36079n3, sparseIntArray);
        g(33, profileActivity.f36086o3, sparseIntArray);
        g(34, profileActivity.f36093p3, sparseIntArray);
        g(35, profileActivity.f36100q3, sparseIntArray);
        g(36, profileActivity.f36107r3, sparseIntArray);
        g(37, profileActivity.f36114s3, sparseIntArray);
        g(38, profileActivity.f36120t3, sparseIntArray);
        g(39, profileActivity.f36126u3, sparseIntArray);
        g(40, profileActivity.f36132v3, sparseIntArray);
        g(41, profileActivity.f36139w3, sparseIntArray);
        g(42, profileActivity.f36146x3, sparseIntArray);
        g(43, profileActivity.f36152y3, sparseIntArray);
        g(44, profileActivity.f36158z3, sparseIntArray);
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
        g(59, profileActivity.f36025f4, sparseIntArray);
        g(60, profileActivity.Q3, sparseIntArray);
        g(61, profileActivity.R3, sparseIntArray);
        g(62, profileActivity.S3, sparseIntArray);
        g(63, profileActivity.T3, sparseIntArray);
        g(64, profileActivity.V3, sparseIntArray);
        g(65, profileActivity.f36072m4, sparseIntArray);
        g(66, profileActivity.f36080n4, sparseIntArray);
        g(67, profileActivity.f36087o4, sparseIntArray);
        g(68, profileActivity.f36094p4, sparseIntArray);
        g(69, profileActivity.f36115s4, sparseIntArray);
        g(70, profileActivity.f36121t4, sparseIntArray);
        g(71, profileActivity.f36127u4, sparseIntArray);
        g(72, profileActivity.f36133v4, sparseIntArray);
        g(73, profileActivity.f36140w4, sparseIntArray);
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
        g(88, profileActivity.x4, sparseIntArray);
        g(89, profileActivity.f36153y4, sparseIntArray);
        g(90, profileActivity.f36159z4, sparseIntArray);
        g(91, profileActivity.B4, sparseIntArray);
        g(92, profileActivity.f36017e4, sparseIntArray);
        g(93, profileActivity.f36053j4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f36066l4, sparseIntArray);
        g(98, profileActivity.N2, sparseIntArray);
        g(99, profileActivity.f36032g4, sparseIntArray);
        g(100, profileActivity.f36039h4, sparseIntArray);
        g(101, profileActivity.f36046i4, sparseIntArray);
    }
}
