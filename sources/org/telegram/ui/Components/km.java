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
public final class km extends org.telegram.ui.fu0 {
    public ArrayList f28440a = new ArrayList();
    public final om f28441b;

    public km(om omVar) {
        this.f28441b = omVar;
    }

    @Override
    public final void D() {
        om omVar = this.f28441b;
        omVar.c();
        omVar.i(omVar.M.M, false);
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        om omVar = this.f28441b;
        ArrayList arrayList2 = omVar.f29811b;
        pm pmVar = omVar.M;
        if (i10 >= 0 && i10 < this.f28440a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f28440a.get(i10)) != null) {
            int size = arrayList2.size();
            nm nmVar = null;
            mm mmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                nmVar = (nm) arrayList2.get(i11);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        mm mmVar2 = (mm) arrayList.get(i12);
                        if (mmVar2 != null && mmVar2.f29157b == photoEntry && mmVar2.f29164k > 0.5d) {
                            mmVar = (mm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (mmVar != null) {
                        break;
                    }
                }
            }
            if (nmVar != null && mmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                omVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - pmVar.f26590b.getLeftInset();
                }
                qu0Var.f40679b = iArr[0];
                qu0Var.f40680c = iArr[1] + ((int) nmVar.f29516a);
                qu0Var.f40686k = 1.0f;
                qu0Var.d = omVar;
                ImageReceiver imageReceiver = mmVar.f29158c;
                qu0Var.f40678a = imageReceiver;
                qu0Var.f40681e = imageReceiver.getBitmapSafe();
                qu0Var.h = r5;
                RectF rectF = mmVar.f29170q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                qu0Var.f40685j = (int) (-omVar.getY());
                qu0Var.f40684i = omVar.getHeight() - ((int) (((-omVar.getY()) + pmVar.f30122r.getHeight()) - pmVar.f26590b.l1()));
                return qu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f28441b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        om omVar = this.f28441b;
        if (omVar.h.size() <= 1 || (indexOf = omVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f28440a.size() || (photoEntry = (MediaController.PhotoEntry) this.f28440a.get(i10)) == null) {
            return -1;
        }
        return this.f28441b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 >= 0 && i10 < this.f28440a.size() && (photoEntry = (MediaController.PhotoEntry) this.f28440a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            om omVar = this.f28441b;
            omVar.invalidate();
            for (int i12 = 0; i12 < omVar.f29811b.size(); i12++) {
                nm nmVar = (nm) omVar.f29811b.get(i12);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        mm mmVar = (mm) arrayList.get(i13);
                        if (mmVar != null && mmVar.f29157b.imageId == i11) {
                            mm.a(mmVar, photoEntry);
                        }
                    }
                    hm hmVar = nmVar.f29524k;
                    if (hmVar != null && hmVar.f27565g != null) {
                        z4 = false;
                        for (int i14 = 0; i14 < nmVar.f29524k.f27565g.size(); i14++) {
                            if (((MediaController.PhotoEntry) nmVar.f29524k.f27565g.get(i14)).imageId == i11) {
                                nmVar.f29524k.f27565g.set(i14, photoEntry);
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        nm.a(nmVar, nmVar.f29524k, true);
                    }
                }
            }
            omVar.g();
            omVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f28441b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f28440a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f28440a.get(i10)).imageId);
        om omVar = this.f28441b;
        int indexOf = omVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (omVar.h.size() <= 1) {
                return -1;
            }
            omVar.h.remove(indexOf);
            omVar.c();
            return indexOf;
        }
        omVar.h.add(valueOf);
        omVar.c();
        return omVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f28441b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f28440a.size()) {
            return this.f28441b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f28440a.get(i10)).imageId));
        }
        return false;
    }
}
