package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pz extends pq0 {
    public final c00 f50947a;

    public pz(c00 c00Var) {
        this.f50947a = c00Var;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.hd.s(((org.telegram.messenger.gj) this.f50947a.f46348f.get(i7)).f24177k.date, false);
    }

    @Override
    public final xq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.q9 q9Var;
        if (gjVar != null) {
            et etVar = this.f50947a.f46341b;
            int childCount = etVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = etVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.q7) {
                    org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= q7Var.f31291e) {
                            gjVar2 = null;
                        } else {
                            gjVar2 = q7Var.f31289b[i12];
                        }
                        if (gjVar2 == null) {
                            break;
                        }
                        if (gjVar2.e1() == gjVar.e1()) {
                            if (i12 >= q7Var.f31291e) {
                                q9Var = null;
                            } else {
                                q9Var = q7Var.f31288a[i12].f31124a;
                            }
                            ImageReceiver imageReceiver = q9Var.getImageReceiver();
                            q9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().e1() == gjVar.e1()) {
                        org.telegram.ui.Components.q9 imageView = i7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) i2Var.getParentObject();
                        if (gjVar3 != null && gjVar3.e1() == gjVar.e1()) {
                            photoImage = i2Var.getPhotoImage();
                            i2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    xq0 xq0Var = new xq0();
                    xq0Var.f53899b = iArr[0];
                    xq0Var.f53900c = iArr[1];
                    xq0Var.d = etVar;
                    etVar.getLocationInWindow(iArr);
                    xq0Var.f53909n = -iArr[1];
                    xq0Var.f53898a = photoImage;
                    xq0Var.f53910o = false;
                    xq0Var.h = photoImage.E();
                    xq0Var.f53901e = xq0Var.f53898a.p();
                    xq0Var.d.getLocationInWindow(iArr);
                    xq0Var.f53905j = 0;
                    if (PhotoViewer.L1(gjVar) && (pinnedHeader = etVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - xq0Var.f53900c;
                        if (i13 > childAt.getHeight()) {
                            etVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return xq0Var;
                        }
                        int height = xq0Var.f53900c - etVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            etVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return xq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        c00 c00Var = this.f50947a;
        if (!c00Var.O) {
            c00Var.h(c00Var.F, c00Var.G, c00Var.I, c00Var.H, c00Var.E, c00Var.K, c00Var.f46366x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return c00.d((org.telegram.messenger.gj) this.f50947a.f46348f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f50947a.P;
    }
}
