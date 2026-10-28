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
    public final int f40619a;
    public final ey f40620b;

    public jv(ey eyVar, int i10) {
        this.f40619a = i10;
        this.f40620b = eyVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        sw swVar;
        sw swVar2;
        switch (this.f40619a) {
            case 0:
                ey eyVar = this.f40620b;
                if (eyVar.i4() && (arrayList = eyVar.D2) != null && !arrayList.isEmpty() && eyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) eyVar.D2.get(0);
                    lw lwVar = eyVar.B1;
                    if (lwVar != null) {
                        charSequence = lwVar.getFieldText();
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
                    PhotoViewer.v1().N2(null, eyVar, eyVar.getResourceProvider());
                    PhotoViewer.v1().f35773p7 = true;
                    PhotoViewer.v1().f35781q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(eyVar.D2);
                    boolean[] zArr = new boolean[eyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new hx(eyVar, zArr), null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.f35684f4 = true;
                    CheckBox checkBox = v12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = v12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ey eyVar2 = this.f40620b;
                eyVar2.W4(true, false, true, false);
                eyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new ev(eyVar2, 23), 100L);
                return;
            case 2:
                ey eyVar3 = this.f40620b;
                if (eyVar3.G0 && (swVar = eyVar3.E0) != null && !swVar.g()) {
                    eyVar3.F4(true, true);
                    return;
                } else {
                    eyVar3.X4();
                    return;
                }
            case 3:
                ey eyVar4 = this.f40620b;
                if (eyVar4.G0 && (swVar2 = eyVar4.E0) != null && !swVar2.g()) {
                    eyVar4.F4(true, true);
                    return;
                } else {
                    eyVar4.X4();
                    return;
                }
            case 4:
                ey eyVar5 = this.f40620b;
                eyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eyVar5.Y2);
                eyVar5.presentFragment(new ii.r(bundle));
                return;
            case 5:
                ey eyVar6 = this.f40620b;
                ArrayList arrayList4 = eyVar6.I2;
                if (eyVar6.C2 != null && !arrayList4.isEmpty()) {
                    eyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    eyVar6.C2.v(eyVar6, arrayList5, eyVar6.B1.getFieldText(), false, eyVar6.J2, eyVar6.K2, eyVar6.L2, null);
                    return;
                }
                return;
            case 6:
                this.f40620b.finishPreviewFragment();
                return;
            case 7:
                this.f40620b.j4(true);
                return;
            case 8:
                ey eyVar7 = this.f40620b;
                eyVar7.f39105z0.setIsEditing(false);
                eyVar7.Q4(false);
                return;
            case 9:
                ey eyVar8 = this.f40620b;
                eyVar8.getClass();
                eyVar8.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) eyVar8, 2, true));
                return;
            case 10:
                ey eyVar9 = this.f40620b;
                eyVar9.getContactsController().loadGlobalPrivacySetting();
                eyVar9.S4();
                return;
            case 11:
                this.f40620b.x4(view);
                return;
            case 12:
                ey.r0(this.f40620b);
                return;
            case 13:
                ey.H0(this.f40620b);
                return;
            case 14:
                ey.u0(this.f40620b);
                return;
            case 15:
                ey eyVar10 = this.f40620b;
                eyVar10.showDialog(org.telegram.ui.Components.g5.l(eyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new hv(eyVar10, 1), new ev(eyVar10, 17), false, false, eyVar10.getResourceProvider()).f22602a);
                return;
            case 16:
                ey.B0(this.f40620b);
                return;
            case 17:
                ey.y0(this.f40620b);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f35902j0 = true;
                ey eyVar11 = this.f40620b;
                eyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new ev(eyVar11, 21), 250L);
                return;
            case 19:
                ey.a0(this.f40620b);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f35902j0 = true;
                ey eyVar12 = this.f40620b;
                eyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new ev(eyVar12, 15), 250L);
                return;
            case 21:
                c7 c7Var = new c7();
                ey eyVar13 = this.f40620b;
                eyVar13.presentFragment(c7Var);
                AndroidUtilities.runOnUIThread(new uv(eyVar13, 12), 250L);
                return;
            case 22:
                ey.C0(this.f40620b);
                return;
            case 23:
                ey.Z(this.f40620b);
                return;
            case 24:
                ey.x0(this.f40620b);
                return;
            case 25:
                ey.k0(this.f40620b);
                return;
            case 26:
                ey eyVar14 = this.f40620b;
                qf.d.r(eyVar14.getParentActivity(), eyVar14.getMessagesController().premiumManageSubscriptionUrl);
                return;
            case 27:
                ey.j0(this.f40620b);
                return;
            default:
                ey.Y(this.f40620b);
                return;
        }
    }
}
