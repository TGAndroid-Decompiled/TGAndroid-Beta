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
public final class pc1 extends yt0 {
    public final MediaController.PhotoEntry f37277a;
    public final qc1 f37278b;

    public pc1(qc1 qc1Var, MediaController.PhotoEntry photoEntry) {
        this.f37278b = qc1Var;
        this.f37277a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        cd1 cd1Var = this.f37278b.f37723a;
        MediaController.PhotoEntry photoEntry = this.f37277a;
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
            cd1Var.f33350y1 = new ni1(file2, file2, "");
            cd1Var.f33352z1 = loadBitmap;
            cd1Var.Y1 = 0;
            cd1Var.f33338u0.requestLayout();
            cd1Var.b1(false);
            cd1Var.f33337t1 = null;
            cd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
