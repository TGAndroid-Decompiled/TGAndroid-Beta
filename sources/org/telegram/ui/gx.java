package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gx extends xr0 {
    public final boolean[] f37577a;
    public final zx f37578b;

    public gx(zx zxVar, boolean[] zArr) {
        this.f37578b = zxVar;
        this.f37577a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        zx zxVar = this.f37578b;
        if (i10 >= 0 && i10 < zxVar.D2.size() && ((org.telegram.messenger.ff) zxVar.D2.get(i10)).f14603b) {
            return null;
        }
        return zx.w2(zxVar);
    }

    @Override
    public final void D() {
        int i10;
        zx zxVar = this.f37578b;
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            tp0Var.i(i10, zxVar.D2);
        }
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.g9 g9Var;
        zx zxVar = this.f37578b;
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            g9Var = tp0Var.f(i10);
        } else {
            g9Var = null;
        }
        if (g9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.f37216b = iArr[0];
        fs0Var.f37217c = iArr[1];
        fs0Var.d = zxVar.G2;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        fs0Var.f37215a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.f37222k = g9Var.getScaleX();
        fs0Var.h = new int[]{org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f)};
        return fs0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f37578b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f37578b.x3();
    }

    @Override
    public final long a() {
        zx zxVar = this.f37578b;
        if (zxVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) zxVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        zx zxVar = this.f37578b;
        ArrayList arrayList = zxVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = zxVar.D2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ff) zxVar.D2.get(0)).f14603b) {
                i11 = 2131753933;
            } else {
                i11 = 2131753948;
            }
            return org.telegram.messenger.dd.L0(i11, null);
        }
        ArrayList arrayList2 = zxVar.D2;
        int size2 = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList2.get(i14);
            i14++;
            if (((org.telegram.messenger.ff) obj).f14603b) {
                i12++;
            } else {
                i13++;
            }
        }
        if (i12 == 0) {
            return org.telegram.messenger.dd.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i13 == 0) {
            return org.telegram.messenger.dd.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.dd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        zx zxVar = this.f37578b;
        nw nwVar = zxVar.B1;
        if (nwVar != null) {
            nwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zxVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ff) obj).f14602a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gx.h():boolean");
    }

    @Override
    public final org.telegram.messenger.lc j(int i10) {
        org.telegram.ui.Components.g9 g9Var;
        org.telegram.ui.Components.tp0 tp0Var = this.f37578b.G2;
        if (tp0Var != null) {
            g9Var = tp0Var.f(i10);
        } else {
            g9Var = null;
        }
        if (g9Var == null) {
            return null;
        }
        return g9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        zx zxVar = this.f37578b;
        ArrayList arrayList2 = zxVar.I2;
        if (zxVar.B1 != null && (arrayList = zxVar.D2) != null && !arrayList.isEmpty()) {
            nw nwVar = zxVar.B1;
            CharSequence charSequence = ((org.telegram.messenger.ff) zxVar.D2.get(0)).f14602a;
            if (charSequence == null) {
                charSequence = "";
            }
            nwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            tp0Var.i(i13, zxVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && zxVar.C2 != null && !arrayList2.isEmpty()) {
            zxVar.J2 = z10;
            zxVar.K2 = i11;
            zxVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(org.telegram.messenger.hs.a(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.v1().H0(true, false);
            zxVar.C2.z(zxVar, arrayList3, zxVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.v1().H0(true, false);
    }

    @Override
    public final void s() {
        nw nwVar;
        org.telegram.ui.Components.nc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        zx zxVar = this.f37578b;
        if (charSequence != null && (nwVar = zxVar.B1) != null) {
            nwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zxVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ff) obj).f14602a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i10) {
        return this.f37577a[i10];
    }

    @Override
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return i10;
    }
}
