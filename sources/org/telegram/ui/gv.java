package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class gv implements View.OnClickListener {
    public final int f37570a;
    public final zx f37571b;

    public gv(zx zxVar, int i10) {
        this.f37570a = i10;
        this.f37571b = zxVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        tw twVar;
        tw twVar2;
        int i10 = this.f37570a;
        int i11 = 0;
        zx zxVar = this.f37571b;
        switch (i10) {
            case 0:
                if (zxVar.m4() && (arrayList = zxVar.D2) != null && !arrayList.isEmpty() && zxVar.getParentActivity() != null) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) zxVar.D2.get(0);
                    nw nwVar = zxVar.B1;
                    if (nwVar != null) {
                        charSequence = nwVar.getFieldText();
                    } else {
                        charSequence = ffVar.f14602a;
                    }
                    ArrayList arrayList2 = zxVar.D2;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.messenger.ff) obj).f14602a = charSequence;
                    }
                    PhotoViewer.v1().N2(null, zxVar, zxVar.getResourceProvider());
                    PhotoViewer.v1().f33579p7 = true;
                    PhotoViewer.v1().f33587q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(zxVar.D2);
                    boolean[] zArr = new boolean[zxVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.v1().j2(arrayList3, 0, 0, false, new gx(zxVar, zArr), null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    v12.f33490f4 = true;
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
                if (zxVar.G0 && (twVar = zxVar.E0) != null && !twVar.g()) {
                    zxVar.J4(true, true);
                    return;
                } else {
                    zxVar.b5();
                    return;
                }
            case 2:
                if (zxVar.G0 && (twVar2 = zxVar.E0) != null && !twVar2.g()) {
                    zxVar.J4(true, true);
                    return;
                } else {
                    zxVar.b5();
                    return;
                }
            case 3:
                zxVar.a5(true, false, true, false);
                zxVar.Y.b(true);
                org.telegram.messenger.i0.h3(new ev(zxVar, 9), 100L);
                return;
            case 4:
                zxVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zxVar.Y2);
                zxVar.presentFragment(new yh.p(bundle));
                return;
            case 5:
                zx zxVar2 = this.f37571b;
                ArrayList arrayList4 = zxVar2.I2;
                if (zxVar2.C2 != null && !arrayList4.isEmpty()) {
                    zxVar2.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i11 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.hs.a(((Long) arrayList4.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    zxVar2.C2.z(zxVar2, arrayList5, zxVar2.B1.getFieldText(), false, zxVar2.J2, zxVar2.K2, zxVar2.L2, null);
                    return;
                }
                return;
            case 6:
                zxVar.n4(true);
                return;
            case 7:
                zxVar.finishPreviewFragment();
                return;
            case 8:
                zxVar.f44243z0.setIsEditing(false);
                zxVar.U4(false);
                return;
            case 9:
                zxVar.getClass();
                zxVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) zxVar, 2, true));
                return;
            case 10:
                zxVar.getContactsController().B();
                zxVar.W4();
                return;
            case 11:
                zxVar.B4(view);
                return;
            case 12:
                zx.w0(zxVar);
                return;
            case 13:
                zx.K0(zxVar);
                return;
            case 14:
                zx.y0(zxVar);
                return;
            case 15:
                zxVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.l(zxVar.getParentActivity(), org.telegram.messenger.dd.L0(2131751239, null), org.telegram.messenger.dd.L0(2131751244, null), null, new jv(zxVar, 1), new ev(zxVar, 3), false, false, zxVar.getResourceProvider()).f11588b);
                return;
            case 16:
                zx.D0(zxVar);
                return;
            case 17:
                zx.B0(zxVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f33709j0 = true;
                zxVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.i0.h3(new ev(zxVar, 7), 250L);
                return;
            case 19:
                zx.d0(zxVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f33709j0 = true;
                zxVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.i0.h3(new ev(zxVar, 1), 250L);
                return;
            case 21:
                zxVar.presentFragment(new y6());
                org.telegram.messenger.i0.h3(new ev(zxVar, 27), 250L);
                return;
            case 22:
                zx.E0(zxVar);
                return;
            case 23:
                zx.c0(zxVar);
                return;
            case 24:
                zx.o0(zxVar);
                return;
            case 25:
                gf.f.r(zxVar.getParentActivity(), zxVar.getMessagesController().M5);
                return;
            case 26:
                zx.n0(zxVar);
                return;
            case 27:
                zx.A0(zxVar);
                return;
            default:
                zx.b0(zxVar);
                return;
        }
    }
}
