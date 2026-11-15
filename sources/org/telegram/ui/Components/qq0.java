package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class qq0 extends org.telegram.ui.Cells.f7 {
    public final ys0 m0;

    public qq0(ys0 ys0Var, Context context) {
        super(context);
        this.m0 = ys0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ys0 ys0Var = this.m0;
        ns0[] ns0VarArr = ys0Var.f42146w1;
        if (!org.telegram.messenger.gj.R4(gjVar.f23819k) && !gjVar.h4()) {
            if (!gjVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ns0VarArr[4].f37681a;
            long j3 = ys0Var.f42097f1;
            playlistTopicId = ys0Var.getPlaylistTopicId();
            return B.o0(arrayList2, gjVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(gjVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ns0VarArr[4].f37681a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
