package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g10 extends lu0 {
    public final t10 f33798a;

    public g10(t10 t10Var) {
        this.f33798a = t10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f33798a.f37927f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f33798a.f37921b;
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
                            messageObject2 = u7Var.f21657b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = u7Var.f21656a[i13].f20842a;
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
                    vu0 vu0Var = new vu0();
                    vu0Var.f38820b = iArr[0];
                    vu0Var.f38821c = iArr[1];
                    vu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    vu0Var.f38829n = -iArr[1];
                    vu0Var.f38819a = photoImage;
                    vu0Var.f38830o = false;
                    vu0Var.h = photoImage.getRoundRadius(true);
                    vu0Var.e = vu0Var.f38819a.getBitmapSafe();
                    vu0Var.d.getLocationInWindow(iArr);
                    vu0Var.f38825j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - vu0Var.f38821c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return vu0Var;
                        }
                        int height = vu0Var.f38821c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return vu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        t10 t10Var = this.f33798a;
        if (!t10Var.N) {
            t10Var.h(t10Var.E, t10Var.F, t10Var.H, t10Var.G, t10Var.f37945y, t10Var.J, t10Var.f37943w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return t10.d((MessageObject) this.f33798a.f37927f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f33798a.O;
    }
}
