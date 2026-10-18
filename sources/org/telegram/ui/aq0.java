package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class aq0 extends bu0 {
    public final lq0 f35465a;

    public aq0(lq0 lq0Var) {
        this.f35465a = lq0Var;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        lq0 lq0Var = this.f35465a;
        org.telegram.ui.Cells.s5 V = lq0.V(lq0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.w9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            lu0 lu0Var = new lu0();
            lu0Var.f38918b = iArr[0];
            lu0Var.f38919c = iArr[1];
            lu0Var.d = lq0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            lu0Var.f38917a = imageReceiver;
            lu0Var.e = imageReceiver.getBitmapSafe();
            lu0Var.f38924k = V.getScale();
            V.g(false);
            return lu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        lq0 lq0Var = this.f35465a;
        int childCount = lq0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = lq0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f35465a.f38869b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f17792id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        lq0 lq0Var = this.f35465a;
        if (!lq0Var.f38869b.containsKey(obj2)) {
            return -1;
        }
        lq0Var.f38869b.remove(obj2);
        int indexOf = lq0Var.f38871c.indexOf(obj2);
        if (indexOf >= 0) {
            lq0Var.f38871c.remove(indexOf);
        }
        if (lq0Var.e) {
            lq0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i10) {
        lq0 lq0Var = this.f35465a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        org.telegram.ui.Cells.s5 V = lq0.V(lq0Var, i10);
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
            V.e((MediaController.SearchImage) lq0Var.f38875f.get(i10));
        }
    }

    @Override
    public final void a0(int i10) {
        lq0 lq0Var = this.f35465a;
        int childCount = lq0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lq0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = lq0Var.J;
                if (albumEntry == null ? !(intValue < 0 || intValue >= lq0Var.f38875f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
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
        return this.f35465a.f38871c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.s5 V = lq0.V(this.f35465a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        lq0 lq0Var = this.f35465a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = lq0Var.J.photos.get(i10);
            Y = lq0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = lq0Var.f38871c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= lq0Var.f38875f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) lq0Var.f38875f.get(i10);
            Y = lq0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = lq0Var.f38871c.indexOf(searchImage.f17792id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = lq0Var.K.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = lq0Var.K.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (lq0Var.e) {
                    i11 = Y;
                }
                s5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        lq0Var.i0(i12);
        lq0Var.f38891s0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        lq0 lq0Var = this.f35465a;
        ArrayList arrayList = lq0Var.f38875f;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (lq0Var.f38869b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    lq0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                lq0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        lq0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        lq0 lq0Var = this.f35465a;
        lq0Var.f38891s0.h(0, true, true);
        lq0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f35465a.f38869b;
    }

    @Override
    public final boolean x(int i10) {
        lq0 lq0Var = this.f35465a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !lq0Var.f38869b.containsKey(Integer.valueOf(lq0Var.J.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= lq0Var.f38875f.size() || !lq0Var.f38869b.containsKey(((MediaController.SearchImage) lq0Var.f38875f.get(i10)).f17792id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f35465a.E;
    }
}
