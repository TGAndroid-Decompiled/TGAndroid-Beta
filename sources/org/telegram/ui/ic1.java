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
public final class ic1 extends iu0 {
    public final MediaController.PhotoEntry f40110a;
    public final jc1 f40111b;

    public ic1(jc1 jc1Var, MediaController.PhotoEntry photoEntry) {
        this.f40111b = jc1Var;
        this.f40110a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        vc1 vc1Var = this.f40111b.f40509a;
        MediaController.PhotoEntry photoEntry = this.f40110a;
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
            vc1Var.C1 = new ei1(file2, file2, "");
            vc1Var.D1 = loadBitmap;
            vc1Var.f44256c2 = 0;
            vc1Var.f44312y0.requestLayout();
            vc1Var.c1(false);
            vc1Var.f44310x1 = null;
            vc1Var.j1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
