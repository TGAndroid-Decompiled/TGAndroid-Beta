package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class pq0 extends org.telegram.ui.Cells.f7 {
    public final ws0 m0;

    public pq0(ws0 ws0Var, Context context) {
        super(context);
        this.m0 = ws0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ws0 ws0Var = this.m0;
        ls0[] ls0VarArr = ws0Var.f40136w1;
        if (!org.telegram.messenger.zi.S4(ziVar.f26868k) && !ziVar.i4()) {
            if (!ziVar.J3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ls0VarArr[4].f35854a;
            long j10 = ws0Var.f40087f1;
            playlistTopicId = ws0Var.getPlaylistTopicId();
            return B.o0(arrayList2, ziVar, j10, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(ziVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ls0VarArr[4].f35854a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
