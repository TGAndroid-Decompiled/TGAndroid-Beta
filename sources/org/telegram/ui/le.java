package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class le implements Runnable {
    public final int f38856a;
    public final sn f38857b;
    public final long f38858c;

    public le(long j10, sn snVar) {
        this.f38856a = 7;
        this.f38858c = j10;
        this.f38857b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f38856a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f38858c, r1, true, this.f38857b.classGuid);
                return;
            case 1:
                this.f38857b.getMessagesController().loadFullChat(this.f38858c, 0, true);
                return;
            case 2:
                sn snVar = this.f38857b;
                LongSparseIntArray longSparseIntArray = snVar.M5;
                long j10 = this.f38858c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.q31 q31Var = snVar.R1;
                if (q31Var != null) {
                    q31Var.setAllTopicsHidden(false);
                }
                if (j10 == snVar.f41188d4) {
                    snVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                sn snVar2 = this.f38857b;
                snVar2.getClass();
                snVar2.presentFragment(sn.W9(this.f38858c));
                return;
            case 4:
                sn snVar3 = this.f38857b;
                snVar3.getClass();
                snVar3.presentFragment(ProfileActivity.m4(this.f38858c));
                return;
            case 5:
                sn snVar4 = this.f38857b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(snVar4.getParentActivity(), snVar4, null, 1, this.f38858c, 1, snVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), snVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.f29640k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f38857b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f38858c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f38857b.presentFragment(new ProfileActivity(z7.g5.a(this.f38858c, "user_id"), null));
                return;
        }
    }

    public le(sn snVar, long j10, int i10) {
        this.f38856a = i10;
        this.f38857b = snVar;
        this.f38858c = j10;
    }
}
