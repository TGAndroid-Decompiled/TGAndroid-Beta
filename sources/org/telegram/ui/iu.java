package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class iu implements View.OnClickListener {
    public final int f48827a;
    public final cx f48828b;

    public iu(cx cxVar, int i7) {
        this.f48827a = i7;
        this.f48828b = cxVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        tv tvVar;
        tv tvVar2;
        int i7 = this.f48827a;
        int i10 = 0;
        cx cxVar = this.f48828b;
        switch (i7) {
            case 0:
                if (cxVar.o4() && (arrayList = cxVar.F2) != null && !arrayList.isEmpty() && cxVar.getParentActivity() != null) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) cxVar.F2.get(0);
                    nv nvVar = cxVar.D1;
                    if (nvVar != null) {
                        charSequence = nvVar.getFieldText();
                    } else {
                        charSequence = ffVar.f28058a;
                    }
                    ArrayList arrayList2 = cxVar.F2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.ff) obj).f28058a = charSequence;
                    }
                    PhotoViewer.p1().I2(null, cxVar, cxVar.getResourceProvider());
                    PhotoViewer.p1().f43344p7 = true;
                    PhotoViewer.p1().f43353q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(cxVar.F2);
                    boolean[] zArr = new boolean[cxVar.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().f2(arrayList3, 0, 0, false, new hw(cxVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f43257f4 = true;
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
                if (cxVar.H0 && (tvVar = cxVar.F0) != null && !tvVar.g()) {
                    cxVar.R4(true, true);
                    return;
                } else {
                    cxVar.j5();
                    return;
                }
            case 2:
                if (cxVar.H0 && (tvVar2 = cxVar.F0) != null && !tvVar2.g()) {
                    cxVar.R4(true, true);
                    return;
                } else {
                    cxVar.j5();
                    return;
                }
            case 3:
                cxVar.i5(true, false, true, false);
                cxVar.Z.b(true);
                org.telegram.messenger.g0.h3(new gu(cxVar, 16), 100L);
                return;
            case 4:
                cxVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cxVar.f46697a3);
                cxVar.presentFragment(new li.s(bundle));
                return;
            case 5:
                cx cxVar2 = this.f48828b;
                ArrayList arrayList4 = cxVar2.K2;
                if (cxVar2.E2 != null && !arrayList4.isEmpty()) {
                    cxVar2.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.tr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    cxVar2.E2.y(cxVar2, arrayList5, cxVar2.D1.getFieldText(), false, cxVar2.L2, cxVar2.M2, cxVar2.N2, null);
                    return;
                }
                return;
            case 6:
                cxVar.p4(true);
                return;
            case 7:
                cxVar.finishPreviewFragment();
                return;
            case 8:
                cxVar.A0.setIsEditing(false);
                cxVar.c5(false);
                return;
            case 9:
                cxVar.getClass();
                cxVar.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) cxVar, 2, true));
                return;
            case 10:
                cxVar.getContactsController().B();
                cxVar.e5();
                return;
            case 11:
                cxVar.G4(view);
                return;
            case 12:
                cx.q0(cxVar);
                return;
            case 13:
                cx.x0(cxVar);
                return;
            case 14:
                cx.u0(cxVar);
                return;
            case 15:
                cxVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.c5.l(cxVar.getParentActivity(), org.telegram.messenger.hd.N0(2131751226, null), org.telegram.messenger.hd.N0(2131751231, null), null, new hu(cxVar, 1), new zu(cxVar, 12), false, false, cxVar.getResourceProvider()).f15708b);
                return;
            case 16:
                cx.B0(cxVar);
                return;
            case 17:
                cx.v0(cxVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f43480k0 = true;
                cxVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.h3(new gu(cxVar, 10), 250L);
                return;
            case 19:
                cx.y0(cxVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f43480k0 = true;
                cxVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.h3(new zu(cxVar, 8), 250L);
                return;
            case 21:
                cxVar.presentFragment(new x6());
                org.telegram.messenger.g0.h3(new zu(cxVar, 6), 250L);
                return;
            case 22:
                cx.Z(cxVar);
                return;
            case 23:
                cx.e0(cxVar);
                return;
            case 24:
                cx.m0(cxVar);
                return;
            case 25:
                vf.c.t(cxVar.getParentActivity(), cxVar.getMessagesController().O5);
                return;
            case 26:
                cx.I0(cxVar);
                return;
            case 27:
                cx.A0(cxVar);
                return;
            default:
                cx.b0(cxVar);
                return;
        }
    }
}
