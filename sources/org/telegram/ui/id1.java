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
public final class id1 extends tu0 {
    public final MediaController.PhotoEntry f34647a;
    public final jd1 f34648b;

    public id1(jd1 jd1Var, MediaController.PhotoEntry photoEntry) {
        this.f34648b = jd1Var;
        this.f34647a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vd1 vd1Var = this.f34648b.f34857a;
        MediaController.PhotoEntry photoEntry = this.f34647a;
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
            vd1Var.B1 = new gj1(file2, file2, "");
            vd1Var.C1 = loadBitmap;
            vd1Var.f38519b2 = 0;
            vd1Var.f38575x0.requestLayout();
            vd1Var.b1(false);
            vd1Var.f38573w1 = null;
            vd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
