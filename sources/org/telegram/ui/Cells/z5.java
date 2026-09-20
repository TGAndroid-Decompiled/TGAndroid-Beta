package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.rk;
public final class z5 extends FrameLayout {
    public x5[] f21915a;
    public MediaController.AlbumEntry[] f21916b;
    public int f21917c;
    public y5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        x5[] x5VarArr = this.f21915a;
        this.f21916b[i10] = albumEntry;
        if (albumEntry != null) {
            x5 x5Var = x5VarArr[i10];
            org.telegram.ui.Components.v9 v9Var = x5Var.f21840a;
            org.telegram.ui.Components.v9 v9Var2 = x5Var.f21840a;
            v9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                v9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    v9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    v9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                v9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
            x5Var.f21841b.setText(albumEntry.bucketName);
            x5Var.f21842c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        x5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int B;
        View[] viewArr = this.f21915a;
        if (AndroidUtilities.isTablet()) {
            B = rk.B(4.0f, this.f21917c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f21917c;
        } else {
            B = rk.B(4.0f, this.f21917c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f21917c;
        }
        for (int i12 = 0; i12 < this.f21917c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + B) * i12;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, rk.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            x5[] x5VarArr = this.f21915a;
            if (i12 < x5VarArr.length) {
                x5 x5Var = x5VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                x5Var.setVisibility(i11);
                i12++;
            } else {
                this.f21917c = i10;
                return;
            }
        }
    }

    public void setDelegate(y5 y5Var) {
        this.d = y5Var;
    }
}
