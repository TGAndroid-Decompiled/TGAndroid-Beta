package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class ew extends mq0 {
    public final boolean[] f46912a;
    public final yw f46913b;

    public ew(yw ywVar, boolean[] zArr) {
        this.f46913b = ywVar;
        this.f46912a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        yw ywVar = this.f46913b;
        if (i7 >= 0 && i7 < ywVar.F2.size() && ((org.telegram.messenger.ff) ywVar.F2.get(i7)).f27710b) {
            return null;
        }
        return yw.w2(ywVar);
    }

    @Override
    public final void D() {
        int i7;
        yw ywVar = this.f46913b;
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            to0Var.i(i7, ywVar.F2);
        }
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.i9 i9Var;
        yw ywVar = this.f46913b;
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            i9Var = to0Var.f(i7);
        } else {
            i9Var = null;
        }
        if (i9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        i9Var.getLocationInWindow(iArr);
        uq0 uq0Var = new uq0();
        uq0Var.f51998b = iArr[0];
        uq0Var.f51999c = iArr[1];
        uq0Var.d = ywVar.I2;
        ImageReceiver imageReceiver = i9Var.getImageReceiver();
        uq0Var.f51997a = imageReceiver;
        uq0Var.f52000e = imageReceiver.p();
        uq0Var.f52005k = i9Var.getScaleX();
        uq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return uq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f46913b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f46913b.x3();
    }

    @Override
    public final long a() {
        yw ywVar = this.f46913b;
        if (ywVar.K2.isEmpty()) {
            return 0L;
        }
        return ((Long) ywVar.K2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ew.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        yw ywVar = this.f46913b;
        ArrayList arrayList = ywVar.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ywVar.F2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ff) ywVar.F2.get(0)).f27710b) {
                i10 = 2131753933;
            } else {
                i10 = 2131753948;
            }
            return org.telegram.messenger.hd.M0(i10, null);
        }
        ArrayList arrayList2 = ywVar.F2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ff) obj).f27710b) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 == 0) {
            return org.telegram.messenger.hd.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i12 == 0) {
            return org.telegram.messenger.hd.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.hd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        yw ywVar = this.f46913b;
        kv kvVar = ywVar.D1;
        if (kvVar != null) {
            kvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).f27709a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ew.h():boolean");
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Components.i9 i9Var;
        org.telegram.ui.Components.to0 to0Var = this.f46913b.I2;
        if (to0Var != null) {
            i9Var = to0Var.f(i7);
        } else {
            i9Var = null;
        }
        if (i9Var == null) {
            return null;
        }
        return i9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        yw ywVar = this.f46913b;
        ArrayList arrayList2 = ywVar.K2;
        if (ywVar.D1 != null && (arrayList = ywVar.F2) != null && !arrayList.isEmpty()) {
            kv kvVar = ywVar.D1;
            CharSequence charSequence = ((org.telegram.messenger.ff) ywVar.F2.get(0)).f27709a;
            if (charSequence == null) {
                charSequence = "";
            }
            kvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.to0 to0Var = ywVar.I2;
        if (to0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            to0Var.i(i12, ywVar.F2);
        }
        if ((!z10 || i10 != 0 || z11) && ywVar.E2 != null && !arrayList2.isEmpty()) {
            ywVar.L2 = z10;
            ywVar.M2 = i10;
            ywVar.O2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.ur.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            ywVar.E2.y(ywVar, arrayList3, ywVar.D1.getFieldText(), false, z10, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        kv kvVar;
        org.telegram.ui.Components.pc b12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (b12 = p12.b1()) != null) {
            charSequence = b12.getText();
        }
        yw ywVar = this.f46913b;
        if (charSequence != null && (kvVar = ywVar.D1) != null) {
            kvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ywVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).f27709a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f46912a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        return i7;
    }
}
