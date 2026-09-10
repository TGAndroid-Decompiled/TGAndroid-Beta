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
public final class sm extends org.telegram.ui.tu0 {
    public ArrayList f27097a = new ArrayList();
    public final wm f27098b;

    public sm(wm wmVar) {
        this.f27098b = wmVar;
    }

    @Override
    public final void D() {
        wm wmVar = this.f27098b;
        wmVar.c();
        wmVar.i(wmVar.P.P, false);
    }

    @Override
    public final org.telegram.ui.ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        wm wmVar = this.f27098b;
        ArrayList arrayList2 = wmVar.f28792b;
        xm xmVar = wmVar.P;
        if (i10 >= 0 && i10 < this.f27097a.size() && x(i10) && (photoEntry = (MediaController.PhotoEntry) this.f27097a.get(i10)) != null) {
            int size = arrayList2.size();
            vm vmVar = null;
            um umVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                vmVar = (vm) arrayList2.get(i11);
                if (vmVar != null && (arrayList = vmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        um umVar2 = (um) arrayList.get(i12);
                        if (umVar2 != null && umVar2.f27698b == photoEntry && umVar2.f27704k > 0.5d) {
                            umVar = (um) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (umVar != null) {
                        break;
                    }
                }
            }
            if (vmVar != null && umVar != null) {
                org.telegram.ui.ev0 ev0Var = new org.telegram.ui.ev0();
                int[] iArr = new int[2];
                wmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - xmVar.f26422b.getLeftInset();
                }
                ev0Var.f32617b = iArr[0];
                ev0Var.f32618c = iArr[1] + ((int) vmVar.f28008a);
                ev0Var.f32623k = 1.0f;
                ev0Var.d = wmVar;
                ImageReceiver imageReceiver = umVar.f27699c;
                ev0Var.f32616a = imageReceiver;
                ev0Var.e = imageReceiver.getBitmapSafe();
                ev0Var.h = r5;
                RectF rectF = umVar.f27710q;
                int[] iArr2 = {(int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom};
                ev0Var.f32622j = (int) (-wmVar.getY());
                ev0Var.f32621i = wmVar.getHeight() - ((int) (((-wmVar.getY()) + xmVar.f29080r.getHeight()) - xmVar.f26422b.l1()));
                return ev0Var;
            }
        }
        return null;
    }

    @Override
    public final int H() {
        return this.f27098b.h.size();
    }

    @Override
    public final int Q(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        wm wmVar = this.f27098b;
        if (wmVar.h.size() <= 1 || (indexOf = wmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        wmVar.h.remove(indexOf);
        wmVar.c();
        return indexOf;
    }

    @Override
    public final int R(int i10) {
        MediaController.PhotoEntry photoEntry;
        if (i10 < 0 || i10 >= this.f27097a.size() || (photoEntry = (MediaController.PhotoEntry) this.f27097a.get(i10)) == null) {
            return -1;
        }
        return this.f27098b.h.indexOf(Integer.valueOf(photoEntry.imageId));
    }

    @Override
    public final void W(int i10) {
        MediaController.PhotoEntry photoEntry;
        ArrayList arrayList;
        boolean z10;
        if (i10 >= 0 && i10 < this.f27097a.size() && (photoEntry = (MediaController.PhotoEntry) this.f27097a.get(i10)) != null) {
            int i11 = photoEntry.imageId;
            wm wmVar = this.f27098b;
            wmVar.invalidate();
            for (int i12 = 0; i12 < wmVar.f28792b.size(); i12++) {
                vm vmVar = (vm) wmVar.f28792b.get(i12);
                if (vmVar != null && (arrayList = vmVar.h) != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        um umVar = (um) arrayList.get(i13);
                        if (umVar != null && umVar.f27698b.imageId == i11) {
                            um.a(umVar, photoEntry);
                        }
                    }
                    pm pmVar = vmVar.f28015k;
                    if (pmVar != null && pmVar.f26212g != null) {
                        z10 = false;
                        for (int i14 = 0; i14 < vmVar.f28015k.f26212g.size(); i14++) {
                            if (((MediaController.PhotoEntry) vmVar.f28015k.f26212g.get(i14)).imageId == i11) {
                                vmVar.f28015k.f26212g.set(i14, photoEntry);
                                z10 = true;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        vm.a(vmVar, vmVar.f28015k, true);
                    }
                }
            }
            wmVar.g();
            wmVar.invalidate();
        }
    }

    @Override
    public final ArrayList c() {
        return this.f27098b.h;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        if (i10 < 0 || i10 >= this.f27097a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((MediaController.PhotoEntry) this.f27097a.get(i10)).imageId);
        wm wmVar = this.f27098b;
        int indexOf = wmVar.h.indexOf(valueOf);
        if (indexOf >= 0) {
            if (wmVar.h.size() <= 1) {
                return -1;
            }
            wmVar.h.remove(indexOf);
            wmVar.c();
            return indexOf;
        }
        wmVar.h.add(valueOf);
        wmVar.c();
        return wmVar.h.size() - 1;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final HashMap v() {
        return this.f27098b.d;
    }

    @Override
    public final boolean x(int i10) {
        if (i10 >= 0 && i10 < this.f27097a.size()) {
            return this.f27098b.h.contains(Integer.valueOf(((MediaController.PhotoEntry) this.f27097a.get(i10)).imageId));
        }
        return false;
    }
}
