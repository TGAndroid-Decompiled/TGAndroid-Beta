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

public final class zl extends org.telegram.ui.st0 {

    public ArrayList f35306a = new ArrayList();

    public final dm f35307b;

    public zl(dm dmVar) {
        this.f35307b = dmVar;
    }

    @Override
    public final void D() {
        dm dmVar = this.f35307b;
        dmVar.c();
        dmVar.i(dmVar.L.L, false);
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        dm dmVar = this.f35307b;
        ArrayList arrayList2 = dmVar.f27799b;
        em emVar = dmVar.L;
        if (i10 >= 0 && i10 < this.f35306a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f35306a.get(i10)) != null) {
            int size = arrayList2.size();
            cm cmVar = null;
            bm bmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                cmVar = (cm) arrayList2.get(i11);
                if (cmVar != null && (arrayList = cmVar.h) != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        bm bmVar2 = (bm) arrayList.get(i12);
                        if (bmVar2 != null && bmVar2.f27138b == photoEntry && bmVar2.f27145k > 0.5d) {
                            bmVar = (bm) arrayList.get(i12);
                            break;
                        }
                    }
                    if (bmVar != null) {
                        break;
                    }
                }
            }
            if (cmVar != null && bmVar != null) {
                org.telegram.ui.cu0 cu0Var = new org.telegram.ui.cu0();
                int[] iArr = new int[2];
                dmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - emVar.f34900b.getLeftInset();
                }
                cu0Var.f37154b = iArr[0];
                cu0Var.f37155c = iArr[1] + ((int) cmVar.f27483a);
                cu0Var.f37161k = 1.0f;
                cu0Var.d = dmVar;
                ImageReceiver imageReceiver = bmVar.f27139c;
                cu0Var.f37153a = imageReceiver;
                cu0Var.f37156e = imageReceiver.getBitmapSafe();
                cu0Var.h = new int[]{(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                RectF rectF = bmVar.f27151q;
                cu0Var.f37160j = (int) (-dmVar.getY());
                cu0Var.f37159i = dmVar.getHeight() - ((int) (((-dmVar.getY()) + emVar.f28087r.getHeight()) - emVar.f34900b.l1()));
                return cu0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f35307b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int iIndexOf;
        Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        dm dmVar = this.f35307b;
        if (dmVar.h.size() <= 1 || (iIndexOf = dmVar.h.indexOf(numValueOf)) < 0) {
            return -1;
        }
        dmVar.h.remove(iIndexOf);
        dmVar.c();
        return iIndexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f35306a.size() || (photoEntry = (MediaController.PhotoEntry) this.f35306a.get(i10)) == null) {
            return -1;
        }
        return this.f35307b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.f35306a.size() || (photoEntry = (MediaController.PhotoEntry) this.f35306a.get(i10)) == null) {
            return;
        }
        int i11 = photoEntry.imageId;
        dm dmVar = this.f35307b;
        dmVar.invalidate();
        for (int i12 = 0; i12 < dmVar.f27799b.size(); i12++) {
            cm cmVar = (cm) dmVar.f27799b.get(i12);
            if (cmVar != null && (arrayList = cmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    bm bmVar = (bm) arrayList.get(i13);
                    if (bmVar != null && bmVar.f27138b.imageId == i11) {
                        bm.a(bmVar, photoEntry);
                    }
                }
                wl wlVar = cmVar.f27491k;
                if (wlVar == null || wlVar.f34285g == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < cmVar.f27491k.f34285g.size(); i14++) {
                        if (((MediaController.PhotoEntry) cmVar.f27491k.f34285g.get(i14)).imageId == i11) {
                            cmVar.f27491k.f34285g.set(i14, photoEntry);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    cm.a(cmVar, cmVar.f27491k, true);
                }
            }
        }
        dmVar.g();
        dmVar.invalidate();
    }

    @Override
    public final ArrayList c() {
        return this.f35307b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f35306a.size()) {
            return -1;
        }
        Integer numValueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f35306a.get(i10)).imageId);
        dm dmVar = this.f35307b;
        int iIndexOf = dmVar.h.indexOf(numValueOf);
        if (iIndexOf < 0) {
            dmVar.h.add(numValueOf);
            dmVar.c();
            return dmVar.h.size() - 1;
        }
        if (dmVar.h.size() <= 1) {
            return -1;
        }
        dmVar.h.remove(iIndexOf);
        dmVar.c();
        return iIndexOf;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f35307b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.f35306a.size()) {
            return false;
        }
        return this.f35307b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f35306a.get(i10)).imageId));
    }
}
