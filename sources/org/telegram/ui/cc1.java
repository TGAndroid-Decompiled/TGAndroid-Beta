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
public final class cc1 extends bu0 {
    public final MediaController.PhotoEntry f36305a;
    public final dc1 f36306b;

    public cc1(dc1 dc1Var, MediaController.PhotoEntry photoEntry) {
        this.f36306b = dc1Var;
        this.f36305a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        pc1 pc1Var = this.f36306b.f36583a;
        MediaController.PhotoEntry photoEntry = this.f36305a;
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
            pc1Var.C1 = new zh1(file2, file2, "");
            pc1Var.D1 = loadBitmap;
            pc1Var.f40452c2 = 0;
            pc1Var.f40508y0.requestLayout();
            pc1Var.b1(false);
            pc1Var.f40506x1 = null;
            pc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
