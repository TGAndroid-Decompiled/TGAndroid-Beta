package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hw extends oq0 {
    public final boolean[] f48535a;
    public final cx f48536b;

    public hw(cx cxVar, boolean[] zArr) {
        this.f48536b = cxVar;
        this.f48535a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        cx cxVar = this.f48536b;
        if (i7 >= 0 && i7 < cxVar.F2.size() && ((org.telegram.messenger.ff) cxVar.F2.get(i7)).f28059b) {
            return null;
        }
        return cx.x2(cxVar);
    }

    @Override
    public final void D() {
        int i7;
        cx cxVar = this.f48536b;
        org.telegram.ui.Components.ep0 ep0Var = cxVar.I2;
        if (ep0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
            ep0Var.i(i7, cxVar.F2);
        }
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.q9 q9Var;
        cx cxVar = this.f48536b;
        org.telegram.ui.Components.ep0 ep0Var = cxVar.I2;
        if (ep0Var != null) {
            q9Var = ep0Var.f(i7);
        } else {
            q9Var = null;
        }
        if (q9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        q9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53498b = iArr[0];
        wq0Var.f53499c = iArr[1];
        wq0Var.d = cxVar.I2;
        ImageReceiver imageReceiver = q9Var.getImageReceiver();
        wq0Var.f53497a = imageReceiver;
        wq0Var.f53500e = imageReceiver.p();
        wq0Var.f53505k = q9Var.getScaleX();
        wq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return wq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f48536b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f48536b.x3();
    }

    @Override
    public final long a() {
        cx cxVar = this.f48536b;
        if (cxVar.K2.isEmpty()) {
            return 0L;
        }
        return ((Long) cxVar.K2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hw.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        cx cxVar = this.f48536b;
        ArrayList arrayList = cxVar.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = cxVar.F2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ff) cxVar.F2.get(0)).f28059b) {
                i10 = 2131753930;
            } else {
                i10 = 2131753945;
            }
            return org.telegram.messenger.hd.N0(i10, null);
        }
        ArrayList arrayList2 = cxVar.F2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ff) obj).f28059b) {
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
        cx cxVar = this.f48536b;
        nv nvVar = cxVar.D1;
        if (nvVar != null) {
            nvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).f28058a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hw.h():boolean");
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Components.q9 q9Var;
        org.telegram.ui.Components.ep0 ep0Var = this.f48536b.I2;
        if (ep0Var != null) {
            q9Var = ep0Var.f(i7);
        } else {
            q9Var = null;
        }
        if (q9Var == null) {
            return null;
        }
        return q9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        cx cxVar = this.f48536b;
        ArrayList arrayList2 = cxVar.K2;
        if (cxVar.D1 != null && (arrayList = cxVar.F2) != null && !arrayList.isEmpty()) {
            nv nvVar = cxVar.D1;
            CharSequence charSequence = ((org.telegram.messenger.ff) cxVar.F2.get(0)).f28058a;
            if (charSequence == null) {
                charSequence = "";
            }
            nvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.ep0 ep0Var = cxVar.I2;
        if (ep0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
            ep0Var.i(i12, cxVar.F2);
        }
        if ((!z10 || i10 != 0 || z11) && cxVar.E2 != null && !arrayList2.isEmpty()) {
            cxVar.L2 = z10;
            cxVar.M2 = i10;
            cxVar.O2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.tr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            cxVar.E2.y(cxVar, arrayList3, cxVar.D1.getFieldText(), false, z10, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        nv nvVar;
        org.telegram.ui.Components.yc b12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (b12 = p12.b1()) != null) {
            charSequence = b12.getText();
        }
        cx cxVar = this.f48536b;
        if (charSequence != null && (nvVar = cxVar.D1) != null) {
            nvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = cxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ff) obj).f28058a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f48535a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        return i7;
    }
}
