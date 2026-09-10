package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.em;
public final class z5 extends FrameLayout {
    public x5[] f20784a;
    public MediaController.AlbumEntry[] f20785b;
    public int f20786c;
    public y5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        x5[] x5VarArr = this.f20784a;
        this.f20785b[i10] = albumEntry;
        if (albumEntry != null) {
            x5 x5Var = x5VarArr[i10];
            org.telegram.ui.Components.w9 w9Var = x5Var.f20708a;
            org.telegram.ui.Components.w9 w9Var2 = x5Var.f20708a;
            w9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                w9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    w9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    w9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.j6.R4);
                }
            } else {
                w9Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
            }
            x5Var.f20709b.setText(albumEntry.bucketName);
            x5Var.f20710c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        x5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int A;
        View[] viewArr = this.f20784a;
        if (AndroidUtilities.isTablet()) {
            A = em.A(4.0f, this.f20786c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f20786c;
        } else {
            A = em.A(4.0f, this.f20786c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f20786c;
        }
        for (int i12 = 0; i12 < this.f20786c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, em.C(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            x5[] x5VarArr = this.f20784a;
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
                this.f20786c = i10;
                return;
            }
        }
    }

    public void setDelegate(y5 y5Var) {
        this.d = y5Var;
    }
}
