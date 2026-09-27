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
public final class nm extends org.telegram.ui.ou0 {
    public ArrayList f26856a = new ArrayList();
    public final rm f26857b;

    public nm(rm rmVar) {
        this.f26857b = rmVar;
    }

    @Override
    public final void D() {
        rm rmVar = this.f26857b;
        rmVar.c();
        rmVar.i(rmVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        rm rmVar = this.f26857b;
        ArrayList arrayList2 = rmVar.f28031b;
        sm smVar = rmVar.P;
        if (i10 >= 0 && i10 < this.f26856a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f26856a.get(i10)) != null) {
            int size = arrayList2.size();
            qm qmVar = null;
            pm pmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                qmVar = (qm) arrayList2.get(i11);
                if (qmVar != null && (arrayList = qmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        pm pmVar2 = (pm) arrayList.get(i12);
                        if (pmVar2 != null && pmVar2.f27392b == photoEntry && pmVar2.f27398k > 0.5d) {
                            pmVar = (pm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (pmVar != null) {
                        break;
                    }
                }
            }
            if (qmVar != null && pmVar != null) {
                org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                int[] iArr = new int[2];
                rmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - smVar.f27104b.getLeftInset();
                }
                yu0Var.f40326b = iArr[0];
                yu0Var.f40327c = iArr[1] + ((int) qmVar.f27782a);
                yu0Var.f40332k = 1.0f;
                yu0Var.d = rmVar;
                ImageReceiver imageReceiver = pmVar.f27393c;
                yu0Var.f40325a = imageReceiver;
                yu0Var.e = imageReceiver.getBitmapSafe();
                yu0Var.h = r5;
                RectF rectF = pmVar.f27404q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                yu0Var.f40331j = (int) (-rmVar.getY());
                yu0Var.f40330i = rmVar.getHeight() - ((int) (((-rmVar.getY()) + smVar.f28332r.getHeight()) - smVar.f27104b.j1()));
                return yu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f26857b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        rm rmVar = this.f26857b;
        if (rmVar.h.size() <= 1 || (indexOf = rmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        rmVar.h.remove(indexOf);
        rmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f26856a.size() || (photoEntry = (MediaController.PhotoEntry) this.f26856a.get(i10)) == null) {
            return -1;
        }
        return this.f26857b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f26856a.size() && (photoEntry = (MediaController.PhotoEntry) this.f26856a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            rm rmVar = this.f26857b;
            rmVar.invalidate();
            for (int i12 = 0; i12 < rmVar.f28031b.size(); i12++) {
                qm qmVar = (qm) rmVar.f28031b.get(i12);
                if (qmVar != null && (arrayList = qmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        pm pmVar = (pm) arrayList.get(i13);
                        if (pmVar != null && pmVar.f27392b.imageId == i11) {
                            pm.a(pmVar, photoEntry);
                        }
                    }
                    lm lmVar = qmVar.f27789k;
                    if (lmVar != null && lmVar.f26086g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < qmVar.f27789k.f26086g.size(); i14++) {
                            if (((MediaController.PhotoEntry) qmVar.f27789k.f26086g.get(i14)).imageId == i11) {
                                qmVar.f27789k.f26086g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        qm.a(qmVar, qmVar.f27789k, true);
                    }
                }
            }
            rmVar.g();
            rmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f26857b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f26856a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f26856a.get(i10)).imageId);
        rm rmVar = this.f26857b;
        int indexOf = rmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (rmVar.h.size() <= 1) {
                return -1;
            }
            rmVar.h.remove(indexOf);
            rmVar.c();
            return indexOf;
        }
        rmVar.h.add(valueOf);
        rmVar.c();
        return rmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f26857b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f26856a.size()) {
            return this.f26857b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f26856a.get(i10)).imageId));
        }
        return false;
    }
}
