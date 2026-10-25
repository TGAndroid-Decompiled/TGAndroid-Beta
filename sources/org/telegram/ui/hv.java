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
public final class hv implements View.OnClickListener {
    public final int f40090a;
    public final cy f40091b;

    public hv(cy cyVar, int i10) {
        this.f40090a = i10;
        this.f40091b = cyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        qw qwVar;
        qw qwVar2;
        switch (this.f40090a) {
            case 0:
                cy cyVar = this.f40091b;
                if (cyVar.i4() && (arrayList = cyVar.D2) != null && !arrayList.isEmpty() && cyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) cyVar.D2.get(0);
                    jw jwVar = cyVar.B1;
                    if (jwVar != null) {
                        charSequence = jwVar.getFieldText();
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
                    PhotoViewer.u1().f35746p7 = true;
                    PhotoViewer.u1().f35754q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(cyVar.D2);
                    boolean[] zArr = new boolean[cyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.u1().i2(arrayList3, 0, 0, false, new ex(cyVar, zArr), null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    u12.f35657f4 = true;
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
                cy cyVar2 = this.f40091b;
                cyVar2.W4(true, false, true, false);
                cyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new cv(cyVar2, 23), 100L);
                return;
            case 2:
                cy cyVar3 = this.f40091b;
                if (cyVar3.G0 && (qwVar = cyVar3.E0) != null && !qwVar.g()) {
                    cyVar3.F4(true, true);
                    return;
                } else {
                    cyVar3.X4();
                    return;
                }
            case 3:
                cy cyVar4 = this.f40091b;
                if (cyVar4.G0 && (qwVar2 = cyVar4.E0) != null && !qwVar2.g()) {
                    cyVar4.F4(true, true);
                    return;
                } else {
                    cyVar4.X4();
                    return;
                }
            case 4:
                cy cyVar5 = this.f40091b;
                cyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cyVar5.Y2);
                cyVar5.presentFragment(new ii.r(bundle));
                return;
            case 5:
                cy cyVar6 = this.f40091b;
                ArrayList arrayList4 = cyVar6.I2;
                if (cyVar6.C2 != null && !arrayList4.isEmpty()) {
                    cyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    cyVar6.C2.v(cyVar6, arrayList5, cyVar6.B1.getFieldText(), false, cyVar6.J2, cyVar6.K2, cyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f40091b.finishPreviewFragment();
                return;
            case 7:
                this.f40091b.j4(true);
                return;
            case 8:
                cy cyVar7 = this.f40091b;
                cyVar7.f38690z0.setIsEditing(false);
                cyVar7.Q4(false);
                return;
            case 9:
                cy cyVar8 = this.f40091b;
                cyVar8.getClass();
                cyVar8.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) cyVar8, 2, true));
                return;
            case 10:
                cy cyVar9 = this.f40091b;
                cyVar9.getContactsController().loadGlobalPrivacySetting();
                cyVar9.S4();
                return;
            case 11:
                this.f40091b.x4(view);
                return;
            case 12:
                cy.r0(this.f40091b);
                return;
            case 13:
                cy.H0(this.f40091b);
                return;
            case 14:
                cy.u0(this.f40091b);
                return;
            case 15:
                cy cyVar10 = this.f40091b;
                cyVar10.showDialog(org.telegram.ui.Components.g5.l(cyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new fv(cyVar10, 1), new cv(cyVar10, 17), false, false, cyVar10.getResourceProvider()).f22599a);
                return;
            case 16:
                cy.B0(this.f40091b);
                return;
            case 17:
                cy.y0(this.f40091b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f35875j0 = true;
                cy cyVar11 = this.f40091b;
                cyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new cv(cyVar11, 21), 250L);
                return;
            case 19:
                cy.a0(this.f40091b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f35875j0 = true;
                cy cyVar12 = this.f40091b;
                cyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new cv(cyVar12, 15), 250L);
                return;
            case 21:
                c7 c7Var = new c7();
                cy cyVar13 = this.f40091b;
                cyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new sv(cyVar13, 12), 250L);
                return;
            case 22:
                cy.C0(this.f40091b);
                return;
            case 23:
                cy.Z(this.f40091b);
                return;
            case 24:
                cy.x0(this.f40091b);
                return;
            case 25:
                cy.k0(this.f40091b);
                return;
            case 26:
                cy cyVar14 = this.f40091b;
                qf.d.r(cyVar14.getParentActivity(), cyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 27:
                cy.j0(this.f40091b);
                return;
            default:
                cy.Y(this.f40091b);
                return;
        }
    }
}
