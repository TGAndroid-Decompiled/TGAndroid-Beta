package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class x5 extends FrameLayout {
    public v5[] f22545a;
    public MediaController.AlbumEntry[] f22546b;
    public int f22547c;
    public w5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        v5[] v5VarArr = this.f22545a;
        this.f22546b[i10] = albumEntry;
        if (albumEntry != null) {
            v5 v5Var = v5VarArr[i10];
            org.telegram.ui.Components.p9 p9Var = v5Var.f22468a;
            org.telegram.ui.Components.p9 p9Var2 = v5Var.f22468a;
            p9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                p9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    p9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    p9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                p9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
            v5Var.f22469b.setText(albumEntry.bucketName);
            v5Var.f22470c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        v5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int z4;
        View[] viewArr = this.f22545a;
        if (AndroidUtilities.isTablet()) {
            z4 = org.telegram.ui.b.z(4.0f, this.f22547c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f22547c;
        } else {
            z4 = org.telegram.ui.b.z(4.0f, this.f22547c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f22547c;
        }
        for (int i12 = 0; i12 < this.f22547c; i12++) {
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
            v5[] v5VarArr = this.f22545a;
            if (i12 < v5VarArr.length) {
                v5 v5Var = v5VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                v5Var.setVisibility(i11);
                i12++;
            } else {
                this.f22547c = i10;
                return;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
