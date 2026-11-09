package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class qq0 extends org.telegram.ui.Cells.g7 {
    public final zs0 f37467l0;

    public qq0(zs0 zs0Var, Context context) {
        super(context);
        this.f37467l0 = zs0Var;
    }

    @Override
    public final boolean d(org.telegram.messenger.ij ijVar) {
        ArrayList arrayList;
        long playlistTopicId;
        zs0 zs0Var = this.f37467l0;
        os0[] os0VarArr = zs0Var.f41121v1;
        if (!org.telegram.messenger.ij.R4(ijVar.f23262k) && !ijVar.h4()) {
            if (!ijVar.I3()) {
                return false;
            }
            MediaController B = MediaController.B();
            ArrayList arrayList2 = os0VarArr[4].f36778a;
            long j3 = zs0Var.f41072e1;
            playlistTopicId = zs0Var.getPlaylistTopicId();
            return B.o0(arrayList2, ijVar, j3, true, null, playlistTopicId);
        }
        boolean S = MediaController.B().S(ijVar);
        MediaController B2 = MediaController.B();
        if (S) {
            arrayList = os0VarArr[4].f36778a;
        } else {
            arrayList = null;
        }
        B2.r0(arrayList, false);
        return S;
    }
}
