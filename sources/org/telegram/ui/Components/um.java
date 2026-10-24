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
public final class um extends org.telegram.ui.bu0 {
    public ArrayList f31162a = new ArrayList();
    public final ym f31163b;

    public um(ym ymVar) {
        this.f31163b = ymVar;
    }

    @Override
    public final void D() {
        ym ymVar = this.f31163b;
        ymVar.c();
        ymVar.i(ymVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        ym ymVar = this.f31163b;
        ArrayList arrayList2 = ymVar.f32979b;
        zm zmVar = ymVar.P;
        if (i10 >= 0 && i10 < this.f31162a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f31162a.get(i10)) != null) {
            int size = arrayList2.size();
            xm xmVar = null;
            wm wmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                xmVar = (xm) arrayList2.get(i11);
                if (xmVar != null && (arrayList = xmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        wm wmVar2 = (wm) arrayList.get(i12);
                        if (wmVar2 != null && wmVar2.f32267b == photoEntry && wmVar2.f32273k > 0.5d) {
                            wmVar = (wm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (wmVar != null) {
                        break;
                    }
                }
            }
            if (xmVar != null && wmVar != null) {
                org.telegram.ui.lu0 lu0Var = new org.telegram.ui.lu0();
                int[] iArr = new int[2];
                ymVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - zmVar.f27704b.getLeftInset();
                }
                lu0Var.f39382b = iArr[0];
                lu0Var.f39383c = iArr[1] + ((int) xmVar.f32637a);
                lu0Var.f39388k = 1.0f;
                lu0Var.d = ymVar;
                ImageReceiver imageReceiver = wmVar.f32268c;
                lu0Var.f39381a = imageReceiver;
                lu0Var.e = imageReceiver.getBitmapSafe();
                lu0Var.h = r5;
                RectF rectF = wmVar.f32279q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                lu0Var.f39387j = (int) (-ymVar.getY());
                lu0Var.f39386i = ymVar.getHeight() - ((int) (((-ymVar.getY()) + zmVar.f33292r.getHeight()) - zmVar.f27704b.q1()));
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f31163b.h.size();
    }

    @Override
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        ym ymVar = this.f31163b;
        if (ymVar.h.size() <= 1 || (indexOf = ymVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        ymVar.h.remove(indexOf);
        ymVar.c();
        return indexOf;
    }

    @Override
    public final int S(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f31162a.size() || (photoEntry = (MediaController.PhotoEntry) this.f31162a.get(i10)) == null) {
            return -1;
        }
        return this.f31163b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void X(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f31162a.size() && (photoEntry = (MediaController.PhotoEntry) this.f31162a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            ym ymVar = this.f31163b;
            ymVar.invalidate();
            for (int i12 = 0; i12 < ymVar.f32979b.size(); i12++) {
                xm xmVar = (xm) ymVar.f32979b.get(i12);
                if (xmVar != null && (arrayList = xmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        wm wmVar = (wm) arrayList.get(i13);
                        if (wmVar != null && wmVar.f32267b.imageId == i11) {
                            wm.a(wmVar, photoEntry);
                        }
                    }
                    sm smVar = xmVar.f32644k;
                    if (smVar != null && smVar.f30570g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < xmVar.f32644k.f30570g.size(); i14++) {
                            if (((MediaController.PhotoEntry) xmVar.f32644k.f30570g.get(i14)).imageId == i11) {
                                xmVar.f32644k.f30570g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        xm.a(xmVar, xmVar.f32644k, true);
                    }
                }
            }
            ymVar.g();
            ymVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f31163b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f31162a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f31162a.get(i10)).imageId);
        ym ymVar = this.f31163b;
        int indexOf = ymVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (ymVar.h.size() <= 1) {
                return -1;
            }
            ymVar.h.remove(indexOf);
            ymVar.c();
            return indexOf;
        }
        ymVar.h.add(valueOf);
        ymVar.c();
        return ymVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f31163b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f31162a.size()) {
            return this.f31163b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f31162a.get(i10)).imageId));
        }
        return false;
    }
}
