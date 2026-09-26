package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class iq0 extends lu0 {
    public final tq0 f34571a;

    public iq0(tq0 tq0Var) {
        this.f34571a = tq0Var;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        tq0 tq0Var = this.f34571a;
        org.telegram.ui.Cells.t5 V = tq0.V(tq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            vu0 vu0Var = new vu0();
            vu0Var.f38819b = iArr[0];
            vu0Var.f38820c = iArr[1];
            vu0Var.d = tq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            vu0Var.f38818a = imageReceiver;
            vu0Var.e = imageReceiver.getBitmapSafe();
            vu0Var.f38825k = V.getScale();
            V.g(false);
            return vu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        tq0 tq0Var = this.f34571a;
        int childCount = tq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = tq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f34571a.f38189b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f15826id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        tq0 tq0Var = this.f34571a;
        if (!tq0Var.f38189b.containsKey(obj2)) {
            return -1;
        }
        tq0Var.f38189b.remove(obj2);
        int indexOf = tq0Var.f38191c.indexOf(obj2);
        if (indexOf >= 0) {
            tq0Var.f38191c.remove(indexOf);
        }
        if (tq0Var.e) {
            tq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        tq0 tq0Var = this.f34571a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        org.telegram.ui.Cells.t5 V = tq0.V(tq0Var, i10);
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
            V.e((MediaController.SearchImage) tq0Var.f38195f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        tq0 tq0Var = this.f34571a;
        int childCount = tq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = tq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= tq0Var.f38195f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f34571a.f38191c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = tq0.V(this.f34571a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        tq0 tq0Var = this.f34571a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = tq0Var.J.photos.get(i10);
            Y = tq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = tq0Var.f38191c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= tq0Var.f38195f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) tq0Var.f38195f.get(i10);
            Y = tq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = tq0Var.f38191c.indexOf(searchImage.f15826id);
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
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (tq0Var.e) {
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
        tq0Var.i0(i12);
        tq0Var.f38211s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tq0 tq0Var = this.f34571a;
        ArrayList arrayList = tq0Var.f38195f;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (tq0Var.f38189b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    tq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                tq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        tq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        tq0 tq0Var = this.f34571a;
        tq0Var.f38211s0.i(0, true, true);
        tq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f34571a.f38189b;
    }

    @Override
    public final boolean x(int i10) {
        tq0 tq0Var = this.f34571a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !tq0Var.f38189b.containsKey(Integer.valueOf(tq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= tq0Var.f38195f.size() || !tq0Var.f38189b.containsKey(((MediaController.SearchImage) tq0Var.f38195f.get(i10)).f15826id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f34571a.E;
    }
}
