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
    public ArrayList f28245a = new ArrayList();
    public final pm f28246b;

    public lm(pm pmVar) {
        this.f28246b = pmVar;
    }

    @Override
    public final void D() {
        pm pmVar = this.f28246b;
        pmVar.c();
        pmVar.i(pmVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        pm pmVar = this.f28246b;
        ArrayList arrayList2 = pmVar.f29427b;
        qm qmVar = pmVar.P;
        if (i10 >= 0 && i10 < this.f28245a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f28245a.get(i10)) != null) {
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
                        if (nmVar2 != null && nmVar2.f28792b == photoEntry && nmVar2.f28799k > 0.5d) {
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
                    iArr[0] = iArr[0] - qmVar.f28753b.getLeftInset();
                }
                cv0Var.f35541b = iArr[0];
                cv0Var.f35542c = iArr[1] + ((int) omVar.f29109a);
                cv0Var.f35548k = 1.0f;
                cv0Var.d = pmVar;
                ImageReceiver imageReceiver = nmVar.f28793c;
                cv0Var.f35540a = imageReceiver;
                cv0Var.f35543e = imageReceiver.getBitmapSafe();
                cv0Var.h = r5;
                RectF rectF = nmVar.f28805q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                cv0Var.f35547j = (int) (-pmVar.getY());
                cv0Var.f35546i = pmVar.getHeight() - ((int) (((-pmVar.getY()) + qmVar.f29769r.getHeight()) - qmVar.f28753b.l1()));
                return cv0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f28246b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        pm pmVar = this.f28246b;
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
        if (i10 < 0 || i10 >= this.f28245a.size() || (photoEntry = (MediaController.PhotoEntry) this.f28245a.get(i10)) == null) {
            return -1;
        }
        return this.f28246b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f28245a.size() && (photoEntry = (MediaController.PhotoEntry) this.f28245a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            pm pmVar = this.f28246b;
            pmVar.invalidate();
            for (int i12 = 0; i12 < pmVar.f29427b.size(); i12++) {
                om omVar = (om) pmVar.f29427b.get(i12);
                if (omVar != null && (arrayList = omVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        nm nmVar = (nm) arrayList.get(i13);
                        if (nmVar != null && nmVar.f28792b.imageId == i11) {
                            nm.a(nmVar, photoEntry);
                        }
                    }
                    jm jmVar = omVar.f29117k;
                    if (jmVar != null && jmVar.f27538g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < omVar.f29117k.f27538g.size(); i14++) {
                            if (((MediaController.PhotoEntry) omVar.f29117k.f27538g.get(i14)).imageId == i11) {
                                omVar.f29117k.f27538g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        om.a(omVar, omVar.f29117k, true);
                    }
                }
            }
            pmVar.g();
            pmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f28246b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f28245a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f28245a.get(i10)).imageId);
        pm pmVar = this.f28246b;
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
        return this.f28246b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f28245a.size()) {
            return this.f28246b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f28245a.get(i10)).imageId));
        }
        return false;
    }
}
