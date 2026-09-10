package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m10 extends tu0 {
    public final z10 f34818a;

    public m10(z10 z10Var) {
        this.f34818a = z10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f34818a.f39168f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            bi.y1 y1Var = this.f34818a.f39162b;
            int childCount = y1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = y1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.v7) {
                    org.telegram.ui.Cells.v7 v7Var = (org.telegram.ui.Cells.v7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= v7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = v7Var.f20560b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= v7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = v7Var.f20559a[i13].f19895a;
                            }
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.l7) {
                    org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) childAt;
                    if (l7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = l7Var.getImageView();
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
                    ev0 ev0Var = new ev0();
                    ev0Var.f32617b = iArr[0];
                    ev0Var.f32618c = iArr[1];
                    ev0Var.d = y1Var;
                    y1Var.getLocationInWindow(iArr);
                    ev0Var.f32626n = -iArr[1];
                    ev0Var.f32616a = photoImage;
                    ev0Var.f32627o = false;
                    ev0Var.h = photoImage.getRoundRadius(true);
                    ev0Var.e = ev0Var.f32616a.getBitmapSafe();
                    ev0Var.d.getLocationInWindow(iArr);
                    ev0Var.f32622j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = y1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - ev0Var.f32618c;
                        if (i14 > childAt.getHeight()) {
                            y1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return ev0Var;
                        }
                        int height = ev0Var.f32618c - y1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.l7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            y1Var.scrollBy(0, childAt.getHeight() + height);
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
        z10 z10Var = this.f34818a;
        if (!z10Var.N) {
            z10Var.h(z10Var.E, z10Var.F, z10Var.H, z10Var.G, z10Var.f39186y, z10Var.J, z10Var.f39184w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return z10.d((MessageObject) this.f34818a.f39168f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f34818a.O;
    }
}
