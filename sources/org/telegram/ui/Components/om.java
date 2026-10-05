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
    public ArrayList f29504a = new ArrayList();
    public final sm f29505b;

    public om(sm smVar) {
        this.f29505b = smVar;
    }

    @Override
    public final void D() {
        sm smVar = this.f29505b;
        smVar.c();
        smVar.i(smVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        sm smVar = this.f29505b;
        ArrayList arrayList2 = smVar.f30869b;
        tm tmVar = smVar.P;
        if (i10 >= 0 && i10 < this.f29504a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f29504a.get(i10)) != null) {
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
                        if (qmVar2 != null && qmVar2.f30103b == photoEntry && qmVar2.f30110k > 0.5d) {
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
                    iArr[0] = iArr[0] - tmVar.f29741b.getLeftInset();
                }
                yu0Var.f43621b = iArr[0];
                yu0Var.f43622c = iArr[1] + ((int) rmVar.f30532a);
                yu0Var.f43628k = 1.0f;
                yu0Var.d = smVar;
                ImageReceiver imageReceiver = qmVar.f30104c;
                yu0Var.f43620a = imageReceiver;
                yu0Var.f43623e = imageReceiver.getBitmapSafe();
                yu0Var.h = r5;
                RectF rectF = qmVar.f30116q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                yu0Var.f43627j = (int) (-smVar.getY());
                yu0Var.f43626i = smVar.getHeight() - ((int) (((-smVar.getY()) + tmVar.f31185r.getHeight()) - tmVar.f29741b.l1()));
                return yu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f29505b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        sm smVar = this.f29505b;
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
        if (i10 < 0 || i10 >= this.f29504a.size() || (photoEntry = (MediaController.PhotoEntry) this.f29504a.get(i10)) == null) {
            return -1;
        }
        return this.f29505b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f29504a.size() && (photoEntry = (MediaController.PhotoEntry) this.f29504a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            sm smVar = this.f29505b;
            smVar.invalidate();
            for (int i12 = 0; i12 < smVar.f30869b.size(); i12++) {
                rm rmVar = (rm) smVar.f30869b.get(i12);
                if (rmVar != null && (arrayList = rmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        qm qmVar = (qm) arrayList.get(i13);
                        if (qmVar != null && qmVar.f30103b.imageId == i11) {
                            qm.a(qmVar, photoEntry);
                        }
                    }
                    mm mmVar = rmVar.f30540k;
                    if (mmVar != null && mmVar.f28739g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < rmVar.f30540k.f28739g.size(); i14++) {
                            if (((MediaController.PhotoEntry) rmVar.f30540k.f28739g.get(i14)).imageId == i11) {
                                rmVar.f30540k.f28739g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        rm.a(rmVar, rmVar.f30540k, true);
                    }
                }
            }
            smVar.g();
            smVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f29505b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f29504a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f29504a.get(i10)).imageId);
        sm smVar = this.f29505b;
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
        return this.f29505b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f29504a.size()) {
            return this.f29505b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f29504a.get(i10)).imageId));
        }
        return false;
    }
}
