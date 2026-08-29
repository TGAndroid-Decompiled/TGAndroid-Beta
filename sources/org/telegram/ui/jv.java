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
public final class jv implements View.OnClickListener {
    public final int f39691a;
    public final fy f39692b;

    public jv(fy fyVar, int i10) {
        this.f39691a = i10;
        this.f39692b = fyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        xw xwVar;
        xw xwVar2;
        switch (this.f39691a) {
            case 0:
                fy fyVar = this.f39692b;
                if (fyVar.a4() && (arrayList = fyVar.f38383z2) != null && !arrayList.isEmpty() && fyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) fyVar.f38383z2.get(0);
                    qw qwVar = fyVar.f38373x1;
                    if (qwVar != null) {
                        charSequence = qwVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = fyVar.f38383z2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, fyVar, fyVar.getResourceProvider());
                    PhotoViewer.t1().f35753l7 = true;
                    PhotoViewer.t1().f35761m7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(fyVar.f38383z2);
                    boolean[] zArr = new boolean[fyVar.f38383z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new lx(fyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f35660b4 = true;
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
                fy fyVar2 = this.f39692b;
                fyVar2.O4(true, false, true, false);
                fyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new ev(fyVar2, 3), 100L);
                return;
            case 2:
                fy fyVar3 = this.f39692b;
                if (fyVar3.C0 && (xwVar = fyVar3.A0) != null && !xwVar.g()) {
                    fyVar3.x4(true, true);
                    return;
                } else {
                    fyVar3.P4();
                    return;
                }
            case 3:
                fy fyVar4 = this.f39692b;
                if (fyVar4.C0 && (xwVar2 = fyVar4.A0) != null && !xwVar2.g()) {
                    fyVar4.x4(true, true);
                    return;
                } else {
                    fyVar4.P4();
                    return;
                }
            case 4:
                fy fyVar5 = this.f39692b;
                fyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", fyVar5.T2);
                fyVar5.presentFragment(new qh.q(bundle));
                return;
            case 5:
                fy fyVar6 = this.f39692b;
                ArrayList arrayList4 = fyVar6.E2;
                if (fyVar6.f38379y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    fyVar6.f38379y2.v(fyVar6, arrayList5, fyVar6.f38373x1.getFieldText(), false, fyVar6.F2, fyVar6.G2, fyVar6.H2, null);
                    return;
                }
                return;
            case 6:
                this.f39692b.b4(true);
                return;
            case 7:
                this.f39692b.finishPreviewFragment();
                return;
            case 8:
                fy fyVar7 = this.f39692b;
                fyVar7.f38362v0.setIsEditing(false);
                fyVar7.I4(false);
                return;
            case 9:
                fy fyVar8 = this.f39692b;
                fyVar8.getClass();
                fyVar8.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) fyVar8, 2, true));
                return;
            case 10:
                fy fyVar9 = this.f39692b;
                fyVar9.getContactsController().loadGlobalPrivacySetting();
                fyVar9.K4();
                return;
            case 11:
                this.f39692b.p4(view);
                return;
            case 12:
                fy.s0(this.f39692b);
                return;
            case 13:
                fy.J0(this.f39692b);
                return;
            case 14:
                fy.u0(this.f39692b);
                return;
            case 15:
                fy fyVar10 = this.f39692b;
                fyVar10.showDialog(org.telegram.ui.Components.c5.m(fyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new mv(fyVar10, 1), new ev(fyVar10, 17), false, false, fyVar10.getResourceProvider()).f22729a);
                return;
            case 16:
                fy.C0(this.f39692b);
                return;
            case 17:
                fy.z0(this.f39692b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f35915f0 = true;
                fy fyVar11 = this.f39692b;
                fyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ev(fyVar11, 21), 250L);
                return;
            case 19:
                fy.Z(this.f39692b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f35915f0 = true;
                fy fyVar12 = this.f39692b;
                fyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ev(fyVar12, 15), 250L);
                return;
            case 21:
                x6 x6Var = new x6();
                fy fyVar13 = this.f39692b;
                fyVar13.presentFragment(x6Var);
                AndroidUtilities.runOnUIThread(new vv(fyVar13, 10), 250L);
                return;
            case 22:
                fy.D0(this.f39692b);
                return;
            case 23:
                fy.Y(this.f39692b);
                return;
            case 24:
                fy.l0(this.f39692b);
                return;
            case 25:
                fy fyVar14 = this.f39692b;
                ye.d.s(fyVar14.getParentActivity(), fyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                fy.k0(this.f39692b);
                return;
            case 27:
                fy.y0(this.f39692b);
                return;
            default:
                fy.X(this.f39692b);
                return;
        }
    }
}
