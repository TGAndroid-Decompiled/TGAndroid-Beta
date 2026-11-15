package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class em extends org.telegram.ui.mq0 {
    public ArrayList f34371a = new ArrayList();
    public final hm f34372b;

    public em(hm hmVar) {
        this.f34372b = hmVar;
    }

    @Override
    public final void D() {
        hm hmVar = this.f34372b;
        hmVar.c();
        hmVar.i(hmVar.Q.Q, false);
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        hm hmVar = this.f34372b;
        ArrayList arrayList2 = hmVar.f35289b;
        im imVar = hmVar.Q;
        if (i7 >= 0 && i7 < this.f34371a.size() && x(i7) && (ffVar = (org.telegram.messenger.ff) this.f34371a.get(i7)) != null) {
            int size = arrayList2.size();
            gm gmVar = null;
            fm fmVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                gmVar = (gm) arrayList2.get(i10);
                if (gmVar != null && (arrayList = gmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        fm fmVar2 = (fm) arrayList.get(i11);
                        if (fmVar2 != null && fmVar2.f34629b == ffVar && fmVar2.f34636k > 0.5d) {
                            fmVar = (fm) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (fmVar != null) {
                        break;
                    }
                }
            }
            if (gmVar != null && fmVar != null) {
                org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
                int[] iArr = new int[2];
                hmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - imVar.f33609b.T();
                }
                uq0Var.f51998b = iArr[0];
                uq0Var.f51999c = iArr[1] + ((int) gmVar.f35003a);
                uq0Var.f52005k = 1.0f;
                uq0Var.d = hmVar;
                ImageReceiver imageReceiver = fmVar.f34630c;
                uq0Var.f51997a = imageReceiver;
                uq0Var.f52000e = imageReceiver.p();
                uq0Var.h = r5;
                RectF rectF = fmVar.f34642q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                uq0Var.f52004j = (int) (-hmVar.getY());
                uq0Var.f52003i = hmVar.getHeight() - ((int) (((-hmVar.getY()) + imVar.f35650r.getHeight()) - imVar.f33609b.Z0()));
                return uq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f34372b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        hm hmVar = this.f34372b;
        if (hmVar.h.size() <= 1 || (indexOf = hmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        hmVar.h.remove(indexOf);
        hmVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i7) {
        org.telegram.messenger.ff ffVar;
        if (i7 < 0 || i7 >= this.f34371a.size() || (ffVar = (org.telegram.messenger.ff) this.f34371a.get(i7)) == null) {
            return -1;
        }
        return this.f34372b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override
    public final void X(int i7) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 >= 0 && i7 < this.f34371a.size() && (ffVar = (org.telegram.messenger.ff) this.f34371a.get(i7)) != null) {
            int i10 = ffVar.C;
            hm hmVar = this.f34372b;
            hmVar.invalidate();
            for (int i11 = 0; i11 < hmVar.f35289b.size(); i11++) {
                gm gmVar = (gm) hmVar.f35289b.get(i11);
                if (gmVar != null && (arrayList = gmVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        fm fmVar = (fm) arrayList.get(i12);
                        if (fmVar != null && fmVar.f34629b.C == i10) {
                            fm.a(fmVar, ffVar);
                        }
                    }
                    cm cmVar = gmVar.f35011k;
                    if (cmVar != null && ((ArrayList) cmVar.f33636f) != null) {
                        z10 = false;
                        for (int i13 = 0; i13 < ((ArrayList) gmVar.f35011k.f33636f).size(); i13++) {
                            if (((org.telegram.messenger.ff) ((ArrayList) gmVar.f35011k.f33636f).get(i13)).C == i10) {
                                ((ArrayList) gmVar.f35011k.f33636f).set(i13, ffVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gm.a(gmVar, gmVar.f35011k, true);
                    }
                }
            }
            hmVar.g();
            hmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f34372b.h;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        if (i7 < 0 || i7 >= this.f34371a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.f34371a.get(i7)).C);
        hm hmVar = this.f34372b;
        int indexOf = hmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (hmVar.h.size() <= 1) {
                return -1;
            }
            hmVar.h.remove(indexOf);
            hmVar.c();
            return indexOf;
        }
        hmVar.h.add(valueOf);
        hmVar.c();
        return hmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f34372b.d;
    }

    @Override
    public final boolean x(int i7) {
        if (i7 >= 0 && i7 < this.f34371a.size()) {
            return this.f34372b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.f34371a.get(i7)).C));
        }
        return false;
    }
}
