package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class nm extends org.telegram.ui.oq0 {
    public ArrayList f37900a = new ArrayList();
    public final qm f37901b;

    public nm(qm qmVar) {
        this.f37901b = qmVar;
    }

    @Override
    public final void D() {
        qm qmVar = this.f37901b;
        qmVar.c();
        qmVar.i(qmVar.Q.Q, false);
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        qm qmVar = this.f37901b;
        ArrayList arrayList2 = qmVar.f38944b;
        rm rmVar = qmVar.Q;
        if (i7 >= 0 && i7 < this.f37900a.size() && x(i7) && (ffVar = (org.telegram.messenger.ff) this.f37900a.get(i7)) != null) {
            int size = arrayList2.size();
            pm pmVar = null;
            om omVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                pmVar = (pm) arrayList2.get(i10);
                if (pmVar != null && (arrayList = pmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        om omVar2 = (om) arrayList.get(i11);
                        if (omVar2 != null && omVar2.f38286b == ffVar && omVar2.f38293k > 0.5d) {
                            omVar = (om) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (omVar != null) {
                        break;
                    }
                }
            }
            if (pmVar != null && omVar != null) {
                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                int[] iArr = new int[2];
                qmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - rmVar.f37519b.T();
                }
                wq0Var.f53498b = iArr[0];
                wq0Var.f53499c = iArr[1] + ((int) pmVar.f38614a);
                wq0Var.f53505k = 1.0f;
                wq0Var.d = qmVar;
                ImageReceiver imageReceiver = omVar.f38287c;
                wq0Var.f53497a = imageReceiver;
                wq0Var.f53500e = imageReceiver.p();
                wq0Var.h = r5;
                RectF rectF = omVar.f38299q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                wq0Var.f53504j = (int) (-qmVar.getY());
                wq0Var.f53503i = qmVar.getHeight() - ((int) (((-qmVar.getY()) + rmVar.f39280r.getHeight()) - rmVar.f37519b.a1()));
                return wq0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f37901b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        qm qmVar = this.f37901b;
        if (qmVar.h.size() <= 1 || (indexOf = qmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        qmVar.h.remove(indexOf);
        qmVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i7) {
        org.telegram.messenger.ff ffVar;
        if (i7 < 0 || i7 >= this.f37900a.size() || (ffVar = (org.telegram.messenger.ff) this.f37900a.get(i7)) == null) {
            return -1;
        }
        return this.f37901b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override
    public final void X(int i7) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 >= 0 && i7 < this.f37900a.size() && (ffVar = (org.telegram.messenger.ff) this.f37900a.get(i7)) != null) {
            int i10 = ffVar.C;
            qm qmVar = this.f37901b;
            qmVar.invalidate();
            for (int i11 = 0; i11 < qmVar.f38944b.size(); i11++) {
                pm pmVar = (pm) qmVar.f38944b.get(i11);
                if (pmVar != null && (arrayList = pmVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        om omVar = (om) arrayList.get(i12);
                        if (omVar != null && omVar.f38286b.C == i10) {
                            om.a(omVar, ffVar);
                        }
                    }
                    lm lmVar = pmVar.f38622k;
                    if (lmVar != null && ((ArrayList) lmVar.f37241f) != null) {
                        z10 = false;
                        for (int i13 = 0; i13 < ((ArrayList) pmVar.f38622k.f37241f).size(); i13++) {
                            if (((org.telegram.messenger.ff) ((ArrayList) pmVar.f38622k.f37241f).get(i13)).C == i10) {
                                ((ArrayList) pmVar.f38622k.f37241f).set(i13, ffVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        pm.a(pmVar, pmVar.f38622k, true);
                    }
                }
            }
            qmVar.g();
            qmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f37901b.h;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        if (i7 < 0 || i7 >= this.f37900a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.f37900a.get(i7)).C);
        qm qmVar = this.f37901b;
        int indexOf = qmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (qmVar.h.size() <= 1) {
                return -1;
            }
            qmVar.h.remove(indexOf);
            qmVar.c();
            return indexOf;
        }
        qmVar.h.add(valueOf);
        qmVar.c();
        return qmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f37901b.d;
    }

    @Override
    public final boolean x(int i7) {
        if (i7 >= 0 && i7 < this.f37900a.size()) {
            return this.f37901b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.f37900a.get(i7)).C));
        }
        return false;
    }
}
