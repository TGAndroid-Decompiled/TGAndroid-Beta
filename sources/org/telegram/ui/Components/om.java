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
public final class om extends org.telegram.ui.lu0 {
    public ArrayList f27119a = new ArrayList();
    public final sm f27120b;

    public om(sm smVar) {
        this.f27120b = smVar;
    }

    @Override
    public final void D() {
        sm smVar = this.f27120b;
        smVar.c();
        smVar.i(smVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        sm smVar = this.f27120b;
        ArrayList arrayList2 = smVar.f28288b;
        tm tmVar = smVar.P;
        if (i10 >= 0 && i10 < this.f27119a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f27119a.get(i10)) != null) {
            int size = arrayList2.size();
            rm rmVar = null;
            qm qmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                rmVar = (rm) arrayList2.get(i11);
                if (rmVar != null && (arrayList = rmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        qm qmVar2 = (qm) arrayList.get(i12);
                        if (qmVar2 != null && qmVar2.f27674b == photoEntry && qmVar2.f27680k > 0.5d) {
                            qmVar = (qm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (qmVar != null) {
                        break;
                    }
                }
            }
            if (rmVar != null && qmVar != null) {
                org.telegram.ui.vu0 vu0Var = new org.telegram.ui.vu0();
                int[] iArr = new int[2];
                smVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - tmVar.f27362b.getLeftInset();
                }
                vu0Var.f38908b = iArr[0];
                vu0Var.f38909c = iArr[1] + ((int) rmVar.f28065a);
                vu0Var.f38914k = 1.0f;
                vu0Var.d = smVar;
                ImageReceiver imageReceiver = qmVar.f27675c;
                vu0Var.f38907a = imageReceiver;
                vu0Var.e = imageReceiver.getBitmapSafe();
                vu0Var.h = r5;
                RectF rectF = qmVar.f27686q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                vu0Var.f38913j = (int) (-smVar.getY());
                vu0Var.f38912i = smVar.getHeight() - ((int) (((-smVar.getY()) + tmVar.f28602r.getHeight()) - tmVar.f27362b.l1()));
                return vu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f27120b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        sm smVar = this.f27120b;
        if (smVar.h.size() <= 1 || (indexOf = smVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        smVar.h.remove(indexOf);
        smVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f27119a.size() || (photoEntry = (MediaController.PhotoEntry) this.f27119a.get(i10)) == null) {
            return -1;
        }
        return this.f27120b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f27119a.size() && (photoEntry = (MediaController.PhotoEntry) this.f27119a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            sm smVar = this.f27120b;
            smVar.invalidate();
            for (int i12 = 0; i12 < smVar.f28288b.size(); i12++) {
                rm rmVar = (rm) smVar.f28288b.get(i12);
                if (rmVar != null && (arrayList = rmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        qm qmVar = (qm) arrayList.get(i13);
                        if (qmVar != null && qmVar.f27674b.imageId == i11) {
                            qm.a(qmVar, photoEntry);
                        }
                    }
                    mm mmVar = rmVar.f28072k;
                    if (mmVar != null && mmVar.f26324g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < rmVar.f28072k.f26324g.size(); i14++) {
                            if (((MediaController.PhotoEntry) rmVar.f28072k.f26324g.get(i14)).imageId == i11) {
                                rmVar.f28072k.f26324g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        rm.a(rmVar, rmVar.f28072k, true);
                    }
                }
            }
            smVar.g();
            smVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f27120b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f27119a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f27119a.get(i10)).imageId);
        sm smVar = this.f27120b;
        int indexOf = smVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (smVar.h.size() <= 1) {
                return -1;
            }
            smVar.h.remove(indexOf);
            smVar.c();
            return indexOf;
        }
        smVar.h.add(valueOf);
        smVar.c();
        return smVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f27120b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f27119a.size()) {
            return this.f27120b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f27119a.get(i10)).imageId));
        }
        return false;
    }
}
