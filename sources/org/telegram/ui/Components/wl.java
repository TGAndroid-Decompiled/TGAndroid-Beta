package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class wl extends org.telegram.ui.eq0 {
    public ArrayList f40025a = new ArrayList();
    public final zl f40026b;

    public wl(zl zlVar) {
        this.f40026b = zlVar;
    }

    @Override
    public final void D() {
        zl zlVar = this.f40026b;
        zlVar.c();
        zlVar.i(zlVar.Q.Q, false);
    }

    @Override
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.messenger.ye yeVar;
        ArrayList arrayList;
        zl zlVar = this.f40026b;
        ArrayList arrayList2 = zlVar.f41063b;
        am amVar = zlVar.Q;
        if (i3 >= 0 && i3 < this.f40025a.size() && x(i3) && (yeVar = (org.telegram.messenger.ye) this.f40025a.get(i3)) != null) {
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
                        if (xlVar2 != null && xlVar2.f40390b == yeVar && xlVar2.f40397k > 0.5d) {
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
                org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                int[] iArr = new int[2];
                zlVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - amVar.f38416b.S();
                }
                mq0Var.f47752b = iArr[0];
                mq0Var.f47753c = iArr[1] + ((int) ylVar.f40761a);
                mq0Var.f47759k = 1.0f;
                mq0Var.d = zlVar;
                ImageReceiver imageReceiver = xlVar.f40391c;
                mq0Var.f47751a = imageReceiver;
                mq0Var.f47754e = imageReceiver.p();
                mq0Var.h = r5;
                RectF rectF = xlVar.f40403q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                mq0Var.f47758j = (int) (-zlVar.getY());
                mq0Var.f47757i = zlVar.getHeight() - ((int) (((-zlVar.getY()) + amVar.f31896r.getHeight()) - amVar.f38416b.Z0()));
                return mq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f40026b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ye) obj).C);
        zl zlVar = this.f40026b;
        if (zlVar.h.size() <= 1 || (indexOf = zlVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        zlVar.h.remove(indexOf);
        zlVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i3) {
        org.telegram.messenger.ye yeVar;
        if (i3 < 0 || i3 >= this.f40025a.size() || (yeVar = (org.telegram.messenger.ye) this.f40025a.get(i3)) == null) {
            return -1;
        }
        return this.f40026b.h.indexOf(Integer.valueOf(yeVar.C));
    }

    @Override
    public final void X(int i3) {
        org.telegram.messenger.ye yeVar;
        ArrayList arrayList;
        boolean z10;
        if (i3 >= 0 && i3 < this.f40025a.size() && (yeVar = (org.telegram.messenger.ye) this.f40025a.get(i3)) != null) {
            int i10 = yeVar.C;
            zl zlVar = this.f40026b;
            zlVar.invalidate();
            for (int i11 = 0; i11 < zlVar.f41063b.size(); i11++) {
                yl ylVar = (yl) zlVar.f41063b.get(i11);
                if (ylVar != null && (arrayList = ylVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        xl xlVar = (xl) arrayList.get(i12);
                        if (xlVar != null && xlVar.f40390b.C == i10) {
                            xl.a(xlVar, yeVar);
                        }
                    }
                    ul ulVar = ylVar.f40769k;
                    if (ulVar != null && ((ArrayList) ulVar.f38818f) != null) {
                        z10 = false;
                        for (int i13 = 0; i13 < ((ArrayList) ylVar.f40769k.f38818f).size(); i13++) {
                            if (((org.telegram.messenger.ye) ((ArrayList) ylVar.f40769k.f38818f).get(i13)).C == i10) {
                                ((ArrayList) ylVar.f40769k.f38818f).set(i13, yeVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        yl.a(ylVar, ylVar.f40769k, true);
                    }
                }
            }
            zlVar.g();
            zlVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f40026b.h;
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        if (i3 < 0 || i3 >= this.f40025a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ye) this.f40025a.get(i3)).C);
        zl zlVar = this.f40026b;
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
        return this.f40026b.d;
    }

    @Override
    public final boolean x(int i3) {
        if (i3 >= 0 && i3 < this.f40025a.size()) {
            return this.f40026b.h.contains(Integer.valueOf(((org.telegram.messenger.ye) this.f40025a.get(i3)).C));
        }
        return false;
    }
}
