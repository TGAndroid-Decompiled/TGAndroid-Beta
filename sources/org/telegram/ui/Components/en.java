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
public final class en extends org.telegram.ui.wu0 {
    public ArrayList f25730a = new ArrayList();
    public final in f25731b;

    public en(in inVar) {
        this.f25731b = inVar;
    }

    @Override
    public final void D() {
        in inVar = this.f25731b;
        inVar.c();
        inVar.i(inVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        in inVar = this.f25731b;
        ArrayList arrayList2 = inVar.f27233b;
        jn jnVar = inVar.P;
        if (i10 >= 0 && i10 < this.f25730a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f25730a.get(i10)) != null) {
            int size = arrayList2.size();
            hn hnVar = null;
            gn gnVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                hnVar = (hn) arrayList2.get(i11);
                if (hnVar != null && (arrayList = hnVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        gn gnVar2 = (gn) arrayList.get(i12);
                        if (gnVar2 != null && gnVar2.f26456b == photoEntry && gnVar2.f26463k > 0.5d) {
                            gnVar = (gn) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (gnVar != null) {
                        break;
                    }
                }
            }
            if (hnVar != null && gnVar != null) {
                org.telegram.ui.gv0 gv0Var = new org.telegram.ui.gv0();
                int[] iArr = new int[2];
                inVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - jnVar.f30574b.getLeftInset();
                }
                gv0Var.f38148b = iArr[0];
                gv0Var.f38149c = iArr[1] + ((int) hnVar.f26815a);
                gv0Var.f38155k = 1.0f;
                gv0Var.d = inVar;
                ImageReceiver imageReceiver = gnVar.f26457c;
                gv0Var.f38147a = imageReceiver;
                gv0Var.f38150e = imageReceiver.getBitmapSafe();
                gv0Var.h = r5;
                RectF rectF = gnVar.f26469q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                gv0Var.f38154j = (int) (-inVar.getY());
                gv0Var.f38153i = inVar.getHeight() - ((int) (((-inVar.getY()) + jnVar.f27559r.getHeight()) - jnVar.f30574b.n1()));
                return gv0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f25731b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        in inVar = this.f25731b;
        if (inVar.h.size() <= 1 || (indexOf = inVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        inVar.h.remove(indexOf);
        inVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f25730a.size() || (photoEntry = (MediaController.PhotoEntry) this.f25730a.get(i10)) == null) {
            return -1;
        }
        return this.f25731b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f25730a.size() && (photoEntry = (MediaController.PhotoEntry) this.f25730a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            in inVar = this.f25731b;
            inVar.invalidate();
            for (int i12 = 0; i12 < inVar.f27233b.size(); i12++) {
                hn hnVar = (hn) inVar.f27233b.get(i12);
                if (hnVar != null && (arrayList = hnVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        gn gnVar = (gn) arrayList.get(i13);
                        if (gnVar != null && gnVar.f26456b.imageId == i11) {
                            gn.a(gnVar, photoEntry);
                        }
                    }
                    cn cnVar = hnVar.f26823k;
                    if (cnVar != null && cnVar.f24978g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < hnVar.f26823k.f24978g.size(); i14++) {
                            if (((MediaController.PhotoEntry) hnVar.f26823k.f24978g.get(i14)).imageId == i11) {
                                hnVar.f26823k.f24978g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        hn.a(hnVar, hnVar.f26823k, true);
                    }
                }
            }
            inVar.g();
            inVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f25731b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f25730a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f25730a.get(i10)).imageId);
        in inVar = this.f25731b;
        int indexOf = inVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (inVar.h.size() <= 1) {
                return -1;
            }
            inVar.h.remove(indexOf);
            inVar.c();
            return indexOf;
        }
        inVar.h.add(valueOf);
        inVar.c();
        return inVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f25731b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f25730a.size()) {
            return this.f25731b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f25730a.get(i10)).imageId));
        }
        return false;
    }
}
