package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class y5 extends FrameLayout {
    public w5[] f24443a;
    public MediaController.AlbumEntry[] f24444b;
    public int f24445c;
    public x5 d;
    public Paint f24446e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.f24443a;
        this.f24444b[i10] = albumEntry;
        if (albumEntry != null) {
            w5 w5Var = w5VarArr[i10];
            org.telegram.ui.Components.p9 p9Var = w5Var.f24359a;
            org.telegram.ui.Components.p9 p9Var2 = w5Var.f24359a;
            p9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                p9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    p9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    p9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.k6.R4);
                }
            } else {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
            }
            w5Var.f24360b.setText(albumEntry.bucketName);
            w5Var.f24361c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        w5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int z4;
        View[] viewArr = this.f24443a;
        if (AndroidUtilities.isTablet()) {
            z4 = org.telegram.ui.b.z(4.0f, this.f24445c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f24445c;
        } else {
            z4 = org.telegram.ui.b.z(4.0f, this.f24445c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f24445c;
        }
        for (int i12 = 0; i12 < this.f24445c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + z4) * i12;
            layoutParams.width = z4;
            layoutParams.height = z4;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, org.telegram.ui.b.B(4.0f, z4, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            w5[] w5VarArr = this.f24443a;
            if (i12 < w5VarArr.length) {
                w5 w5Var = w5VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                w5Var.setVisibility(i11);
                i12++;
            } else {
                this.f24445c = i10;
                return;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
