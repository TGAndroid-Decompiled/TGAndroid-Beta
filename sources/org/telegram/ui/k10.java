package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k10 extends tu0 {
    public final x10 f35021a;

    public k10(x10 x10Var) {
        this.f35021a = x10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f35021a.f39443f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.u9 u9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f35021a.f39437b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = w0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f21434b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                u9Var = null;
                            } else {
                                u9Var = u7Var.f21433a[i13].f20608a;
                            }
                            ImageReceiver imageReceiver = u9Var.getImageReceiver();
                            u9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.u9 imageView = j7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.e2) {
                        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                        MessageObject messageObject3 = (MessageObject) e2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = e2Var.getPhotoImage();
                            e2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    dv0 dv0Var = new dv0();
                    dv0Var.f33097b = iArr[0];
                    dv0Var.f33098c = iArr[1];
                    dv0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    dv0Var.f33106n = -iArr[1];
                    dv0Var.f33096a = photoImage;
                    dv0Var.f33107o = false;
                    dv0Var.h = photoImage.getRoundRadius(true);
                    dv0Var.e = dv0Var.f33096a.getBitmapSafe();
                    dv0Var.d.getLocationInWindow(iArr);
                    dv0Var.f33102j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - dv0Var.f33098c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return dv0Var;
                        }
                        int height = dv0Var.f33098c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return dv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        x10 x10Var = this.f35021a;
        if (!x10Var.N) {
            x10Var.h(x10Var.E, x10Var.F, x10Var.H, x10Var.G, x10Var.f39461y, x10Var.J, x10Var.f39459w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return x10.d((MessageObject) this.f35021a.f39443f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f35021a.O;
    }
}
