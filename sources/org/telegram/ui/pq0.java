package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pq0 extends tu0 {
    public final ar0 f36669a;

    public pq0(ar0 ar0Var) {
        this.f36669a = ar0Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ar0 ar0Var = this.f36669a;
        org.telegram.ui.Cells.t5 V = ar0.V(ar0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.u9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            dv0 dv0Var = new dv0();
            dv0Var.f33097b = iArr[0];
            dv0Var.f33098c = iArr[1];
            dv0Var.d = ar0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            dv0Var.f33096a = imageReceiver;
            dv0Var.e = imageReceiver.getBitmapSafe();
            dv0Var.f33103k = V.getScale();
            V.g(false);
            return dv0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        ar0 ar0Var = this.f36669a;
        int childCount = ar0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ar0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f36669a.f31895b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f15595id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        ar0 ar0Var = this.f36669a;
        if (!ar0Var.f31895b.containsKey(obj2)) {
            return -1;
        }
        ar0Var.f31895b.remove(obj2);
        int indexOf = ar0Var.f31897c.indexOf(obj2);
        if (indexOf >= 0) {
            ar0Var.f31897c.remove(indexOf);
        }
        if (ar0Var.e) {
            ar0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        ar0 ar0Var = this.f36669a;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        org.telegram.ui.Cells.t5 V = ar0.V(ar0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.u9 imageView = V.getImageView();
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
            V.e((MediaController.SearchImage) ar0Var.f31901f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        ar0 ar0Var = this.f36669a;
        int childCount = ar0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ar0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = ar0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= ar0Var.f31901f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f36669a.f31897c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.t5 V = ar0.V(this.f36669a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        ar0 ar0Var = this.f36669a;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = ar0Var.J.photos.get(i10);
            Y = ar0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = ar0Var.f31897c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= ar0Var.f31901f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) ar0Var.f31901f.get(i10);
            Y = ar0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = ar0Var.f31897c.indexOf(searchImage.f15595id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = ar0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = ar0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (ar0Var.e) {
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
        ar0Var.i0(i12);
        ar0Var.f31917s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ar0 ar0Var = this.f36669a;
        ArrayList arrayList = ar0Var.f31901f;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        if (ar0Var.f31895b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    ar0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                ar0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        ar0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        ar0 ar0Var = this.f36669a;
        ar0Var.f31917s0.i(0, true, true);
        ar0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f36669a.f31895b;
    }

    @Override
    public final boolean x(int i10) {
        ar0 ar0Var = this.f36669a;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !ar0Var.f31895b.containsKey(Integer.valueOf(ar0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= ar0Var.f31901f.size() || !ar0Var.f31895b.containsKey(((MediaController.SearchImage) ar0Var.f31901f.get(i10)).f15595id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f36669a.E;
    }
}
