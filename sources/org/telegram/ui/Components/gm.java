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
public final class gm extends org.telegram.ui.pt0 {
    public ArrayList f28916a = new ArrayList();
    public final km f28917b;

    public gm(km kmVar) {
        this.f28917b = kmVar;
    }

    @Override
    public final void D() {
        km kmVar = this.f28917b;
        kmVar.c();
        kmVar.i(kmVar.L.L, false);
    }

    @Override
    public final org.telegram.ui.zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        km kmVar = this.f28917b;
        ArrayList arrayList2 = kmVar.f30097b;
        lm lmVar = kmVar.L;
        if (i10 >= 0 && i10 < this.f28916a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f28916a.get(i10)) != null) {
            int size = arrayList2.size();
            jm jmVar = null;
            im imVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                jmVar = (jm) arrayList2.get(i11);
                if (jmVar != null && (arrayList = jmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        im imVar2 = (im) arrayList.get(i12);
                        if (imVar2 != null && imVar2.f29409b == photoEntry && imVar2.f29416k > 0.5d) {
                            imVar = (im) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (imVar != null) {
                        break;
                    }
                }
            }
            if (jmVar != null && imVar != null) {
                org.telegram.ui.zt0 zt0Var = new org.telegram.ui.zt0();
                int[] iArr = new int[2];
                kmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - lmVar.f28403b.getLeftInset();
                }
                zt0Var.f45317b = iArr[0];
                zt0Var.f45318c = iArr[1] + ((int) jmVar.f29738a);
                zt0Var.f45324k = 1.0f;
                zt0Var.d = kmVar;
                ImageReceiver imageReceiver = imVar.f29410c;
                zt0Var.f45316a = imageReceiver;
                zt0Var.f45319e = imageReceiver.getBitmapSafe();
                zt0Var.h = r5;
                RectF rectF = imVar.f29422q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                zt0Var.f45323j = (int) (-kmVar.getY());
                zt0Var.f45322i = kmVar.getHeight() - ((int) (((-kmVar.getY()) + lmVar.f30372r.getHeight()) - lmVar.f28403b.l1()));
                return zt0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f28917b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        km kmVar = this.f28917b;
        if (kmVar.h.size() <= 1 || (indexOf = kmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        kmVar.h.remove(indexOf);
        kmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f28916a.size() || (photoEntry = (MediaController.PhotoEntry) this.f28916a.get(i10)) == null) {
            return -1;
        }
        return this.f28917b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f28916a.size() && (photoEntry = (MediaController.PhotoEntry) this.f28916a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            km kmVar = this.f28917b;
            kmVar.invalidate();
            for (int i12 = 0; i12 < kmVar.f30097b.size(); i12++) {
                jm jmVar = (jm) kmVar.f30097b.get(i12);
                if (jmVar != null && (arrayList = jmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        im imVar = (im) arrayList.get(i13);
                        if (imVar != null && imVar.f29409b.imageId == i11) {
                            im.a(imVar, photoEntry);
                        }
                    }
                    em emVar = jmVar.f29746k;
                    if (emVar != null && emVar.f28112g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < jmVar.f29746k.f28112g.size(); i14++) {
                            if (((MediaController.PhotoEntry) jmVar.f29746k.f28112g.get(i14)).imageId == i11) {
                                jmVar.f29746k.f28112g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        jm.a(jmVar, jmVar.f29746k, true);
                    }
                }
            }
            kmVar.g();
            kmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f28917b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f28916a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f28916a.get(i10)).imageId);
        km kmVar = this.f28917b;
        int indexOf = kmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (kmVar.h.size() <= 1) {
                return -1;
            }
            kmVar.h.remove(indexOf);
            kmVar.c();
            return indexOf;
        }
        kmVar.h.add(valueOf);
        kmVar.c();
        return kmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f28917b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f28916a.size()) {
            return this.f28917b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f28916a.get(i10)).imageId));
        }
        return false;
    }
}
