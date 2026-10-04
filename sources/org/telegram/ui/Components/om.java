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
public final class om extends org.telegram.ui.ou0 {
    public ArrayList f29398a = new ArrayList();
    public final sm f29399b;

    public om(sm smVar) {
        this.f29399b = smVar;
    }

    @Override
    public final void D() {
        sm smVar = this.f29399b;
        smVar.c();
        smVar.i(smVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        sm smVar = this.f29399b;
        ArrayList arrayList2 = smVar.f30806b;
        tm tmVar = smVar.P;
        if (i10 >= 0 && i10 < this.f29398a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f29398a.get(i10)) != null) {
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
                        if (qmVar2 != null && qmVar2.f30075b == photoEntry && qmVar2.f30082k > 0.5d) {
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
                org.telegram.ui.yu0 yu0Var = new org.telegram.ui.yu0();
                int[] iArr = new int[2];
                smVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - tmVar.f29642b.getLeftInset();
                }
                yu0Var.f43620b = iArr[0];
                yu0Var.f43621c = iArr[1] + ((int) rmVar.f30443a);
                yu0Var.f43627k = 1.0f;
                yu0Var.d = smVar;
                ImageReceiver imageReceiver = qmVar.f30076c;
                yu0Var.f43619a = imageReceiver;
                yu0Var.f43622e = imageReceiver.getBitmapSafe();
                yu0Var.h = r5;
                RectF rectF = qmVar.f30088q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                yu0Var.f43626j = (int) (-smVar.getY());
                yu0Var.f43625i = smVar.getHeight() - ((int) (((-smVar.getY()) + tmVar.f31091r.getHeight()) - tmVar.f29642b.j1()));
                return yu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f29399b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        sm smVar = this.f29399b;
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
        if (i10 < 0 || i10 >= this.f29398a.size() || (photoEntry = (MediaController.PhotoEntry) this.f29398a.get(i10)) == null) {
            return -1;
        }
        return this.f29399b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f29398a.size() && (photoEntry = (MediaController.PhotoEntry) this.f29398a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            sm smVar = this.f29399b;
            smVar.invalidate();
            for (int i12 = 0; i12 < smVar.f30806b.size(); i12++) {
                rm rmVar = (rm) smVar.f30806b.get(i12);
                if (rmVar != null && (arrayList = rmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        qm qmVar = (qm) arrayList.get(i13);
                        if (qmVar != null && qmVar.f30075b.imageId == i11) {
                            qm.a(qmVar, photoEntry);
                        }
                    }
                    mm mmVar = rmVar.f30451k;
                    if (mmVar != null && mmVar.f28654g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < rmVar.f30451k.f28654g.size(); i14++) {
                            if (((MediaController.PhotoEntry) rmVar.f30451k.f28654g.get(i14)).imageId == i11) {
                                rmVar.f30451k.f28654g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        rm.a(rmVar, rmVar.f30451k, true);
                    }
                }
            }
            smVar.g();
            smVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f29399b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f29398a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f29398a.get(i10)).imageId);
        sm smVar = this.f29399b;
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
        return this.f29399b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f29398a.size()) {
            return this.f29399b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f29398a.get(i10)).imageId));
        }
        return false;
    }
}
