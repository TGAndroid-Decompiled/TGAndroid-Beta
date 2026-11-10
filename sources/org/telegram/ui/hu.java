package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;
public final class hu implements View.OnClickListener {
    public final int f46424a;
    public final zw f46425b;

    public hu(zw zwVar, int i7) {
        this.f46424a = i7;
        this.f46425b = zwVar;
    }

    @Override
    public final void onClick(View view) {
        ArrayList arrayList;
        CharSequence charSequence;
        sv svVar;
        sv svVar2;
        int i7 = this.f46424a;
        int i10 = 0;
        zw zwVar = this.f46425b;
        switch (i7) {
            case 0:
                if (zwVar.m4() && (arrayList = zwVar.E2) != null && !arrayList.isEmpty() && zwVar.getParentActivity() != null) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) zwVar.E2.get(0);
                    mv mvVar = zwVar.C1;
                    if (mvVar != null) {
                        charSequence = mvVar.getFieldText();
                    } else {
                        charSequence = gfVar.f26848a;
                    }
                    ArrayList arrayList2 = zwVar.E2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((org.telegram.messenger.gf) obj).f26848a = charSequence;
                    }
                    PhotoViewer.p1().H2(null, zwVar, zwVar.getResourceProvider());
                    PhotoViewer.p1().f41474o7 = true;
                    PhotoViewer.p1().f41483p7 = charSequence;
                    ArrayList arrayList3 = new ArrayList(zwVar.E2);
                    boolean[] zArr = new boolean[zwVar.E2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.p1().e2(arrayList3, 0, 0, false, new fw(zwVar, zArr), null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.f41386e4 = true;
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
                if (zwVar.G0 && (svVar = zwVar.E0) != null && !svVar.g()) {
                    zwVar.J4(true, true);
                    return;
                } else {
                    zwVar.b5();
                    return;
                }
            case 2:
                if (zwVar.G0 && (svVar2 = zwVar.E0) != null && !svVar2.g()) {
                    zwVar.J4(true, true);
                    return;
                } else {
                    zwVar.b5();
                    return;
                }
            case 3:
                zwVar.a5(true, false, true, false);
                zwVar.Y.b(true);
                org.telegram.messenger.g0.i3(new fu(zwVar, 9), 100L);
                return;
            case 4:
                zwVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zwVar.Z2);
                zwVar.presentFragment(new ii.s(bundle));
                return;
            case 5:
                zw zwVar2 = this.f46425b;
                ArrayList arrayList4 = zwVar2.J2;
                if (zwVar2.D2 != null && !arrayList4.isEmpty()) {
                    zwVar2.N2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    while (i10 < arrayList4.size()) {
                        arrayList5.add(org.telegram.messenger.xr.a(((Long) arrayList4.get(i10)).longValue(), 0L));
                        i10++;
                    }
                    zwVar2.D2.y(zwVar2, arrayList5, zwVar2.C1.getFieldText(), false, zwVar2.K2, zwVar2.L2, zwVar2.M2, null);
                    return;
                }
                return;
            case 6:
                zwVar.n4(true);
                return;
            case 7:
                zwVar.finishPreviewFragment();
                return;
            case 8:
                zwVar.f52683z0.setIsEditing(false);
                zwVar.U4(false);
                return;
            case 9:
                zwVar.getClass();
                zwVar.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) zwVar, 2, true));
                return;
            case 10:
                zwVar.getContactsController().B();
                zwVar.W4();
                return;
            case 11:
                zwVar.B4(view);
                return;
            case 12:
                zw.w0(zwVar);
                return;
            case 13:
                zw.K0(zwVar);
                return;
            case 14:
                zw.y0(zwVar);
                return;
            case 15:
                zwVar.showDialog((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.l(zwVar.getParentActivity(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new ku(zwVar, 1), new fu(zwVar, 3), false, false, zwVar.getResourceProvider()).f14325b);
                return;
            case 16:
                zw.D0(zwVar);
                return;
            case 17:
                zw.B0(zwVar);
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.f41617j0 = true;
                zwVar.presentFragment(premiumPreviewFragment);
                org.telegram.messenger.g0.i3(new fu(zwVar, 7), 250L);
                return;
            case 19:
                zw.d0(zwVar);
                return;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.f41617j0 = true;
                zwVar.presentFragment(premiumPreviewFragment2);
                org.telegram.messenger.g0.i3(new fu(zwVar, 1), 250L);
                return;
            case 21:
                zwVar.presentFragment(new y6());
                org.telegram.messenger.g0.i3(new fu(zwVar, 27), 250L);
                return;
            case 22:
                zw.E0(zwVar);
                return;
            case 23:
                zw.c0(zwVar);
                return;
            case 24:
                zw.o0(zwVar);
                return;
            case 25:
                vf.c.t(zwVar.getParentActivity(), zwVar.getMessagesController().L5);
                return;
            case 26:
                zw.n0(zwVar);
                return;
            case 27:
                zw.A0(zwVar);
                return;
            default:
                zw.b0(zwVar);
                return;
        }
    }
}
