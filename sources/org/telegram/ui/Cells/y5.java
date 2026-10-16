package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.sk;
public final class y5 extends FrameLayout {
    public w5[] f22478a;
    public MediaController.AlbumEntry[] f22479b;
    public int f22480c;
    public x5 d;
    public Paint e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.f22478a;
        this.f22479b[i10] = albumEntry;
        if (albumEntry != null) {
            w5 w5Var = w5VarArr[i10];
            org.telegram.ui.Components.z9 z9Var = w5Var.f22385a;
            org.telegram.ui.Components.z9 z9Var2 = w5Var.f22385a;
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
            w5Var.f22386b.setText(albumEntry.bucketName);
            w5Var.f22387c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        w5VarArr[i10].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int B;
        View[] viewArr = this.f22478a;
        if (AndroidUtilities.isTablet()) {
            B = sk.B(4.0f, this.f22480c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f22480c;
        } else {
            B = sk.B(4.0f, this.f22480c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f22480c;
        }
        for (int i12 = 0; i12 < this.f22480c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + B) * i12;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, sk.C(4.0f, B, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            w5[] w5VarArr = this.f22478a;
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
                this.f22480c = i10;
                return;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
