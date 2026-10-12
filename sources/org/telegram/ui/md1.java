package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class md1 extends wu0 {
    public final MediaController.PhotoEntry f40010a;
    public final nd1 f40011b;

    public md1(nd1 nd1Var, MediaController.PhotoEntry photoEntry) {
        this.f40011b = nd1Var;
        this.f40010a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zd1 zd1Var = this.f40011b.f40387a;
        MediaController.PhotoEntry photoEntry = this.f40010a;
        if (photoEntry.imagePath != null) {
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e7) {
                e7.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            zd1Var.B1 = new kj1(file2, file2, "");
            zd1Var.C1 = loadBitmap;
            zd1Var.f44735b2 = 0;
            zd1Var.f44792x0.requestLayout();
            zd1Var.b1(false);
            zd1Var.f44790w1 = null;
            zd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
