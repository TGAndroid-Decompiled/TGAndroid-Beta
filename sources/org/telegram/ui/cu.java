package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class cu implements View.OnClickListener {
    public final int f44434a;
    public final uw f44435b;

    public cu(uw uwVar, int i3) {
        this.f44434a = i3;
        this.f44435b = uwVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        mv mvVar;
        mv mvVar2;
        int i3 = this.f44434a;
        int i10 = 0;
        uw uwVar = this.f44435b;
        switch (i3) {
            case 0:
                if (uwVar.m4() && (arrayList = uwVar.E2) != null && !arrayList.isEmpty() && uwVar.getParentActivity() != null) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) uwVar.E2.get(0);
                    gv gvVar = uwVar.C1;
                    if (gvVar != null) {
                        charSequence = gvVar.getFieldText();
                    } else {
                        charSequence = yeVar.f25309a;
                    }
                    ArrayList arrayList2 = uwVar.E2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.ye) obj).f25309a = charSequence;
                    }
                    PhotoViewer.v1().N2(null, uwVar, uwVar.getResourceProvider());
                    PhotoViewer.v1().f41520q7 = true;
                    PhotoViewer.v1().f41529r7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(uwVar.E2);
                    boolean[] zArr = new boolean[uwVar.E2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new zv(uwVar, zArr), null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.f41433g4 = true;
                    CheckBox checkBox = v12.O0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = v12.P0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (uwVar.H0 && (mvVar = uwVar.F0) != null && !mvVar.g()) {
                    uwVar.J4(true, true);
                    return;
                } else {
                    uwVar.b5();
                    return;
                }
            case 2:
                if (uwVar.H0 && (mvVar2 = uwVar.F0) != null && !mvVar2.g()) {
                    uwVar.J4(true, true);
                    return;
                } else {
                    uwVar.b5();
                    return;
                }
            case 3:
                uwVar.a5(true, false, true, false);
                uwVar.Z.b(true);
                org.telegram.messenger.g0.i3(new au(uwVar, 9), 100L);
                return;
            case 4:
                uwVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uwVar.Z2);
                uwVar.presentFragment(new ji.q(bundle));
                return;
            case 5:
                uw uwVar2 = this.f44435b;
                ArrayList arrayList4 = uwVar2.J2;
                if (uwVar2.D2 != null && !arrayList4.isEmpty()) {
                    uwVar2.N2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.pr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    uwVar2.D2.y(uwVar2, arrayList5, uwVar2.C1.getFieldText(), false, uwVar2.K2, uwVar2.L2, uwVar2.M2, null);
                    return;
                }
                return;
            case 6:
                uwVar.n4(true);
                return;
            case 7:
                uwVar.finishPreviewFragment();
                return;
            case 8:
                uwVar.A0.setIsEditing(false);
                uwVar.U4(false);
                return;
            case 9:
                uwVar.getClass();
                uwVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) uwVar, 2, true));
                return;
            case 10:
                uwVar.getContactsController().B();
                uwVar.W4();
                return;
            case 11:
                uwVar.B4(view);
                return;
            case 12:
                uw.w0(uwVar);
                return;
            case 13:
                uw.K0(uwVar);
                return;
            case 14:
                uw.y0(uwVar);
                return;
            case 15:
                uwVar.showDialog((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.l(uwVar.getParentActivity(), org.telegram.messenger.bd.M0(2131751239, null), org.telegram.messenger.bd.M0(2131751244, null), null, new fu(uwVar, 1), new au(uwVar, 3), false, false, uwVar.getResourceProvider()).f14429b);
                return;
            case 16:
                uw.D0(uwVar);
                return;
            case 17:
                uw.B0(uwVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f41647k0 = true;
                uwVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new au(uwVar, 7), 250L);
                return;
            case 19:
                uw.d0(uwVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f41647k0 = true;
                uwVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.i3(new au(uwVar, 1), 250L);
                return;
            case 21:
                uwVar.presentFragment(new z6());
                org.telegram.messenger.g0.i3(new au(uwVar, 27), 250L);
                return;
            case 22:
                uw.E0(uwVar);
                return;
            case 23:
                uw.c0(uwVar);
                return;
            case 24:
                uw.o0(uwVar);
                return;
            case 25:
                sf.c.t(uwVar.getParentActivity(), uwVar.getMessagesController().L5);
                return;
            case 26:
                uw.n0(uwVar);
                return;
            case 27:
                uw.A0(uwVar);
                return;
            default:
                uw.b0(uwVar);
                return;
        }
    }
}
