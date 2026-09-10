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
public final class nd1 extends tu0 {
    public final MediaController.PhotoEntry f35253a;
    public final od1 f35254b;

    public nd1(od1 od1Var, MediaController.PhotoEntry photoEntry) {
        this.f35254b = od1Var;
        this.f35253a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ae1 ae1Var = this.f35254b.f35470a;
        MediaController.PhotoEntry photoEntry = this.f35253a;
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
            ae1Var.B1 = new lj1(file2, file2, "");
            ae1Var.C1 = loadBitmap;
            ae1Var.f30920b2 = 0;
            ae1Var.f30976x0.requestLayout();
            ae1Var.b1(false);
            ae1Var.f30974w1 = null;
            ae1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
