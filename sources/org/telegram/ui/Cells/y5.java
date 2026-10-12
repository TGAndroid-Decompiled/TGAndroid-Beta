package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.yh;
public final class y5 extends FrameLayout {
    public w5[] f22779a;
    public MediaController.AlbumEntry[] f22780b;
    public int f22781c;
    public x5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.f22779a;
        this.f22780b[i10] = albumEntry;
        if (albumEntry != null) {
            w5 w5Var = w5VarArr[i10];
            org.telegram.ui.Components.z9 z9Var = w5Var.f22616a;
            org.telegram.ui.Components.z9 z9Var2 = w5Var.f22616a;
            z9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                z9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    z9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
                } else {
                    z9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
                }
            } else {
                z9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
            }
            w5Var.f22617b.setText(albumEntry.bucketName);
            w5Var.f22618c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        w5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int C;
        View[] viewArr = this.f22779a;
        if (AndroidUtilities.isTablet()) {
            C = yh.C(4.0f, this.f22781c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f22781c;
        } else {
            C = yh.C(4.0f, this.f22781c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f22781c;
        }
        for (int i12 = 0; i12 < this.f22781c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + C) * i12;
            layoutParams.width = C;
            layoutParams.height = C;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, yh.D(4.0f, C, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            w5[] w5VarArr = this.f22779a;
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
                this.f22781c = i10;
                return;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
