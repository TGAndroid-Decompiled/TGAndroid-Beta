package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m10 extends vu0 {
    public final z10 f35662a;

    public m10(z10 z10Var) {
        this.f35662a = z10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f35662a.f40077f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.u9 u9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f35662a.f40071b;
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
                            messageObject2 = u7Var.f21453b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.e) {
                                u9Var = null;
                            } else {
                                u9Var = u7Var.f21452a[i13].f20620a;
                            }
                            ImageReceiver imageReceiver = u9Var.getImageReceiver();
                            u9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.u9 imageView = j7Var.getImageView();
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
                    fv0 fv0Var = new fv0();
                    fv0Var.f33764b = iArr[0];
                    fv0Var.f33765c = iArr[1];
                    fv0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    fv0Var.f33773n = -iArr[1];
                    fv0Var.f33763a = photoImage;
                    fv0Var.f33774o = false;
                    fv0Var.h = photoImage.getRoundRadius(true);
                    fv0Var.e = fv0Var.f33763a.getBitmapSafe();
                    fv0Var.d.getLocationInWindow(iArr);
                    fv0Var.f33769j = 0;
                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - fv0Var.f33765c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return fv0Var;
                        }
                        int height = fv0Var.f33765c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        z10 z10Var = this.f35662a;
        if (!z10Var.N) {
            z10Var.h(z10Var.E, z10Var.F, z10Var.H, z10Var.G, z10Var.f40095y, z10Var.J, z10Var.f40093w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return z10.d((MessageObject) this.f35662a.f40077f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f35662a.O;
    }
}
