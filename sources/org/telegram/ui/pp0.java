package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pp0 extends pt0 {
    public final zp0 f41444a;

    public pp0(zp0 zp0Var) {
        this.f41444a = zp0Var;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        zp0 zp0Var = this.f41444a;
        org.telegram.ui.Cells.r5 V = zp0.V(zp0Var, i10);
        if (V != null) {
            org.telegram.ui.Components.t9 imageView = V.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            zt0 zt0Var = new zt0();
            zt0Var.f45317b = iArr[0];
            zt0Var.f45318c = iArr[1];
            zt0Var.d = zp0Var.G;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            zt0Var.f45316a = imageReceiver;
            zt0Var.f45319e = imageReceiver.getBitmapSafe();
            zt0Var.f45324k = V.getScale();
            V.g(false);
            return zt0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        zp0 zp0Var = this.f41444a;
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f41444a.f45273b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19614id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        zp0 zp0Var = this.f41444a;
        if (!zp0Var.f45273b.containsKey(obj2)) {
            return -1;
        }
        zp0Var.f45273b.remove(obj2);
        int indexOf = zp0Var.f45275c.indexOf(obj2);
        if (indexOf >= 0) {
            zp0Var.f45275c.remove(indexOf);
        }
        if (zp0Var.f45278e) {
            zp0Var.h0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i10) {
        zp0 zp0Var = this.f41444a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        org.telegram.ui.Cells.r5 V = zp0.V(zp0Var, i10);
        if (V != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.t9 imageView = V.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.g6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.g6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
                    return;
                }
            }
            V.e((MediaController.SearchImage) zp0Var.f45280f.get(i10));
        }
    }

    @Override
    public final void Z(int i10) {
        zp0 zp0Var = this.f41444a;
        int childCount = zp0Var.G.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = zp0Var.G.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f45280f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i10) {
                        r5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f41444a.f45275c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        org.telegram.ui.Cells.r5 V = zp0.V(this.f41444a, i10);
        if (V != null) {
            return V.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        int Y;
        boolean z10;
        zp0 zp0Var = this.f41444a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        int i11 = -1;
        int i12 = 1;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = zp0Var.F.photos.get(i10);
            Y = zp0Var.Y(-1, photoEntry);
            if (Y == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                Y = zp0Var.f45275c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i10 < 0 || i10 >= zp0Var.f45280f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f45280f.get(i10);
            Y = zp0Var.Y(-1, searchImage);
            if (Y == -1) {
                searchImage.editedInfo = videoEditedInfo;
                Y = zp0Var.f45275c.indexOf(searchImage.f19614id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = zp0Var.G.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = zp0Var.G.getChildAt(i13);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                if (zp0Var.f45278e) {
                    i11 = Y;
                }
                r5Var.b(i11, z10, false);
            } else {
                i13++;
            }
        }
        if (!z10) {
            i12 = 2;
        }
        zp0Var.i0(i12);
        zp0Var.f45290o0.a();
        return Y;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zp0 zp0Var = this.f41444a;
        ArrayList arrayList = zp0Var.f45280f;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (zp0Var.f45273b.isEmpty()) {
            if (albumEntry != null) {
                if (i10 >= 0 && i10 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
                    photoEntry.editedInfo = videoEditedInfo;
                    zp0Var.Y(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i10 >= 0 && i10 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i10);
                searchImage.editedInfo = videoEditedInfo;
                zp0Var.Y(-1, searchImage);
            } else {
                return;
            }
        }
        zp0Var.e0(i11, z10);
    }

    @Override
    public final boolean u() {
        zp0 zp0Var = this.f41444a;
        zp0Var.f45290o0.h(0, true, true);
        zp0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f41444a.f45273b;
    }

    @Override
    public final boolean x(int i10) {
        zp0 zp0Var = this.f41444a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            if (i10 < 0 || i10 >= albumEntry.photos.size() || !zp0Var.f45273b.containsKey(Integer.valueOf(zp0Var.F.photos.get(i10).imageId))) {
                return false;
            }
            return true;
        } else if (i10 < 0 || i10 >= zp0Var.f45280f.size() || !zp0Var.f45273b.containsKey(((MediaController.SearchImage) zp0Var.f45280f.get(i10)).f19614id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f41444a.A;
    }
}
