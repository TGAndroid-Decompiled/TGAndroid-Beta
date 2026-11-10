package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ur0 extends org.telegram.ui.Cells.g7 {
    public final int f38742l0;
    public final oj0 m0;

    public ur0(oj0 oj0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(0, context, h6Var);
        this.f38742l0 = i7;
        this.m0 = oj0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.f38742l0) {
            case 0:
                vr0 vr0Var = (vr0) this.m0;
                if (!org.telegram.messenger.ij.R4(ijVar.f23266k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = vr0Var.d;
                    ys0 ys0Var = vr0Var.f39725w;
                    long j3 = ys0Var.f40664e1;
                    playlistTopicId = ys0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, ijVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(ijVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = vr0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (ijVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ls0 ls0Var = (ls0) this.m0;
                int i7 = ls0Var.d;
                ys0 ys0Var2 = ls0Var.f35738f;
                if (!org.telegram.messenger.ij.R4(ijVar.f23266k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = ys0Var2.f40713v1[i7].f36369a;
                    long j10 = ys0Var2.f40664e1;
                    playlistTopicId2 = ys0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, ijVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(ijVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = ys0Var2.f40713v1[i7].f36369a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.wz) this.m0).f51467w;
                if (!org.telegram.messenger.ij.R4(ijVar.f23266k) && !ijVar.h4()) {
                    if (!ijVar.I3()) {
                        return false;
                    }
                    String str = b00Var.Q;
                    long j11 = b00Var.E;
                    long j12 = b00Var.H;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, b00Var.D);
                    a0Var.f14046e = b00Var.N;
                    a0Var.f14047f = b00Var.f43885w;
                    a0Var.d = b00Var.O;
                    a0Var.f14048g = b00Var.J ? 1 : 0;
                    return MediaController.B().o0(b00Var.f43869f, ijVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(ijVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = b00Var.f43869f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public ur0(org.telegram.ui.wz wzVar, Context context) {
        super(1, context, null);
        this.f38742l0 = 2;
        this.m0 = wzVar;
    }
}
