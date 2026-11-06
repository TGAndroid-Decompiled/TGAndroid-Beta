package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class cw extends nq0 {
    public final boolean[] f44905a;
    public final ww f44906b;

    public cw(ww wwVar, boolean[] zArr) {
        this.f44906b = wwVar;
        this.f44905a = zArr;
    }

    @Override
    public final CharSequence C(int i7) {
        ww wwVar = this.f44906b;
        if (i7 >= 0 && i7 < wwVar.D2.size() && ((org.telegram.messenger.gf) wwVar.D2.get(i7)).f26824b) {
            return null;
        }
        return ww.w2(wwVar);
    }

    @Override
    public final void D() {
        int i7;
        ww wwVar = this.f44906b;
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            po0Var.i(i7, wwVar.D2);
        }
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Components.l9 l9Var;
        ww wwVar = this.f44906b;
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            l9Var = po0Var.f(i7);
        } else {
            l9Var = null;
        }
        if (l9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        l9Var.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.f51479b = iArr[0];
        wq0Var.f51480c = iArr[1];
        wq0Var.d = wwVar.G2;
        ImageReceiver imageReceiver = l9Var.getImageReceiver();
        wq0Var.f51478a = imageReceiver;
        wq0Var.f51481e = imageReceiver.p();
        wq0Var.f51486k = l9Var.getScaleX();
        wq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return wq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f44906b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f44906b.x3();
    }

    @Override
    public final long a() {
        ww wwVar = this.f44906b;
        if (wwVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) wwVar.I2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cw.b():boolean");
    }

    @Override
    public final CharSequence c0(int i7) {
        int i10;
        ww wwVar = this.f44906b;
        ArrayList arrayList = wwVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = wwVar.D2.size();
        if (size == 1) {
            if (((org.telegram.messenger.gf) wwVar.D2.get(0)).f26824b) {
                i10 = 2131753933;
            } else {
                i10 = 2131753948;
            }
            return org.telegram.messenger.hd.M0(i10, null);
        }
        ArrayList arrayList2 = wwVar.D2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.gf) obj).f26824b) {
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
        ww wwVar = this.f44906b;
        jv jvVar = wwVar.B1;
        if (jvVar != null) {
            jvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wwVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26823a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cw.h():boolean");
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.l9 l9Var;
        org.telegram.ui.Components.po0 po0Var = this.f44906b.G2;
        if (po0Var != null) {
            l9Var = po0Var.f(i7);
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
        ww wwVar = this.f44906b;
        ArrayList arrayList2 = wwVar.I2;
        if (wwVar.B1 != null && (arrayList = wwVar.D2) != null && !arrayList.isEmpty()) {
            jv jvVar = wwVar.B1;
            CharSequence charSequence = ((org.telegram.messenger.gf) wwVar.D2.get(0)).f26823a;
            if (charSequence == null) {
                charSequence = "";
            }
            jvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.po0 po0Var = wwVar.G2;
        if (po0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            po0Var.i(i12, wwVar.D2);
        }
        if ((!z9 || i10 != 0 || z10) && wwVar.C2 != null && !arrayList2.isEmpty()) {
            wwVar.J2 = z9;
            wwVar.K2 = i10;
            wwVar.M2 = z10;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.p1().z0(true, false);
            wwVar.C2.y(wwVar, arrayList3, wwVar.B1.getFieldText(), false, z9, i10, i11, null);
            return;
        }
        PhotoViewer.p1().z0(true, false);
    }

    @Override
    public final void s() {
        jv jvVar;
        org.telegram.ui.Components.uc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        ww wwVar = this.f44906b;
        if (charSequence != null && (jvVar = wwVar.B1) != null) {
            jvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = wwVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).f26823a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i7) {
        return this.f44905a[i7];
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
