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
public final class iv implements View.OnClickListener {
    public final int f39293a;
    public final dy f39294b;

    public iv(dy dyVar, int i9) {
        this.f39293a = i9;
        this.f39294b = dyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        vw vwVar;
        vw vwVar2;
        switch (this.f39293a) {
            case 0:
                dy dyVar = this.f39294b;
                if (dyVar.a4() && (arrayList = dyVar.f37756z2) != null && !arrayList.isEmpty() && dyVar.getParentActivity() != null) {
                    int i9 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) dyVar.f37756z2.get(0);
                    ow owVar = dyVar.f37746x1;
                    if (owVar != null) {
                        charSequence = owVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = dyVar.f37756z2;
                    int size = arrayList2.size();
                    while (i9 < size) {
                        Object obj = arrayList2.get(i9);
                        i9++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, dyVar, dyVar.getResourceProvider());
                    PhotoViewer.t1().f35687l7 = true;
                    PhotoViewer.t1().f35695m7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(dyVar.f37756z2);
                    boolean[] zArr = new boolean[dyVar.f37756z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new jx(dyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f35592b4 = true;
                    CheckBox checkBox = t12.J0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.K0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                dy dyVar2 = this.f39294b;
                dyVar2.O4(true, false, true, false);
                dyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new dv(dyVar2, 3), 100L);
                return;
            case 2:
                dy dyVar3 = this.f39294b;
                if (dyVar3.C0 && (vwVar = dyVar3.A0) != null && !vwVar.g()) {
                    dyVar3.x4(true, true);
                    return;
                } else {
                    dyVar3.P4();
                    return;
                }
            case 3:
                dy dyVar4 = this.f39294b;
                if (dyVar4.C0 && (vwVar2 = dyVar4.A0) != null && !vwVar2.g()) {
                    dyVar4.x4(true, true);
                    return;
                } else {
                    dyVar4.P4();
                    return;
                }
            case 4:
                dy dyVar5 = this.f39294b;
                dyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", dyVar5.T2);
                dyVar5.presentFragment(new nh.r(bundle));
                return;
            case 5:
                dy dyVar6 = this.f39294b;
                ArrayList arrayList4 = dyVar6.E2;
                if (dyVar6.f37752y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i10)).longValue(), 0L));
                    }
                    dyVar6.f37752y2.v(dyVar6, arrayList5, dyVar6.f37746x1.getFieldText(), false, dyVar6.F2, dyVar6.G2, dyVar6.H2, null);
                    return;
                }
                return;
            case 6:
                this.f39294b.b4(true);
                return;
            case 7:
                this.f39294b.finishPreviewFragment();
                return;
            case 8:
                dy dyVar7 = this.f39294b;
                dyVar7.f37735v0.setIsEditing(false);
                dyVar7.I4(false);
                return;
            case 9:
                dy dyVar8 = this.f39294b;
                dyVar8.getClass();
                dyVar8.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) dyVar8, 2, true));
                return;
            case 10:
                dy dyVar9 = this.f39294b;
                dyVar9.getContactsController().loadGlobalPrivacySetting();
                dyVar9.K4();
                return;
            case 11:
                this.f39294b.p4(view);
                return;
            case 12:
                dy.r0(this.f39294b);
                return;
            case 13:
                dy.I0(this.f39294b);
                return;
            case 14:
                dy.t0(this.f39294b);
                return;
            case 15:
                dy dyVar10 = this.f39294b;
                dyVar10.showDialog(org.telegram.ui.Components.y4.m(dyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new lv(dyVar10, 1), new dv(dyVar10, 17), false, false, dyVar10.getResourceProvider()).f22713a);
                return;
            case 16:
                dy.B0(this.f39294b);
                return;
            case 17:
                dy.y0(this.f39294b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f35849f0 = true;
                dy dyVar11 = this.f39294b;
                dyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new dv(dyVar11, 21), 250L);
                return;
            case 19:
                dy.Y(this.f39294b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f35849f0 = true;
                dy dyVar12 = this.f39294b;
                dyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new dv(dyVar12, 15), 250L);
                return;
            case 21:
                y6 y6Var = new y6();
                dy dyVar13 = this.f39294b;
                dyVar13.presentFragment(y6Var);
                AndroidUtilities.runOnUIThread(new uv(dyVar13, 10), 250L);
                return;
            case 22:
                dy.C0(this.f39294b);
                return;
            case 23:
                dy.X(this.f39294b);
                return;
            case 24:
                dy.k0(this.f39294b);
                return;
            case 25:
                dy dyVar14 = this.f39294b;
                ve.e.s(dyVar14.getParentActivity(), dyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                dy.j0(this.f39294b);
                return;
            case 27:
                dy.x0(this.f39294b);
                return;
            default:
                dy.W(this.f39294b);
                return;
        }
    }
}
