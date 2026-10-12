package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.am;
public final class y5 extends FrameLayout {
    public w5[] f23537a;
    public MediaController.AlbumEntry[] f23538b;
    public int f23539c;
    public x5 d;
    public Paint f23540e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.f23537a;
        this.f23538b[i10] = albumEntry;
        if (albumEntry != null) {
            w5 w5Var = w5VarArr[i10];
            org.telegram.ui.Components.y9 y9Var = w5Var.f23432a;
            org.telegram.ui.Components.y9 y9Var2 = w5Var.f23432a;
            y9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                y9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    y9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.h6.R4);
                } else {
                    y9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.h6.R4);
                }
            } else {
                y9Var2.setImageDrawable(org.telegram.ui.ActionBar.h6.R4);
            }
            w5Var.f23433b.setText(albumEntry.bucketName);
            w5Var.f23434c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        w5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int B;
        View[] viewArr = this.f23537a;
        if (AndroidUtilities.isTablet()) {
            B = am.B(4.0f, this.f23539c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f23539c;
        } else {
            B = am.B(4.0f, this.f23539c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f23539c;
        }
        for (int i12 = 0; i12 < this.f23539c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + B) * i12;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, am.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            w5[] w5VarArr = this.f23537a;
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
                this.f23539c = i10;
                return;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
