package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class gw extends oq0 {
    public final boolean[] f48365a;
    public final bx f48366b;

    public gw(bx bxVar, boolean[] zArr) {
        this.f48366b = bxVar;
        this.f48365a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        bx bxVar = this.f48366b;
        if (i7 >= 0 && i7 < bxVar.F2.size() && ((org.telegram.messenger.ef) bxVar.F2.get(i7)).f27963b) {
            return null;
        }
        return bx.x2(bxVar);
    }

    @Override
    public final void D() {
        int i7;
        bx bxVar = this.f48366b;
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            dp0Var.i(i7, bxVar.F2);
        }
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.ui.Components.p9 p9Var;
        bx bxVar = this.f48366b;
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            p9Var = dp0Var.f(i7);
        } else {
            p9Var = null;
        }
        if (p9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        p9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f53727b = iArr[0];
        wq0Var.f53728c = iArr[1];
        wq0Var.d = bxVar.I2;
        ImageReceiver imageReceiver = p9Var.getImageReceiver();
        wq0Var.f53726a = imageReceiver;
        wq0Var.f53729e = imageReceiver.p();
        wq0Var.f53734k = p9Var.getScaleX();
        wq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return wq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f48366b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f48366b.x3();
    }

    @Override
    public final long a() {
        bx bxVar = this.f48366b;
        if (bxVar.K2.isEmpty()) {
            return 0L;
        }
        return ((Long) bxVar.K2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gw.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        bx bxVar = this.f48366b;
        ArrayList arrayList = bxVar.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = bxVar.F2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ef) bxVar.F2.get(0)).f27963b) {
                i10 = 2131753930;
            } else {
                i10 = 2131753945;
            }
            return org.telegram.messenger.gd.N0(i10, null);
        }
        ArrayList arrayList2 = bxVar.F2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ef) obj).f27963b) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 == 0) {
            return org.telegram.messenger.gd.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i12 == 0) {
            return org.telegram.messenger.gd.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.gd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        bx bxVar = this.f48366b;
        mv mvVar = bxVar.D1;
        if (mvVar != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = bxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ef) obj).f27962a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gw.h():boolean");
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Components.p9 p9Var;
        org.telegram.ui.Components.dp0 dp0Var = this.f48366b.I2;
        if (dp0Var != null) {
            p9Var = dp0Var.f(i7);
        } else {
            p9Var = null;
        }
        if (p9Var == null) {
            return null;
        }
        return p9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        bx bxVar = this.f48366b;
        ArrayList arrayList2 = bxVar.K2;
        if (bxVar.D1 != null && (arrayList = bxVar.F2) != null && !arrayList.isEmpty()) {
            mv mvVar = bxVar.D1;
            CharSequence charSequence = ((org.telegram.messenger.ef) bxVar.F2.get(0)).f27962a;
            if (charSequence == null) {
                charSequence = "";
            }
            mvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            dp0Var.i(i12, bxVar.F2);
        }
        if ((!z10 || i10 != 0 || z11) && bxVar.E2 != null && !arrayList2.isEmpty()) {
            bxVar.L2 = z10;
            bxVar.M2 = i10;
            bxVar.O2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.sr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            bxVar.E2.z(bxVar, arrayList3, bxVar.D1.getFieldText(), false, z10, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        mv mvVar;
        org.telegram.ui.Components.yc b12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.Q1() && (b12 = p12.b1()) != null) {
            charSequence = b12.getText();
        }
        bx bxVar = this.f48366b;
        if (charSequence != null && (mvVar = bxVar.D1) != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = bxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ef) obj).f27962a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f48365a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        return i7;
    }
}
