package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class nz extends pq0 {
    public final a00 f48252a;

    public nz(a00 a00Var) {
        this.f48252a = a00Var;
    }

    @Override
    public final CharSequence C(int i7) {
        return org.telegram.messenger.id.s(((org.telegram.messenger.ij) this.f48252a.f43519f.get(i7)).f23262k.date, false);
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.ij ijVar2;
        org.telegram.ui.Components.l9 l9Var;
        if (ijVar != null) {
            bt btVar = this.f48252a.f43512b;
            int childCount = btVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = btVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= p7Var.f29744e) {
                            ijVar2 = null;
                        } else {
                            ijVar2 = p7Var.f29742b[i12];
                        }
                        if (ijVar2 == null) {
                            break;
                        }
                        if (ijVar2.e1() == ijVar.e1()) {
                            if (i12 >= p7Var.f29744e) {
                                l9Var = null;
                            } else {
                                l9Var = p7Var.f29741a[i12].f29564a;
                            }
                            ImageReceiver imageReceiver = l9Var.getImageReceiver();
                            l9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().e1() == ijVar.e1()) {
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
                        if (ijVar3 != null && ijVar3.e1() == ijVar.e1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    yq0 yq0Var = new yq0();
                    yq0Var.f52160b = iArr[0];
                    yq0Var.f52161c = iArr[1];
                    yq0Var.d = btVar;
                    btVar.getLocationInWindow(iArr);
                    yq0Var.f52170n = -iArr[1];
                    yq0Var.f52159a = photoImage;
                    yq0Var.f52171o = false;
                    yq0Var.h = photoImage.E();
                    yq0Var.f52162e = yq0Var.f52159a.p();
                    yq0Var.d.getLocationInWindow(iArr);
                    yq0Var.f52166j = 0;
                    if (PhotoViewer.L1(ijVar) && (pinnedHeader = btVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - yq0Var.f52161c;
                        if (i13 > childAt.getHeight()) {
                            btVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return yq0Var;
                        }
                        int height = yq0Var.f52161c - btVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            btVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return yq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        a00 a00Var = this.f48252a;
        if (!a00Var.N) {
            a00Var.h(a00Var.E, a00Var.F, a00Var.H, a00Var.G, a00Var.D, a00Var.J, a00Var.f43536x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i7) {
        return a00.d((org.telegram.messenger.ij) this.f48252a.f43519f.get(i7), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f48252a.O;
    }
}
