package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ur0 extends org.telegram.ui.Cells.f7 {
    public final int m0;
    public final tj0 f40154n0;

    public ur0(tj0 tj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(0, context, e6Var);
        this.m0 = i7;
        this.f40154n0 = tj0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.m0) {
            case 0:
                vr0 vr0Var = (vr0) this.f40154n0;
                if (!org.telegram.messenger.gj.R4(gjVar.f23817k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = vr0Var.d;
                    ys0 ys0Var = vr0Var.f41140w;
                    long j3 = ys0Var.f42095f1;
                    playlistTopicId = ys0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, gjVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(gjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = vr0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (gjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ls0 ls0Var = (ls0) this.f40154n0;
                int i7 = ls0Var.d;
                ys0 ys0Var2 = ls0Var.f36900f;
                if (!org.telegram.messenger.gj.R4(gjVar.f23817k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = ys0Var2.f42144w1[i7].f37692a;
                    long j10 = ys0Var2.f42095f1;
                    playlistTopicId2 = ys0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, gjVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(gjVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = ys0Var2.f42144w1[i7].f37692a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.zz zzVar = ((org.telegram.ui.uz) this.f40154n0).f52070w;
                if (!org.telegram.messenger.gj.R4(gjVar.f23817k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    String str = zzVar.R;
                    long j11 = zzVar.F;
                    long j12 = zzVar.I;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, zzVar.E);
                    a0Var.f13404e = zzVar.O;
                    a0Var.f13405f = zzVar.f54099w;
                    a0Var.d = zzVar.P;
                    a0Var.f13406g = zzVar.K ? 1 : 0;
                    return MediaController.B().o0(zzVar.f54082f, gjVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(gjVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = zzVar.f54082f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public ur0(org.telegram.ui.uz uzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.f40154n0 = uzVar;
    }
}
