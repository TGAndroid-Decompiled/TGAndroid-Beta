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
public final class kd1 extends uu0 {
    public final MediaController.PhotoEntry f39229a;
    public final ld1 f39230b;

    public kd1(ld1 ld1Var, MediaController.PhotoEntry photoEntry) {
        this.f39230b = ld1Var;
        this.f39229a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xd1 xd1Var = this.f39230b.f39546a;
        MediaController.PhotoEntry photoEntry = this.f39229a;
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
            xd1Var.B1 = new jj1(file2, file2, "");
            xd1Var.C1 = loadBitmap;
            xd1Var.f43943b2 = 0;
            xd1Var.f44000x0.requestLayout();
            xd1Var.b1(false);
            xd1Var.f43998w1 = null;
            xd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
