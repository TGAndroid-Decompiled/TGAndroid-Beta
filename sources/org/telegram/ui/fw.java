package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fw extends qq0 {
    public final boolean[] f45856a;
    public final zw f45857b;

    public fw(zw zwVar, boolean[] zArr) {
        this.f45857b = zwVar;
        this.f45856a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        zw zwVar = this.f45857b;
        if (i7 >= 0 && i7 < zwVar.E2.size() && ((org.telegram.messenger.gf) zwVar.E2.get(i7)).f26849b) {
            return null;
        }
        return zw.w2(zwVar);
    }

    @Override
    public final void D() {
        int i7;
        zw zwVar = this.f45857b;
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            po0Var.i(i7, zwVar.E2);
        }
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.k9 k9Var;
        zw zwVar = this.f45857b;
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            k9Var = po0Var.f(i7);
        } else {
            k9Var = null;
        }
        if (k9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.f52504b = iArr[0];
        zq0Var.f52505c = iArr[1];
        zq0Var.d = zwVar.H2;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        zq0Var.f52503a = imageReceiver;
        zq0Var.f52506e = imageReceiver.p();
        zq0Var.f52511k = k9Var.getScaleX();
        zq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return zq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f45857b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f45857b.x3();
    }

    @Override
    public final long a() {
        zw zwVar = this.f45857b;
        if (zwVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) zwVar.J2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fw.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        zw zwVar = this.f45857b;
        ArrayList arrayList = zwVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = zwVar.E2.size();
        if (size == 1) {
            if (((org.telegram.messenger.gf) zwVar.E2.get(0)).f26849b) {
                i10 = 2131753933;
            } else {
                i10 = 2131753948;
            }
            return org.telegram.messenger.id.M0(i10, null);
        }
        ArrayList arrayList2 = zwVar.E2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.gf) obj).f26849b) {
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
        zw zwVar = this.f45857b;
        mv mvVar = zwVar.C1;
        if (mvVar != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26848a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fw.h():boolean");
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.k9 k9Var;
        org.telegram.ui.Components.po0 po0Var = this.f45857b.H2;
        if (po0Var != null) {
            k9Var = po0Var.f(i7);
        } else {
            k9Var = null;
        }
        if (k9Var == null) {
            return null;
        }
        return k9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList;
        zw zwVar = this.f45857b;
        ArrayList arrayList2 = zwVar.J2;
        if (zwVar.C1 != null && (arrayList = zwVar.E2) != null && !arrayList.isEmpty()) {
            mv mvVar = zwVar.C1;
            CharSequence charSequence = ((org.telegram.messenger.gf) zwVar.E2.get(0)).f26848a;
            if (charSequence == null) {
                charSequence = "";
            }
            mvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            po0Var.i(i12, zwVar.E2);
        }
        if ((!z9 || i10 != 0 || z10) && zwVar.D2 != null && !arrayList2.isEmpty()) {
            zwVar.K2 = z9;
            zwVar.L2 = i10;
            zwVar.N2 = z10;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            zwVar.D2.y(zwVar, arrayList3, zwVar.C1.getFieldText(), false, z9, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        mv mvVar;
        org.telegram.ui.Components.tc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        zw zwVar = this.f45857b;
        if (charSequence != null && (mvVar = zwVar.C1) != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26848a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f45856a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
