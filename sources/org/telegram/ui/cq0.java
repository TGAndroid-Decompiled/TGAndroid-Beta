package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class cq0 extends fu0 {
    public final mq0 f33209a;

    public cq0(mq0 mq0Var) {
        this.f33209a = mq0Var;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        mq0 mq0Var = this.f33209a;
        org.telegram.ui.Cells.s5 V = mq0.V(mq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.p9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            qu0 qu0Var = new qu0();
            qu0Var.f37488b = iArr[0];
            qu0Var.f37489c = iArr[1];
            qu0Var.d = mq0Var.H;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            qu0Var.f37487a = imageReceiver;
            qu0Var.e = imageReceiver.getBitmapSafe();
            qu0Var.f37494k = V.getScale();
            V.g(false);
            return qu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        mq0 mq0Var = this.f33209a;
        int childCount = mq0Var.H.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = mq0Var.H.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f33209a.f36163b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f16643id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        mq0 mq0Var = this.f33209a;
        if (!mq0Var.f36163b.containsKey(obj2)) {
            return -1;
        }
        mq0Var.f36163b.remove(obj2);
        int indexOf = mq0Var.f36165c.indexOf(obj2);
        if (indexOf >= 0) {
            mq0Var.f36165c.remove(indexOf);
        }
        if (mq0Var.e) {
            mq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        mq0 mq0Var = this.f33209a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        org.telegram.ui.Cells.s5 V = mq0.V(mq0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.p9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) mq0Var.f36169f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        mq0 mq0Var = this.f33209a;
        int childCount = mq0Var.H.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = mq0Var.H.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = mq0Var.G;
                if (albumEntry == null ? !(intValue < 0 || intValue >= mq0Var.f36169f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f33209a.f36165c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = mq0.V(this.f33209a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z4;
        mq0 mq0Var = this.f33209a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = mq0Var.G.photos.get(i10);
            Y = mq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = mq0Var.f36165c.indexOf(Integer.valueOf(photoEntry.imageId));
                z4 = true;
            } else {
                photoEntry.editedInfo = null;
                z4 = false;
            }
        } else if (i10 < 0 || i10 >= mq0Var.f36169f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f36169f.get(i10);
            Y = mq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = mq0Var.f36165c.indexOf(searchImage.f16643id);
                z4 = true;
            } else {
                searchImage.editedInfo = null;
                z4 = false;
            }
        }
        int childCount = mq0Var.H.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = mq0Var.H.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (mq0Var.e) {
                    i11 = Y;
                }
                s5Var.b(i11, z4, false);
            } else {
                i13++;
            }
        }
        if (!z4) {
            i12 = 2;
        }
        mq0Var.i0(i12);
        mq0Var.f36180p0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        mq0 mq0Var = this.f33209a;
        ArrayList arrayList = mq0Var.f36169f;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (mq0Var.f36163b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    mq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                mq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        mq0Var.e0(i11, z4);
    }

    @Override
    public final boolean u() {
        mq0 mq0Var = this.f33209a;
        mq0Var.f36180p0.f(0, true, true);
        mq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f33209a.f36163b;
    }

    @Override
    public final boolean x(int i10) {
        mq0 mq0Var = this.f33209a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !mq0Var.f36163b.containsKey(Integer.valueOf(mq0Var.G.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= mq0Var.f36169f.size() || !mq0Var.f36163b.containsKey(((MediaController.SearchImage) mq0Var.f36169f.get(i10)).f16643id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f33209a.B;
    }
}
