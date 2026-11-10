package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class oz extends qq0 {
    public final b00 f48596a;

    public oz(b00 b00Var) {
        this.f48596a = b00Var;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.id.s(((org.telegram.messenger.ij) this.f48596a.f43869f.get(i7)).f23266k.date, false);
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.k9 k9Var;
        if (ijVar != null) {
            ct ctVar = this.f48596a.f43862b;
            int childCount = ctVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ctVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= p7Var.f29755e) {
                            ijVar2 = null;
                        } else {
                            ijVar2 = p7Var.f29753b[i12];
                        }
                        if (ijVar2 == null) {
                            break;
                        }
                        if (ijVar2.e1() == ijVar.e1()) {
                            if (i12 >= p7Var.f29755e) {
                                k9Var = null;
                            } else {
                                k9Var = p7Var.f29752a[i12].f29575a;
                            }
                            ImageReceiver imageReceiver = k9Var.getImageReceiver();
                            k9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == ijVar.e1()) {
                        org.telegram.ui.Components.k9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) h2Var.getParentObject();
                        if (ijVar3 != null && ijVar3.e1() == ijVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    zq0 zq0Var = new zq0();
                    zq0Var.f52504b = iArr[0];
                    zq0Var.f52505c = iArr[1];
                    zq0Var.d = ctVar;
                    ctVar.getLocationInWindow(iArr);
                    zq0Var.f52514n = -iArr[1];
                    zq0Var.f52503a = photoImage;
                    zq0Var.f52515o = false;
                    zq0Var.h = photoImage.E();
                    zq0Var.f52506e = zq0Var.f52503a.p();
                    zq0Var.d.getLocationInWindow(iArr);
                    zq0Var.f52510j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = ctVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - zq0Var.f52505c;
                        if (i13 > childAt.getHeight()) {
                            ctVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return zq0Var;
                        }
                        int height = zq0Var.f52505c - ctVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            ctVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return zq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        b00 b00Var = this.f48596a;
        if (!b00Var.N) {
            b00Var.h(b00Var.E, b00Var.F, b00Var.H, b00Var.G, b00Var.D, b00Var.J, b00Var.f43886x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return b00.d((org.telegram.messenger.ij) this.f48596a.f43869f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f48596a.O;
    }
}
