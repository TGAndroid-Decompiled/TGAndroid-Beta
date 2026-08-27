package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

public final class fr0 extends org.telegram.ui.st0 {

    public final hu0 f28440a;

    public fr0(hu0 hu0Var) {
        this.f28440a = hu0Var;
    }

    @Override
    public final org.telegram.ui.cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        char c10;
        char c11;
        org.telegram.ui.Cells.i7 i7Var;
        MessageObject message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        org.telegram.ui.cu0 cu0Var;
        View pinnedHeader;
        int iDp;
        boolean z12;
        int i11;
        int height;
        hu0 hu0Var = this.f28440a;
        ss0 ss0Var = hu0Var.f29165z1;
        rr0 rr0Var = hu0Var.N0;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (messageObject != null) {
            char c12 = 0;
            zs0 zs0Var = zs0VarArr[0];
            int i12 = zs0Var.B;
            if (i12 == 0 || i12 == 1 || i12 == 3 || i12 == 5) {
                er0 er0Var = zs0Var.h;
                int childCount = er0Var.getChildCount();
                int i13 = -1;
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                while (i14 < childCount) {
                    View childAt = er0Var.getChildAt(i14);
                    int measuredHeight = zs0VarArr[c12].h.getMeasuredHeight();
                    View view = (View) hu0Var.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (hu0Var.getY() + hu0Var.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= hu0Var.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int iR = RecyclerView.R(childAt);
                        if (iR < i15 || i15 == i13) {
                            i15 = iR;
                        }
                        if (iR > i16 || i16 == i13) {
                            i16 = iR;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof org.telegram.ui.Cells.o7) {
                            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) childAt;
                            linkImageView = o7Var.f24786c;
                            MessageObject messageObject2 = o7Var.getMessageObject();
                            if (messageObject2 != null) {
                                c10 = 0;
                                int id2 = messageObject2.getId();
                                c11 = 1;
                                if (id2 == messageObject.getId()) {
                                    o7Var.getLocationInWindow(iArr);
                                    iArr[0] = Math.round(linkImageView.getImageX()) + iArr[0];
                                    iArr[1] = Math.round(linkImageView.getImageY()) + iArr[1];
                                } else {
                                    linkImageView = imageReceiver;
                                }
                                if (linkImageView != null) {
                                    cu0Var = new org.telegram.ui.cu0();
                                    cu0Var.f37154b = iArr[c10];
                                    cu0Var.f37155c = iArr[c11];
                                    cu0Var.d = er0Var;
                                    zs0 zs0Var2 = zs0VarArr[c10];
                                    cu0Var.f37163m = zs0Var2.f35344y;
                                    zs0Var2.h.getLocationInWindow(iArr);
                                    cu0Var.f37164n = -iArr[c11];
                                    cu0Var.f37153a = linkImageView;
                                    cu0Var.f37165o = true;
                                    cu0Var.h = linkImageView.getRoundRadius(true);
                                    cu0Var.f37156e = cu0Var.f37153a.getBitmapSafe();
                                    cu0Var.d.getLocationInWindow(iArr);
                                    cu0Var.f37160j = 0;
                                    cu0Var.f37167q = hu0Var.f29140p1[0].f34335m;
                                    if (rr0Var != null && rr0Var.getVisibility() == 0) {
                                        cu0Var.f37160j = AndroidUtilities.dp(36.0f) + cu0Var.f37160j;
                                    }
                                    if (PhotoViewer.M1(messageObject) && (pinnedHeader = er0Var.getPinnedHeader()) != null) {
                                        if (rr0Var == null && rr0Var.getVisibility() == 0) {
                                            iDp = rr0Var.getHeight() - AndroidUtilities.dp(2.5f);
                                        } else {
                                            iDp = 0;
                                        }
                                        z12 = childAt instanceof org.telegram.ui.Cells.f7;
                                        if (z12) {
                                            iDp += AndroidUtilities.dp(8.0f);
                                        }
                                        i11 = iDp - cu0Var.f37155c;
                                        if (i11 > childAt.getHeight()) {
                                            er0Var.scrollBy(0, -(pinnedHeader.getHeight() + i11));
                                            return cu0Var;
                                        }
                                        height = cu0Var.f37155c - er0Var.getHeight();
                                        if (z12) {
                                            height -= AndroidUtilities.dp(8.0f);
                                        }
                                        if (height >= 0) {
                                            er0Var.scrollBy(0, childAt.getHeight() + height);
                                        }
                                    }
                                    return cu0Var;
                                }
                            }
                        } else {
                            c10 = 0;
                            c11 = 1;
                            if (childAt instanceof org.telegram.ui.Cells.f7) {
                                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) childAt;
                                if (f7Var.getMessage().getId() == messageObject.getId()) {
                                    n9 imageView = f7Var.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                } else {
                                    linkImageView = imageReceiver;
                                }
                            } else {
                                if (childAt instanceof org.telegram.ui.Cells.d2) {
                                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                                    MessageObject messageObject3 = (MessageObject) d2Var.getParentObject();
                                    if (messageObject3 != null && messageObject3.getId() == messageObject.getId()) {
                                        photoImage = d2Var.getPhotoImage();
                                        d2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof org.telegram.ui.Cells.i7) && (message = (i7Var = (org.telegram.ui.Cells.i7) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = i7Var.getLinkImageView();
                                    i7Var.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                                cu0Var = new org.telegram.ui.cu0();
                                cu0Var.f37154b = iArr[c10];
                                cu0Var.f37155c = iArr[c11];
                                cu0Var.d = er0Var;
                                zs0 zs0Var3 = zs0VarArr[c10];
                                cu0Var.f37163m = zs0Var3.f35344y;
                                zs0Var3.h.getLocationInWindow(iArr);
                                cu0Var.f37164n = -iArr[c11];
                                cu0Var.f37153a = linkImageView;
                                cu0Var.f37165o = true;
                                cu0Var.h = linkImageView.getRoundRadius(true);
                                cu0Var.f37156e = cu0Var.f37153a.getBitmapSafe();
                                cu0Var.d.getLocationInWindow(iArr);
                                cu0Var.f37160j = 0;
                                cu0Var.f37167q = hu0Var.f29140p1[0].f34335m;
                                if (rr0Var != null) {
                                    cu0Var.f37160j = AndroidUtilities.dp(36.0f) + cu0Var.f37160j;
                                }
                                if (PhotoViewer.M1(messageObject)) {
                                    if (rr0Var == null) {
                                        iDp = 0;
                                    } else {
                                        iDp = 0;
                                    }
                                    z12 = childAt instanceof org.telegram.ui.Cells.f7;
                                    if (z12) {
                                        iDp += AndroidUtilities.dp(8.0f);
                                    }
                                    i11 = iDp - cu0Var.f37155c;
                                    if (i11 > childAt.getHeight()) {
                                        er0Var.scrollBy(0, -(pinnedHeader.getHeight() + i11));
                                        return cu0Var;
                                    }
                                    height = cu0Var.f37155c - er0Var.getHeight();
                                    if (z12) {
                                        height -= AndroidUtilities.dp(8.0f);
                                    }
                                    if (height >= 0) {
                                        er0Var.scrollBy(0, childAt.getHeight() + height);
                                    }
                                }
                                return cu0Var;
                            }
                        }
                    }
                    i14++;
                    c12 = 0;
                    i13 = -1;
                }
                if (zs0VarArr[0].B != 0 || i15 < 0 || i16 < 0) {
                    return null;
                }
                int iL = hu0Var.D.L(i10);
                if (iL <= i15) {
                    zs0VarArr[0].f35343x.h1(iL, 0);
                    ss0Var.F();
                    return null;
                }
                if (iL < i16 || i16 < 0) {
                    return null;
                }
                zs0VarArr[0].f35343x.i1(iL, 0, true);
                ss0Var.F();
                return null;
            }
        }
        return null;
    }
}
