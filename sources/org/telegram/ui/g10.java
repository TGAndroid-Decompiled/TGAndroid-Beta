package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g10 extends yt0 {
    public final t10 f34432a;

    public g10(t10 t10Var) {
        this.f34432a = t10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f34432a.f38480f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.p9 p9Var;
        if (messageObject != null) {
            lh.e1 e1Var = this.f34432a.f38474b;
            int childCount = e1Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = e1Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= s7Var.e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = s7Var.f21946b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= s7Var.e) {
                                p9Var = null;
                            } else {
                                p9Var = s7Var.f21945a[i13].f21521a;
                            }
                            ImageReceiver imageReceiver = p9Var.getImageReceiver();
                            p9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i7) {
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) childAt;
                    if (i7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.p9 imageView = i7Var.getImageView();
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
                    ju0 ju0Var = new ju0();
                    ju0Var.f35496b = iArr[0];
                    ju0Var.f35497c = iArr[1];
                    ju0Var.d = e1Var;
                    e1Var.getLocationInWindow(iArr);
                    ju0Var.f35505n = -iArr[1];
                    ju0Var.f35495a = photoImage;
                    ju0Var.f35506o = false;
                    ju0Var.h = photoImage.getRoundRadius(true);
                    ju0Var.e = ju0Var.f35495a.getBitmapSafe();
                    ju0Var.d.getLocationInWindow(iArr);
                    ju0Var.f35501j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = e1Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - ju0Var.f35497c;
                        if (i14 > childAt.getHeight()) {
                            e1Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return ju0Var;
                        }
                        int height = ju0Var.f35497c - e1Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.i7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            e1Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return ju0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        t10 t10Var = this.f34432a;
        if (!t10Var.K) {
            t10Var.h(t10Var.B, t10Var.C, t10Var.E, t10Var.D, t10Var.f38495y, t10Var.G, t10Var.f38493w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return t10.d((MessageObject) this.f34432a.f38480f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f34432a.L;
    }
}
