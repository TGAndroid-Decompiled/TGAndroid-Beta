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
public final class im extends org.telegram.ui.fu0 {
    public ArrayList f25740a = new ArrayList();
    public final mm f25741b;

    public im(mm mmVar) {
        this.f25741b = mmVar;
    }

    @Override
    public final void D() {
        mm mmVar = this.f25741b;
        mmVar.c();
        mmVar.i(mmVar.M.M, false);
    }

    @Override
    public final org.telegram.ui.qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        mm mmVar = this.f25741b;
        ArrayList arrayList2 = mmVar.f27089b;
        nm nmVar = mmVar.M;
        if (i10 >= 0 && i10 < this.f25740a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f25740a.get(i10)) != null) {
            int size = arrayList2.size();
            lm lmVar = null;
            km kmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                lmVar = (lm) arrayList2.get(i11);
                if (lmVar != null && (arrayList = lmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        km kmVar2 = (km) arrayList.get(i12);
                        if (kmVar2 != null && kmVar2.f26331b == photoEntry && kmVar2.f26337k > 0.5d) {
                            kmVar = (km) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (kmVar != null) {
                        break;
                    }
                }
            }
            if (lmVar != null && kmVar != null) {
                org.telegram.ui.qu0 qu0Var = new org.telegram.ui.qu0();
                int[] iArr = new int[2];
                mmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - nmVar.f24282b.getLeftInset();
                }
                qu0Var.f37488b = iArr[0];
                qu0Var.f37489c = iArr[1] + ((int) lmVar.f26780a);
                qu0Var.f37494k = 1.0f;
                qu0Var.d = mmVar;
                ImageReceiver imageReceiver = kmVar.f26332c;
                qu0Var.f37487a = imageReceiver;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.h = r5;
                RectF rectF = kmVar.f26343q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                qu0Var.f37493j = (int) (-mmVar.getY());
                qu0Var.f37492i = mmVar.getHeight() - ((int) (((-mmVar.getY()) + nmVar.f27299r.getHeight()) - nmVar.f24282b.l1()));
                return qu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f25741b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        mm mmVar = this.f25741b;
        if (mmVar.h.size() <= 1 || (indexOf = mmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        mmVar.h.remove(indexOf);
        mmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f25740a.size() || (photoEntry = (MediaController.PhotoEntry) this.f25740a.get(i10)) == null) {
            return -1;
        }
        return this.f25741b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z4;
        if (i10 >= 0 && i10 < this.f25740a.size() && (photoEntry = (MediaController.PhotoEntry) this.f25740a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            mm mmVar = this.f25741b;
            mmVar.invalidate();
            for (int i12 = 0; i12 < mmVar.f27089b.size(); i12++) {
                lm lmVar = (lm) mmVar.f27089b.get(i12);
                if (lmVar != null && (arrayList = lmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        km kmVar = (km) arrayList.get(i13);
                        if (kmVar != null && kmVar.f26331b.imageId == i11) {
                            km.a(kmVar, photoEntry);
                        }
                    }
                    gm gmVar = lmVar.f26787k;
                    if (gmVar != null && gmVar.f25200g != null) {
                        z4 = false;
                        for (int i14 = 0; i14 < lmVar.f26787k.f25200g.size(); i14++) {
                            if (((MediaController.PhotoEntry) lmVar.f26787k.f25200g.get(i14)).imageId == i11) {
                                lmVar.f26787k.f25200g.set(i14, photoEntry);
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        lm.a(lmVar, lmVar.f26787k, true);
                    }
                }
            }
            mmVar.g();
            mmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f25741b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f25740a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f25740a.get(i10)).imageId);
        mm mmVar = this.f25741b;
        int indexOf = mmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (mmVar.h.size() <= 1) {
                return -1;
            }
            mmVar.h.remove(indexOf);
            mmVar.c();
            return indexOf;
        }
        mmVar.h.add(valueOf);
        mmVar.c();
        return mmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f25741b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f25740a.size()) {
            return this.f25741b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f25740a.get(i10)).imageId));
        }
        return false;
    }
}
