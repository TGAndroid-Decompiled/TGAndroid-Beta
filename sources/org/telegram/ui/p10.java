package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p10 extends av0 {
    public final c20 f39095a;

    public p10(c20 c20Var) {
        this.f39095a = c20Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f39095a.f34687f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.z9 z9Var;
        if (messageObject != null) {
            bi.o0 o0Var = this.f39095a.f34681b;
            int childCount = o0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = o0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f22536b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                z9Var = null;
                            } else {
                                z9Var = u7Var.f22535a[i13].f21730a;
                            }
                            ImageReceiver imageReceiver = z9Var.getImageReceiver();
                            z9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k7) {
                    org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) childAt;
                    if (k7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.z9 imageView = k7Var.getImageView();
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
                    kv0 kv0Var = new kv0();
                    kv0Var.f37752b = iArr[0];
                    kv0Var.f37753c = iArr[1];
                    kv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    kv0Var.f37761n = -iArr[1];
                    kv0Var.f37751a = photoImage;
                    kv0Var.f37762o = false;
                    kv0Var.h = photoImage.getRoundRadius(true);
                    kv0Var.e = kv0Var.f37751a.getBitmapSafe();
                    kv0Var.d.getLocationInWindow(iArr);
                    kv0Var.f37757j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - kv0Var.f37753c;
                        if (i14 > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return kv0Var;
                        }
                        int height = kv0Var.f37753c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.k7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return kv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        c20 c20Var = this.f39095a;
        if (!c20Var.N) {
            c20Var.h(c20Var.E, c20Var.F, c20Var.H, c20Var.G, c20Var.f34705y, c20Var.J, c20Var.f34703w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return c20.d((MessageObject) this.f39095a.f34687f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f39095a.O;
    }
}
