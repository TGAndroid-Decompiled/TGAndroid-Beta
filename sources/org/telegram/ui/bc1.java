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
public final class bc1 extends rt0 {
    public final MediaController.PhotoEntry f36825a;
    public final cc1 f36826b;

    public bc1(cc1 cc1Var, MediaController.PhotoEntry photoEntry) {
        this.f36826b = cc1Var;
        this.f36825a = photoEntry;
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        oc1 oc1Var = this.f36826b.f37167a;
        MediaController.PhotoEntry photoEntry = this.f36825a;
        if (photoEntry.imagePath != null) {
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            oc1Var.f41116x1 = new yh1(file2, file2, "");
            oc1Var.f41119y1 = loadBitmap;
            oc1Var.X1 = 0;
            oc1Var.f41105t0.requestLayout();
            oc1Var.b1(false);
            oc1Var.f41104s1 = null;
            oc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
