package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h10 extends fu0 {
    public final u10 f34547a;

    public h10(u10 u10Var) {
        this.f34547a = u10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f34547a.f38646f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.p9 p9Var;
        if (messageObject != null) {
            lh.e1 e1Var = this.f34547a.f38640b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = e1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.r7) {
                    org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= r7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = r7Var.f21877b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= r7Var.e) {
                                p9Var = null;
                            } else {
                                p9Var = r7Var.f21876a[i13].f21431a;
                            }
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.h7) {
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) childAt;
                    if (h7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.p9 imageView = h7Var.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                        if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                            photoImage = d2Var.getPhotoImage();
                            d2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    qu0 qu0Var = new qu0();
                    qu0Var.f37488b = iArr[0];
                    qu0Var.f37489c = iArr[1];
                    qu0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    qu0Var.f37497n = -iArr[1];
                    qu0Var.f37487a = photoImage;
                    qu0Var.f37498o = false;
                    qu0Var.h = photoImage.getRoundRadius(true);
                    qu0Var.e = qu0Var.f37487a.getBitmapSafe();
                    qu0Var.d.getLocationInWindow(iArr);
                    qu0Var.f37493j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - qu0Var.f37489c;
                        if (i14 > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return qu0Var;
                        }
                        int height = qu0Var.f37489c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.h7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return qu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        u10 u10Var = this.f34547a;
        if (!u10Var.K) {
            u10Var.h(u10Var.B, u10Var.C, u10Var.E, u10Var.D, u10Var.f38661y, u10Var.G, u10Var.f38659w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return u10.d((MessageObject) this.f34547a.f38646f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f34547a.L;
    }
}
