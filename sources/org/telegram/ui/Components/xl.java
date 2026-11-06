package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xl extends org.telegram.ui.mq0 {
    public ArrayList f40280a = new ArrayList();
    public final am f40281b;

    public xl(am amVar) {
        this.f40281b = amVar;
    }

    @Override
    public final void D() {
        am amVar = this.f40281b;
        amVar.c();
        amVar.i(amVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        am amVar = this.f40281b;
        ArrayList arrayList2 = amVar.f31836b;
        bm bmVar = amVar.P;
        if (i7 >= 0 && i7 < this.f40280a.size() && x(i7) && (gfVar = (org.telegram.messenger.gf) this.f40280a.get(i7)) != null) {
            int size = arrayList2.size();
            zl zlVar = null;
            yl ylVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                zlVar = (zl) arrayList2.get(i10);
                if (zlVar != null && (arrayList = zlVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        yl ylVar2 = (yl) arrayList.get(i11);
                        if (ylVar2 != null && ylVar2.f40631b == gfVar && ylVar2.f40638k > 0.5d) {
                            ylVar = (yl) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (ylVar != null) {
                        break;
                    }
                }
            }
            if (zlVar != null && ylVar != null) {
                org.telegram.ui.vq0 vq0Var = new org.telegram.ui.vq0();
                int[] iArr = new int[2];
                amVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - bmVar.f38951b.S();
                }
                vq0Var.f50791b = iArr[0];
                vq0Var.f50792c = iArr[1] + ((int) zlVar.f41005a);
                vq0Var.f50798k = 1.0f;
                vq0Var.d = amVar;
                ImageReceiver imageReceiver = ylVar.f40632c;
                vq0Var.f50790a = imageReceiver;
                vq0Var.f50793e = imageReceiver.p();
                vq0Var.h = r5;
                RectF rectF = ylVar.f40644q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                vq0Var.f50797j = (int) (-amVar.getY());
                vq0Var.f50796i = amVar.getHeight() - ((int) (((-amVar.getY()) + bmVar.f32171r.getHeight()) - bmVar.f38951b.Z0()));
                return vq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f40281b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        am amVar = this.f40281b;
        if (amVar.h.size() <= 1 || (indexOf = amVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        amVar.h.remove(indexOf);
        amVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i7) {
        org.telegram.messenger.gf gfVar;
        if (i7 < 0 || i7 >= this.f40280a.size() || (gfVar = (org.telegram.messenger.gf) this.f40280a.get(i7)) == null) {
            return -1;
        }
        return this.f40281b.h.indexOf(Integer.valueOf(gfVar.C));
    }

    @Override
    public final void X(int i7) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        boolean z9;
        if (i7 >= 0 && i7 < this.f40280a.size() && (gfVar = (org.telegram.messenger.gf) this.f40280a.get(i7)) != null) {
            int i10 = gfVar.C;
            am amVar = this.f40281b;
            amVar.invalidate();
            for (int i11 = 0; i11 < amVar.f31836b.size(); i11++) {
                zl zlVar = (zl) amVar.f31836b.get(i11);
                if (zlVar != null && (arrayList = zlVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        yl ylVar = (yl) arrayList.get(i12);
                        if (ylVar != null && ylVar.f40631b.C == i10) {
                            yl.a(ylVar, gfVar);
                        }
                    }
                    vl vlVar = zlVar.f41013k;
                    if (vlVar != null && ((ArrayList) vlVar.f38982f) != null) {
                        z9 = false;
                        for (int i13 = 0; i13 < ((ArrayList) zlVar.f41013k.f38982f).size(); i13++) {
                            if (((org.telegram.messenger.gf) ((ArrayList) zlVar.f41013k.f38982f).get(i13)).C == i10) {
                                ((ArrayList) zlVar.f41013k.f38982f).set(i13, gfVar);
                                z9 = true;
                            }
                        }
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        zl.a(zlVar, zlVar.f41013k, true);
                    }
                }
            }
            amVar.g();
            amVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f40281b.h;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        if (i7 < 0 || i7 >= this.f40280a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) this.f40280a.get(i7)).C);
        am amVar = this.f40281b;
        int indexOf = amVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (amVar.h.size() <= 1) {
                return -1;
            }
            amVar.h.remove(indexOf);
            amVar.c();
            return indexOf;
        }
        amVar.h.add(valueOf);
        amVar.c();
        return amVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f40281b.d;
    }

    @Override
    public final boolean x(int i7) {
        if (i7 >= 0 && i7 < this.f40280a.size()) {
            return this.f40281b.h.contains(Integer.valueOf(((org.telegram.messenger.gf) this.f40280a.get(i7)).C));
        }
        return false;
    }
}
