package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ke implements Runnable {
    public final int f35038a;
    public final wn f35039b;
    public final long f35040c;

    public ke(long j3, wn wnVar) {
        this.f35038a = 7;
        this.f35040c = j3;
        this.f35039b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f35038a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35040c, r1, true, this.f35039b.classGuid);
                return;
            case 1:
                this.f35039b.getMessagesController().loadFullChat(this.f35040c, 0, true);
                return;
            case 2:
                wn wnVar = this.f35039b;
                LongSparseIntArray longSparseIntArray = wnVar.M5;
                long j3 = this.f35040c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.l31 l31Var = wnVar.R1;
                if (l31Var != null) {
                    l31Var.setAllTopicsHidden(false);
                }
                if (j3 == wnVar.f39450d4) {
                    wnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                wn wnVar2 = this.f35039b;
                wnVar2.getClass();
                wnVar2.presentFragment(wn.R9(this.f35040c));
                return;
            case 4:
                wn wnVar3 = this.f35039b;
                wnVar3.getClass();
                wnVar3.presentFragment(ProfileActivity.m4(this.f35040c));
                return;
            case 5:
                wn wnVar4 = this.f35039b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(wnVar4.getParentActivity(), wnVar4, null, 1, this.f35040c, 1, wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f27636k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f35039b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35040c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35039b.presentFragment(new ProfileActivity(v7.j.e(this.f35040c, "user_id"), null));
                return;
        }
    }

    public ke(wn wnVar, long j3, int i10) {
        this.f35038a = i10;
        this.f35039b = wnVar;
        this.f35040c = j3;
    }
}
