package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class gq0 extends gu0 {
    public final rq0 f39769a;

    public gq0(rq0 rq0Var) {
        this.f39769a = rq0Var;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        rq0 rq0Var = this.f39769a;
        org.telegram.ui.Cells.x5 W = rq0.W(rq0Var, i10);
        if (W != null) {
            org.telegram.ui.Components.y9 imageView = W.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            qu0 qu0Var = new qu0();
            qu0Var.f42917b = iArr[0];
            qu0Var.f42918c = iArr[1];
            qu0Var.d = rq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            qu0Var.f42916a = imageReceiver;
            qu0Var.e = imageReceiver.getBitmapSafe();
            qu0Var.f42923k = W.getScale();
            W.g(false);
            return qu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        rq0 rq0Var = this.f39769a;
        int childCount = rq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = rq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                ((org.telegram.ui.Cells.x5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f39769a.f43241b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19543id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        rq0 rq0Var = this.f39769a;
        if (!rq0Var.f43241b.containsKey(obj2)) {
            return -1;
        }
        rq0Var.f43241b.remove(obj2);
        int indexOf = rq0Var.f43243c.indexOf(obj2);
        if (indexOf >= 0) {
            rq0Var.f43243c.remove(indexOf);
        }
        if (rq0Var.e) {
            rq0Var.i0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        rq0 rq0Var = this.f39769a;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        org.telegram.ui.Cells.x5 W = rq0.W(rq0Var, i10);
        if (W != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.y9 imageView = W.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.g(str, null, org.telegram.ui.ActionBar.y6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.g("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.y6.R4);
                        return;
                    }
                    imageView.g("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.y6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
                    return;
                }
            }
            W.e((MediaController.SearchImage) rq0Var.f43247f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        rq0 rq0Var = this.f39769a;
        int childCount = rq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = rq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = rq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= rq0Var.f43247f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        x5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f39769a.f43243c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.x5 W = rq0.W(this.f39769a, i10);
        if (W != null) {
            return W.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Z;
        boolean z10;
        rq0 rq0Var = this.f39769a;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = rq0Var.J.photos.get(i10);
            Z = rq0Var.Z(-1, photoEntry);
            if (Z == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Z = rq0Var.f43243c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= rq0Var.f43247f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) rq0Var.f43247f.get(i10);
            Z = rq0Var.Z(-1, searchImage);
            if (Z == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Z = rq0Var.f43243c.indexOf(searchImage.f19543id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = rq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = rq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                if (rq0Var.e) {
                    i11 = Z;
                }
                x5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        rq0Var.j0(i12);
        rq0Var.f43263s0.a();
        return Z;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rq0 rq0Var = this.f39769a;
        ArrayList arrayList = rq0Var.f43247f;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        if (rq0Var.f43241b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    rq0Var.Z(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                rq0Var.Z(-1, searchImage);
            } else {
                return;
            }
        }
        rq0Var.f0(i11, z10);
    }

    @Override
    public final boolean u() {
        rq0 rq0Var = this.f39769a;
        rq0Var.f43263s0.d(0, true, true);
        rq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f39769a.f43241b;
    }

    @Override
    public final boolean x(int i10) {
        rq0 rq0Var = this.f39769a;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !rq0Var.f43241b.containsKey(Integer.valueOf(rq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= rq0Var.f43247f.size() || !rq0Var.f43241b.containsKey(((MediaController.SearchImage) rq0Var.f43247f.get(i10)).f19543id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f39769a.E;
    }
}
