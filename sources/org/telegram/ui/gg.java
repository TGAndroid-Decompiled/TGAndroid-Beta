package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class gg implements Runnable {
    public final int f36661a;
    public final yn f36662b;
    public final long f36663c;

    public gg(long j3, yn ynVar) {
        this.f36661a = 7;
        this.f36663c = j3;
        this.f36662b = ynVar;
    }

    @Override
    public final void run() {
        switch (this.f36661a) {
            case 0:
                this.f36662b.getMessagesController().loadFullChat(this.f36663c, 0, true);
                return;
            case 1:
                yn ynVar = this.f36662b;
                LongSparseIntArray longSparseIntArray = ynVar.K5;
                long j3 = this.f36663c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w31 w31Var = ynVar.P1;
                if (w31Var != null) {
                    w31Var.setAllTopicsHidden(false);
                }
                if (j3 == ynVar.f43280b4) {
                    ynVar.f43565y0.O(false);
                    return;
                }
                return;
            case 2:
                yn ynVar2 = this.f36662b;
                ynVar2.getClass();
                ynVar2.presentFragment(yn.Q9(this.f36663c));
                return;
            case 3:
                yn ynVar3 = this.f36662b;
                ynVar3.getClass();
                ynVar3.presentFragment(ProfileActivity.m4(this.f36663c));
                return;
            case 4:
                yn ynVar4 = this.f36662b;
                org.telegram.ui.Components.rc v = org.telegram.ui.Components.yc.v(ynVar4.getParentActivity(), ynVar4, null, 1, this.f36663c, 1, ynVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), ynVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.f30428k = true;
                v.k(true);
                return;
            case 5:
                r0.getMediaDataController().loadBotInfo(this.f36663c, r1, true, this.f36662b.classGuid);
                return;
            case 6:
                org.telegram.ui.Components.yc.a0(this.f36662b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f36663c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f36662b.presentFragment(new ProfileActivity(sa.e.f(this.f36663c, "user_id"), null));
                return;
        }
    }

    public gg(yn ynVar, long j3, int i10) {
        this.f36661a = i10;
        this.f36662b = ynVar;
        this.f36663c = j3;
    }
}
