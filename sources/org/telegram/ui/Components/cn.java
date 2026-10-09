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
public final class cn extends org.telegram.ui.uu0 {
    public ArrayList f25440a = new ArrayList();
    public final gn f25441b;

    public cn(gn gnVar) {
        this.f25441b = gnVar;
    }

    @Override
    public final void D() {
        gn gnVar = this.f25441b;
        gnVar.c();
        gnVar.i(gnVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        gn gnVar = this.f25441b;
        ArrayList arrayList2 = gnVar.f26805b;
        hn hnVar = gnVar.P;
        if (i10 >= 0 && i10 < this.f25440a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f25440a.get(i10)) != null) {
            int size = arrayList2.size();
            fn fnVar = null;
            en enVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                fnVar = (fn) arrayList2.get(i11);
                if (fnVar != null && (arrayList = fnVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        en enVar2 = (en) arrayList.get(i12);
                        if (enVar2 != null && enVar2.f26114b == photoEntry && enVar2.f26121k > 0.5d) {
                            enVar = (en) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (enVar != null) {
                        break;
                    }
                }
            }
            if (fnVar != null && enVar != null) {
                org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                int[] iArr = new int[2];
                gnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - hnVar.f30173b.getLeftInset();
                }
                ev0Var.f37355b = iArr[0];
                ev0Var.f37356c = iArr[1] + ((int) fnVar.f26409a);
                ev0Var.f37362k = 1.0f;
                ev0Var.d = gnVar;
                ImageReceiver imageReceiver = enVar.f26115c;
                ev0Var.f37354a = imageReceiver;
                ev0Var.f37357e = imageReceiver.getBitmapSafe();
                ev0Var.h = r5;
                RectF rectF = enVar.f26127q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                ev0Var.f37361j = (int) (-gnVar.getY());
                ev0Var.f37360i = gnVar.getHeight() - ((int) (((-gnVar.getY()) + hnVar.f27090r.getHeight()) - hnVar.f30173b.n1()));
                return ev0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f25441b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        gn gnVar = this.f25441b;
        if (gnVar.h.size() <= 1 || (indexOf = gnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        gnVar.h.remove(indexOf);
        gnVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f25440a.size() || (photoEntry = (MediaController.PhotoEntry) this.f25440a.get(i10)) == null) {
            return -1;
        }
        return this.f25441b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f25440a.size() && (photoEntry = (MediaController.PhotoEntry) this.f25440a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            gn gnVar = this.f25441b;
            gnVar.invalidate();
            for (int i12 = 0; i12 < gnVar.f26805b.size(); i12++) {
                fn fnVar = (fn) gnVar.f26805b.get(i12);
                if (fnVar != null && (arrayList = fnVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        en enVar = (en) arrayList.get(i13);
                        if (enVar != null && enVar.f26114b.imageId == i11) {
                            en.a(enVar, photoEntry);
                        }
                    }
                    an anVar = fnVar.f26417k;
                    if (anVar != null && anVar.f24717g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < fnVar.f26417k.f24717g.size(); i14++) {
                            if (((MediaController.PhotoEntry) fnVar.f26417k.f24717g.get(i14)).imageId == i11) {
                                fnVar.f26417k.f24717g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fn.a(fnVar, fnVar.f26417k, true);
                    }
                }
            }
            gnVar.g();
            gnVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f25441b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f25440a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f25440a.get(i10)).imageId);
        gn gnVar = this.f25441b;
        int indexOf = gnVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (gnVar.h.size() <= 1) {
                return -1;
            }
            gnVar.h.remove(indexOf);
            gnVar.c();
            return indexOf;
        }
        gnVar.h.add(valueOf);
        gnVar.c();
        return gnVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f25441b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f25440a.size()) {
            return this.f25441b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f25440a.get(i10)).imageId));
        }
        return false;
    }
}
