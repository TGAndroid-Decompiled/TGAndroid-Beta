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
public final class cm extends org.telegram.ui.rt0 {
    public ArrayList f27511a = new ArrayList();
    public final gm f27512b;

    public cm(gm gmVar) {
        this.f27512b = gmVar;
    }

    @Override
    public final void D() {
        gm gmVar = this.f27512b;
        gmVar.c();
        gmVar.i(gmVar.L.L, false);
    }

    @Override
    public final org.telegram.ui.bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        gm gmVar = this.f27512b;
        ArrayList arrayList2 = gmVar.f28798b;
        hm hmVar = gmVar.L;
        if (i9 >= 0 && i9 < this.f27511a.size() && x(i9) && (photoEntry = (MediaController.PhotoEntry) this.f27511a.get(i9)) != null) {
            int size = arrayList2.size();
            fm fmVar = null;
            em emVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                fmVar = (fm) arrayList2.get(i10);
                if (fmVar != null && (arrayList = fmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        em emVar2 = (em) arrayList.get(i11);
                        if (emVar2 != null && emVar2.f28063b == photoEntry && emVar2.f28070k > 0.5d) {
                            emVar = (em) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (emVar != null) {
                        break;
                    }
                }
            }
            if (fmVar != null && emVar != null) {
                org.telegram.ui.bu0 bu0Var = new org.telegram.ui.bu0();
                int[] iArr = new int[2];
                gmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - hmVar.f27493b.getLeftInset();
                }
                bu0Var.f36979b = iArr[0];
                bu0Var.f36980c = iArr[1] + ((int) fmVar.f28490a);
                bu0Var.f36986k = 1.0f;
                bu0Var.d = gmVar;
                ImageReceiver imageReceiver = emVar.f28064c;
                bu0Var.f36978a = imageReceiver;
                bu0Var.f36981e = imageReceiver.getBitmapSafe();
                bu0Var.h = r5;
                RectF rectF = emVar.f28076q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                bu0Var.f36985j = (int) (-gmVar.getY());
                bu0Var.f36984i = gmVar.getHeight() - ((int) (((-gmVar.getY()) + hmVar.f29124r.getHeight()) - hmVar.f27493b.l1()));
                return bu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f27512b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        gm gmVar = this.f27512b;
        if (gmVar.h.size() <= 1 || (indexOf = gmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        gmVar.h.remove(indexOf);
        gmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i9) {
        MediaController.PhotoEntry photoEntry;
        if (i9 < 0 || i9 >= this.f27511a.size() || (photoEntry = (MediaController.PhotoEntry) this.f27511a.get(i9)) == null) {
            return -1;
        }
        return this.f27512b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i9) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i9 >= 0 && i9 < this.f27511a.size() && (photoEntry = (MediaController.PhotoEntry) this.f27511a.get(i9)) != null) {
            int i10 = photoEntry.imageId;
            gm gmVar = this.f27512b;
            gmVar.invalidate();
            for (int i11 = 0; i11 < gmVar.f28798b.size(); i11++) {
                fm fmVar = (fm) gmVar.f28798b.get(i11);
                if (fmVar != null && (arrayList = fmVar.h) != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        em emVar = (em) arrayList.get(i12);
                        if (emVar != null && emVar.f28063b.imageId == i10) {
                            em.a(emVar, photoEntry);
                        }
                    }
                    am amVar = fmVar.f28498k;
                    if (amVar != null && amVar.f26867g != null) {
                        z10 = false;
                        for (int i13 = 0; i13 < fmVar.f28498k.f26867g.size(); i13++) {
                            if (((MediaController.PhotoEntry) fmVar.f28498k.f26867g.get(i13)).imageId == i10) {
                                fmVar.f28498k.f26867g.set(i13, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fm.a(fmVar, fmVar.f28498k, true);
                    }
                }
            }
            gmVar.g();
            gmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f27512b.h;
    }

    @Override
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        if (i9 < 0 || i9 >= this.f27511a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f27511a.get(i9)).imageId);
        gm gmVar = this.f27512b;
        int indexOf = gmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (gmVar.h.size() <= 1) {
                return -1;
            }
            gmVar.h.remove(indexOf);
            gmVar.c();
            return indexOf;
        }
        gmVar.h.add(valueOf);
        gmVar.c();
        return gmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f27512b.d;
    }

    @Override
    public final boolean x(int i9) {
        if (i9 >= 0 && i9 < this.f27511a.size()) {
            return this.f27512b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f27511a.get(i9)).imageId));
        }
        return false;
    }
}
