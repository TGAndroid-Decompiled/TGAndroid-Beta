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
public final class lm extends org.telegram.ui.au0 {
    public ArrayList f28769a = new ArrayList();
    public final pm f28770b;

    public lm(pm pmVar) {
        this.f28770b = pmVar;
    }

    @Override
    public final void D() {
        pm pmVar = this.f28770b;
        pmVar.c();
        pmVar.i(pmVar.M.M, false);
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        pm pmVar = this.f28770b;
        ArrayList arrayList2 = pmVar.f30115b;
        qm qmVar = pmVar.M;
        if (i10 >= 0 && i10 < this.f28769a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f28769a.get(i10)) != null) {
            int size = arrayList2.size();
            om omVar = null;
            nm nmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                omVar = (om) arrayList2.get(i11);
                if (omVar != null && (arrayList = omVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        nm nmVar2 = (nm) arrayList.get(i12);
                        if (nmVar2 != null && nmVar2.f29542b == photoEntry && nmVar2.f29549k > 0.5d) {
                            nmVar = (nm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (nmVar != null) {
                        break;
                    }
                }
            }
            if (omVar != null && nmVar != null) {
                org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                int[] iArr = new int[2];
                pmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - qmVar.f26546b.getLeftInset();
                }
                lu0Var.f38865b = iArr[0];
                lu0Var.f38866c = iArr[1] + ((int) omVar.f29798a);
                lu0Var.f38872k = 1.0f;
                lu0Var.d = pmVar;
                ImageReceiver imageReceiver = nmVar.f29543c;
                lu0Var.f38864a = imageReceiver;
                lu0Var.f38867e = imageReceiver.getBitmapSafe();
                lu0Var.h = r5;
                RectF rectF = nmVar.f29555q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                lu0Var.f38871j = (int) (-pmVar.getY());
                lu0Var.f38870i = pmVar.getHeight() - ((int) (((-pmVar.getY()) + qmVar.f30416r.getHeight()) - qmVar.f26546b.l1()));
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f28770b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        pm pmVar = this.f28770b;
        if (pmVar.h.size() <= 1 || (indexOf = pmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        pmVar.h.remove(indexOf);
        pmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f28769a.size() || (photoEntry = (MediaController.PhotoEntry) this.f28769a.get(i10)) == null) {
            return -1;
        }
        return this.f28770b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 >= 0 && i10 < this.f28769a.size() && (photoEntry = (MediaController.PhotoEntry) this.f28769a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            pm pmVar = this.f28770b;
            pmVar.invalidate();
            for (int i12 = 0; i12 < pmVar.f30115b.size(); i12++) {
                om omVar = (om) pmVar.f30115b.get(i12);
                if (omVar != null && (arrayList = omVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        nm nmVar = (nm) arrayList.get(i13);
                        if (nmVar != null && nmVar.f29542b.imageId == i11) {
                            nm.a(nmVar, photoEntry);
                        }
                    }
                    im imVar = omVar.f29806k;
                    if (imVar != null && imVar.f27860g != null) {
                        z4 = false;
                        for (int i14 = 0; i14 < omVar.f29806k.f27860g.size(); i14++) {
                            if (((MediaController.PhotoEntry) omVar.f29806k.f27860g.get(i14)).imageId == i11) {
                                omVar.f29806k.f27860g.set(i14, photoEntry);
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        om.a(omVar, omVar.f29806k, true);
                    }
                }
            }
            pmVar.g();
            pmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f28770b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f28769a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f28769a.get(i10)).imageId);
        pm pmVar = this.f28770b;
        int indexOf = pmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (pmVar.h.size() <= 1) {
                return -1;
            }
            pmVar.h.remove(indexOf);
            pmVar.c();
            return indexOf;
        }
        pmVar.h.add(valueOf);
        pmVar.c();
        return pmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f28770b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f28769a.size()) {
            return this.f28770b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f28769a.get(i10)).imageId));
        }
        return false;
    }
}
