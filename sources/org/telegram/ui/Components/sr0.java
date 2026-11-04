package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class sr0 extends org.telegram.ui.Cells.f7 {
    public final int m0;
    public final sj0 f38113n0;

    public sr0(sj0 sj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(0, context, e6Var);
        this.m0 = i3;
        this.f38113n0 = sj0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ArrayList arrayList2;
        long playlistTopicId2;
        ArrayList arrayList3;
        switch (this.m0) {
            case 0:
                tr0 tr0Var = (tr0) this.f38113n0;
                if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
                    if (!ziVar.J3()) {
                        return false;
                    }
                    MediaController B = MediaController.B();
                    ArrayList arrayList4 = tr0Var.d;
                    ws0 ws0Var = tr0Var.f38544w;
                    long j10 = ws0Var.f40087f1;
                    playlistTopicId = ws0Var.getPlaylistTopicId();
                    return B.o0(arrayList4, ziVar, j10, true, null, playlistTopicId);
                }
                boolean S = MediaController.B().S(ziVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = tr0Var.d;
                } else {
                    arrayList = null;
                }
                B2.r0(arrayList, false);
                if (ziVar.i4()) {
                    MediaController.B().k0(false);
                }
                return S;
            case 1:
                js0 js0Var = (js0) this.f38113n0;
                int i3 = js0Var.d;
                ws0 ws0Var2 = js0Var.f35187f;
                if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
                    if (!ziVar.J3()) {
                        return false;
                    }
                    MediaController B3 = MediaController.B();
                    ArrayList arrayList5 = ws0Var2.f40136w1[i3].f35854a;
                    long j11 = ws0Var2.f40087f1;
                    playlistTopicId2 = ws0Var2.getPlaylistTopicId();
                    return B3.o0(arrayList5, ziVar, j11, true, null, playlistTopicId2);
                }
                boolean S2 = MediaController.B().S(ziVar);
                MediaController B4 = MediaController.B();
                if (S2) {
                    arrayList2 = ws0Var2.f40136w1[i3].f35854a;
                } else {
                    arrayList2 = null;
                }
                B4.r0(arrayList2, false);
                return S2;
            default:
                org.telegram.ui.wz wzVar = ((org.telegram.ui.rz) this.f38113n0).f49309w;
                if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
                    if (!ziVar.J3()) {
                        return false;
                    }
                    String str = wzVar.R;
                    long j12 = wzVar.F;
                    long j13 = wzVar.I;
                    g2.b0 b0Var = new g2.b0(str, j12, j13, j13, wzVar.E);
                    b0Var.f11805e = wzVar.O;
                    b0Var.f11806f = wzVar.f51662w;
                    b0Var.d = wzVar.P;
                    b0Var.f11807g = wzVar.K ? 1 : 0;
                    return MediaController.B().o0(wzVar.f51645f, ziVar, 0L, true, b0Var, 0L);
                }
                boolean S3 = MediaController.B().S(ziVar);
                MediaController B5 = MediaController.B();
                if (S3) {
                    arrayList3 = wzVar.f51645f;
                } else {
                    arrayList3 = null;
                }
                B5.r0(arrayList3, false);
                return S3;
        }
    }

    public sr0(org.telegram.ui.rz rzVar, Context context) {
        super(1, context, null);
        this.m0 = 2;
        this.f38113n0 = rzVar;
    }
}
