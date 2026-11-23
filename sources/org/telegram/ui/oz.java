package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class oz extends oq0 {
    public final b00 f50794a;

    public oz(b00 b00Var) {
        this.f50794a = b00Var;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.gd.s(((org.telegram.messenger.fj) this.f50794a.f45852f.get(i7)).f24073k.date, false);
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.fj fjVar2;
        org.telegram.ui.Components.p9 p9Var;
        if (fjVar != null) {
            dt dtVar = this.f50794a.f45845b;
            int childCount = dtVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = dtVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= p7Var.f31330e) {
                            fjVar2 = null;
                        } else {
                            fjVar2 = p7Var.f31328b[i12];
                        }
                        if (fjVar2 == null) {
                            break;
                        }
                        if (fjVar2.e1() == fjVar.e1()) {
                            if (i12 >= p7Var.f31330e) {
                                p9Var = null;
                            } else {
                                p9Var = p7Var.f31327a[i12].f31166a;
                            }
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == fjVar.e1()) {
                        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.i2) {
                        org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) childAt;
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) i2Var.getParentObject();
                        if (fjVar3 != null && fjVar3.e1() == fjVar.e1()) {
                            photoImage = i2Var.getPhotoImage();
                            i2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    wq0 wq0Var = new wq0();
                    wq0Var.f53727b = iArr[0];
                    wq0Var.f53728c = iArr[1];
                    wq0Var.d = dtVar;
                    dtVar.getLocationInWindow(iArr);
                    wq0Var.f53737n = -iArr[1];
                    wq0Var.f53726a = photoImage;
                    wq0Var.f53738o = false;
                    wq0Var.h = photoImage.F();
                    wq0Var.f53729e = wq0Var.f53726a.p();
                    wq0Var.d.getLocationInWindow(iArr);
                    wq0Var.f53733j = 0;
                    if (PhotoViewer.L1(fjVar) && (pinnedHeader = dtVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - wq0Var.f53728c;
                        if (i13 > childAt.getHeight()) {
                            dtVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return wq0Var;
                        }
                        int height = wq0Var.f53728c - dtVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            dtVar.scrollBy(0, childAt.getHeight() + height);
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
        b00 b00Var = this.f50794a;
        if (!b00Var.O) {
            b00Var.h(b00Var.F, b00Var.G, b00Var.I, b00Var.H, b00Var.E, b00Var.K, b00Var.f45870x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return b00.d((org.telegram.messenger.fj) this.f50794a.f45852f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f50794a.P;
    }
}
