package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.rl;

public final class v5 extends FrameLayout {

    public t5[] f25805a;

    public MediaController.AlbumEntry[] f25806b;

    public int f25807c;
    public u5 d;

    public Paint f25808e;

    public final void a(int i10, MediaController.AlbumEntry albumEntry) {
        t5[] t5VarArr = this.f25805a;
        this.f25806b[i10] = albumEntry;
        if (albumEntry == null) {
            t5VarArr[i10].setVisibility(4);
            return;
        }
        t5 t5Var = t5VarArr[i10];
        org.telegram.ui.Components.n9 n9Var = t5Var.f25671a;
        org.telegram.ui.Components.n9 n9Var2 = t5Var.f25671a;
        n9Var.q(0, true);
        MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
        if (photoEntry == null || photoEntry.path == null) {
            n9Var2.setImageDrawable(org.telegram.ui.ActionBar.g6.R4);
        } else {
            n9Var2.p(photoEntry.orientation, photoEntry.invert, true);
            if (albumEntry.coverPhoto.isVideo) {
                n9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
            } else {
                n9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.g6.R4);
            }
        }
        t5Var.f25672b.setText(albumEntry.bucketName);
        t5Var.f25673c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.f25805a;
        int iZ = AndroidUtilities.isTablet() ? rl.z(4.0f, this.f25807c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f25807c : rl.z(4.0f, this.f25807c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f25807c;
        for (int i12 = 0; i12 < this.f25807c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + iZ) * i12;
            layoutParams.width = iZ;
            layoutParams.height = iZ;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, rl.B(4.0f, iZ, 1073741824));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            t5[] t5VarArr = this.f25805a;
            if (i11 >= t5VarArr.length) {
                this.f25807c = i10;
                return;
            } else {
                t5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
