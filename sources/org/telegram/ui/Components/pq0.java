package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class pq0 extends org.telegram.ui.Cells.g7 {
    public final ys0 f37065l0;

    public pq0(ys0 ys0Var, Context context) {
        super(context);
        this.f37065l0 = ys0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        ys0 ys0Var = this.f37065l0;
        ns0[] ns0VarArr = ys0Var.f40713v1;
        if (!org.telegram.messenger.ij.R4(ijVar.f23266k) && !ijVar.h4()) {
            if (!ijVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ns0VarArr[4].f36369a;
            long j3 = ys0Var.f40664e1;
            playlistTopicId = ys0Var.getPlaylistTopicId();
            return B.o0(arrayList2, ijVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(ijVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ns0VarArr[4].f36369a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
