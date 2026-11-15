package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mz extends mq0 {
    public final zz f49350a;

    public mz(zz zzVar) {
        this.f49350a = zzVar;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.hd.s(((org.telegram.messenger.gj) this.f49350a.f54082f.get(i7)).f23817k.date, false);
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.gj gjVar2;
        org.telegram.ui.Components.i9 i9Var;
        if (gjVar != null) {
            ct ctVar = this.f49350a.f54075b;
            int childCount = ctVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ctVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= o7Var.f30814e) {
                            gjVar2 = null;
                        } else {
                            gjVar2 = o7Var.f30812b[i12];
                        }
                        if (gjVar2 == null) {
                            break;
                        }
                        if (gjVar2.e1() == gjVar.e1()) {
                            if (i12 >= o7Var.f30814e) {
                                i9Var = null;
                            } else {
                                i9Var = o7Var.f30811a[i12].f30646a;
                            }
                            ImageReceiver imageReceiver = i9Var.getImageReceiver();
                            i9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().e1() == gjVar.e1()) {
                        org.telegram.ui.Components.i9 imageView = g7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) h2Var.getParentObject();
                        if (gjVar3 != null && gjVar3.e1() == gjVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    uq0 uq0Var = new uq0();
                    uq0Var.f52000b = iArr[0];
                    uq0Var.f52001c = iArr[1];
                    uq0Var.d = ctVar;
                    ctVar.getLocationInWindow(iArr);
                    uq0Var.f52010n = -iArr[1];
                    uq0Var.f51999a = photoImage;
                    uq0Var.f52011o = false;
                    uq0Var.h = photoImage.E();
                    uq0Var.f52002e = uq0Var.f51999a.p();
                    uq0Var.d.getLocationInWindow(iArr);
                    uq0Var.f52006j = 0;
                    if (PhotoViewer.L1(gjVar) && (pinnedHeader = ctVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - uq0Var.f52001c;
                        if (i13 > childAt.getHeight()) {
                            ctVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return uq0Var;
                        }
                        int height = uq0Var.f52001c - ctVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            ctVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return uq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        zz zzVar = this.f49350a;
        if (!zzVar.O) {
            zzVar.h(zzVar.F, zzVar.G, zzVar.I, zzVar.H, zzVar.E, zzVar.K, zzVar.f54100x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return zz.d((org.telegram.messenger.gj) this.f49350a.f54082f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f49350a.P;
    }
}
