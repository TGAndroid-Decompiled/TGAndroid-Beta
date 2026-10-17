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
    public final int f37646a;
    public final ey f37647b;

    public hv(ey eyVar, int i10) {
        this.f37646a = i10;
        this.f37647b = eyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        vw vwVar;
        vw vwVar2;
        switch (this.f37646a) {
            case 0:
                ey eyVar = this.f37647b;
                if (eyVar.Y3() && (arrayList = eyVar.D2) != null && !arrayList.isEmpty() && eyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) eyVar.D2.get(0);
                    ow owVar = eyVar.B1;
                    if (owVar != null) {
                        charSequence = owVar.getFieldText();
                    } else {
                        charSequence = photoEntry.caption;
                    }
                    ArrayList arrayList2 = eyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = charSequence;
                    }
                    PhotoViewer.t1().K2(null, eyVar, eyVar.getResourceProvider());
                    PhotoViewer.t1().f33368p7 = true;
                    PhotoViewer.t1().f33376q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(eyVar.D2);
                    boolean[] zArr = new boolean[eyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new kx(eyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f33279f4 = true;
                    CheckBox checkBox = t12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ey eyVar2 = this.f37647b;
                eyVar2.M4(true, false, true, false);
                eyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new dv(eyVar2, 3), 100L);
                return;
            case 2:
                ey eyVar3 = this.f37647b;
                if (eyVar3.G0 && (vwVar = eyVar3.E0) != null && !vwVar.g()) {
                    eyVar3.v4(true, true);
                    return;
                } else {
                    eyVar3.N4();
                    return;
                }
            case 3:
                ey eyVar4 = this.f37647b;
                if (eyVar4.G0 && (vwVar2 = eyVar4.E0) != null && !vwVar2.g()) {
                    eyVar4.v4(true, true);
                    return;
                } else {
                    eyVar4.N4();
                    return;
                }
            case 4:
                ey eyVar5 = this.f37647b;
                eyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eyVar5.Y2);
                eyVar5.presentFragment(new hi.r(bundle));
                return;
            case 5:
                ey eyVar6 = this.f37647b;
                ArrayList arrayList4 = eyVar6.I2;
                if (eyVar6.C2 != null && !arrayList4.isEmpty()) {
                    eyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    eyVar6.C2.w(eyVar6, arrayList5, eyVar6.B1.getFieldText(), false, eyVar6.J2, eyVar6.K2, eyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f37647b.Z3(true);
                return;
            case 7:
                this.f37647b.finishPreviewFragment();
                return;
            case 8:
                ey eyVar7 = this.f37647b;
                eyVar7.f36736z0.setIsEditing(false);
                eyVar7.G4(false);
                return;
            case 9:
                ey eyVar8 = this.f37647b;
                eyVar8.getClass();
                eyVar8.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) eyVar8, 2, true));
                return;
            case 10:
                ey eyVar9 = this.f37647b;
                eyVar9.getContactsController().loadGlobalPrivacySetting();
                eyVar9.I4();
                return;
            case 11:
                this.f37647b.n4(view);
                return;
            case 12:
                ey.r0(this.f37647b);
                return;
            case 13:
                ey.F0(this.f37647b);
                return;
            case 14:
                ey.t0(this.f37647b);
                return;
            case 15:
                ey eyVar10 = this.f37647b;
                eyVar10.showDialog(org.telegram.ui.Components.f5.l(eyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new jv(eyVar10, 1), new dv(eyVar10, 18), false, false, eyVar10.getResourceProvider()).f20609a);
                return;
            case 16:
                ey.A0(this.f37647b);
                return;
            case 17:
                ey.y0(this.f37647b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f33498j0 = true;
                ey eyVar11 = this.f37647b;
                eyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new dv(eyVar11, 22), 250L);
                return;
            case 19:
                ey.Z(this.f37647b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f33498j0 = true;
                ey eyVar12 = this.f37647b;
                eyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new dv(eyVar12, 16), 250L);
                return;
            case 21:
                c7 c7Var = new c7();
                ey eyVar13 = this.f37647b;
                eyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new uv(eyVar13, 11), 250L);
                return;
            case 22:
                ey.B0(this.f37647b);
                return;
            case 23:
                ey.X(this.f37647b);
                return;
            case 24:
                ey.l0(this.f37647b);
                return;
            case 25:
                ey eyVar14 = this.f37647b;
                pf.d.r(eyVar14.getParentActivity(), eyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 26:
                ey.k0(this.f37647b);
                return;
            case 27:
                ey.w0(this.f37647b);
                return;
            default:
                ey.W(this.f37647b);
                return;
        }
    }
}
