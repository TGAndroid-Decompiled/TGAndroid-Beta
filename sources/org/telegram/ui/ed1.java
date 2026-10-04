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
public final class ed1 extends ou0 {
    public final MediaController.PhotoEntry f35989a;
    public final fd1 f35990b;

    public ed1(fd1 fd1Var, MediaController.PhotoEntry photoEntry) {
        this.f35990b = fd1Var;
        this.f35989a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        rd1 rd1Var = this.f35990b.f36276a;
        MediaController.PhotoEntry photoEntry = this.f35989a;
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
            rd1Var.B1 = new zi1(file2, file2, "");
            rd1Var.C1 = loadBitmap;
            rd1Var.f40038b2 = 0;
            rd1Var.f40095x0.requestLayout();
            rd1Var.b1(false);
            rd1Var.f40093w1 = null;
            rd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
