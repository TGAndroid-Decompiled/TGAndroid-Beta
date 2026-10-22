package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pz0 extends s4.o {
    public int f40324b;
    public final SparseIntArray f40325c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList e = new ArrayList();
    public final ArrayList f40326f = new ArrayList();
    public int f40327g;
    public int h;
    public final ProfileActivity f40328i;

    public pz0(ProfileActivity profileActivity) {
        this.f40328i = profileActivity;
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
        ProfileActivity profileActivity = this.f40328i;
        if (i11 >= profileActivity.f33736v4 && i11 < profileActivity.f33744w4 && i10 >= this.f40327g && i10 < this.h) {
            ArrayList arrayList = this.f40326f;
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.e;
            if (!isEmpty) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(((Integer) arrayList.get(i10 - this.f40327g)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList2.get(i10 - this.f40327g);
            }
            if (!profileActivity.D2.isEmpty()) {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(((Integer) profileActivity.T4.get(i11 - profileActivity.f33736v4)).intValue());
            } else {
                chatParticipant2 = (TLRPC.ChatParticipant) profileActivity.S4.get(i11 - profileActivity.f33736v4);
            }
            if (chatParticipant.user_id != chatParticipant2.user_id) {
                return false;
            }
            return true;
        }
        int i12 = this.f40325c.get(i10, -1);
        if (i12 != this.d.get(i11, -1) || i12 < 0) {
            return false;
        }
        return true;
    }

    @Override
    public final int d() {
        return this.f40328i.O2;
    }

    @Override
    public final int e() {
        return this.f40324b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        sparseIntArray.clear();
        ProfileActivity profileActivity = this.f40328i;
        g(1, profileActivity.P2, sparseIntArray);
        g(2, profileActivity.Q2, sparseIntArray);
        g(3, profileActivity.T2, sparseIntArray);
        g(4, profileActivity.U2, sparseIntArray);
        g(5, profileActivity.W2, sparseIntArray);
        g(6, profileActivity.X2, sparseIntArray);
        g(7, profileActivity.f33595b3, sparseIntArray);
        g(8, profileActivity.Y2, sparseIntArray);
        g(9, profileActivity.f33610d3, sparseIntArray);
        g(10, profileActivity.f33603c3, sparseIntArray);
        g(11, profileActivity.Z2, sparseIntArray);
        g(12, profileActivity.f33587a3, sparseIntArray);
        g(13, profileActivity.f33617e3, sparseIntArray);
        g(14, profileActivity.f33625f3, sparseIntArray);
        g(15, profileActivity.f33632g3, sparseIntArray);
        g(16, profileActivity.f33639h3, sparseIntArray);
        g(17, profileActivity.f33611d4, sparseIntArray);
        g(18, profileActivity.f33618e4, sparseIntArray);
        g(19, profileActivity.f33633g4, sparseIntArray);
        g(20, profileActivity.f33647i4, sparseIntArray);
        g(21, profileActivity.f33640h4, sparseIntArray);
        g(22, profileActivity.f33646i3, sparseIntArray);
        g(23, profileActivity.f33653j3, sparseIntArray);
        g(24, profileActivity.f33671m3, sparseIntArray);
        g(25, profileActivity.f33660k3, sparseIntArray);
        g(26, profileActivity.f33666l3, sparseIntArray);
        g(27, profileActivity.f33679n3, sparseIntArray);
        g(28, profileActivity.f33686o3, sparseIntArray);
        g(29, profileActivity.f33693p3, sparseIntArray);
        g(30, profileActivity.f33699q3, sparseIntArray);
        g(31, profileActivity.f33706r3, sparseIntArray);
        g(32, profileActivity.f33714s3, sparseIntArray);
        g(33, profileActivity.f33721t3, sparseIntArray);
        g(34, profileActivity.f33728u3, sparseIntArray);
        g(35, profileActivity.f33735v3, sparseIntArray);
        g(36, profileActivity.f33743w3, sparseIntArray);
        g(37, profileActivity.f33751x3, sparseIntArray);
        g(38, profileActivity.y3, sparseIntArray);
        g(39, profileActivity.f33765z3, sparseIntArray);
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
        g(59, profileActivity.f33661k4, sparseIntArray);
        g(60, profileActivity.V3, sparseIntArray);
        g(61, profileActivity.W3, sparseIntArray);
        g(62, profileActivity.X3, sparseIntArray);
        g(63, profileActivity.Y3, sparseIntArray);
        g(64, profileActivity.f33588a4, sparseIntArray);
        g(65, profileActivity.f33707r4, sparseIntArray);
        g(66, profileActivity.f33715s4, sparseIntArray);
        g(67, profileActivity.f33722t4, sparseIntArray);
        g(68, profileActivity.f33729u4, sparseIntArray);
        g(69, profileActivity.f33752x4, sparseIntArray);
        g(70, profileActivity.f33759y4, sparseIntArray);
        g(71, profileActivity.f33766z4, sparseIntArray);
        g(72, profileActivity.A4, sparseIntArray);
        g(73, profileActivity.B4, sparseIntArray);
        g(74, profileActivity.H4, sparseIntArray);
        g(75, profileActivity.I4, sparseIntArray);
        g(76, profileActivity.F4, sparseIntArray);
        g(77, profileActivity.L4, sparseIntArray);
        g(78, profileActivity.M4, sparseIntArray);
        g(79, profileActivity.f33596b4, sparseIntArray);
        g(80, profileActivity.f33604c4, sparseIntArray);
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
        g(92, profileActivity.f33654j4, sparseIntArray);
        g(93, profileActivity.f33687o4, sparseIntArray);
        i10 = profileActivity.botPermissionLocation;
        g(94, i10, sparseIntArray);
        i11 = profileActivity.botPermissionEmojiStatus;
        g(95, i11, sparseIntArray);
        i12 = profileActivity.botPermissionBiometry;
        g(96, i12, sparseIntArray);
        g(97, profileActivity.f33700q4, sparseIntArray);
        g(98, profileActivity.S2, sparseIntArray);
        g(99, profileActivity.l4, sparseIntArray);
        g(100, profileActivity.f33672m4, sparseIntArray);
        g(101, profileActivity.f33680n4, sparseIntArray);
    }
}
