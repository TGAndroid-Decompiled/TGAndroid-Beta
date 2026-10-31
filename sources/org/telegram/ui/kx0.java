package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kx0 extends s4.n {
    public int f38967b;
    public final SparseIntArray f38968c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f38969f = new ArrayList();
    public int f38970g;
    public int h;
    public final ProfileActivity f38971i;

    public kx0(ProfileActivity profileActivity) {
        this.f38971i = profileActivity;
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
        ProfileActivity profileActivity = this.f38971i;
        if (i11 >= profileActivity.f33910t4 && i11 < profileActivity.f33917u4 && i10 >= this.f38970g && i10 < this.h) {
            ArrayList arrayList = this.f38969f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f38970g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f38970g);
            }
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(((Integer) profileActivity.R4.get(i11 - profileActivity.f33910t4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.Q4.get(i11 - profileActivity.f33910t4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f38968c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f38971i.M2;
    }

    @Override
    public final int e() {
        return this.f38967b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f38971i;
        g(1, profileActivity.N2, sparseIntArray);
        g(2, profileActivity.O2, sparseIntArray);
        g(3, profileActivity.R2, sparseIntArray);
        g(4, profileActivity.S2, sparseIntArray);
        g(5, profileActivity.U2, sparseIntArray);
        g(6, profileActivity.V2, sparseIntArray);
        g(7, profileActivity.Z2, sparseIntArray);
        g(8, profileActivity.W2, sparseIntArray);
        g(9, profileActivity.f33783b3, sparseIntArray);
        g(10, profileActivity.f33775a3, sparseIntArray);
        g(11, profileActivity.X2, sparseIntArray);
        g(12, profileActivity.Y2, sparseIntArray);
        g(13, profileActivity.f33791c3, sparseIntArray);
        g(14, profileActivity.f33798d3, sparseIntArray);
        g(15, profileActivity.f33805e3, sparseIntArray);
        g(16, profileActivity.f33813f3, sparseIntArray);
        g(17, profileActivity.f33784b4, sparseIntArray);
        g(18, profileActivity.f33792c4, sparseIntArray);
        g(19, profileActivity.f33806e4, sparseIntArray);
        g(20, profileActivity.f33821g4, sparseIntArray);
        g(21, profileActivity.f33814f4, sparseIntArray);
        g(22, profileActivity.f33820g3, sparseIntArray);
        g(23, profileActivity.f33827h3, sparseIntArray);
        g(24, profileActivity.f33848k3, sparseIntArray);
        g(25, profileActivity.f33834i3, sparseIntArray);
        g(26, profileActivity.f33841j3, sparseIntArray);
        g(27, profileActivity.f33854l3, sparseIntArray);
        g(28, profileActivity.f33859m3, sparseIntArray);
        g(29, profileActivity.f33867n3, sparseIntArray);
        g(30, profileActivity.f33874o3, sparseIntArray);
        g(31, profileActivity.f33881p3, sparseIntArray);
        g(32, profileActivity.f33887q3, sparseIntArray);
        g(33, profileActivity.f33894r3, sparseIntArray);
        g(34, profileActivity.f33902s3, sparseIntArray);
        g(35, profileActivity.f33909t3, sparseIntArray);
        g(36, profileActivity.f33916u3, sparseIntArray);
        g(37, profileActivity.f33923v3, sparseIntArray);
        g(38, profileActivity.f33931w3, sparseIntArray);
        g(39, profileActivity.f33939x3, sparseIntArray);
        g(40, profileActivity.y3, sparseIntArray);
        g(41, profileActivity.f33953z3, sparseIntArray);
        g(42, profileActivity.A3, sparseIntArray);
        g(43, profileActivity.B3, sparseIntArray);
        g(44, profileActivity.C3, sparseIntArray);
        g(45, profileActivity.D3, sparseIntArray);
        g(46, profileActivity.E3, sparseIntArray);
        g(47, profileActivity.F3, sparseIntArray);
        g(48, profileActivity.G3, sparseIntArray);
        g(49, profileActivity.H3, sparseIntArray);
        g(50, profileActivity.I3, sparseIntArray);
        g(51, profileActivity.J3, sparseIntArray);
        g(52, profileActivity.K3, sparseIntArray);
        g(53, profileActivity.L3, sparseIntArray);
        g(54, profileActivity.X3, sparseIntArray);
        g(55, profileActivity.M3, sparseIntArray);
        g(56, profileActivity.Q3, sparseIntArray);
        g(57, profileActivity.R3, sparseIntArray);
        g(58, profileActivity.S3, sparseIntArray);
        g(59, profileActivity.f33835i4, sparseIntArray);
        g(60, profileActivity.T3, sparseIntArray);
        g(61, profileActivity.U3, sparseIntArray);
        g(62, profileActivity.V3, sparseIntArray);
        g(63, profileActivity.W3, sparseIntArray);
        g(64, profileActivity.Y3, sparseIntArray);
        g(65, profileActivity.f33882p4, sparseIntArray);
        g(66, profileActivity.f33888q4, sparseIntArray);
        g(67, profileActivity.f33895r4, sparseIntArray);
        g(68, profileActivity.f33903s4, sparseIntArray);
        g(69, profileActivity.f33924v4, sparseIntArray);
        g(70, profileActivity.f33932w4, sparseIntArray);
        g(71, profileActivity.f33940x4, sparseIntArray);
        g(72, profileActivity.f33947y4, sparseIntArray);
        g(73, profileActivity.f33954z4, sparseIntArray);
        g(74, profileActivity.F4, sparseIntArray);
        g(75, profileActivity.G4, sparseIntArray);
        g(76, profileActivity.D4, sparseIntArray);
        g(77, profileActivity.J4, sparseIntArray);
        g(78, profileActivity.K4, sparseIntArray);
        g(79, profileActivity.Z3, sparseIntArray);
        g(80, profileActivity.f33776a4, sparseIntArray);
        g(81, profileActivity.L4, sparseIntArray);
        g(82, profileActivity.M4, sparseIntArray);
        g(83, profileActivity.P3, sparseIntArray);
        g(84, profileActivity.N3, sparseIntArray);
        g(85, profileActivity.O3, sparseIntArray);
        g(86, profileActivity.T2, sparseIntArray);
        g(87, profileActivity.P2, sparseIntArray);
        g(88, profileActivity.A4, sparseIntArray);
        g(89, profileActivity.B4, sparseIntArray);
        g(90, profileActivity.C4, sparseIntArray);
        g(91, profileActivity.E4, sparseIntArray);
        g(92, profileActivity.f33828h4, sparseIntArray);
        g(93, profileActivity.f33860m4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f33875o4, sparseIntArray);
        g(98, profileActivity.Q2, sparseIntArray);
        g(99, profileActivity.f33842j4, sparseIntArray);
        g(100, profileActivity.f33849k4, sparseIntArray);
        g(101, profileActivity.l4, sparseIntArray);
    }
}
