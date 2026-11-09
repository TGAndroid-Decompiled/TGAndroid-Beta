package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ew extends pq0 {
    public final boolean[] f45519a;
    public final yw f45520b;

    public ew(yw ywVar, boolean[] zArr) {
        this.f45520b = ywVar;
        this.f45519a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        yw ywVar = this.f45520b;
        if (i7 >= 0 && i7 < ywVar.E2.size() && ((org.telegram.messenger.gf) ywVar.E2.get(i7)).f26845b) {
            return null;
        }
        return yw.w2(ywVar);
    }

    @Override
    public final void D() {
        int i7;
        yw ywVar = this.f45520b;
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            qo0Var.i(i7, ywVar.E2);
        }
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var;
        yw ywVar = this.f45520b;
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            l9Var = qo0Var.f(i7);
        } else {
            l9Var = null;
        }
        if (l9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        yq0 yq0Var = new yq0();
        yq0Var.f52160b = iArr[0];
        yq0Var.f52161c = iArr[1];
        yq0Var.d = ywVar.H2;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        yq0Var.f52159a = imageReceiver;
        yq0Var.f52162e = imageReceiver.p();
        yq0Var.f52167k = l9Var.getScaleX();
        yq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return yq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f45520b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f45520b.x3();
    }

    @Override
    public final long a() {
        yw ywVar = this.f45520b;
        if (ywVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) ywVar.J2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ew.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        yw ywVar = this.f45520b;
        ArrayList arrayList = ywVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ywVar.E2.size();
        if (size == 1) {
            if (((org.telegram.messenger.gf) ywVar.E2.get(0)).f26845b) {
                i10 = 2131753933;
            } else {
                i10 = 2131753948;
            }
            return org.telegram.messenger.id.M0(i10, null);
        }
        ArrayList arrayList2 = ywVar.E2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.gf) obj).f26845b) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 == 0) {
            return org.telegram.messenger.id.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i12 == 0) {
            return org.telegram.messenger.id.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.id.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        yw ywVar = this.f45520b;
        lv lvVar = ywVar.C1;
        if (lvVar != null) {
            lvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26844a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ew.h():boolean");
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.l9 l9Var;
        org.telegram.ui.Components.qo0 qo0Var = this.f45520b.H2;
        if (qo0Var != null) {
            l9Var = qo0Var.f(i7);
        } else {
            l9Var = null;
        }
        if (l9Var == null) {
            return null;
        }
        return l9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList;
        yw ywVar = this.f45520b;
        ArrayList arrayList2 = ywVar.J2;
        if (ywVar.C1 != null && (arrayList = ywVar.E2) != null && !arrayList.isEmpty()) {
            lv lvVar = ywVar.C1;
            CharSequence charSequence = ((org.telegram.messenger.gf) ywVar.E2.get(0)).f26844a;
            if (charSequence == null) {
                charSequence = "";
            }
            lvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.qo0 qo0Var = ywVar.H2;
        if (qo0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            qo0Var.i(i12, ywVar.E2);
        }
        if ((!z9 || i10 != 0 || z10) && ywVar.D2 != null && !arrayList2.isEmpty()) {
            ywVar.K2 = z9;
            ywVar.L2 = i10;
            ywVar.N2 = z10;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            ywVar.D2.y(ywVar, arrayList3, ywVar.C1.getFieldText(), false, z9, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        lv lvVar;
        org.telegram.ui.Components.uc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        yw ywVar = this.f45520b;
        if (charSequence != null && (lvVar = ywVar.C1) != null) {
            lvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26844a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f45519a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
