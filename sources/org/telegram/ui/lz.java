package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lz extends nq0 {
    public final yz f47599a;

    public lz(yz yzVar) {
        this.f47599a = yzVar;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.id.s(((org.telegram.messenger.ij) this.f47599a.f52367f.get(i7)).f23262k.date, false);
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.l9 l9Var;
        if (ijVar != null) {
            zs zsVar = this.f47599a.f52360b;
            int childCount = zsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zsVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= p7Var.f29740e) {
                            ijVar2 = null;
                        } else {
                            ijVar2 = p7Var.f29738b[i12];
                        }
                        if (ijVar2 == null) {
                            break;
                        }
                        if (ijVar2.f1() == ijVar.f1()) {
                            if (i12 >= p7Var.f29740e) {
                                l9Var = null;
                            } else {
                                l9Var = p7Var.f29737a[i12].f29560a;
                            }
                            ImageReceiver imageReceiver = l9Var.getImageReceiver();
                            l9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().f1() == ijVar.f1()) {
                        org.telegram.ui.Components.l9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) h2Var.getParentObject();
                        if (ijVar3 != null && ijVar3.f1() == ijVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.f51484b = iArr[0];
                    wq0Var.f51485c = iArr[1];
                    wq0Var.d = zsVar;
                    zsVar.getLocationInWindow(iArr);
                    wq0Var.f51494n = -iArr[1];
                    wq0Var.f51483a = photoImage;
                    wq0Var.f51495o = false;
                    wq0Var.h = photoImage.E();
                    wq0Var.f51486e = wq0Var.f51483a.p();
                    wq0Var.d.getLocationInWindow(iArr);
                    wq0Var.f51490j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = zsVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - wq0Var.f51485c;
                        if (i13 > childAt.getHeight()) {
                            zsVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return wq0Var;
                        }
                        int height = wq0Var.f51485c - zsVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            zsVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return wq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        yz yzVar = this.f47599a;
        if (!yzVar.N) {
            yzVar.h(yzVar.E, yzVar.F, yzVar.H, yzVar.G, yzVar.D, yzVar.J, yzVar.f52384x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return yz.d((org.telegram.messenger.ij) this.f47599a.f52367f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f47599a.O;
    }
}
