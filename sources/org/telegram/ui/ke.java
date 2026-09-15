package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class ke implements Runnable {
    public final int f35119a;
    public final bo f35120b;
    public final long f35121c;

    public ke(long j3, bo boVar) {
        this.f35119a = 7;
        this.f35121c = j3;
        this.f35120b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f35119a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35121c, r1, true, this.f35120b.classGuid);
                return;
            case 1:
                this.f35120b.getMessagesController().loadFullChat(this.f35121c, 0, true);
                return;
            case 2:
                bo boVar = this.f35120b;
                LongSparseIntArray longSparseIntArray = boVar.M5;
                long j3 = this.f35121c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.x21 x21Var = boVar.R1;
                if (x21Var != null) {
                    x21Var.setAllTopicsHidden(false);
                }
                if (j3 == boVar.f32279d4) {
                    boVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                bo boVar2 = this.f35120b;
                boVar2.getClass();
                boVar2.presentFragment(bo.R9(this.f35121c));
                return;
            case 4:
                bo boVar3 = this.f35120b;
                boVar3.getClass();
                boVar3.presentFragment(ProfileActivity.m4(this.f35121c));
                return;
            case 5:
                bo boVar4 = this.f35120b;
                org.telegram.ui.Components.oc v = org.telegram.ui.Components.vc.v(boVar4.getParentActivity(), boVar4, null, 1, this.f35121c, 1, boVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), boVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.f26755k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.vc.a0(this.f35120b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35121c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35120b.presentFragment(new ProfileActivity(w.f.e(this.f35121c, "user_id"), null));
                return;
        }
    }

    public ke(bo boVar, long j3, int i10) {
        this.f35119a = i10;
        this.f35120b = boVar;
        this.f35121c = j3;
    }
}
