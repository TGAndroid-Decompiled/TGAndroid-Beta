package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class hu implements View.OnClickListener {
    public final int f48631a;
    public final bx f48632b;

    public hu(bx bxVar, int i7) {
        this.f48631a = i7;
        this.f48632b = bxVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        sv svVar;
        sv svVar2;
        int i7 = this.f48631a;
        int i10 = 0;
        bx bxVar = this.f48632b;
        switch (i7) {
            case 0:
                if (bxVar.o4() && (arrayList = bxVar.F2) != null && !arrayList.isEmpty() && bxVar.getParentActivity() != null) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) bxVar.F2.get(0);
                    mv mvVar = bxVar.D1;
                    if (mvVar != null) {
                        charSequence = mvVar.getFieldText();
                    } else {
                        charSequence = efVar.f27962a;
                    }
                    ArrayList arrayList2 = bxVar.F2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.ef) obj).f27962a = charSequence;
                    }
                    PhotoViewer.p1().J2(null, bxVar, bxVar.getResourceProvider());
                    PhotoViewer.p1().f43479v7 = true;
                    PhotoViewer.p1().f43489w7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(bxVar.F2);
                    boolean[] zArr = new boolean[bxVar.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().g2(arrayList3, 0, 0, false, new gw(bxVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f43338f4 = true;
                    CheckBox checkBox = p12.O0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = p12.P0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (bxVar.H0 && (svVar = bxVar.F0) != null && !svVar.g()) {
                    bxVar.R4(true, true);
                    return;
                } else {
                    bxVar.j5();
                    return;
                }
            case 2:
                if (bxVar.H0 && (svVar2 = bxVar.F0) != null && !svVar2.g()) {
                    bxVar.R4(true, true);
                    return;
                } else {
                    bxVar.j5();
                    return;
                }
            case 3:
                bxVar.i5(true, false, true, false);
                bxVar.Z.b(true);
                org.telegram.messenger.g0.h3(new fu(bxVar, 16), 100L);
                return;
            case 4:
                bxVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", bxVar.f46524a3);
                bxVar.presentFragment(new li.r(bundle));
                return;
            case 5:
                bx bxVar2 = this.f48632b;
                ArrayList arrayList4 = bxVar2.K2;
                if (bxVar2.E2 != null && !arrayList4.isEmpty()) {
                    bxVar2.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.sr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    bxVar2.E2.z(bxVar2, arrayList5, bxVar2.D1.getFieldText(), false, bxVar2.L2, bxVar2.M2, bxVar2.N2, null);
                    return;
                }
                return;
            case 6:
                bxVar.p4(true);
                return;
            case 7:
                bxVar.finishPreviewFragment();
                return;
            case 8:
                bxVar.A0.setIsEditing(false);
                bxVar.c5(false);
                return;
            case 9:
                bxVar.getClass();
                bxVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bxVar, 2, true));
                return;
            case 10:
                bxVar.getContactsController().B();
                bxVar.e5();
                return;
            case 11:
                bxVar.G4(view);
                return;
            case 12:
                bx.q0(bxVar);
                return;
            case 13:
                bx.x0(bxVar);
                return;
            case 14:
                bx.u0(bxVar);
                return;
            case 15:
                bxVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.b5.l(bxVar.getParentActivity(), org.telegram.messenger.gd.N0(2131751226, null), org.telegram.messenger.gd.N0(2131751231, null), null, new gu(bxVar, 1), new yu(bxVar, 12), false, false, bxVar.getResourceProvider()).f13936b);
                return;
            case 16:
                bx.B0(bxVar);
                return;
            case 17:
                bx.v0(bxVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f43561k0 = true;
                bxVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.h3(new fu(bxVar, 10), 250L);
                return;
            case 19:
                bx.y0(bxVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f43561k0 = true;
                bxVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.h3(new yu(bxVar, 8), 250L);
                return;
            case 21:
                bxVar.presentFragment(new y6());
                org.telegram.messenger.g0.h3(new yu(bxVar, 6), 250L);
                return;
            case 22:
                bx.Z(bxVar);
                return;
            case 23:
                bx.e0(bxVar);
                return;
            case 24:
                bx.m0(bxVar);
                return;
            case 25:
                vf.c.t(bxVar.getParentActivity(), bxVar.getMessagesController().O5);
                return;
            case 26:
                bx.I0(bxVar);
                return;
            case 27:
                bx.A0(bxVar);
                return;
            default:
                bx.b0(bxVar);
                return;
        }
    }
}
