package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class hx extends yr0 {
    public final boolean[] f38044a;
    public final ay f38045b;

    public hx(ay ayVar, boolean[] zArr) {
        this.f38045b = ayVar;
        this.f38044a = zArr;
    }

    @Override
    public final CharSequence C(int i10) {
        ay ayVar = this.f38045b;
        if (i10 >= 0 && i10 < ayVar.D2.size() && ((org.telegram.messenger.ef) ayVar.D2.get(i10)).f19507b) {
            return null;
        }
        return ay.v2(ayVar);
    }

    @Override
    public final void D() {
        int i10;
        ay ayVar = this.f38045b;
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            sp0Var.i(i10, ayVar.D2);
        }
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.g9 g9Var;
        ay ayVar = this.f38045b;
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            g9Var = sp0Var.f(i10);
        } else {
            g9Var = null;
        }
        if (g9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.f37628b = iArr[0];
        gs0Var.f37629c = iArr[1];
        gs0Var.d = ayVar.G2;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        gs0Var.f37627a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        gs0Var.f37634k = g9Var.getScaleX();
        gs0Var.h = new int[]{org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f)};
        return gs0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f38045b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f38045b.w3();
    }

    @Override
    public final long a() {
        ay ayVar = this.f38045b;
        if (ayVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) ayVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.b():boolean");
    }

    @Override
    public final CharSequence c0(int i10) {
        int i11;
        ay ayVar = this.f38045b;
        ArrayList arrayList = ayVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = ayVar.D2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ef) ayVar.D2.get(0)).f19507b) {
                i11 = 2131753933;
            } else {
                i11 = 2131753948;
            }
            return org.telegram.messenger.cd.L0(i11, null);
        }
        ArrayList arrayList2 = ayVar.D2;
        int size2 = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList2.get(i14);
            i14++;
            if (((org.telegram.messenger.ef) obj).f19507b) {
                i12++;
            } else {
                i13++;
            }
        }
        if (i12 == 0) {
            return org.telegram.messenger.cd.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i13 == 0) {
            return org.telegram.messenger.cd.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.cd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        ay ayVar = this.f38045b;
        ow owVar = ayVar.B1;
        if (owVar != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ayVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ef) obj).f19506a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hx.h():boolean");
    }

    @Override
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Components.g9 g9Var;
        org.telegram.ui.Components.sp0 sp0Var = this.f38045b.G2;
        if (sp0Var != null) {
            g9Var = sp0Var.f(i10);
        } else {
            g9Var = null;
        }
        if (g9Var == null) {
            return null;
        }
        return g9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        ay ayVar = this.f38045b;
        ArrayList arrayList2 = ayVar.I2;
        if (ayVar.B1 != null && (arrayList = ayVar.D2) != null && !arrayList.isEmpty()) {
            ow owVar = ayVar.B1;
            CharSequence charSequence = ((org.telegram.messenger.ef) ayVar.D2.get(0)).f19506a;
            if (charSequence == null) {
                charSequence = "";
            }
            owVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.sp0 sp0Var = ayVar.G2;
        if (sp0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            sp0Var.i(i13, ayVar.D2);
        }
        if ((!z10 || i11 != 0 || z11) && ayVar.C2 != null && !arrayList2.isEmpty()) {
            ayVar.J2 = z10;
            ayVar.K2 = i11;
            ayVar.M2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                arrayList3.add(org.telegram.messenger.gs.a(((Long) arrayList2.get(i14)).longValue(), 0L));
            }
            PhotoViewer.v1().H0(true, false);
            ayVar.C2.y(ayVar, arrayList3, ayVar.B1.getFieldText(), false, z10, i11, i12, null);
            return;
        }
        PhotoViewer.v1().H0(true, false);
    }

    @Override
    public final void s() {
        ow owVar;
        org.telegram.ui.Components.nc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        ay ayVar = this.f38045b;
        if (charSequence != null && (owVar = ayVar.B1) != null) {
            owVar.setFieldText(charSequence);
        }
        ArrayList arrayList = ayVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ef) obj).f19506a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i10) {
        return this.f38044a[i10];
    }

    @Override
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        return i10;
    }
}
