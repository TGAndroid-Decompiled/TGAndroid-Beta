package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class gu implements View.OnClickListener {
    public final int f46069a;
    public final yw f46070b;

    public gu(yw ywVar, int i7) {
        this.f46069a = i7;
        this.f46070b = ywVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        rv rvVar;
        rv rvVar2;
        int i7 = this.f46069a;
        int i10 = 0;
        yw ywVar = this.f46070b;
        switch (i7) {
            case 0:
                if (ywVar.m4() && (arrayList = ywVar.E2) != null && !arrayList.isEmpty() && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ywVar.E2.get(0);
                    lv lvVar = ywVar.C1;
                    if (lvVar != null) {
                        charSequence = lvVar.getFieldText();
                    } else {
                        charSequence = gfVar.f26844a;
                    }
                    ArrayList arrayList2 = ywVar.E2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.gf) obj).f26844a = charSequence;
                    }
                    PhotoViewer.p1().H2(null, ywVar, ywVar.getResourceProvider());
                    PhotoViewer.p1().f41483o7 = true;
                    PhotoViewer.p1().f41492p7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(ywVar.E2);
                    boolean[] zArr = new boolean[ywVar.E2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().e2(arrayList3, 0, 0, false, new ew(ywVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f41395e4 = true;
                    CheckBox checkBox = p12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = p12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (ywVar.G0 && (rvVar = ywVar.E0) != null && !rvVar.g()) {
                    ywVar.J4(true, true);
                    return;
                } else {
                    ywVar.b5();
                    return;
                }
            case 2:
                if (ywVar.G0 && (rvVar2 = ywVar.E0) != null && !rvVar2.g()) {
                    ywVar.J4(true, true);
                    return;
                } else {
                    ywVar.b5();
                    return;
                }
            case 3:
                ywVar.a5(true, false, true, false);
                ywVar.Y.b(true);
                org.telegram.messenger.g0.i3(new eu(ywVar, 9), 100L);
                return;
            case 4:
                ywVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ywVar.Z2);
                ywVar.presentFragment(new ii.s(bundle));
                return;
            case 5:
                yw ywVar2 = this.f46070b;
                ArrayList arrayList4 = ywVar2.J2;
                if (ywVar2.D2 != null && !arrayList4.isEmpty()) {
                    ywVar2.N2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.xr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    ywVar2.D2.y(ywVar2, arrayList5, ywVar2.C1.getFieldText(), false, ywVar2.K2, ywVar2.L2, ywVar2.M2, null);
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
                ywVar.f52337z0.setIsEditing(false);
                ywVar.U4(false);
                return;
            case 9:
                ywVar.getClass();
                ywVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ywVar, 2, true));
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
                ywVar.showDialog((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.l(ywVar.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new ju(ywVar, 1), new eu(ywVar, 3), false, false, ywVar.getResourceProvider()).f14323b);
                return;
            case 16:
                yw.D0(ywVar);
                return;
            case 17:
                yw.B0(ywVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f41626j0 = true;
                ywVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new eu(ywVar, 7), 250L);
                return;
            case 19:
                yw.d0(ywVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f41626j0 = true;
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
                vf.c.t(ywVar.getParentActivity(), ywVar.getMessagesController().L5);
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
