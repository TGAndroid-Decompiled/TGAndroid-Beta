package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ur implements View.OnClickListener {
    public final int f31079a;
    public final long f31080b;
    public final Object f31081c;
    public final Object d;
    public final Object e;

    public ur(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f31079a = i10;
        this.f31081c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31080b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31079a) {
            case 0:
                xr.T((xr) this.f31081c, (Context) this.d, (ei.d) this.e, this.f31080b);
                return;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f31081c;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.b2(eyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f31080b, 19), 100L);
                return;
            default:
                ug.z.Q((ug.z) this.f31081c, (TL_stories.PrepaidGiveaway) this.d, this.f31080b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public ur(ug.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f31079a = 2;
        this.f31081c = zVar;
        this.d = prepaidGiveaway;
        this.f31080b = j10;
        this.e = n2Var;
    }
}
