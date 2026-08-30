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
public final class jm extends org.telegram.ui.yt0 {
    public ArrayList f26006a = new ArrayList();
    public final nm f26007b;

    public jm(nm nmVar) {
        this.f26007b = nmVar;
    }

    @Override
    public final void D() {
        nm nmVar = this.f26007b;
        nmVar.c();
        nmVar.i(nmVar.M.M, false);
    }

    @Override
    public final org.telegram.ui.ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        nm nmVar = this.f26007b;
        ArrayList arrayList2 = nmVar.f27315b;
        om omVar = nmVar.M;
        if (i10 >= 0 && i10 < this.f26006a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f26006a.get(i10)) != null) {
            int size = arrayList2.size();
            mm mmVar = null;
            lm lmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                mmVar = (mm) arrayList2.get(i11);
                if (mmVar != null && (arrayList = mmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        lm lmVar2 = (lm) arrayList.get(i12);
                        if (lmVar2 != null && lmVar2.f26791b == photoEntry && lmVar2.f26797k > 0.5d) {
                            lmVar = (lm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (lmVar != null) {
                        break;
                    }
                }
            }
            if (mmVar != null && lmVar != null) {
                org.telegram.ui.ju0 ju0Var = new org.telegram.ui.ju0();
                int[] iArr = new int[2];
                nmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - omVar.f24278b.getLeftInset();
                }
                ju0Var.f35496b = iArr[0];
                ju0Var.f35497c = iArr[1] + ((int) mmVar.f27053a);
                ju0Var.f35502k = 1.0f;
                ju0Var.d = nmVar;
                ImageReceiver imageReceiver = lmVar.f26792c;
                ju0Var.f35495a = imageReceiver;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.h = r5;
                RectF rectF = lmVar.f26803q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                ju0Var.f35501j = (int) (-nmVar.getY());
                ju0Var.f35500i = nmVar.getHeight() - ((int) (((-nmVar.getY()) + omVar.f27591r.getHeight()) - omVar.f24278b.l1()));
                return ju0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f26007b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        nm nmVar = this.f26007b;
        if (nmVar.h.size() <= 1 || (indexOf = nmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        nmVar.h.remove(indexOf);
        nmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f26006a.size() || (photoEntry = (MediaController.PhotoEntry) this.f26006a.get(i10)) == null) {
            return -1;
        }
        return this.f26007b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 >= 0 && i10 < this.f26006a.size() && (photoEntry = (MediaController.PhotoEntry) this.f26006a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            nm nmVar = this.f26007b;
            nmVar.invalidate();
            for (int i12 = 0; i12 < nmVar.f27315b.size(); i12++) {
                mm mmVar = (mm) nmVar.f27315b.get(i12);
                if (mmVar != null && (arrayList = mmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        lm lmVar = (lm) arrayList.get(i13);
                        if (lmVar != null && lmVar.f26791b.imageId == i11) {
                            lm.a(lmVar, photoEntry);
                        }
                    }
                    gm gmVar = mmVar.f27060k;
                    if (gmVar != null && gmVar.f25197g != null) {
                        z4 = false;
                        for (int i14 = 0; i14 < mmVar.f27060k.f25197g.size(); i14++) {
                            if (((MediaController.PhotoEntry) mmVar.f27060k.f25197g.get(i14)).imageId == i11) {
                                mmVar.f27060k.f25197g.set(i14, photoEntry);
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        mm.a(mmVar, mmVar.f27060k, true);
                    }
                }
            }
            nmVar.g();
            nmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f26007b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f26006a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f26006a.get(i10)).imageId);
        nm nmVar = this.f26007b;
        int indexOf = nmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (nmVar.h.size() <= 1) {
                return -1;
            }
            nmVar.h.remove(indexOf);
            nmVar.c();
            return indexOf;
        }
        nmVar.h.add(valueOf);
        nmVar.c();
        return nmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f26007b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f26006a.size()) {
            return this.f26007b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f26006a.get(i10)).imageId));
        }
        return false;
    }
}
