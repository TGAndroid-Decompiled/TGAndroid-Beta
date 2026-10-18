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
public final class wm extends org.telegram.ui.bu0 {
    public ArrayList f32159a = new ArrayList();
    public final an f32160b;

    public wm(an anVar) {
        this.f32160b = anVar;
    }

    @Override
    public final void D() {
        an anVar = this.f32160b;
        anVar.c();
        anVar.i(anVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        an anVar = this.f32160b;
        ArrayList arrayList2 = anVar.f24673b;
        bn bnVar = anVar.P;
        if (i10 >= 0 && i10 < this.f32159a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f32159a.get(i10)) != null) {
            int size = arrayList2.size();
            zm zmVar = null;
            ym ymVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                zmVar = (zm) arrayList2.get(i11);
                if (zmVar != null && (arrayList = zmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        ym ymVar2 = (ym) arrayList.get(i12);
                        if (ymVar2 != null && ymVar2.f32687b == photoEntry && ymVar2.f32693k > 0.5d) {
                            ymVar = (ym) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (ymVar != null) {
                        break;
                    }
                }
            }
            if (zmVar != null && ymVar != null) {
                org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                int[] iArr = new int[2];
                anVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - bnVar.f28245b.getLeftInset();
                }
                lu0Var.f38962b = iArr[0];
                lu0Var.f38963c = iArr[1] + ((int) zmVar.f32954a);
                lu0Var.f38968k = 1.0f;
                lu0Var.d = anVar;
                ImageReceiver imageReceiver = ymVar.f32688c;
                lu0Var.f38961a = imageReceiver;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.h = r5;
                RectF rectF = ymVar.f32699q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                lu0Var.f38967j = (int) (-anVar.getY());
                lu0Var.f38966i = anVar.getHeight() - ((int) (((-anVar.getY()) + bnVar.f25016r.getHeight()) - bnVar.f28245b.n1()));
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f32160b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        an anVar = this.f32160b;
        if (anVar.h.size() <= 1 || (indexOf = anVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        anVar.h.remove(indexOf);
        anVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f32159a.size() || (photoEntry = (MediaController.PhotoEntry) this.f32159a.get(i10)) == null) {
            return -1;
        }
        return this.f32160b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f32159a.size() && (photoEntry = (MediaController.PhotoEntry) this.f32159a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            an anVar = this.f32160b;
            anVar.invalidate();
            for (int i12 = 0; i12 < anVar.f24673b.size(); i12++) {
                zm zmVar = (zm) anVar.f24673b.get(i12);
                if (zmVar != null && (arrayList = zmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        ym ymVar = (ym) arrayList.get(i13);
                        if (ymVar != null && ymVar.f32687b.imageId == i11) {
                            ym.a(ymVar, photoEntry);
                        }
                    }
                    um umVar = zmVar.f32961k;
                    if (umVar != null && umVar.f31055g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < zmVar.f32961k.f31055g.size(); i14++) {
                            if (((MediaController.PhotoEntry) zmVar.f32961k.f31055g.get(i14)).imageId == i11) {
                                zmVar.f32961k.f31055g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        zm.a(zmVar, zmVar.f32961k, true);
                    }
                }
            }
            anVar.g();
            anVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f32160b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f32159a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f32159a.get(i10)).imageId);
        an anVar = this.f32160b;
        int indexOf = anVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (anVar.h.size() <= 1) {
                return -1;
            }
            anVar.h.remove(indexOf);
            anVar.c();
            return indexOf;
        }
        anVar.h.add(valueOf);
        anVar.c();
        return anVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f32160b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f32159a.size()) {
            return this.f32160b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f32159a.get(i10)).imageId));
        }
        return false;
    }
}
