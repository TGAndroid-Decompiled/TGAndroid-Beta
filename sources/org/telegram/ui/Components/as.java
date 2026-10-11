package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class as implements View.OnClickListener {
    public final int f24565a;
    public final long f24566b;
    public final Object f24567c;
    public final Object d;
    public final Object f24568e;

    public as(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f24565a = i10;
        this.f24567c = obj;
        this.d = obj2;
        this.f24568e = obj3;
        this.f24566b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24565a) {
            case 0:
                es.T((es) this.f24567c, (Context) this.d, (ci.d) this.f24568e, this.f24566b);
                return;
            case 1:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) this.f24567c;
                syVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new q31(syVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f24568e, this.f24566b, 1), 100L);
                return;
            default:
                tg.z.Q((tg.z) this.f24567c, (TL_stories.PrepaidGiveaway) this.d, this.f24566b, (org.telegram.ui.ActionBar.m2) this.f24568e);
                return;
        }
    }

    public as(tg.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f24565a = 2;
        this.f24567c = zVar;
        this.d = prepaidGiveaway;
        this.f24566b = j3;
        this.f24568e = m2Var;
    }
}
