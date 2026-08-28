package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class pp0 extends rt0 {
    public final zp0 f41573a;

    public pp0(zp0 zp0Var) {
        this.f41573a = zp0Var;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        zp0 zp0Var = this.f41573a;
        org.telegram.ui.Cells.t5 U = zp0.U(zp0Var, i9);
        if (U != null) {
            org.telegram.ui.Components.o9 imageView = U.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            bu0 bu0Var = new bu0();
            bu0Var.f36979b = iArr[0];
            bu0Var.f36980c = iArr[1];
            bu0Var.d = zp0Var.G;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            bu0Var.f36978a = imageReceiver;
            bu0Var.f36981e = imageReceiver.getBitmapSafe();
            bu0Var.f36986k = U.getScale();
            U.g(false);
            return bu0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        zp0 zp0Var = this.f41573a;
        int childCount = zp0Var.G.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = zp0Var.G.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t5) {
                ((org.telegram.ui.Cells.t5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f41573a.f45208b.size();
    }

    @Override
    public final int Q(Object obj) {
        Object obj2;
        if (obj instanceof MediaController.PhotoEntry) {
            obj2 = Integer.valueOf(((MediaController.PhotoEntry) obj).imageId);
        } else if (obj instanceof MediaController.SearchImage) {
            obj2 = ((MediaController.SearchImage) obj).f19643id;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        zp0 zp0Var = this.f41573a;
        if (!zp0Var.f45208b.containsKey(obj2)) {
            return -1;
        }
        zp0Var.f45208b.remove(obj2);
        int indexOf = zp0Var.f45210c.indexOf(obj2);
        if (indexOf >= 0) {
            zp0Var.f45210c.remove(indexOf);
        }
        if (zp0Var.f45213e) {
            zp0Var.g0();
        }
        return indexOf;
    }

    @Override
    public final void W(int i9) {
        zp0 zp0Var = this.f41573a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        org.telegram.ui.Cells.t5 U = zp0.U(zp0Var, i9);
        if (U != null) {
            if (albumEntry != null) {
                org.telegram.ui.Components.o9 imageView = U.getImageView();
                imageView.q(0, true);
                MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    imageView.f(str, null, org.telegram.ui.ActionBar.f6.R4);
                    return;
                } else if (photoEntry.path != null) {
                    imageView.p(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        imageView.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
                        return;
                    }
                    imageView.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, org.telegram.ui.ActionBar.f6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
                    return;
                }
            }
            U.e((MediaController.SearchImage) zp0Var.f45215f.get(i9));
        }
    }

    @Override
    public final void Z(int i9) {
        zp0 zp0Var = this.f41573a;
        int childCount = zp0Var.G.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zp0Var.G.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null ? !(intValue < 0 || intValue >= zp0Var.f45215f.size()) : !(intValue < 0 || intValue >= albumEntry.photos.size())) {
                    if (intValue == i9) {
                        t5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f41573a.f45210c;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i9) {
        org.telegram.ui.Cells.t5 U = zp0.U(this.f41573a, i9);
        if (U != null) {
            return U.getImageView().getImageReceiver().getBitmapSafe();
        }
        return null;
    }

    @Override
    public final int k(int i9, VideoEditedInfo videoEditedInfo) {
        int X;
        boolean z10;
        zp0 zp0Var = this.f41573a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        int i10 = -1;
        int i11 = 1;
        if (albumEntry != null) {
            if (i9 < 0 || i9 >= albumEntry.photos.size()) {
                return -1;
            }
            MediaController.PhotoEntry photoEntry = zp0Var.F.photos.get(i9);
            X = zp0Var.X(-1, photoEntry);
            if (X == -1) {
                photoEntry.editedInfo = videoEditedInfo;
                X = zp0Var.f45210c.indexOf(Integer.valueOf(photoEntry.imageId));
                z10 = true;
            } else {
                photoEntry.editedInfo = null;
                z10 = false;
            }
        } else if (i9 < 0 || i9 >= zp0Var.f45215f.size()) {
            return -1;
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) zp0Var.f45215f.get(i9);
            X = zp0Var.X(-1, searchImage);
            if (X == -1) {
                searchImage.editedInfo = videoEditedInfo;
                X = zp0Var.f45210c.indexOf(searchImage.f19643id);
                z10 = true;
            } else {
                searchImage.editedInfo = null;
                z10 = false;
            }
        }
        int childCount = zp0Var.G.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = zp0Var.G.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i9) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) childAt;
                if (zp0Var.f45213e) {
                    i10 = X;
                }
                t5Var.b(i10, z10, false);
            } else {
                i12++;
            }
        }
        if (!z10) {
            i11 = 2;
        }
        zp0Var.h0(i11);
        zp0Var.f45225o0.a();
        return X;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        zp0 zp0Var = this.f41573a;
        ArrayList arrayList = zp0Var.f45215f;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (zp0Var.f45208b.isEmpty()) {
            if (albumEntry != null) {
                if (i9 >= 0 && i9 < albumEntry.photos.size()) {
                    MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i9);
                    photoEntry.editedInfo = videoEditedInfo;
                    zp0Var.X(-1, photoEntry);
                } else {
                    return;
                }
            } else if (i9 >= 0 && i9 < arrayList.size()) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) arrayList.get(i9);
                searchImage.editedInfo = videoEditedInfo;
                zp0Var.X(-1, searchImage);
            } else {
                return;
            }
        }
        zp0Var.d0(i10, z10);
    }

    @Override
    public final boolean u() {
        zp0 zp0Var = this.f41573a;
        zp0Var.f45225o0.i(0, true, true);
        zp0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f41573a.f45208b;
    }

    @Override
    public final boolean x(int i9) {
        zp0 zp0Var = this.f41573a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        if (albumEntry != null) {
            if (i9 < 0 || i9 >= albumEntry.photos.size() || !zp0Var.f45208b.containsKey(Integer.valueOf(zp0Var.F.photos.get(i9).imageId))) {
                return false;
            }
            return true;
        } else if (i9 < 0 || i9 >= zp0Var.f45215f.size() || !zp0Var.f45208b.containsKey(((MediaController.SearchImage) zp0Var.f45215f.get(i9)).f19643id)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f41573a.A;
    }
}
