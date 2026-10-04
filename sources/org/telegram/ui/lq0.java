package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class lq0 extends ou0 {
    public final wq0 f38317a;

    public lq0(wq0 wq0Var) {
        this.f38317a = wq0Var;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        wq0 wq0Var = this.f38317a;
        org.telegram.ui.Cells.t5 T = wq0.T(wq0Var, i10);
        if (T != null) {
            org.telegram.ui.Components.w9 imageView = T.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            yu0 yu0Var = new yu0();
            yu0Var.f43621b = iArr[0];
            yu0Var.f43622c = iArr[1];
            yu0Var.d = wq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            yu0Var.f43620a = imageReceiver;
            yu0Var.f43623e = imageReceiver.getBitmapSafe();
            yu0Var.f43628k = T.getScale();
            T.g(false);
            return yu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        wq0 wq0Var = this.f38317a;
        int childCount = wq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = wq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f38317a.f42595b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f17251id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        wq0 wq0Var = this.f38317a;
        if (!wq0Var.f42595b.containsKey(obj2)) {
            return -1;
        }
        wq0Var.f42595b.remove(obj2);
        int indexOf = wq0Var.f42597c.indexOf(obj2);
        if (indexOf >= 0) {
            wq0Var.f42597c.remove(indexOf);
        }
        if (wq0Var.f42600e) {
            wq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        wq0 wq0Var = this.f38317a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        org.telegram.ui.Cells.t5 T = wq0.T(wq0Var, i10);
        if (T != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.w9 imageView = T.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.i6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.i6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.i6.R4);
                    return;
                }
            }
            T.e((MediaController.SearchImage) wq0Var.f42602f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        wq0 wq0Var = this.f38317a;
        int childCount = wq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = wq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = wq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= wq0Var.f42602f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f38317a.f42597c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 T = wq0.T(this.f38317a, i10);
        if (T != null) {
            return T.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int X;
        boolean z10;
        wq0 wq0Var = this.f38317a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = wq0Var.J.photos.get(i10);
            X = wq0Var.X(-1, photoEntry);
            if (X == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                X = wq0Var.f42597c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= wq0Var.f42602f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) wq0Var.f42602f.get(i10);
            X = wq0Var.X(-1, searchImage);
            if (X == -1) {
                searchImage.editedInfo = videoEditedInfo;
                X = wq0Var.f42597c.indexOf(searchImage.f17251id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = wq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = wq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (wq0Var.f42600e) {
                    i11 = X;
                }
                t5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        wq0Var.i0(i12);
        wq0Var.f42618s0.a();
        return X;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wq0 wq0Var = this.f38317a;
        ArrayList arrayList = wq0Var.f42602f;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        if (wq0Var.f42595b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    wq0Var.X(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                wq0Var.X(-1, searchImage);
            } else {
                return;
            }
        }
        wq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        wq0 wq0Var = this.f38317a;
        wq0Var.f42618s0.i(0, true, true);
        wq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f38317a.f42595b;
    }

    @Override
    public final boolean x(int i10) {
        wq0 wq0Var = this.f38317a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !wq0Var.f42595b.containsKey(Integer.valueOf(wq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= wq0Var.f42602f.size() || !wq0Var.f42595b.containsKey(((MediaController.SearchImage) wq0Var.f42602f.get(i10)).f17251id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f38317a.E;
    }
}
