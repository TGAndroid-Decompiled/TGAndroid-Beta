package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class je implements Runnable {
    public final int f38543a;
    public final sn f38544b;
    public final long f38545c;

    public je(long j10, sn snVar) {
        this.f38543a = 7;
        this.f38545c = j10;
        this.f38544b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f38543a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38545c, r1, true, this.f38544b.classGuid);
                return;
            case 1:
                this.f38544b.getMessagesController().loadFullChat(this.f38545c, 0, true);
                return;
            case 2:
                sn snVar = this.f38544b;
                LongSparseIntArray longSparseIntArray = snVar.Y5;
                long j10 = this.f38545c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.v31 v31Var = snVar.f41487d2;
                if (v31Var != null) {
                    v31Var.setAllTopicsHidden(false);
                }
                if (j10 == snVar.f41635p4) {
                    snVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                sn snVar2 = this.f38544b;
                org.telegram.ui.Components.oc v = org.telegram.ui.Components.vc.v(snVar2.getParentActivity(), snVar2, null, 1, this.f38545c, 1, snVar2.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), snVar2.getThemedColor(org.telegram.ui.ActionBar.k6.Hi), 5000, true, null);
                v.f29204k = true;
                v.k(true);
                return;
            case 4:
                sn snVar3 = this.f38544b;
                snVar3.getClass();
                snVar3.presentFragment(sn.W9(this.f38545c));
                return;
            case 5:
                sn snVar4 = this.f38544b;
                snVar4.getClass();
                snVar4.presentFragment(ProfileActivity.o4(this.f38545c));
                return;
            case 6:
                org.telegram.ui.Components.vc.a0(this.f38544b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38545c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38544b.presentFragment(new ProfileActivity(si.o0.e(this.f38545c, "user_id"), null));
                return;
        }
    }

    public je(sn snVar, long j10, int i10) {
        this.f38543a = i10;
        this.f38544b = snVar;
        this.f38545c = j10;
    }
}
