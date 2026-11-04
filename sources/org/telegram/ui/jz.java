package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jz extends eq0 {
    public final wz f46713a;

    public jz(wz wzVar) {
        this.f46713a = wzVar;
    }

    @Override
    public final CharSequence C(int i3) {
        return org.telegram.messenger.bd.s(((org.telegram.messenger.zi) this.f46713a.f51645f.get(i3)).f26868k.date, false);
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i10;
        org.telegram.messenger.zi ziVar2;
        org.telegram.ui.Components.k9 k9Var;
        if (ziVar != null) {
            xs xsVar = this.f46713a.f51638b;
            int childCount = xsVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = xsVar.getChildAt(i11);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                    photoImage = null;
                    for (int i12 = 0; i12 < 6; i12++) {
                        if (i12 >= o7Var.f29753e) {
                            ziVar2 = null;
                        } else {
                            ziVar2 = o7Var.f29751b[i12];
                        }
                        if (ziVar2 == null) {
                            break;
                        }
                        if (ziVar2.f1() == ziVar.f1()) {
                            if (i12 >= o7Var.f29753e) {
                                k9Var = null;
                            } else {
                                k9Var = o7Var.f29750a[i12].f29585a;
                            }
                            ImageReceiver imageReceiver = k9Var.getImageReceiver();
                            k9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.g7) {
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) childAt;
                    if (g7Var.getMessage().f1() == ziVar.f1()) {
                        org.telegram.ui.Components.k9 imageView = g7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.h2) {
                        org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) childAt;
                        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) h2Var.getParentObject();
                        if (ziVar3 != null && ziVar3.f1() == ziVar.f1()) {
                            photoImage = h2Var.getPhotoImage();
                            h2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    mq0 mq0Var = new mq0();
                    mq0Var.f47752b = iArr[0];
                    mq0Var.f47753c = iArr[1];
                    mq0Var.d = xsVar;
                    xsVar.getLocationInWindow(iArr);
                    mq0Var.f47762n = -iArr[1];
                    mq0Var.f47751a = photoImage;
                    mq0Var.f47763o = false;
                    mq0Var.h = photoImage.E();
                    mq0Var.f47754e = mq0Var.f47751a.p();
                    mq0Var.d.getLocationInWindow(iArr);
                    mq0Var.f47758j = 0;
                    if (PhotoViewer.Q1(ziVar) && (pinnedHeader = xsVar.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            i10 = org.telegram.messenger.g0.L(8.0f);
                        } else {
                            i10 = 0;
                        }
                        int i13 = i10 - mq0Var.f47753c;
                        if (i13 > childAt.getHeight()) {
                            xsVar.scrollBy(0, -(pinnedHeader.getHeight() + i13));
                            return mq0Var;
                        }
                        int height = mq0Var.f47753c - xsVar.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.g7) {
                            height -= org.telegram.messenger.g0.L(8.0f);
                        }
                        if (height >= 0) {
                            xsVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return mq0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        wz wzVar = this.f46713a;
        if (!wzVar.O) {
            wzVar.h(wzVar.F, wzVar.G, wzVar.I, wzVar.H, wzVar.E, wzVar.K, wzVar.f51663x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i3) {
        return wz.d((org.telegram.messenger.zi) this.f46713a.f51645f.get(i3), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f46713a.P;
    }
}
