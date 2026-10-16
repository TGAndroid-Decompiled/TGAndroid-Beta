package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o10 extends zu0 {
    public final b20 f38516a;

    public o10(b20 b20Var) {
        this.f38516a = b20Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f38516a.f34169f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.z9 z9Var;
        if (messageObject != null) {
            bi.o0 o0Var = this.f38516a.f34163b;
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
                            messageObject2 = u7Var.f22245b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                z9Var = null;
                            } else {
                                z9Var = u7Var.f22244a[i13].f21428a;
                            }
                            ImageReceiver imageReceiver = z9Var.getImageReceiver();
                            z9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.z9 imageView = j7Var.getImageView();
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
                    jv0 jv0Var = new jv0();
                    jv0Var.f37146b = iArr[0];
                    jv0Var.f37147c = iArr[1];
                    jv0Var.d = o0Var;
                    o0Var.getLocationInWindow(iArr);
                    jv0Var.f37155n = -iArr[1];
                    jv0Var.f37145a = photoImage;
                    jv0Var.f37156o = false;
                    jv0Var.h = photoImage.getRoundRadius(true);
                    jv0Var.e = jv0Var.f37145a.getBitmapSafe();
                    jv0Var.d.getLocationInWindow(iArr);
                    jv0Var.f37151j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = o0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - jv0Var.f37147c;
                        if (i14 > childAt.getHeight()) {
                            o0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return jv0Var;
                        }
                        int height = jv0Var.f37147c - o0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            o0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return jv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        b20 b20Var = this.f38516a;
        if (!b20Var.N) {
            b20Var.h(b20Var.E, b20Var.F, b20Var.H, b20Var.G, b20Var.f34187y, b20Var.J, b20Var.f34185w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i10) {
        return b20.d((MessageObject) this.f38516a.f34169f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f38516a.O;
    }
}
