package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class pz extends oq0 {
    public final c00 f51045a;

    public pz(c00 c00Var) {
        this.f51045a = c00Var;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.gd.s(((org.telegram.messenger.fj) this.f51045a.f46338f.get(i7)).f23968k.date, false);
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.fj fjVar2;
        org.telegram.ui.Components.q9 q9Var;
        if (fjVar != null) {
            et etVar = this.f51045a.f46331b;
            int childCount = etVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = etVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= p7Var.f31244e) {
                            fjVar2 = null;
                        } else {
                            fjVar2 = p7Var.f31242b[i12];
                        }
                        if (fjVar2 == null) {
                            break;
                        }
                        if (fjVar2.e1() == fjVar.e1()) {
                            if (i12 >= p7Var.f31244e) {
                                q9Var = null;
                            } else {
                                q9Var = p7Var.f31241a[i12].f31072a;
                            }
                            ImageReceiver imageReceiver = q9Var.getImageReceiver();
                            q9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.q9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) h2Var.getParentObject();
                        if (fjVar3 != null && fjVar3.e1() == fjVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.f53497b = iArr[0];
                    wq0Var.f53498c = iArr[1];
                    wq0Var.d = etVar;
                    etVar.getLocationInWindow(iArr);
                    wq0Var.f53507n = -iArr[1];
                    wq0Var.f53496a = photoImage;
                    wq0Var.f53508o = false;
                    wq0Var.h = photoImage.E();
                    wq0Var.f53499e = wq0Var.f53496a.p();
                    wq0Var.d.getLocationInWindow(iArr);
                    wq0Var.f53503j = 0;
                    if (PhotoViewer.L1(fjVar) && (pinnedHeader = etVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - wq0Var.f53498c;
                        if (i13 > childAt.getHeight()) {
                            etVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return wq0Var;
                        }
                        int height = wq0Var.f53498c - etVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            etVar.scrollBy(0, childAt.getHeight() + height);
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
        c00 c00Var = this.f51045a;
        if (!c00Var.O) {
            c00Var.h(c00Var.F, c00Var.G, c00Var.I, c00Var.H, c00Var.E, c00Var.K, c00Var.f46356x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return c00.d((org.telegram.messenger.fj) this.f51045a.f46338f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f51045a.P;
    }
}
