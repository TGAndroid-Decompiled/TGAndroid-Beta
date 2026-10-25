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
public final class xm extends org.telegram.ui.gu0 {
    public ArrayList f34774a = new ArrayList();
    public final bn f34775b;

    public xm(bn bnVar) {
        this.f34775b = bnVar;
    }

    @Override
    public final void D() {
        bn bnVar = this.f34775b;
        bnVar.c();
        bnVar.i(bnVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        bn bnVar = this.f34775b;
        ArrayList arrayList2 = bnVar.f26905b;
        cn cnVar = bnVar.P;
        if (i10 >= 0 && i10 < this.f34774a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f34774a.get(i10)) != null) {
            int size = arrayList2.size();
            an anVar = null;
            zm zmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                anVar = (an) arrayList2.get(i11);
                if (anVar != null && (arrayList = anVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        zm zmVar2 = (zm) arrayList.get(i12);
                        if (zmVar2 != null && zmVar2.f35355b == photoEntry && zmVar2.f35361k > 0.5d) {
                            zmVar = (zm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (zmVar != null) {
                        break;
                    }
                }
            }
            if (anVar != null && zmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                bnVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - cnVar.f30213b.getLeftInset();
                }
                qu0Var.f42917b = iArr[0];
                qu0Var.f42918c = iArr[1] + ((int) anVar.f26554a);
                qu0Var.f42923k = 1.0f;
                qu0Var.d = bnVar;
                ImageReceiver imageReceiver = zmVar.f35356c;
                qu0Var.f42916a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.h = r5;
                RectF rectF = zmVar.f35367q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                qu0Var.f42922j = (int) (-bnVar.getY());
                qu0Var.f42921i = bnVar.getHeight() - ((int) (((-bnVar.getY()) + cnVar.f27199r.getHeight()) - cnVar.f30213b.q1()));
                return qu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f34775b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        bn bnVar = this.f34775b;
        if (bnVar.h.size() <= 1 || (indexOf = bnVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        bnVar.h.remove(indexOf);
        bnVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f34774a.size() || (photoEntry = (MediaController.PhotoEntry) this.f34774a.get(i10)) == null) {
            return -1;
        }
        return this.f34775b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f34774a.size() && (photoEntry = (MediaController.PhotoEntry) this.f34774a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            bn bnVar = this.f34775b;
            bnVar.invalidate();
            for (int i12 = 0; i12 < bnVar.f26905b.size(); i12++) {
                an anVar = (an) bnVar.f26905b.get(i12);
                if (anVar != null && (arrayList = anVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        zm zmVar = (zm) arrayList.get(i13);
                        if (zmVar != null && zmVar.f35355b.imageId == i11) {
                            zm.a(zmVar, photoEntry);
                        }
                    }
                    vm vmVar = anVar.f26561k;
                    if (vmVar != null && vmVar.f33685g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < anVar.f26561k.f33685g.size(); i14++) {
                            if (((MediaController.PhotoEntry) anVar.f26561k.f33685g.get(i14)).imageId == i11) {
                                anVar.f26561k.f33685g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        an.a(anVar, anVar.f26561k, true);
                    }
                }
            }
            bnVar.g();
            bnVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f34775b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f34774a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f34774a.get(i10)).imageId);
        bn bnVar = this.f34775b;
        int indexOf = bnVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (bnVar.h.size() <= 1) {
                return -1;
            }
            bnVar.h.remove(indexOf);
            bnVar.c();
            return indexOf;
        }
        bnVar.h.add(valueOf);
        bnVar.c();
        return bnVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f34775b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f34774a.size()) {
            return this.f34775b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f34774a.get(i10)).imageId));
        }
        return false;
    }
}
