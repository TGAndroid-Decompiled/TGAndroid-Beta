package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class zm extends org.telegram.ui.av0 {
    public ArrayList f31897a = new ArrayList();
    public final dn f31898b;

    public zm(dn dnVar) {
        this.f31898b = dnVar;
    }

    @Override
    public final void D() {
        dn dnVar = this.f31898b;
        dnVar.c();
        dnVar.i(dnVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        dn dnVar = this.f31898b;
        ArrayList arrayList2 = dnVar.f24450b;
        en enVar = dnVar.P;
        if (i10 >= 0 && i10 < this.f31897a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f31897a.get(i10)) != null) {
            int size = arrayList2.size();
            cn cnVar = null;
            bn bnVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                cnVar = (cn) arrayList2.get(i11);
                if (cnVar != null && (arrayList = cnVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        bn bnVar2 = (bn) arrayList.get(i12);
                        if (bnVar2 != null && bnVar2.f23804b == photoEntry && bnVar2.f23810k > 0.5d) {
                            bnVar = (bn) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (bnVar != null) {
                        break;
                    }
                }
            }
            if (cnVar != null && bnVar != null) {
                org.telegram.ui.kv0 kv0Var = new org.telegram.ui.kv0();
                int[] iArr = new int[2];
                dnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - enVar.f27671b.getLeftInset();
                }
                kv0Var.f37752b = iArr[0];
                kv0Var.f37753c = iArr[1] + ((int) cnVar.f24118a);
                kv0Var.f37758k = 1.0f;
                kv0Var.d = dnVar;
                ImageReceiver imageReceiver = bnVar.f23805c;
                kv0Var.f37751a = imageReceiver;
                kv0Var.e = imageReceiver.getBitmapSafe();
                kv0Var.h = r5;
                RectF rectF = bnVar.f23816q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                kv0Var.f37757j = (int) (-dnVar.getY());
                kv0Var.f37756i = dnVar.getHeight() - ((int) (((-dnVar.getY()) + enVar.f24746r.getHeight()) - enVar.f27671b.n1()));
                return kv0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f31898b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        dn dnVar = this.f31898b;
        if (dnVar.h.size() <= 1 || (indexOf = dnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        dnVar.h.remove(indexOf);
        dnVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f31897a.size() || (photoEntry = (MediaController.PhotoEntry) this.f31897a.get(i10)) == null) {
            return -1;
        }
        return this.f31898b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f31897a.size() && (photoEntry = (MediaController.PhotoEntry) this.f31897a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            dn dnVar = this.f31898b;
            dnVar.invalidate();
            for (int i12 = 0; i12 < dnVar.f24450b.size(); i12++) {
                cn cnVar = (cn) dnVar.f24450b.get(i12);
                if (cnVar != null && (arrayList = cnVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        bn bnVar = (bn) arrayList.get(i13);
                        if (bnVar != null && bnVar.f23804b.imageId == i11) {
                            bn.a(bnVar, photoEntry);
                        }
                    }
                    xm xmVar = cnVar.f24125k;
                    if (xmVar != null && xmVar.f31275g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < cnVar.f24125k.f31275g.size(); i14++) {
                            if (((MediaController.PhotoEntry) cnVar.f24125k.f31275g.get(i14)).imageId == i11) {
                                cnVar.f24125k.f31275g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cn.a(cnVar, cnVar.f24125k, true);
                    }
                }
            }
            dnVar.g();
            dnVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f31898b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f31897a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f31897a.get(i10)).imageId);
        dn dnVar = this.f31898b;
        int indexOf = dnVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (dnVar.h.size() <= 1) {
                return -1;
            }
            dnVar.h.remove(indexOf);
            dnVar.c();
            return indexOf;
        }
        dnVar.h.add(valueOf);
        dnVar.c();
        return dnVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f31898b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f31897a.size()) {
            return this.f31898b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f31897a.get(i10)).imageId));
        }
        return false;
    }
}
