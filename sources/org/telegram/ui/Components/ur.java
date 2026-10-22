package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ur implements View.OnClickListener {
    public final int f31004a;
    public final long f31005b;
    public final Object f31006c;
    public final Object d;
    public final Object e;

    public ur(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f31004a = i10;
        this.f31006c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31005b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31004a) {
            case 0:
                xr.T((xr) this.f31006c, (Context) this.d, (ei.d) this.e, this.f31005b);
                return;
            case 1:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f31006c;
                cyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.c3(cyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f31005b, 19), 100L);
                return;
            default:
                ug.z.Q((ug.z) this.f31006c, (TL_stories.PrepaidGiveaway) this.d, this.f31005b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public ur(ug.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f31004a = 2;
        this.f31006c = zVar;
        this.d = prepaidGiveaway;
        this.f31005b = j10;
        this.e = n2Var;
    }
}
