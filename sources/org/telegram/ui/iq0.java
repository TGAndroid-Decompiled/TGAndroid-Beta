package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class iq0 extends iu0 {
    public final tq0 f40262a;

    public iq0(tq0 tq0Var) {
        this.f40262a = tq0Var;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        tq0 tq0Var = this.f40262a;
        org.telegram.ui.Cells.x5 W = tq0.W(tq0Var, i10);
        if (W != null) {
            org.telegram.ui.Components.y9 imageView = W.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            su0 su0Var = new su0();
            su0Var.f43407b = iArr[0];
            su0Var.f43408c = iArr[1];
            su0Var.d = tq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            su0Var.f43406a = imageReceiver;
            su0Var.e = imageReceiver.getBitmapSafe();
            su0Var.f43413k = W.getScale();
            W.g(false);
            return su0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        tq0 tq0Var = this.f40262a;
        int childCount = tq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.x5) {
                ((org.telegram.ui.Cells.x5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f40262a.f43730b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19542id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        tq0 tq0Var = this.f40262a;
        if (!tq0Var.f43730b.containsKey(obj2)) {
            return -1;
        }
        tq0Var.f43730b.remove(obj2);
        int indexOf = tq0Var.f43732c.indexOf(obj2);
        if (indexOf >= 0) {
            tq0Var.f43732c.remove(indexOf);
        }
        if (tq0Var.e) {
            tq0Var.i0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        tq0 tq0Var = this.f40262a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        org.telegram.ui.Cells.x5 W = tq0.W(tq0Var, i10);
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
            W.e((MediaController.SearchImage) tq0Var.f43736f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        tq0 tq0Var = this.f40262a;
        int childCount = tq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= tq0Var.f43736f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f40262a.f43732c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.x5 W = tq0.W(this.f40262a, i10);
        if (W != null) {
            return W.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Z;
        boolean z10;
        tq0 tq0Var = this.f40262a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = tq0Var.J.photos.get(i10);
            Z = tq0Var.Z(-1, photoEntry);
            if (Z == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Z = tq0Var.f43732c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= tq0Var.f43736f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) tq0Var.f43736f.get(i10);
            Z = tq0Var.Z(-1, searchImage);
            if (Z == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Z = tq0Var.f43732c.indexOf(searchImage.f19542id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = tq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = tq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) childAt;
                if (tq0Var.e) {
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
        tq0Var.j0(i12);
        tq0Var.f43752s0.a();
        return Z;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tq0 tq0Var = this.f40262a;
        ArrayList arrayList = tq0Var.f43736f;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (tq0Var.f43730b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    tq0Var.Z(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                tq0Var.Z(-1, searchImage);
            } else {
                return;
            }
        }
        tq0Var.f0(i11, z10);
    }

    @Override
    public final boolean u() {
        tq0 tq0Var = this.f40262a;
        tq0Var.f43752s0.d(0, true, true);
        tq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f40262a.f43730b;
    }

    @Override
    public final boolean x(int i10) {
        tq0 tq0Var = this.f40262a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !tq0Var.f43730b.containsKey(Integer.valueOf(tq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= tq0Var.f43736f.size() || !tq0Var.f43730b.containsKey(((MediaController.SearchImage) tq0Var.f43736f.get(i10)).f19542id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f40262a.E;
    }
}
