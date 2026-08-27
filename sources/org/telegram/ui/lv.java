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

public final class lv implements View.OnClickListener {

    public final int f40251a;

    public final gy f40252b;

    public lv(gy gyVar, int i10) {
        this.f40251a = i10;
        this.f40252b = gyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        yw ywVar;
        yw ywVar2;
        switch (this.f40251a) {
            case 0:
                gy gyVar = this.f40252b;
                if (gyVar.a4() && (arrayList = gyVar.f38625z2) != null && !arrayList.isEmpty() && gyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) gyVar.f38625z2.get(0);
                    rw rwVar = gyVar.f38615x1;
                    CharSequence fieldText = rwVar != null ? rwVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = gyVar.f38625z2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, gyVar, gyVar.getResourceProvider());
                    PhotoViewer.t1().f35690l7 = true;
                    PhotoViewer.t1().f35698m7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(gyVar.f38625z2);
                    boolean[] zArr = new boolean[gyVar.f38625z2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new mx(gyVar, zArr), null);
                    PhotoViewer photoViewerT1 = PhotoViewer.t1();
                    photoViewerT1.f35595b4 = true;
                    CheckBox checkBox = photoViewerT1.J0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = photoViewerT1.K0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                    }
                    break;
                }
                break;
            case 1:
                gy gyVar2 = this.f40252b;
                gyVar2.O4(true, false, true, false);
                gyVar2.U.b(true);
                AndroidUtilities.runOnUIThread(new gv(gyVar2, 3), 100L);
                break;
            case 2:
                gy gyVar3 = this.f40252b;
                if (!gyVar3.C0 || (ywVar = gyVar3.A0) == null || ywVar.g()) {
                    gyVar3.P4();
                } else {
                    gyVar3.x4(true, true);
                }
                break;
            case 3:
                gy gyVar4 = this.f40252b;
                if (!gyVar4.C0 || (ywVar2 = gyVar4.A0) == null || ywVar2.g()) {
                    gyVar4.P4();
                } else {
                    gyVar4.x4(true, true);
                }
                break;
            case 4:
                gy gyVar5 = this.f40252b;
                gyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", gyVar5.T2);
                gyVar5.presentFragment(new oh.r(bundle));
                break;
            case 5:
                gy gyVar6 = this.f40252b;
                ArrayList arrayList4 = gyVar6.E2;
                if (gyVar6.f38621y2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    gyVar6.f38621y2.w(gyVar6, arrayList5, gyVar6.f38615x1.getFieldText(), false, gyVar6.F2, gyVar6.G2, gyVar6.H2, null);
                    break;
                }
                break;
            case 6:
                this.f40252b.b4(true);
                break;
            case 7:
                this.f40252b.finishPreviewFragment();
                break;
            case 8:
                gy gyVar7 = this.f40252b;
                gyVar7.f38604v0.setIsEditing(false);
                gyVar7.I4(false);
                break;
            case 9:
                gy gyVar8 = this.f40252b;
                gyVar8.getClass();
                gyVar8.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) gyVar8, 2, true));
                break;
            case 10:
                gy gyVar9 = this.f40252b;
                gyVar9.getContactsController().loadGlobalPrivacySetting();
                gyVar9.K4();
                break;
            case 11:
                this.f40252b.p4(view);
                break;
            case 12:
                gy.s0(this.f40252b);
                break;
            case 13:
                gy.J0(this.f40252b);
                break;
            case 14:
                gy.u0(this.f40252b);
                break;
            case 15:
                gy gyVar10 = this.f40252b;
                gyVar10.showDialog(org.telegram.ui.Components.y4.m(gyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new ov(gyVar10, 1), new gv(gyVar10, 17), false, false, gyVar10.getResourceProvider()).f23994a);
                break;
            case 16:
                gy.C0(this.f40252b);
                break;
            case 17:
                gy.z0(this.f40252b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f35852f0 = true;
                gy gyVar11 = this.f40252b;
                gyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new gv(gyVar11, 21), 250L);
                break;
            case 19:
                gy.Z(this.f40252b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f35852f0 = true;
                gy gyVar12 = this.f40252b;
                gyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new gv(gyVar12, 15), 250L);
                break;
            case 21:
                z6 z6Var = new z6();
                gy gyVar13 = this.f40252b;
                gyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new xv(gyVar13, 10), 250L);
                break;
            case 22:
                gy.D0(this.f40252b);
                break;
            case 23:
                gy.Y(this.f40252b);
                break;
            case 24:
                gy.l0(this.f40252b);
                break;
            case 25:
                gy gyVar14 = this.f40252b;
                we.e.s(gyVar14.getParentActivity(), gyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                gy.k0(this.f40252b);
                break;
            case 27:
                gy.y0(this.f40252b);
                break;
            default:
                gy.X(this.f40252b);
                break;
        }
    }
}
