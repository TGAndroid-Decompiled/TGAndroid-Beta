package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class k10 extends ou0 {
    public final x10 f37807a;

    public k10(x10 x10Var) {
        this.f37807a = x10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f37807a.f42689f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f37807a.f42682b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = w0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.f23525e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f23523b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.f23525e) {
                                w9Var = null;
                            } else {
                                w9Var = u7Var.f23522a[i13].f22685a;
                            }
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = k7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.f2) {
                        org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                        MessageObject messageObject3 = (MessageObject) f2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = f2Var.getPhotoImage();
                            f2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    yu0 yu0Var = new yu0();
                    yu0Var.f43620b = iArr[0];
                    yu0Var.f43621c = iArr[1];
                    yu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    yu0Var.f43630n = -iArr[1];
                    yu0Var.f43619a = photoImage;
                    yu0Var.f43631o = false;
                    yu0Var.h = photoImage.getRoundRadius(true);
                    yu0Var.f43622e = yu0Var.f43619a.getBitmapSafe();
                    yu0Var.d.getLocationInWindow(iArr);
                    yu0Var.f43626j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - yu0Var.f43621c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return yu0Var;
                        }
                        int height = yu0Var.f43621c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return yu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        x10 x10Var = this.f37807a;
        if (!x10Var.N) {
            x10Var.h(x10Var.E, x10Var.F, x10Var.H, x10Var.G, x10Var.f42707y, x10Var.J, x10Var.f42705w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return x10.d((MessageObject) this.f37807a.f42689f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f37807a.O;
    }
}
