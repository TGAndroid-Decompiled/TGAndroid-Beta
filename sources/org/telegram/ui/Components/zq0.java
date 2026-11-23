package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class zq0 extends org.telegram.ui.Cells.g7 {
    public final it0 m0;

    public zq0(it0 it0Var, Context context) {
        super(context);
        this.m0 = it0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.fj fjVar) {
        ArrayList arrayList;
        long playlistTopicId;
        it0 it0Var = this.m0;
        xs0[] xs0VarArr = it0Var.f36160w1;
        if (!org.telegram.messenger.fj.R4(fjVar.f24073k) && !fjVar.h4()) {
            if (!fjVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = xs0VarArr[4].f42165a;
            long j3 = it0Var.f36111f1;
            playlistTopicId = it0Var.getPlaylistTopicId();
            return B.o0(arrayList2, fjVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(fjVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = xs0VarArr[4].f42165a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
