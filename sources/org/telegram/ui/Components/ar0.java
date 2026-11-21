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
    public final boolean d(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        jt0 jt0Var = this.m0;
        ys0[] ys0VarArr = jt0Var.f36683w1;
        if (!org.telegram.messenger.fj.R4(fjVar.f23993k) && !fjVar.h4()) {
            if (!fjVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ys0VarArr[4].f42521a;
            long j3 = jt0Var.f36634f1;
            playlistTopicId = jt0Var.getPlaylistTopicId();
            return B.o0(arrayList2, fjVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(fjVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ys0VarArr[4].f42521a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
