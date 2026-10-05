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
public final class cd1 extends ou0 {
    public final MediaController.PhotoEntry f35436a;
    public final dd1 f35437b;

    public cd1(dd1 dd1Var, MediaController.PhotoEntry photoEntry) {
        this.f35437b = dd1Var;
        this.f35436a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        pd1 pd1Var = this.f35437b.f35789a;
        MediaController.PhotoEntry photoEntry = this.f35436a;
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
            pd1Var.B1 = new xi1(file2, file2, "");
            pd1Var.C1 = loadBitmap;
            pd1Var.f39493b2 = 0;
            pd1Var.f39550x0.requestLayout();
            pd1Var.b1(false);
            pd1Var.f39548w1 = null;
            pd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
