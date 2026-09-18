package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
public final class me implements Runnable {
    public final int f35772a;
    public final bo f35773b;
    public final long f35774c;

    public me(long j3, bo boVar) {
        this.f35772a = 7;
        this.f35774c = j3;
        this.f35773b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f35772a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.f35774c, r1, true, this.f35773b.classGuid);
                return;
            case 1:
                this.f35773b.getMessagesController().loadFullChat(this.f35774c, 0, true);
                return;
            case 2:
                bo boVar = this.f35773b;
                LongSparseIntArray longSparseIntArray = boVar.M5;
                long j3 = this.f35774c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.y21 y21Var = boVar.R1;
                if (y21Var != null) {
                    y21Var.setAllTopicsHidden(false);
                }
                if (j3 == boVar.f32261d4) {
                    boVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                bo boVar2 = this.f35773b;
                boVar2.getClass();
                boVar2.presentFragment(bo.R9(this.f35774c));
                return;
            case 4:
                bo boVar3 = this.f35773b;
                boVar3.getClass();
                boVar3.presentFragment(ProfileActivity.m4(this.f35774c));
                return;
            case 5:
                bo boVar4 = this.f35773b;
                org.telegram.ui.Components.oc v = org.telegram.ui.Components.vc.v(boVar4.getParentActivity(), boVar4, null, 1, this.f35774c, 1, boVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), boVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.f26706k = true;
                v.k(true);
                return;
            case 6:
                org.telegram.ui.Components.vc.a0(this.f35773b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f35774c)), R.raw.stars_topup).k(true);
                return;
            default:
                this.f35773b.presentFragment(new ProfileActivity(w.f.e(this.f35774c, "user_id"), null));
                return;
        }
    }

    public me(bo boVar, long j3, int i10) {
        this.f35772a = i10;
        this.f35773b = boVar;
        this.f35774c = j3;
    }
}
