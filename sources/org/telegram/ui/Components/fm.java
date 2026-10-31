package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fm extends org.telegram.ui.yr0 {
    public ArrayList f26103a = new ArrayList();
    public final im f26104b;

    public fm(im imVar) {
        this.f26104b = imVar;
    }

    @Override
    public final void D() {
        im imVar = this.f26104b;
        imVar.c();
        imVar.i(imVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        im imVar = this.f26104b;
        ArrayList arrayList2 = imVar.f27009b;
        jm jmVar = imVar.P;
        if (i10 >= 0 && i10 < this.f26103a.size() && x(i10) && (efVar = (org.telegram.messenger.ef) this.f26103a.get(i10)) != null) {
            int size = arrayList2.size();
            hm hmVar = null;
            gm gmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                hmVar = (hm) arrayList2.get(i11);
                if (hmVar != null && (arrayList = hmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        gm gmVar2 = (gm) arrayList.get(i12);
                        if (gmVar2 != null && gmVar2.f26416b == efVar && gmVar2.f26422k > 0.5d) {
                            gmVar = (gm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (gmVar != null) {
                        break;
                    }
                }
            }
            if (hmVar != null && gmVar != null) {
                org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                int[] iArr = new int[2];
                imVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - jmVar.f30947b.T();
                }
                gs0Var.f37628b = iArr[0];
                gs0Var.f37629c = iArr[1] + ((int) hmVar.f26758a);
                gs0Var.f37634k = 1.0f;
                gs0Var.d = imVar;
                ImageReceiver imageReceiver = gmVar.f26417c;
                gs0Var.f37627a = imageReceiver;
                gs0Var.e = imageReceiver.p();
                gs0Var.h = r5;
                RectF rectF = gmVar.f26428q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                gs0Var.f37633j = (int) (-imVar.getY());
                gs0Var.f37632i = imVar.getHeight() - ((int) (((-imVar.getY()) + jmVar.f27402r.getHeight()) - jmVar.f30947b.Y0()));
                return gs0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f26104b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        im imVar = this.f26104b;
        if (imVar.h.size() <= 1 || (indexOf = imVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        imVar.h.remove(indexOf);
        imVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        org.telegram.messenger.ef efVar;
        if (i10 < 0 || i10 >= this.f26103a.size() || (efVar = (org.telegram.messenger.ef) this.f26103a.get(i10)) == null) {
            return -1;
        }
        return this.f26104b.h.indexOf(Integer.valueOf(efVar.C));
    }

    @Override
    public final void X(int i10) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f26103a.size() && (efVar = (org.telegram.messenger.ef) this.f26103a.get(i10)) != null) {
            int i11 = efVar.C;
            im imVar = this.f26104b;
            imVar.invalidate();
            for (int i12 = 0; i12 < imVar.f27009b.size(); i12++) {
                hm hmVar = (hm) imVar.f27009b.get(i12);
                if (hmVar != null && (arrayList = hmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        gm gmVar = (gm) arrayList.get(i13);
                        if (gmVar != null && gmVar.f26416b.C == i11) {
                            gm.a(gmVar, efVar);
                        }
                    }
                    dm dmVar = hmVar.f26765k;
                    if (dmVar != null && ((ArrayList) dmVar.f25466f) != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < ((ArrayList) hmVar.f26765k.f25466f).size(); i14++) {
                            if (((org.telegram.messenger.ef) ((ArrayList) hmVar.f26765k.f25466f).get(i14)).C == i11) {
                                ((ArrayList) hmVar.f26765k.f25466f).set(i14, efVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        hm.a(hmVar, hmVar.f26765k, true);
                    }
                }
            }
            imVar.g();
            imVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f26104b.h;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        if (i10 < 0 || i10 >= this.f26103a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) this.f26103a.get(i10)).C);
        im imVar = this.f26104b;
        int indexOf = imVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (imVar.h.size() <= 1) {
                return -1;
            }
            imVar.h.remove(indexOf);
            imVar.c();
            return indexOf;
        }
        imVar.h.add(valueOf);
        imVar.c();
        return imVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f26104b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f26103a.size()) {
            return this.f26104b.h.contains(Integer.valueOf(((org.telegram.messenger.ef) this.f26103a.get(i10)).C));
        }
        return false;
    }
}
