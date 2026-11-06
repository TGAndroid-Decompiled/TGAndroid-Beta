package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class tr0 extends org.telegram.ui.Cells.g7 {
    public final int f38398l0;
    public final oj0 m0;

    public tr0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(0, context, f6Var);
        this.f38398l0 = i7;
        this.m0 = oj0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.f38398l0) {
            case 0:
                ur0 ur0Var = (ur0) this.m0;
                if (!org.telegram.messenger.ij.S4(ijVar.f23237k) && !ijVar.i4()) {
                    if (!ijVar.J3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = ur0Var.d;
                    xs0 xs0Var = ur0Var.f38715w;
                    long j3 = xs0Var.f40369e1;
                    playlistTopicId = xs0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, ijVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(ijVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = ur0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (ijVar.i4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ks0 ks0Var = (ks0) this.m0;
                int i7 = ks0Var.d;
                xs0 xs0Var2 = ks0Var.f35415f;
                if (!org.telegram.messenger.ij.S4(ijVar.f23237k) && !ijVar.i4()) {
                    if (!ijVar.J3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = xs0Var2.f40418v1[i7].f36047a;
                    long j10 = xs0Var2.f40369e1;
                    playlistTopicId2 = xs0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, ijVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(ijVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = xs0Var2.f40418v1[i7].f36047a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.yz yzVar = ((org.telegram.ui.tz) this.m0).f50183w;
                if (!org.telegram.messenger.ij.S4(ijVar.f23237k) && !ijVar.i4()) {
                    if (!ijVar.J3()) {
                        return false;
                    }
                    String str = yzVar.Q;
                    long j11 = yzVar.E;
                    long j12 = yzVar.H;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, yzVar.D);
                    a0Var.f14044e = yzVar.N;
                    a0Var.f14045f = yzVar.f52405w;
                    a0Var.d = yzVar.O;
                    a0Var.f14046g = yzVar.J ? 1 : 0;
                    return MediaController.B().o0(yzVar.f52389f, ijVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(ijVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = yzVar.f52389f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public tr0(org.telegram.ui.tz tzVar, Context context) {
        super(1, context, null);
        this.f38398l0 = 2;
        this.m0 = tzVar;
    }
}
