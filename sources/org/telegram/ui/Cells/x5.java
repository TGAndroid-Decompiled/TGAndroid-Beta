package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wl;
public final class x5 extends FrameLayout {
    public v5[] f23558a;
    public MediaController.AlbumEntry[] f23559b;
    public int f23560c;
    public w5 d;
    public Paint f23561e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        v5[] v5VarArr = this.f23558a;
        this.f23559b[i10] = albumEntry;
        if (albumEntry != null) {
            v5 v5Var = v5VarArr[i10];
            org.telegram.ui.Components.x9 x9Var = v5Var.f23397a;
            org.telegram.ui.Components.x9 x9Var2 = v5Var.f23397a;
            x9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                x9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    x9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    x9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                x9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
            v5Var.f23398b.setText(albumEntry.bucketName);
            v5Var.f23399c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        v5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int A;
        View[] viewArr = this.f23558a;
        if (AndroidUtilities.isTablet()) {
            A = wl.A(4.0f, this.f23560c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f23560c;
        } else {
            A = wl.A(4.0f, this.f23560c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f23560c;
        }
        for (int i12 = 0; i12 < this.f23560c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, wl.C(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            v5[] v5VarArr = this.f23558a;
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
                this.f23560c = i10;
                return;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
