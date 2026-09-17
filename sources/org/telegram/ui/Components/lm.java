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
public final class lm extends org.telegram.ui.su0 {
    public ArrayList f28246a = new ArrayList();
    public final pm f28247b;

    public lm(pm pmVar) {
        this.f28247b = pmVar;
    }

    @Override
    public final void D() {
        pm pmVar = this.f28247b;
        pmVar.c();
        pmVar.i(pmVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        pm pmVar = this.f28247b;
        ArrayList arrayList2 = pmVar.f29428b;
        qm qmVar = pmVar.P;
        if (i10 >= 0 && i10 < this.f28246a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f28246a.get(i10)) != null) {
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
                        if (nmVar2 != null && nmVar2.f28793b == photoEntry && nmVar2.f28800k > 0.5d) {
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
                org.telegram.ui.cv0 cv0Var = new org.telegram.ui.cv0();
                int[] iArr = new int[2];
                pmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - qmVar.f28754b.getLeftInset();
                }
                cv0Var.f35542b = iArr[0];
                cv0Var.f35543c = iArr[1] + ((int) omVar.f29110a);
                cv0Var.f35549k = 1.0f;
                cv0Var.d = pmVar;
                ImageReceiver imageReceiver = nmVar.f28794c;
                cv0Var.f35541a = imageReceiver;
                cv0Var.f35544e = imageReceiver.getBitmapSafe();
                cv0Var.h = r5;
                RectF rectF = nmVar.f28806q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                cv0Var.f35548j = (int) (-pmVar.getY());
                cv0Var.f35547i = pmVar.getHeight() - ((int) (((-pmVar.getY()) + qmVar.f29770r.getHeight()) - qmVar.f28754b.l1()));
                return cv0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f28247b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        pm pmVar = this.f28247b;
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
        if (i10 < 0 || i10 >= this.f28246a.size() || (photoEntry = (MediaController.PhotoEntry) this.f28246a.get(i10)) == null) {
            return -1;
        }
        return this.f28247b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f28246a.size() && (photoEntry = (MediaController.PhotoEntry) this.f28246a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            pm pmVar = this.f28247b;
            pmVar.invalidate();
            for (int i12 = 0; i12 < pmVar.f29428b.size(); i12++) {
                om omVar = (om) pmVar.f29428b.get(i12);
                if (omVar != null && (arrayList = omVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        nm nmVar = (nm) arrayList.get(i13);
                        if (nmVar != null && nmVar.f28793b.imageId == i11) {
                            nm.a(nmVar, photoEntry);
                        }
                    }
                    jm jmVar = omVar.f29118k;
                    if (jmVar != null && jmVar.f27539g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < omVar.f29118k.f27539g.size(); i14++) {
                            if (((MediaController.PhotoEntry) omVar.f29118k.f27539g.get(i14)).imageId == i11) {
                                omVar.f29118k.f27539g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        om.a(omVar, omVar.f29118k, true);
                    }
                }
            }
            pmVar.g();
            pmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f28247b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f28246a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f28246a.get(i10)).imageId);
        pm pmVar = this.f28247b;
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
        return this.f28247b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f28246a.size()) {
            return this.f28247b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f28246a.get(i10)).imageId));
        }
        return false;
    }
}
