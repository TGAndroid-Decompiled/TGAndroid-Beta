package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class gu implements View.OnClickListener {
    public final int f47513a;
    public final yw f47514b;

    public gu(yw ywVar, int i7) {
        this.f47513a = i7;
        this.f47514b = ywVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        qv qvVar;
        qv qvVar2;
        int i7 = this.f47513a;
        int i10 = 0;
        yw ywVar = this.f47514b;
        switch (i7) {
            case 0:
                if (ywVar.m4() && (arrayList = ywVar.F2) != null && !arrayList.isEmpty() && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ywVar.F2.get(0);
                    kv kvVar = ywVar.D1;
                    if (kvVar != null) {
                        charSequence = kvVar.getFieldText();
                    } else {
                        charSequence = ffVar.f27709a;
                    }
                    ArrayList arrayList2 = ywVar.F2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.ff) obj).f27709a = charSequence;
                    }
                    PhotoViewer.p1().I2(null, ywVar, ywVar.getResourceProvider());
                    PhotoViewer.p1().f42854p7 = true;
                    PhotoViewer.p1().f42863q7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(ywVar.F2);
                    boolean[] zArr = new boolean[ywVar.F2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().f2(arrayList3, 0, 0, false, new ew(ywVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f42767f4 = true;
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
                if (ywVar.H0 && (qvVar = ywVar.F0) != null && !qvVar.g()) {
                    ywVar.J4(true, true);
                    return;
                } else {
                    ywVar.b5();
                    return;
                }
            case 2:
                if (ywVar.H0 && (qvVar2 = ywVar.F0) != null && !qvVar2.g()) {
                    ywVar.J4(true, true);
                    return;
                } else {
                    ywVar.b5();
                    return;
                }
            case 3:
                ywVar.a5(true, false, true, false);
                ywVar.Z.b(true);
                org.telegram.messenger.g0.i3(new eu(ywVar, 9), 100L);
                return;
            case 4:
                ywVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ywVar.f53613a3);
                ywVar.presentFragment(new li.r(bundle));
                return;
            case 5:
                yw ywVar2 = this.f47514b;
                ArrayList arrayList4 = ywVar2.K2;
                if (ywVar2.E2 != null && !arrayList4.isEmpty()) {
                    ywVar2.O2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.ur.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar2.E2.y(ywVar2, arrayList5, ywVar2.D1.getFieldText(), false, ywVar2.L2, ywVar2.M2, ywVar2.N2, null);
                    return;
                }
                return;
            case 6:
                ywVar.n4(true);
                return;
            case 7:
                ywVar.finishPreviewFragment();
                return;
            case 8:
                ywVar.A0.setIsEditing(false);
                ywVar.U4(false);
                return;
            case 9:
                ywVar.getClass();
                ywVar.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) ywVar, 2, true));
                return;
            case 10:
                ywVar.getContactsController().B();
                ywVar.W4();
                return;
            case 11:
                ywVar.B4(view);
                return;
            case 12:
                yw.w0(ywVar);
                return;
            case 13:
                yw.K0(ywVar);
                return;
            case 14:
                yw.y0(ywVar);
                return;
            case 15:
                ywVar.showDialog((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.l(ywVar.getParentActivity(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new ju(ywVar, 1), new eu(ywVar, 3), false, false, ywVar.getResourceProvider()).f25806b);
                return;
            case 16:
                yw.D0(ywVar);
                return;
            case 17:
                yw.B0(ywVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f42990k0 = true;
                ywVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new eu(ywVar, 7), 250L);
                return;
            case 19:
                yw.d0(ywVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f42990k0 = true;
                ywVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.i3(new eu(ywVar, 1), 250L);
                return;
            case 21:
                ywVar.presentFragment(new y6());
                org.telegram.messenger.g0.i3(new eu(ywVar, 27), 250L);
                return;
            case 22:
                yw.E0(ywVar);
                return;
            case 23:
                yw.c0(ywVar);
                return;
            case 24:
                yw.o0(ywVar);
                return;
            case 25:
                vf.c.t(ywVar.getParentActivity(), ywVar.getMessagesController().M5);
                return;
            case 26:
                yw.n0(ywVar);
                return;
            case 27:
                yw.A0(ywVar);
                return;
            default:
                yw.b0(ywVar);
                return;
        }
    }
}
