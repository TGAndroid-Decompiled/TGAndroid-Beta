package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class me implements Runnable {
    public final int f34921a;
    public final eo f34922b;
    public final long f34923c;

    public me(long j3, eo eoVar) {
        this.f34921a = 7;
        this.f34923c = j3;
        this.f34922b = eoVar;
    }

    @Override
    public final void run() {
        switch (this.f34921a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f34923c, r1, true, this.f34922b.classGuid);
                return;
            case 1:
                this.f34922b.getMessagesController().loadFullChat(this.f34923c, 0, true);
                return;
            case 2:
                eo eoVar = this.f34922b;
                LongSparseIntArray longSparseIntArray = eoVar.M5;
                long j3 = this.f34923c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.k31 k31Var = eoVar.R1;
                if (k31Var != null) {
                    k31Var.setAllTopicsHidden(false);
                }
                if (j3 == eoVar.f32298d4) {
                    eoVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                eo eoVar2 = this.f34922b;
                eoVar2.getClass();
                eoVar2.presentFragment(eo.R9(this.f34923c));
                return;
            case 4:
                eo eoVar3 = this.f34922b;
                eoVar3.getClass();
                eoVar3.presentFragment(ProfileActivity.m4(this.f34923c));
                return;
            case 5:
                eo eoVar4 = this.f34922b;
                org.telegram.ui.Components.pc v = org.telegram.ui.Components.wc.v(eoVar4.getParentActivity(), eoVar4, null, 1, this.f34923c, 1, eoVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), eoVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f26082k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.wc.a0(this.f34922b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f34923c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f34922b.presentFragment(new ProfileActivity(w.f.e(this.f34923c, "user_id"), null));
                return;
        }
    }

    public me(eo eoVar, long j3, int i10) {
        this.f34921a = i10;
        this.f34922b = eoVar;
        this.f34923c = j3;
    }
}
