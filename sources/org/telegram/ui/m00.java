package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m00 extends yr0 {
    public final z00 f39447a;

    public m00(z00 z00Var) {
        this.f39447a = z00Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return org.telegram.messenger.cd.s(((org.telegram.messenger.jj) this.f39447a.f43947f.get(i10)).f16337k.date, false);
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        org.telegram.messenger.jj jjVar2;
        org.telegram.ui.Components.g9 g9Var;
        if (jjVar != null) {
            ag.b1 b1Var = this.f39447a.f43941b;
            int childCount = b1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = b1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.t7) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= t7Var.e) {
                            jjVar2 = null;
                        } else {
                            jjVar2 = t7Var.f23093b[i13];
                        }
                        if (jjVar2 == null) {
                            break;
                        }
                        if (jjVar2.f1() == jjVar.f1()) {
                            if (i13 >= t7Var.e) {
                                g9Var = null;
                            } else {
                                g9Var = t7Var.f23092a[i13].f22844a;
                            }
                            ImageReceiver imageReceiver = g9Var.getImageReceiver();
                            g9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().f1() == jjVar.f1()) {
                        org.telegram.ui.Components.g9 imageView = l7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) h2Var.getParentObject();
                        if (jjVar3 != null && jjVar3.f1() == jjVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    gs0 gs0Var = new gs0();
                    gs0Var.f37628b = iArr[0];
                    gs0Var.f37629c = iArr[1];
                    gs0Var.d = b1Var;
                    b1Var.getLocationInWindow(iArr);
                    gs0Var.f37637n = -iArr[1];
                    gs0Var.f37627a = photoImage;
                    gs0Var.f37638o = false;
                    gs0Var.h = photoImage.E();
                    gs0Var.e = gs0Var.f37627a.p();
                    gs0Var.d.getLocationInWindow(iArr);
                    gs0Var.f37633j = 0;
                    if (PhotoViewer.Q1(jjVar) && (pinnedHeader = b1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            i11 = org.telegram.messenger.i0.L(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - gs0Var.f37629c;
                        if (i14 > childAt.getHeight()) {
                            b1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return gs0Var;
                        }
                        int height = gs0Var.f37629c - b1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= org.telegram.messenger.i0.L(8.0f);
                        }
                        if (height >= 0) {
                            b1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return gs0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        z00 z00Var = this.f39447a;
        if (!z00Var.N) {
            z00Var.h(z00Var.E, z00Var.F, z00Var.H, z00Var.G, z00Var.D, z00Var.J, z00Var.f43964x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return z00.d((org.telegram.messenger.jj) this.f39447a.f43947f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f39447a.O;
    }
}
