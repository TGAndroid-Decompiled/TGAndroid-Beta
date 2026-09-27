package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ne implements Runnable {
    public final int f35970a;
    public final xn f35971b;
    public final long f35972c;

    public ne(long j3, xn xnVar) {
        this.f35970a = 7;
        this.f35972c = j3;
        this.f35971b = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f35970a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35972c, r1, true, this.f35971b.classGuid);
                return;
            case 1:
                this.f35971b.getMessagesController().loadFullChat(this.f35972c, 0, true);
                return;
            case 2:
                xn xnVar = this.f35971b;
                LongSparseIntArray longSparseIntArray = xnVar.M5;
                long j3 = this.f35972c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.m31 m31Var = xnVar.R1;
                if (m31Var != null) {
                    m31Var.setAllTopicsHidden(false);
                }
                if (j3 == xnVar.f39732d4) {
                    xnVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                xn xnVar2 = this.f35971b;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.f35972c));
                return;
            case 4:
                xn xnVar3 = this.f35971b;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.f35972c));
                return;
            case 5:
                xn xnVar4 = this.f35971b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.f35972c, 1, xnVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), xnVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.f27692k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.xc.a0(this.f35971b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35972c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35971b.presentFragment(new ProfileActivity(v7.k0.e(this.f35972c, "user_id"), null));
                return;
        }
    }

    public ne(xn xnVar, long j3, int i10) {
        this.f35970a = i10;
        this.f35971b = xnVar;
        this.f35972c = j3;
    }
}
