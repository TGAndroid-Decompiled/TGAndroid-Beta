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
public final class gc1 extends gu0 {
    public final MediaController.PhotoEntry f39608a;
    public final hc1 f39609b;

    public gc1(hc1 hc1Var, MediaController.PhotoEntry photoEntry) {
        this.f39609b = hc1Var;
        this.f39608a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        tc1 tc1Var = this.f39609b.f39979a;
        MediaController.PhotoEntry photoEntry = this.f39608a;
        if (photoEntry.imagePath != null) {
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            tc1Var.C1 = new ci1(file2, file2, "");
            tc1Var.D1 = loadBitmap;
            tc1Var.f43743c2 = 0;
            tc1Var.f43799y0.requestLayout();
            tc1Var.c1(false);
            tc1Var.f43797x1 = null;
            tc1Var.j1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
