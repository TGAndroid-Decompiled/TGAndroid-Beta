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

public final class ac1 extends st0 {

    public final MediaController.PhotoEntry f36508a;

    public final bc1 f36509b;

    public ac1(bc1 bc1Var, MediaController.PhotoEntry photoEntry) {
        this.f36509b = bc1Var;
        this.f36508a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) throws FileNotFoundException {
        nc1 nc1Var = this.f36509b.f36778a;
        MediaController.PhotoEntry photoEntry = this.f36508a;
        if (photoEntry.imagePath != null) {
            File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e9) {
                e9.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            nc1Var.f40795x1 = new xh1(file2, file2, "");
            nc1Var.f40798y1 = bitmapLoadBitmap;
            nc1Var.X1 = 0;
            nc1Var.f40784t0.requestLayout();
            nc1Var.b1(false);
            nc1Var.f40783s1 = null;
            nc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
