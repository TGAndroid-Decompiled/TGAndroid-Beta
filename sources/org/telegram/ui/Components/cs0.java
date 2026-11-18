package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class cs0 extends org.telegram.ui.Cells.g7 {
    public final int m0;
    public final bk0 f34174n0;

    public cs0(bk0 bk0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(0, context, i6Var);
        this.m0 = i7;
        this.f34174n0 = bk0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.m0) {
            case 0:
                ds0 ds0Var = (ds0) this.f34174n0;
                if (!org.telegram.messenger.fj.R4(fjVar.f23968k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = ds0Var.d;
                    gt0 gt0Var = ds0Var.f34499w;
                    long j3 = gt0Var.f35587f1;
                    playlistTopicId = gt0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, fjVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(fjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = ds0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (fjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ts0 ts0Var = (ts0) this.f34174n0;
                int i7 = ts0Var.d;
                gt0 gt0Var2 = ts0Var.f40096f;
                if (!org.telegram.messenger.fj.R4(fjVar.f23968k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = gt0Var2.f35636w1[i7].f41412a;
                    long j10 = gt0Var2.f35587f1;
                    playlistTopicId2 = gt0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, fjVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(fjVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = gt0Var2.f35636w1[i7].f41412a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.xz) this.f34174n0).f53969w;
                if (!org.telegram.messenger.fj.R4(fjVar.f23968k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    String str = c00Var.R;
                    long j11 = c00Var.F;
                    long j12 = c00Var.I;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, c00Var.E);
                    a0Var.f13719e = c00Var.O;
                    a0Var.f13720f = c00Var.f46355w;
                    a0Var.d = c00Var.P;
                    a0Var.f13721g = c00Var.K ? 1 : 0;
                    return MediaController.B().o0(c00Var.f46338f, fjVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(fjVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = c00Var.f46338f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public cs0(org.telegram.ui.xz xzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.f34174n0 = xzVar;
    }
}
