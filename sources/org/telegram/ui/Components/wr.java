package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wr implements View.OnClickListener {
    public final int f34523a;
    public final long f34524b;
    public final Object f34525c;
    public final Object d;
    public final Object e;

    public wr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f34523a = i10;
        this.f34525c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f34524b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34523a) {
            case 0:
                zr.S((zr) this.f34525c, (Context) this.d, (fi.d) this.e, this.f34524b);
                return;
            case 1:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.f34525c;
                cyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.y2(cyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f34524b, 19), 100L);
                return;
            default:
                vg.a0.P((vg.a0) this.f34525c, (TL_stories.PrepaidGiveaway) this.d, this.f34524b, (org.telegram.ui.ActionBar.r2) this.e);
                return;
        }
    }

    public wr(vg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f34523a = 2;
        this.f34525c = a0Var;
        this.d = prepaidGiveaway;
        this.f34524b = j10;
        this.e = r2Var;
    }
}
