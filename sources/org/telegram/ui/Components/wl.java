package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class wl extends org.telegram.ui.qq0 {
    public ArrayList f40014a = new ArrayList();
    public final zl f40015b;

    public wl(zl zlVar) {
        this.f40015b = zlVar;
    }

    @Override
    public final void D() {
        zl zlVar = this.f40015b;
        zlVar.c();
        zlVar.i(zlVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        zl zlVar = this.f40015b;
        ArrayList arrayList2 = zlVar.f41054b;
        am amVar = zlVar.P;
        if (i7 >= 0 && i7 < this.f40014a.size() && x(i7) && (gfVar = (org.telegram.messenger.gf) this.f40014a.get(i7)) != null) {
            int size = arrayList2.size();
            yl ylVar = null;
            xl xlVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                ylVar = (yl) arrayList2.get(i10);
                if (ylVar != null && (arrayList = ylVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        xl xlVar2 = (xl) arrayList.get(i11);
                        if (xlVar2 != null && xlVar2.f40328b == gfVar && xlVar2.f40335k > 0.5d) {
                            xlVar = (xl) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (xlVar != null) {
                        break;
                    }
                }
            }
            if (ylVar != null && xlVar != null) {
                org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
                int[] iArr = new int[2];
                zlVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - amVar.f38656b.S();
                }
                zq0Var.f52504b = iArr[0];
                zq0Var.f52505c = iArr[1] + ((int) ylVar.f40595a);
                zq0Var.f52511k = 1.0f;
                zq0Var.d = zlVar;
                ImageReceiver imageReceiver = xlVar.f40329c;
                zq0Var.f52503a = imageReceiver;
                zq0Var.f52506e = imageReceiver.p();
                zq0Var.h = r5;
                RectF rectF = xlVar.f40341q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                zq0Var.f52510j = (int) (-zlVar.getY());
                zq0Var.f52509i = zlVar.getHeight() - ((int) (((-zlVar.getY()) + amVar.f31880r.getHeight()) - amVar.f38656b.Z0()));
                return zq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f40015b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        zl zlVar = this.f40015b;
        if (zlVar.h.size() <= 1 || (indexOf = zlVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        zlVar.h.remove(indexOf);
        zlVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i7) {
        org.telegram.messenger.gf gfVar;
        if (i7 < 0 || i7 >= this.f40014a.size() || (gfVar = (org.telegram.messenger.gf) this.f40014a.get(i7)) == null) {
            return -1;
        }
        return this.f40015b.h.indexOf(Integer.valueOf(gfVar.C));
    }

    @Override
    public final void X(int i7) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        boolean z9;
        if (i7 >= 0 && i7 < this.f40014a.size() && (gfVar = (org.telegram.messenger.gf) this.f40014a.get(i7)) != null) {
            int i10 = gfVar.C;
            zl zlVar = this.f40015b;
            zlVar.invalidate();
            for (int i11 = 0; i11 < zlVar.f41054b.size(); i11++) {
                yl ylVar = (yl) zlVar.f41054b.get(i11);
                if (ylVar != null && (arrayList = ylVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        xl xlVar = (xl) arrayList.get(i12);
                        if (xlVar != null && xlVar.f40328b.C == i10) {
                            xl.a(xlVar, gfVar);
                        }
                    }
                    ul ulVar = ylVar.f40603k;
                    if (ulVar != null && ((ArrayList) ulVar.f38708f) != null) {
                        z9 = false;
                        for (int i13 = 0; i13 < ((ArrayList) ylVar.f40603k.f38708f).size(); i13++) {
                            if (((org.telegram.messenger.gf) ((ArrayList) ylVar.f40603k.f38708f).get(i13)).C == i10) {
                                ((ArrayList) ylVar.f40603k.f38708f).set(i13, gfVar);
                                z9 = true;
                            }
                        }
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        yl.a(ylVar, ylVar.f40603k, true);
                    }
                }
            }
            zlVar.g();
            zlVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f40015b.h;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        if (i7 < 0 || i7 >= this.f40014a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) this.f40014a.get(i7)).C);
        zl zlVar = this.f40015b;
        int indexOf = zlVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (zlVar.h.size() <= 1) {
                return -1;
            }
            zlVar.h.remove(indexOf);
            zlVar.c();
            return indexOf;
        }
        zlVar.h.add(valueOf);
        zlVar.c();
        return zlVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f40015b.d;
    }

    @Override
    public final boolean x(int i7) {
        if (i7 >= 0 && i7 < this.f40014a.size()) {
            return this.f40015b.h.contains(Integer.valueOf(((org.telegram.messenger.gf) this.f40014a.get(i7)).C));
        }
        return false;
    }
}
