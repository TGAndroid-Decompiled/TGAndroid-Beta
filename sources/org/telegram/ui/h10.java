package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h10 extends mu0 {
    public final u10 f33701a;

    public h10(u10 u10Var) {
        this.f33701a = u10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f33701a.f37852f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.w9 w9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f33701a.f37846b;
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
                            messageObject2 = u7Var.f21420b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                w9Var = null;
                            } else {
                                w9Var = u7Var.f21419a[i13].f20599a;
                            }
                            ImageReceiver imageReceiver = w9Var.getImageReceiver();
                            w9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.w9 imageView = j7Var.getImageView();
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
                    wu0 wu0Var = new wu0();
                    wu0Var.f39095b = iArr[0];
                    wu0Var.f39096c = iArr[1];
                    wu0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    wu0Var.f39104n = -iArr[1];
                    wu0Var.f39094a = photoImage;
                    wu0Var.f39105o = false;
                    wu0Var.h = photoImage.getRoundRadius(true);
                    wu0Var.e = wu0Var.f39094a.getBitmapSafe();
                    wu0Var.d.getLocationInWindow(iArr);
                    wu0Var.f39100j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - wu0Var.f39096c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return wu0Var;
                        }
                        int height = wu0Var.f39096c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return wu0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        u10 u10Var = this.f33701a;
        if (!u10Var.N) {
            u10Var.h(u10Var.E, u10Var.F, u10Var.H, u10Var.G, u10Var.f37870y, u10Var.J, u10Var.f37868w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return u10.d((MessageObject) this.f33701a.f37852f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f33701a.O;
    }
}
