package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cs implements View.OnClickListener {
    public final int f24991a;
    public final long f24992b;
    public final Object f24993c;
    public final Object d;
    public final Object f24994e;

    public cs(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f24991a = i10;
        this.f24993c = obj;
        this.d = obj2;
        this.f24994e = obj3;
        this.f24992b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24991a) {
            case 0:
                fs.T((fs) this.f24993c, (Context) this.d, (ci.d) this.f24994e, this.f24992b);
                return;
            case 1:
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) this.f24993c;
                vyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.r8(vyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f24994e, this.f24992b, 11), 100L);
                return;
            default:
                tg.a0.Q((tg.a0) this.f24993c, (TL_stories.PrepaidGiveaway) this.d, this.f24992b, (org.telegram.ui.ActionBar.m2) this.f24994e);
                return;
        }
    }

    public cs(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f24991a = 2;
        this.f24993c = a0Var;
        this.d = prepaidGiveaway;
        this.f24992b = j3;
        this.f24994e = m2Var;
    }
}
