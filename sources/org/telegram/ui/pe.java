package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class pe implements Runnable {
    public final int f40931a;
    public final eo f40932b;
    public final long f40933c;

    public pe(long j3, eo eoVar) {
        this.f40931a = 7;
        this.f40933c = j3;
        this.f40932b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f40931a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f40933c, r1, true, this.f40932b.classGuid);
                return;
            case 1:
                this.f40932b.getMessagesController().loadFullChat(this.f40933c, 0, true);
                return;
            case 2:
                eo eoVar = this.f40932b;
                LongSparseIntArray longSparseIntArray = eoVar.M5;
                long j3 = this.f40933c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.h41 h41Var = eoVar.R1;
                if (h41Var != null) {
                    h41Var.setAllTopicsHidden(false);
                }
                if (j3 == eoVar.f37232d4) {
                    eoVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                eo eoVar2 = this.f40932b;
                eoVar2.getClass();
                eoVar2.presentFragment(eo.W9(this.f40933c));
                return;
            case 4:
                eo eoVar3 = this.f40932b;
                eoVar3.getClass();
                eoVar3.presentFragment(ProfileActivity.m4(this.f40933c));
                return;
            case 5:
                eo eoVar4 = this.f40932b;
                org.telegram.ui.Components.sc v = org.telegram.ui.Components.zc.v(eoVar4.getParentActivity(), eoVar4, null, 1, this.f40933c, 1, eoVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), eoVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f30541k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.zc.a0(this.f40932b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f40933c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f40932b.presentFragment(new ProfileActivity(sc.v.f(this.f40933c, "user_id"), null));
                return;
        }
    }

    public pe(eo eoVar, long j3, int i10) {
        this.f40931a = i10;
        this.f40932b = eoVar;
        this.f40933c = j3;
    }
}
