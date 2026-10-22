package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class gv implements View.OnClickListener {
    public final int f37427a;
    public final cy f37428b;

    public gv(cy cyVar, int i10) {
        this.f37427a = i10;
        this.f37428b = cyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        tw twVar;
        tw twVar2;
        switch (this.f37427a) {
            case 0:
                cy cyVar = this.f37428b;
                if (cyVar.Y3() && (arrayList = cyVar.D2) != null && !arrayList.isEmpty() && cyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) cyVar.D2.get(0);
                    mw mwVar = cyVar.B1;
                    if (mwVar != null) {
                        charSequence = mwVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = cyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.u1().M2(null, cyVar, cyVar.getResourceProvider());
                    PhotoViewer.u1().f33384p7 = true;
                    PhotoViewer.u1().f33392q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(cyVar.D2);
                    boolean[] zArr = new boolean[cyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.u1().i2(arrayList3, 0, 0, false, new ix(cyVar, zArr), null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.f33295f4 = true;
                    CheckBox checkBox = u12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = u12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cy cyVar2 = this.f37428b;
                cyVar2.M4(true, false, true, false);
                cyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new cv(cyVar2, 3), 100L);
                return;
            case 2:
                cy cyVar3 = this.f37428b;
                if (cyVar3.G0 && (twVar = cyVar3.E0) != null && !twVar.g()) {
                    cyVar3.v4(true, true);
                    return;
                } else {
                    cyVar3.N4();
                    return;
                }
            case 3:
                cy cyVar4 = this.f37428b;
                if (cyVar4.G0 && (twVar2 = cyVar4.E0) != null && !twVar2.g()) {
                    cyVar4.v4(true, true);
                    return;
                } else {
                    cyVar4.N4();
                    return;
                }
            case 4:
                cy cyVar5 = this.f37428b;
                cyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cyVar5.Y2);
                cyVar5.presentFragment(new hi.r(bundle));
                return;
            case 5:
                cy cyVar6 = this.f37428b;
                ArrayList arrayList4 = cyVar6.I2;
                if (cyVar6.C2 != null && !arrayList4.isEmpty()) {
                    cyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    cyVar6.C2.w(cyVar6, arrayList5, cyVar6.B1.getFieldText(), false, cyVar6.J2, cyVar6.K2, cyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f37428b.Z3(true);
                return;
            case 7:
                this.f37428b.finishPreviewFragment();
                return;
            case 8:
                cy cyVar7 = this.f37428b;
                cyVar7.f36201z0.setIsEditing(false);
                cyVar7.G4(false);
                return;
            case 9:
                cy cyVar8 = this.f37428b;
                cyVar8.getClass();
                cyVar8.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) cyVar8, 2, true));
                return;
            case 10:
                cy cyVar9 = this.f37428b;
                cyVar9.getContactsController().loadGlobalPrivacySetting();
                cyVar9.I4();
                return;
            case 11:
                this.f37428b.n4(view);
                return;
            case 12:
                cy.r0(this.f37428b);
                return;
            case 13:
                cy.F0(this.f37428b);
                return;
            case 14:
                cy.t0(this.f37428b);
                return;
            case 15:
                cy cyVar10 = this.f37428b;
                cyVar10.showDialog(org.telegram.ui.Components.f5.l(cyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new iv(cyVar10, 1), new cv(cyVar10, 18), false, false, cyVar10.getResourceProvider()).f20616a);
                return;
            case 16:
                cy.A0(this.f37428b);
                return;
            case 17:
                cy.y0(this.f37428b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f33514j0 = true;
                cy cyVar11 = this.f37428b;
                cyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new cv(cyVar11, 22), 250L);
                return;
            case 19:
                cy.Z(this.f37428b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f33514j0 = true;
                cy cyVar12 = this.f37428b;
                cyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new cv(cyVar12, 16), 250L);
                return;
            case 21:
                c7 c7Var = new c7();
                cy cyVar13 = this.f37428b;
                cyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new sv(cyVar13, 11), 250L);
                return;
            case 22:
                cy.B0(this.f37428b);
                return;
            case 23:
                cy.X(this.f37428b);
                return;
            case 24:
                cy.l0(this.f37428b);
                return;
            case 25:
                cy cyVar14 = this.f37428b;
                pf.d.r(cyVar14.getParentActivity(), cyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                cy.k0(this.f37428b);
                return;
            case 27:
                cy.w0(this.f37428b);
                return;
            default:
                cy.W(this.f37428b);
                return;
        }
    }
}
