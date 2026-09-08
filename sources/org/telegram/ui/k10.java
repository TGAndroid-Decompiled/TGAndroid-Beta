package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k10 extends su0 {
    public final x10 f37914a;

    public k10(x10 x10Var) {
        this.f37914a = x10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f37914a.f42571f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.x9 x9Var;
        if (messageObject != null) {
            bi.o0 o0Var = this.f37914a.f42564b;
            int childCount = o0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = o0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.f23367e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f23365b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.f23367e) {
                                x9Var = null;
                            } else {
                                x9Var = u7Var.f23364a[i13].f22518a;
                            }
                            ImageReceiver imageReceiver = x9Var.getImageReceiver();
                            x9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.x9 imageView = j7Var.getImageView();
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
                    cv0 cv0Var = new cv0();
                    cv0Var.f35568b = iArr[0];
                    cv0Var.f35569c = iArr[1];
                    cv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    cv0Var.f35578n = -iArr[1];
                    cv0Var.f35567a = photoImage;
                    cv0Var.f35579o = false;
                    cv0Var.h = photoImage.getRoundRadius(true);
                    cv0Var.f35570e = cv0Var.f35567a.getBitmapSafe();
                    cv0Var.d.getLocationInWindow(iArr);
                    cv0Var.f35574j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - cv0Var.f35569c;
                        if (i14 > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return cv0Var;
                        }
                        int height = cv0Var.f35569c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return cv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        x10 x10Var = this.f37914a;
        if (!x10Var.N) {
            x10Var.h(x10Var.E, x10Var.F, x10Var.H, x10Var.G, x10Var.f42589y, x10Var.J, x10Var.f42587w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return x10.d((MessageObject) this.f37914a.f42571f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f37914a.O;
    }
}
