package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class w5 extends FrameLayout {
    public u5[] f25866a;
    public MediaController.AlbumEntry[] f25867b;
    public int f25868c;
    public v5 d;
    public Paint f25869e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        u5[] u5VarArr = this.f25866a;
        this.f25867b[i10] = albumEntry;
        if (albumEntry != null) {
            u5 u5Var = u5VarArr[i10];
            org.telegram.ui.Components.t9 t9Var = u5Var.f25731a;
            org.telegram.ui.Components.t9 t9Var2 = u5Var.f25731a;
            t9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                t9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    t9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
                } else {
                    t9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
                }
            } else {
                t9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            }
            u5Var.f25732b.setText(albumEntry.bucketName);
            u5Var.f25733c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        u5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int z10;
        View[] viewArr = this.f25866a;
        if (AndroidUtilities.isTablet()) {
            z10 = org.telegram.ui.b.z(4.0f, this.f25868c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f25868c;
        } else {
            z10 = org.telegram.ui.b.z(4.0f, this.f25868c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f25868c;
        }
        for (int i12 = 0; i12 < this.f25868c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + z10) * i12;
            layoutParams.width = z10;
            layoutParams.height = z10;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, org.telegram.ui.b.B(4.0f, z10, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            u5[] u5VarArr = this.f25866a;
            if (i12 < u5VarArr.length) {
                u5 u5Var = u5VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                u5Var.setVisibility(i11);
                i12++;
            } else {
                this.f25868c = i10;
                return;
            }
        }
    }

    public void setDelegate(v5 v5Var) {
        this.d = v5Var;
    }
}
