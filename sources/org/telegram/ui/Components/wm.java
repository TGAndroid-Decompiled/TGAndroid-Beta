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
public final class wm extends org.telegram.ui.zt0 {
    public ArrayList f32154a = new ArrayList();
    public final an f32155b;

    public wm(an anVar) {
        this.f32155b = anVar;
    }

    @Override
    public final void D() {
        an anVar = this.f32155b;
        anVar.c();
        anVar.i(anVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        an anVar = this.f32155b;
        ArrayList arrayList2 = anVar.f24675b;
        bn bnVar = anVar.P;
        if (i10 >= 0 && i10 < this.f32154a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f32154a.get(i10)) != null) {
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
                        if (ymVar2 != null && ymVar2.f32680b == photoEntry && ymVar2.f32686k > 0.5d) {
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
                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                int[] iArr = new int[2];
                anVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - bnVar.f28177b.getLeftInset();
                }
                ju0Var.f38356b = iArr[0];
                ju0Var.f38357c = iArr[1] + ((int) zmVar.f32951a);
                ju0Var.f38362k = 1.0f;
                ju0Var.d = anVar;
                ImageReceiver imageReceiver = ymVar.f32681c;
                ju0Var.f38355a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.h = r5;
                RectF rectF = ymVar.f32692q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                ju0Var.f38361j = (int) (-anVar.getY());
                ju0Var.f38360i = anVar.getHeight() - ((int) (((-anVar.getY()) + bnVar.f24995r.getHeight()) - bnVar.f28177b.n1()));
                return ju0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f32155b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        an anVar = this.f32155b;
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
        if (i10 < 0 || i10 >= this.f32154a.size() || (photoEntry = (MediaController.PhotoEntry) this.f32154a.get(i10)) == null) {
            return -1;
        }
        return this.f32155b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f32154a.size() && (photoEntry = (MediaController.PhotoEntry) this.f32154a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            an anVar = this.f32155b;
            anVar.invalidate();
            for (int i12 = 0; i12 < anVar.f24675b.size(); i12++) {
                zm zmVar = (zm) anVar.f24675b.get(i12);
                if (zmVar != null && (arrayList = zmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        ym ymVar = (ym) arrayList.get(i13);
                        if (ymVar != null && ymVar.f32680b.imageId == i11) {
                            ym.a(ymVar, photoEntry);
                        }
                    }
                    um umVar = zmVar.f32958k;
                    if (umVar != null && umVar.f30967g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < zmVar.f32958k.f30967g.size(); i14++) {
                            if (((MediaController.PhotoEntry) zmVar.f32958k.f30967g.get(i14)).imageId == i11) {
                                zmVar.f32958k.f30967g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        zm.a(zmVar, zmVar.f32958k, true);
                    }
                }
            }
            anVar.g();
            anVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f32155b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f32154a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f32154a.get(i10)).imageId);
        an anVar = this.f32155b;
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
        return this.f32155b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f32154a.size()) {
            return this.f32155b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f32154a.get(i10)).imageId));
        }
        return false;
    }
}
