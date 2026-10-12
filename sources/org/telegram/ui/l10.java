package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l10 extends wu0 {
    public final y10 f39621a;

    public l10(y10 y10Var) {
        this.f39621a = y10Var;
    }

    @Override
    public final CharSequence C(int i10) {
        return LocaleController.formatDateAudio(((MessageObject) this.f39621a.f44250f.get(i10)).messageOwner.date, false);
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i11;
        MessageObject messageObject2;
        org.telegram.ui.Components.y9 y9Var;
        if (messageObject != null) {
            ai.w0 w0Var = this.f39621a.f44243b;
            int childCount = w0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = w0Var.getChildAt(i12);
                int[] iArr = new int[2];
                if (childAt instanceof org.telegram.ui.Cells.u7) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    photoImage = null;
                    for (int i13 = 0; i13 < 6; i13++) {
                        if (i13 >= u7Var.f23285e) {
                            messageObject2 = null;
                        } else {
                            messageObject2 = u7Var.f23283b[i13];
                        }
                        if (messageObject2 == null) {
                            break;
                        }
                        if (messageObject2.getId() == messageObject.getId()) {
                            if (i13 >= u7Var.f23285e) {
                                y9Var = null;
                            } else {
                                y9Var = u7Var.f23282a[i13].f22450a;
                            }
                            ImageReceiver imageReceiver = y9Var.getImageReceiver();
                            y9Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j7) {
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) childAt;
                    if (j7Var.getMessage().getId() == messageObject.getId()) {
                        org.telegram.ui.Components.y9 imageView = j7Var.getImageView();
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
                    gv0 gv0Var = new gv0();
                    gv0Var.f38148b = iArr[0];
                    gv0Var.f38149c = iArr[1];
                    gv0Var.d = w0Var;
                    w0Var.getLocationInWindow(iArr);
                    gv0Var.f38158n = -iArr[1];
                    gv0Var.f38147a = photoImage;
                    gv0Var.f38159o = false;
                    gv0Var.h = photoImage.getRoundRadius(true);
                    gv0Var.f38150e = gv0Var.f38147a.getBitmapSafe();
                    gv0Var.d.getLocationInWindow(iArr);
                    gv0Var.f38154j = 0;
                    if (PhotoViewer.N1(messageObject) && (pinnedHeader = w0Var.getPinnedHeader()) != null) {
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            i11 = AndroidUtilities.dp(8.0f);
                        } else {
                            i11 = 0;
                        }
                        int i14 = i11 - gv0Var.f38149c;
                        if (i14 > childAt.getHeight()) {
                            w0Var.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                            return gv0Var;
                        }
                        int height = gv0Var.f38149c - w0Var.getHeight();
                        if (childAt instanceof org.telegram.ui.Cells.j7) {
                            height -= AndroidUtilities.dp(8.0f);
                        }
                        if (height >= 0) {
                            w0Var.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return gv0Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Y() {
        y10 y10Var = this.f39621a;
        if (!y10Var.N) {
            y10Var.h(y10Var.E, y10Var.F, y10Var.H, y10Var.G, y10Var.f44268y, y10Var.J, y10Var.f44266w, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence b0(int i10) {
        return y10.d((MessageObject) this.f39621a.f44250f.get(i10), true, 0, null);
    }

    @Override
    public final int y() {
        return this.f39621a.O;
    }
}
