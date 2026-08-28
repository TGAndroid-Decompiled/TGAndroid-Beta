package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ll;
public final class y5 extends FrameLayout {
    public w5[] f25991a;
    public MediaController.AlbumEntry[] f25992b;
    public int f25993c;
    public x5 d;
    public Paint f25994e;

    public final void a(int i9, MediaController.AlbumEntry albumEntry) {
        w5[] w5VarArr = this.f25991a;
        this.f25992b[i9] = albumEntry;
        if (albumEntry != null) {
            w5 w5Var = w5VarArr[i9];
            org.telegram.ui.Components.o9 o9Var = w5Var.f25899a;
            org.telegram.ui.Components.o9 o9Var2 = w5Var.f25899a;
            o9Var.q(0, true);
            MediaController.PhotoEntry photoEntry = albumEntry.coverPhoto;
            if (photoEntry != null && photoEntry.path != null) {
                o9Var2.p(photoEntry.orientation, photoEntry.invert, true);
                if (albumEntry.coverPhoto.isVideo) {
                    o9Var2.f("vthumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.f6.R4);
                } else {
                    o9Var2.f("thumb://" + albumEntry.coverPhoto.imageId + ":" + albumEntry.coverPhoto.path, null, org.telegram.ui.ActionBar.f6.R4);
                }
            } else {
                o9Var2.setImageDrawable(org.telegram.ui.ActionBar.f6.R4);
            }
            w5Var.f25900b.setText(albumEntry.bucketName);
            w5Var.f25901c.setText(String.format("%d", Integer.valueOf(albumEntry.photos.size())));
            return;
        }
        w5VarArr[i9].setVisibility(4);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int A;
        View[] viewArr = this.f25991a;
        if (AndroidUtilities.isTablet()) {
            A = ll.A(4.0f, this.f25993c - 1, AndroidUtilities.dp(490.0f) - AndroidUtilities.dp(12.0f)) / this.f25993c;
        } else {
            A = ll.A(4.0f, this.f25993c - 1, AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) / this.f25993c;
        }
        for (int i11 = 0; i11 < this.f25993c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = AndroidUtilities.dp(4.0f);
            layoutParams.leftMargin = (AndroidUtilities.dp(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i9, ll.C(4.0f, A, 1073741824));
    }

    public void setAlbumsCount(int i9) {
        int i10;
        int i11 = 0;
        while (true) {
            w5[] w5VarArr = this.f25991a;
            if (i11 < w5VarArr.length) {
                w5 w5Var = w5VarArr[i11];
                if (i11 < i9) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                w5Var.setVisibility(i10);
                i11++;
            } else {
                this.f25993c = i9;
                return;
            }
        }
    }

    public void setDelegate(x5 x5Var) {
        this.d = x5Var;
    }
}
