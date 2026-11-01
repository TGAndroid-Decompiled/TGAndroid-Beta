package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class fm extends org.telegram.ui.xr0 {
    public ArrayList f26190a = new ArrayList();
    public final im f26191b;

    public fm(im imVar) {
        this.f26191b = imVar;
    }

    @Override
    public final void D() {
        im imVar = this.f26191b;
        imVar.c();
        imVar.i(imVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        im imVar = this.f26191b;
        ArrayList arrayList2 = imVar.f27117b;
        jm jmVar = imVar.P;
        if (i10 >= 0 && i10 < this.f26190a.size() && x(i10) && (ffVar = (org.telegram.messenger.ff) this.f26190a.get(i10)) != null) {
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
                        if (gmVar2 != null && gmVar2.f26477b == ffVar && gmVar2.f26483k > 0.5d) {
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
                org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
                int[] iArr = new int[2];
                imVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - jmVar.f30964b.T();
                }
                fs0Var.f37216b = iArr[0];
                fs0Var.f37217c = iArr[1] + ((int) hmVar.f26836a);
                fs0Var.f37222k = 1.0f;
                fs0Var.d = imVar;
                ImageReceiver imageReceiver = gmVar.f26478c;
                fs0Var.f37215a = imageReceiver;
                fs0Var.e = imageReceiver.p();
                fs0Var.h = r5;
                RectF rectF = gmVar.f26489q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                fs0Var.f37221j = (int) (-imVar.getY());
                fs0Var.f37220i = imVar.getHeight() - ((int) (((-imVar.getY()) + jmVar.f27455r.getHeight()) - jmVar.f30964b.Y0()));
                return fs0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f26191b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        im imVar = this.f26191b;
        if (imVar.h.size() <= 1 || (indexOf = imVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        imVar.h.remove(indexOf);
        imVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        org.telegram.messenger.ff ffVar;
        if (i10 < 0 || i10 >= this.f26190a.size() || (ffVar = (org.telegram.messenger.ff) this.f26190a.get(i10)) == null) {
            return -1;
        }
        return this.f26191b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override
    public final void X(int i10) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f26190a.size() && (ffVar = (org.telegram.messenger.ff) this.f26190a.get(i10)) != null) {
            int i11 = ffVar.C;
            im imVar = this.f26191b;
            imVar.invalidate();
            for (int i12 = 0; i12 < imVar.f27117b.size(); i12++) {
                hm hmVar = (hm) imVar.f27117b.get(i12);
                if (hmVar != null && (arrayList = hmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        gm gmVar = (gm) arrayList.get(i13);
                        if (gmVar != null && gmVar.f26477b.C == i11) {
                            gm.a(gmVar, ffVar);
                        }
                    }
                    dm dmVar = hmVar.f26843k;
                    if (dmVar != null && ((ArrayList) dmVar.f25515f) != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < ((ArrayList) hmVar.f26843k.f25515f).size(); i14++) {
                            if (((org.telegram.messenger.ff) ((ArrayList) hmVar.f26843k.f25515f).get(i14)).C == i11) {
                                ((ArrayList) hmVar.f26843k.f25515f).set(i14, ffVar);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        hm.a(hmVar, hmVar.f26843k, true);
                    }
                }
            }
            imVar.g();
            imVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f26191b.h;
    }

    @Override
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        if (i10 < 0 || i10 >= this.f26190a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.f26190a.get(i10)).C);
        im imVar = this.f26191b;
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
        return this.f26191b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f26190a.size()) {
            return this.f26191b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.f26190a.get(i10)).C));
        }
        return false;
    }
}
