package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i10 extends tu0 {
    public final v10 f38587a;

    public i10(v10 v10Var) {
        this.f38587a = v10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f38587a.f42871f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.y9 y9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f38587a.f42864b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = w0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.f23541e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f23539b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.f23541e) {
                                y9Var = null;
                            } else {
                                y9Var = u7Var.f23538a[i13].f22715a;
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
                    dv0 dv0Var = new dv0();
                    dv0Var.f37148b = iArr[0];
                    dv0Var.f37149c = iArr[1];
                    dv0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    dv0Var.f37158n = -iArr[1];
                    dv0Var.f37147a = photoImage;
                    dv0Var.f37159o = false;
                    dv0Var.h = photoImage.getRoundRadius(true);
                    dv0Var.f37150e = dv0Var.f37147a.getBitmapSafe();
                    dv0Var.d.getLocationInWindow(iArr);
                    dv0Var.f37154j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - dv0Var.f37149c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return dv0Var;
                        }
                        int height = dv0Var.f37149c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
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
        v10 v10Var = this.f38587a;
        if (!v10Var.N) {
            v10Var.h(v10Var.E, v10Var.F, v10Var.H, v10Var.G, v10Var.f42889y, v10Var.J, v10Var.f42887w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return v10.d((MessageObject) this.f38587a.f42871f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f38587a.O;
    }
}
