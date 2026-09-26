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
public final class mm extends org.telegram.ui.lu0 {
    public ArrayList f26539a = new ArrayList();
    public final qm f26540b;

    public mm(qm qmVar) {
        this.f26540b = qmVar;
    }

    @Override
    public final void D() {
        qm qmVar = this.f26540b;
        qmVar.c();
        qmVar.i(qmVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        qm qmVar = this.f26540b;
        ArrayList arrayList2 = qmVar.f27703b;
        rm rmVar = qmVar.P;
        if (i10 >= 0 && i10 < this.f26539a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f26539a.get(i10)) != null) {
            int size = arrayList2.size();
            pm pmVar = null;
            om omVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                pmVar = (pm) arrayList2.get(i11);
                if (pmVar != null && (arrayList = pmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        om omVar2 = (om) arrayList.get(i12);
                        if (omVar2 != null && omVar2.f27119b == photoEntry && omVar2.f27125k > 0.5d) {
                            omVar = (om) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (omVar != null) {
                        break;
                    }
                }
            }
            if (pmVar != null && omVar != null) {
                org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                int[] iArr = new int[2];
                qmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - rmVar.f27087b.getLeftInset();
                }
                vu0Var.f38820b = iArr[0];
                vu0Var.f38821c = iArr[1] + ((int) pmVar.f27383a);
                vu0Var.f38826k = 1.0f;
                vu0Var.d = qmVar;
                ImageReceiver imageReceiver = omVar.f27120c;
                vu0Var.f38819a = imageReceiver;
                vu0Var.e = imageReceiver.getBitmapSafe();
                vu0Var.h = r5;
                RectF rectF = omVar.f27131q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                vu0Var.f38825j = (int) (-qmVar.getY());
                vu0Var.f38824i = qmVar.getHeight() - ((int) (((-qmVar.getY()) + rmVar.f28000r.getHeight()) - rmVar.f27087b.l1()));
                return vu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f26540b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        qm qmVar = this.f26540b;
        if (qmVar.h.size() <= 1 || (indexOf = qmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        qmVar.h.remove(indexOf);
        qmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f26539a.size() || (photoEntry = (MediaController.PhotoEntry) this.f26539a.get(i10)) == null) {
            return -1;
        }
        return this.f26540b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f26539a.size() && (photoEntry = (MediaController.PhotoEntry) this.f26539a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            qm qmVar = this.f26540b;
            qmVar.invalidate();
            for (int i12 = 0; i12 < qmVar.f27703b.size(); i12++) {
                pm pmVar = (pm) qmVar.f27703b.get(i12);
                if (pmVar != null && (arrayList = pmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        om omVar = (om) arrayList.get(i13);
                        if (omVar != null && omVar.f27119b.imageId == i11) {
                            om.a(omVar, photoEntry);
                        }
                    }
                    km kmVar = pmVar.f27390k;
                    if (kmVar != null && kmVar.f25818g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < pmVar.f27390k.f25818g.size(); i14++) {
                            if (((MediaController.PhotoEntry) pmVar.f27390k.f25818g.get(i14)).imageId == i11) {
                                pmVar.f27390k.f25818g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        pm.a(pmVar, pmVar.f27390k, true);
                    }
                }
            }
            qmVar.g();
            qmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f26540b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f26539a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f26539a.get(i10)).imageId);
        qm qmVar = this.f26540b;
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
        return this.f26540b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f26539a.size()) {
            return this.f26540b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f26539a.get(i10)).imageId));
        }
        return false;
    }
}
