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
public final class zm extends org.telegram.ui.zu0 {
    public ArrayList f31589a = new ArrayList();
    public final dn f31590b;

    public zm(dn dnVar) {
        this.f31590b = dnVar;
    }

    @Override
    public final void D() {
        dn dnVar = this.f31590b;
        dnVar.c();
        dnVar.i(dnVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        dn dnVar = this.f31590b;
        ArrayList arrayList2 = dnVar.f24143b;
        en enVar = dnVar.P;
        if (i10 >= 0 && i10 < this.f31589a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f31589a.get(i10)) != null) {
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
                        if (bnVar2 != null && bnVar2.f23497b == photoEntry && bnVar2.f23503k > 0.5d) {
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
                org.telegram.ui.jv0 jv0Var = new org.telegram.ui.jv0();
                int[] iArr = new int[2];
                dnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - enVar.f27360b.getLeftInset();
                }
                jv0Var.f37146b = iArr[0];
                jv0Var.f37147c = iArr[1] + ((int) cnVar.f23805a);
                jv0Var.f37152k = 1.0f;
                jv0Var.d = dnVar;
                ImageReceiver imageReceiver = bnVar.f23498c;
                jv0Var.f37145a = imageReceiver;
                jv0Var.e = imageReceiver.getBitmapSafe();
                jv0Var.h = r5;
                RectF rectF = bnVar.f23509q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                jv0Var.f37151j = (int) (-dnVar.getY());
                jv0Var.f37150i = dnVar.getHeight() - ((int) (((-dnVar.getY()) + enVar.f24433r.getHeight()) - enVar.f27360b.n1()));
                return jv0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f31590b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        dn dnVar = this.f31590b;
        if (dnVar.h.size() <= 1 || (indexOf = dnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        dnVar.h.remove(indexOf);
        dnVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f31589a.size() || (photoEntry = (MediaController.PhotoEntry) this.f31589a.get(i10)) == null) {
            return -1;
        }
        return this.f31590b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f31589a.size() && (photoEntry = (MediaController.PhotoEntry) this.f31589a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            dn dnVar = this.f31590b;
            dnVar.invalidate();
            for (int i12 = 0; i12 < dnVar.f24143b.size(); i12++) {
                cn cnVar = (cn) dnVar.f24143b.get(i12);
                if (cnVar != null && (arrayList = cnVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        bn bnVar = (bn) arrayList.get(i13);
                        if (bnVar != null && bnVar.f23497b.imageId == i11) {
                            bn.a(bnVar, photoEntry);
                        }
                    }
                    xm xmVar = cnVar.f23812k;
                    if (xmVar != null && xmVar.f30952g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < cnVar.f23812k.f30952g.size(); i14++) {
                            if (((MediaController.PhotoEntry) cnVar.f23812k.f30952g.get(i14)).imageId == i11) {
                                cnVar.f23812k.f30952g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        cn.a(cnVar, cnVar.f23812k, true);
                    }
                }
            }
            dnVar.g();
            dnVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f31590b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f31589a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f31589a.get(i10)).imageId);
        dn dnVar = this.f31590b;
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
        return this.f31590b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f31589a.size()) {
            return this.f31590b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f31589a.get(i10)).imageId));
        }
        return false;
    }
}
