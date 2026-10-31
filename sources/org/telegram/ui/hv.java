package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class hv implements View.OnClickListener {
    public final int f38037a;
    public final ay f38038b;

    public hv(ay ayVar, int i10) {
        this.f38037a = i10;
        this.f38038b = ayVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        uw uwVar;
        uw uwVar2;
        int i10 = this.f38037a;
        int i11 = 0;
        ay ayVar = this.f38038b;
        switch (i10) {
            case 0:
                if (ayVar.l4() && (arrayList = ayVar.D2) != null && !arrayList.isEmpty() && ayVar.getParentActivity() != null) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ayVar.D2.get(0);
                    ow owVar = ayVar.B1;
                    if (owVar != null) {
                        charSequence = owVar.getFieldText();
                    } else {
                        charSequence = efVar.f19506a;
                    }
                    ArrayList arrayList2 = ayVar.D2;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.messenger.ef) obj).f19506a = charSequence;
                    }
                    PhotoViewer.v1().N2(null, ayVar, ayVar.getResourceProvider());
                    PhotoViewer.v1().f33572p7 = true;
                    PhotoViewer.v1().f33580q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(ayVar.D2);
                    boolean[] zArr = new boolean[ayVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new hx(ayVar, zArr), null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.f33483f4 = true;
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
                if (ayVar.G0 && (uwVar = ayVar.E0) != null && !uwVar.g()) {
                    ayVar.I4(true, true);
                    return;
                } else {
                    ayVar.a5();
                    return;
                }
            case 2:
                if (ayVar.G0 && (uwVar2 = ayVar.E0) != null && !uwVar2.g()) {
                    ayVar.I4(true, true);
                    return;
                } else {
                    ayVar.a5();
                    return;
                }
            case 3:
                ayVar.Z4(true, false, true, false);
                ayVar.Y.b(true);
                org.telegram.messenger.i0.h3(new fv(ayVar, 9), 100L);
                return;
            case 4:
                ayVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ayVar.Y2);
                ayVar.presentFragment(new yh.q(bundle));
                return;
            case 5:
                ay ayVar2 = this.f38038b;
                ArrayList arrayList4 = ayVar2.I2;
                if (ayVar2.C2 != null && !arrayList4.isEmpty()) {
                    ayVar2.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i11 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.gs.a(((Long) arrayList4.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    ayVar2.C2.y(ayVar2, arrayList5, ayVar2.B1.getFieldText(), false, ayVar2.J2, ayVar2.K2, ayVar2.L2, null);
                    return;
                }
                return;
            case 6:
                ayVar.m4(true);
                return;
            case 7:
                ayVar.finishPreviewFragment();
                return;
            case 8:
                ayVar.f35900z0.setIsEditing(false);
                ayVar.T4(false);
                return;
            case 9:
                ayVar.getClass();
                ayVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar, 2, true));
                return;
            case 10:
                ayVar.getContactsController().B();
                ayVar.V4();
                return;
            case 11:
                ayVar.A4(view);
                return;
            case 12:
                ay.v0(ayVar);
                return;
            case 13:
                ay.J0(ayVar);
                return;
            case 14:
                ay.x0(ayVar);
                return;
            case 15:
                ayVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131751239, null), org.telegram.messenger.cd.L0(2131751244, null), null, new kv(ayVar, 1), new fv(ayVar, 3), false, false, ayVar.getResourceProvider()).f11587b);
                return;
            case 16:
                ay.C0(ayVar);
                return;
            case 17:
                ay.A0(ayVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f33702j0 = true;
                ayVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.i0.h3(new fv(ayVar, 7), 250L);
                return;
            case 19:
                ay.c0(ayVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f33702j0 = true;
                ayVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.i0.h3(new fv(ayVar, 1), 250L);
                return;
            case 21:
                ayVar.presentFragment(new y6());
                org.telegram.messenger.i0.h3(new fv(ayVar, 27), 250L);
                return;
            case 22:
                ay.D0(ayVar);
                return;
            case 23:
                ay.b0(ayVar);
                return;
            case 24:
                ay.n0(ayVar);
                return;
            case 25:
                gf.f.r(ayVar.getParentActivity(), ayVar.getMessagesController().M5);
                return;
            case 26:
                ay.m0(ayVar);
                return;
            case 27:
                ay.z0(ayVar);
                return;
            default:
                ay.a0(ayVar);
                return;
        }
    }
}
