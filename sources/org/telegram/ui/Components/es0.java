package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class es0 extends org.telegram.ui.Cells.g7 {
    public final int m0;
    public final dk0 f34847n0;

    public es0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(0, context, i6Var);
        this.m0 = i7;
        this.f34847n0 = dk0Var;
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
                fs0 fs0Var = (fs0) this.f34847n0;
                if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = fs0Var.d;
                    it0 it0Var = fs0Var.f35194w;
                    long j3 = it0Var.f36111f1;
                    playlistTopicId = it0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, fjVar, j3, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(fjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = fs0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (fjVar.h4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                vs0 vs0Var = (vs0) this.f34847n0;
                int i7 = vs0Var.d;
                it0 it0Var2 = vs0Var.f41434f;
                if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = it0Var2.f36160w1[i7].f42165a;
                    long j10 = it0Var2.f36111f1;
                    playlistTopicId2 = it0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, fjVar, j10, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(fjVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = it0Var2.f36160w1[i7].f42165a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.b00 b00Var = ((org.telegram.ui.wz) this.f34847n0).f53797w;
                if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
                    if (!fjVar.I3()) {
                        return false;
                    }
                    String str = b00Var.R;
                    long j11 = b00Var.F;
                    long j12 = b00Var.I;
                    h2.a0 a0Var = new h2.a0(str, j11, j12, j12, b00Var.E);
                    a0Var.f13711e = b00Var.O;
                    a0Var.f13712f = b00Var.f45869w;
                    a0Var.d = b00Var.P;
                    a0Var.f13713g = b00Var.K ? 1 : 0;
                    return MediaController.B().o0(b00Var.f45852f, fjVar, 0L, true, a0Var, 0L);
                }
                boolean S3 = MediaController.B().S(fjVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = b00Var.f45852f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public es0(org.telegram.ui.wz wzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.f34847n0 = wzVar;
    }
}
