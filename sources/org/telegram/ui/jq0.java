package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class jq0 extends mu0 {
    public final uq0 f34501a;

    public jq0(uq0 uq0Var) {
        this.f34501a = uq0Var;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        uq0 uq0Var = this.f34501a;
        org.telegram.ui.Cells.t5 V = uq0.V(uq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            wu0 wu0Var = new wu0();
            wu0Var.f39095b = iArr[0];
            wu0Var.f39096c = iArr[1];
            wu0Var.d = uq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            wu0Var.f39094a = imageReceiver;
            wu0Var.e = imageReceiver.getBitmapSafe();
            wu0Var.f39101k = V.getScale();
            V.g(false);
            return wu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        uq0 uq0Var = this.f34501a;
        int childCount = uq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = uq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f34501a.f38169b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f15571id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        uq0 uq0Var = this.f34501a;
        if (!uq0Var.f38169b.containsKey(obj2)) {
            return -1;
        }
        uq0Var.f38169b.remove(obj2);
        int indexOf = uq0Var.f38171c.indexOf(obj2);
        if (indexOf >= 0) {
            uq0Var.f38171c.remove(indexOf);
        }
        if (uq0Var.e) {
            uq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        uq0 uq0Var = this.f34501a;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        org.telegram.ui.Cells.t5 V = uq0.V(uq0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.w9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.h6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.h6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) uq0Var.f38175f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        uq0 uq0Var = this.f34501a;
        int childCount = uq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = uq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = uq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= uq0Var.f38175f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f34501a.f38171c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = uq0.V(this.f34501a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        uq0 uq0Var = this.f34501a;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = uq0Var.J.photos.get(i10);
            Y = uq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = uq0Var.f38171c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= uq0Var.f38175f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) uq0Var.f38175f.get(i10);
            Y = uq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = uq0Var.f38171c.indexOf(searchImage.f15571id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = uq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = uq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (uq0Var.e) {
                    i11 = Y;
                }
                t5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        uq0Var.i0(i12);
        uq0Var.f38191s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        uq0 uq0Var = this.f34501a;
        ArrayList arrayList = uq0Var.f38175f;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        if (uq0Var.f38169b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    uq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                uq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        uq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        uq0 uq0Var = this.f34501a;
        uq0Var.f38191s0.i(0, true, true);
        uq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f34501a.f38169b;
    }

    @Override
    public final boolean x(int i10) {
        uq0 uq0Var = this.f34501a;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !uq0Var.f38169b.containsKey(Integer.valueOf(uq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= uq0Var.f38175f.size() || !uq0Var.f38169b.containsKey(((MediaController.SearchImage) uq0Var.f38175f.get(i10)).f15571id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f34501a.E;
    }
}
