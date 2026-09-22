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
public final class kd1 extends tu0 {
    public final MediaController.PhotoEntry f35150a;
    public final ld1 f35151b;

    public kd1(ld1 ld1Var, MediaController.PhotoEntry photoEntry) {
        this.f35151b = ld1Var;
        this.f35150a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xd1 xd1Var = this.f35151b.f35442a;
        MediaController.PhotoEntry photoEntry = this.f35150a;
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
            xd1Var.B1 = new gj1(file2, file2, "");
            xd1Var.C1 = loadBitmap;
            xd1Var.f39500b2 = 0;
            xd1Var.f39556x0.requestLayout();
            xd1Var.b1(false);
            xd1Var.f39554w1 = null;
            xd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
