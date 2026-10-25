package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vh;
public final class c6 extends FrameLayout {
    public a6[] f23927a;
    public MediaController.AlbumEntry[] f23928b;
    public int f23929c;
    public b6 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        a6[] a6VarArr = this.f23927a;
        this.f23928b[i10] = albumEntry;
        if (albumEntry != null) {
            a6 a6Var = a6VarArr[i10];
            org.telegram.ui.Components.y9 y9Var = a6Var.f23855a;
            org.telegram.ui.Components.y9 y9Var2 = a6Var.f23855a;
            y9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                y9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    y9Var2.g("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.y6.R4);
                } else {
                    y9Var2.g("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.y6.R4);
                }
            } else {
                y9Var2.setImageDrawable(org.telegram.ui.ActionBar.y6.R4);
            }
            a6Var.f23856b.setText(albumEntry.bucketName);
            a6Var.f23857c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        a6VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int C;
        View[] viewArr = this.f23927a;
        if (AndroidUtilities.isTablet()) {
            C = vh.C(4.0f, this.f23929c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f23929c;
        } else {
            C = vh.C(4.0f, this.f23929c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f23929c;
        }
        for (int i12 = 0; i12 < this.f23929c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + C) * i12;
            layoutParams.width = C;
            layoutParams.height = C;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, vh.D(4.0f, C, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            a6[] a6VarArr = this.f23927a;
            if (i12 < a6VarArr.length) {
                a6 a6Var = a6VarArr[i12];
                if (i12 < i10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                a6Var.setVisibility(i11);
                i12++;
            } else {
                this.f23929c = i10;
                return;
            }
        }
    }

    public void setDelegate(b6 b6Var) {
        this.d = b6Var;
    }
}
