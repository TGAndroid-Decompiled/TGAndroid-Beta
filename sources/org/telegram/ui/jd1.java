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
public final class jd1 extends tu0 {
    public final MediaController.PhotoEntry f38991a;
    public final kd1 f38992b;

    public jd1(kd1 kd1Var, MediaController.PhotoEntry photoEntry) {
        this.f38992b = kd1Var;
        this.f38991a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wd1 wd1Var = this.f38992b.f39306a;
        MediaController.PhotoEntry photoEntry = this.f38991a;
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
            wd1Var.B1 = new hj1(file2, file2, "");
            wd1Var.C1 = loadBitmap;
            wd1Var.f43331b2 = 0;
            wd1Var.f43388x0.requestLayout();
            wd1Var.b1(false);
            wd1Var.f43386w1 = null;
            wd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
