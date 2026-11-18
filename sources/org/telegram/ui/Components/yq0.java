package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class yq0 extends org.telegram.ui.Cells.h7 {
    public final gt0 m0;

    public yq0(gt0 gt0Var, Context context) {
        super(context);
        this.m0 = gt0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        gt0 gt0Var = this.m0;
        vs0[] vs0VarArr = gt0Var.f35636w1;
        if (!org.telegram.messenger.fj.R4(fjVar.f23965k) && !fjVar.h4()) {
            if (!fjVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = vs0VarArr[4].f41412a;
            long j3 = gt0Var.f35587f1;
            playlistTopicId = gt0Var.getPlaylistTopicId();
            return B.o0(arrayList2, fjVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(fjVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = vs0VarArr[4].f41412a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
