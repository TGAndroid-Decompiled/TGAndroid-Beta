package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class fs0 extends org.telegram.ui.Cells.h7 {
    public final int m0;
    public final dk0 f35313n0;

    public fs0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(0, context, h6Var);
        this.m0 = i7;
        this.f35313n0 = dk0Var;
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
                gs0 gs0Var = (gs0) this.f35313n0;
                if (!org.telegram.messenger.gj.R4(gjVar.f24213k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = gs0Var.d;
                    jt0 jt0Var = gs0Var.f35665w;
                    long j3 = jt0Var.f36628f1;
                    playlistTopicId = jt0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, gjVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(gjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = gs0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (gjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                ws0 ws0Var = (ws0) this.f35313n0;
                int i7 = ws0Var.d;
                jt0 jt0Var2 = ws0Var.f41890f;
                if (!org.telegram.messenger.gj.R4(gjVar.f24213k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = jt0Var2.f36677w1[i7].f42513a;
                    long j10 = jt0Var2.f36628f1;
                    playlistTopicId2 = jt0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, gjVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(gjVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = jt0Var2.f36677w1[i7].f42513a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.xz) this.f35313n0).f53990w;
                if (!org.telegram.messenger.gj.R4(gjVar.f24213k) && !gjVar.h4()) {
                    if (!gjVar.I3()) {
                        return false;
                    }
                    String str = c00Var.R;
                    long j11 = c00Var.F;
                    long j12 = c00Var.I;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, c00Var.E);
                    a0Var.f13748e = c00Var.O;
                    a0Var.f13749f = c00Var.f46372w;
                    a0Var.d = c00Var.P;
                    a0Var.f13750g = c00Var.K ? 1 : 0;
                    return MediaController.B().o0(c00Var.f46355f, gjVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(gjVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = c00Var.f46355f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public fs0(org.telegram.ui.xz xzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.f35313n0 = xzVar;
    }
}
