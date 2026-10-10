package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j10 extends uu0 {
    public final w10 f38846a;

    public j10(w10 w10Var) {
        this.f38846a = w10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f38846a.f43095f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.y9 y9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f38846a.f43088b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = w0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.f23517e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f23515b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.f23517e) {
                                y9Var = null;
                            } else {
                                y9Var = u7Var.f23514a[i13].f22691a;
                            }
                            ImageReceiver imageReceiver = y9Var.getImageReceiver();
                            y9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y9 imageView = k7Var.getImageView();
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
                    ev0 ev0Var = new ev0();
                    ev0Var.f37401b = iArr[0];
                    ev0Var.f37402c = iArr[1];
                    ev0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    ev0Var.f37411n = -iArr[1];
                    ev0Var.f37400a = photoImage;
                    ev0Var.f37412o = false;
                    ev0Var.h = photoImage.getRoundRadius(true);
                    ev0Var.f37403e = ev0Var.f37400a.getBitmapSafe();
                    ev0Var.d.getLocationInWindow(iArr);
                    ev0Var.f37407j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - ev0Var.f37402c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return ev0Var;
                        }
                        int height = ev0Var.f37402c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ev0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        w10 w10Var = this.f38846a;
        if (!w10Var.N) {
            w10Var.h(w10Var.E, w10Var.F, w10Var.H, w10Var.G, w10Var.f43113y, w10Var.J, w10Var.f43111w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return w10.d((MessageObject) this.f38846a.f43095f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f38846a.O;
    }
}
