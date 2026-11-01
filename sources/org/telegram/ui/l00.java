package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l00 extends xr0 {
    public final y00 f39041a;

    public l00(y00 y00Var) {
        this.f39041a = y00Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return org.telegram.messenger.dd.s(((org.telegram.messenger.kj) this.f39041a.f43504f.get(i10)).f16690k.date, false);
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        org.telegram.messenger.kj kjVar2;
        org.telegram.ui.Components.g9 g9Var;
        if (kjVar != null) {
            ag.b1 b1Var = this.f39041a.f43498b;
            int childCount = b1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = b1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= t7Var.e) {
                            kjVar2 = null;
                        } else {
                            kjVar2 = t7Var.f23094b[i13];
                        }
                        if (kjVar2 == null) {
                            break;
                        }
                        if (kjVar2.f1() == kjVar.f1()) {
                            if (i13 >= t7Var.e) {
                                g9Var = null;
                            } else {
                                g9Var = t7Var.f23093a[i13].f22845a;
                            }
                            ImageReceiver imageReceiver = g9Var.getImageReceiver();
                            g9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().f1() == kjVar.f1()) {
                        org.telegram.ui.Components.g9 imageView = l7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) h2Var.getParentObject();
                        if (kjVar3 != null && kjVar3.f1() == kjVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    fs0 fs0Var = new fs0();
                    fs0Var.f37216b = iArr[0];
                    fs0Var.f37217c = iArr[1];
                    fs0Var.d = b1Var;
                    b1Var.getLocationInWindow(iArr);
                    fs0Var.f37225n = -iArr[1];
                    fs0Var.f37215a = photoImage;
                    fs0Var.f37226o = false;
                    fs0Var.h = photoImage.E();
                    fs0Var.e = fs0Var.f37215a.p();
                    fs0Var.d.getLocationInWindow(iArr);
                    fs0Var.f37221j = 0;
                    if (PhotoViewer.Q1(kjVar) && (pinnedHeader = b1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            i11 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - fs0Var.f37217c;
                        if (i14 > childAt.getHeight()) {
                            b1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return fs0Var;
                        }
                        int height = fs0Var.f37217c - b1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= org.telegram.messenger.i0.L(8.0f);
                        }
                        if (height >= 0) {
                            b1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fs0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        y00 y00Var = this.f39041a;
        if (!y00Var.N) {
            y00Var.h(y00Var.E, y00Var.F, y00Var.H, y00Var.G, y00Var.D, y00Var.J, y00Var.f43521x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return y00.d((org.telegram.messenger.kj) this.f39041a.f43504f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f39041a.O;
    }
}
