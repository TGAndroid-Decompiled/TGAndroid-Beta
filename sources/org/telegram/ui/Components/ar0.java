package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ar0 extends org.telegram.ui.Cells.h7 {
    public final jt0 m0;

    public ar0(jt0 jt0Var, Context context) {
        super(context);
        this.m0 = jt0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.gj gjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        jt0 jt0Var = this.m0;
        ys0[] ys0VarArr = jt0Var.f36678w1;
        if (!org.telegram.messenger.gj.R4(gjVar.f24213k) && !gjVar.h4()) {
            if (!gjVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ys0VarArr[4].f42514a;
            long j3 = jt0Var.f36629f1;
            playlistTopicId = jt0Var.getPlaylistTopicId();
            return B.o0(arrayList2, gjVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(gjVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ys0VarArr[4].f42514a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
