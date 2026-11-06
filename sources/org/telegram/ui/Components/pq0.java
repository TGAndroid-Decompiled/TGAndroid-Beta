package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class pq0 extends org.telegram.ui.Cells.g7 {
    public final xs0 f37049l0;

    public pq0(xs0 xs0Var, Context context) {
        super(context);
        this.f37049l0 = xs0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        xs0 xs0Var = this.f37049l0;
        ms0[] ms0VarArr = xs0Var.f40434v1;
        if (!org.telegram.messenger.ij.S4(ijVar.f23244k) && !ijVar.i4()) {
            if (!ijVar.J3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = ms0VarArr[4].f36063a;
            long j3 = xs0Var.f40385e1;
            playlistTopicId = xs0Var.getPlaylistTopicId();
            return B.o0(arrayList2, ijVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(ijVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = ms0VarArr[4].f36063a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
