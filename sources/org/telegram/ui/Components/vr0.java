package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class vr0 extends org.telegram.ui.Cells.g7 {
    public final int f39801l0;
    public final pj0 m0;

    public vr0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(0, context, g6Var);
        this.f39801l0 = i7;
        this.m0 = pj0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.f39801l0) {
            case 0:
                wr0 wr0Var = (wr0) this.m0;
                if (!org.telegram.messenger.ij.R4(ijVar.f23262k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = wr0Var.d;
                    zs0 zs0Var = wr0Var.f40140w;
                    long j3 = zs0Var.f41072e1;
                    playlistTopicId = zs0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, ijVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(ijVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = wr0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (ijVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ms0 ms0Var = (ms0) this.m0;
                int i7 = ms0Var.d;
                zs0 zs0Var2 = ms0Var.f36145f;
                if (!org.telegram.messenger.ij.R4(ijVar.f23262k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = zs0Var2.f41121v1[i7].f36778a;
                    long j10 = zs0Var2.f41072e1;
                    playlistTopicId2 = zs0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, ijVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(ijVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = zs0Var2.f41121v1[i7].f36778a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.a00 a00Var = ((org.telegram.ui.vz) this.m0).f50801w;
                if (!org.telegram.messenger.ij.R4(ijVar.f23262k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    String str = a00Var.Q;
                    long j11 = a00Var.E;
                    long j12 = a00Var.H;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, a00Var.D);
                    a0Var.f14044e = a00Var.N;
                    a0Var.f14045f = a00Var.f43535w;
                    a0Var.d = a00Var.O;
                    a0Var.f14046g = a00Var.J ? 1 : 0;
                    return MediaController.B().o0(a00Var.f43519f, ijVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(ijVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = a00Var.f43519f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public vr0(org.telegram.ui.vz vzVar, Context context) {
        super(1, context, null);
        this.f39801l0 = 2;
        this.m0 = vzVar;
    }
}
