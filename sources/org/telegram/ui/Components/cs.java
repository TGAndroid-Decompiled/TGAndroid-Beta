package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cs implements View.OnClickListener {
    public final int f25006a;
    public final long f25007b;
    public final Object f25008c;
    public final Object d;
    public final Object f25009e;

    public cs(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25006a = i10;
        this.f25008c = obj;
        this.d = obj2;
        this.f25009e = obj3;
        this.f25007b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25006a) {
            case 0:
                fs.T((fs) this.f25008c, (Context) this.d, (ci.d) this.f25009e, this.f25007b);
                return;
            case 1:
                org.telegram.ui.vy vyVar = (org.telegram.ui.vy) this.f25008c;
                vyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.r8(vyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f25009e, this.f25007b, 11), 100L);
                return;
            default:
                tg.z.Q((tg.z) this.f25008c, (TL_stories.PrepaidGiveaway) this.d, this.f25007b, (org.telegram.ui.ActionBar.m2) this.f25009e);
                return;
        }
    }

    public cs(tg.z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f25006a = 2;
        this.f25008c = zVar;
        this.d = prepaidGiveaway;
        this.f25007b = j3;
        this.f25009e = m2Var;
    }
}
