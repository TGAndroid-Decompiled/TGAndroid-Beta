package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ke implements Runnable {
    public final int f35129a;
    public final wn f35130b;
    public final long f35131c;

    public ke(long j3, wn wnVar) {
        this.f35129a = 7;
        this.f35131c = j3;
        this.f35130b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f35129a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35131c, r1, true, this.f35130b.classGuid);
                return;
            case 1:
                this.f35130b.getMessagesController().loadFullChat(this.f35131c, 0, true);
                return;
            case 2:
                wn wnVar = this.f35130b;
                LongSparseIntArray longSparseIntArray = wnVar.M5;
                long j3 = this.f35131c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.n31 n31Var = wnVar.R1;
                if (n31Var != null) {
                    n31Var.setAllTopicsHidden(false);
                }
                if (j3 == wnVar.f39544d4) {
                    wnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                wn wnVar2 = this.f35130b;
                wnVar2.getClass();
                wnVar2.presentFragment(wn.R9(this.f35131c));
                return;
            case 4:
                wn wnVar3 = this.f35130b;
                wnVar3.getClass();
                wnVar3.presentFragment(ProfileActivity.m4(this.f35131c));
                return;
            case 5:
                wn wnVar4 = this.f35130b;
                org.telegram.ui.Components.rc v = org.telegram.ui.Components.yc.v(wnVar4.getParentActivity(), wnVar4, null, 1, this.f35131c, 1, wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f27947k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.yc.a0(this.f35130b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35131c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35130b.presentFragment(new ProfileActivity(v7.j.e(this.f35131c, "user_id"), null));
                return;
        }
    }

    public ke(wn wnVar, long j3, int i10) {
        this.f35129a = i10;
        this.f35130b = wnVar;
        this.f35131c = j3;
    }
}
