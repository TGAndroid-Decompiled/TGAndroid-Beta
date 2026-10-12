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
public final class pd1 extends av0 {
    public final MediaController.PhotoEntry f39198a;
    public final qd1 f39199b;

    public pd1(qd1 qd1Var, MediaController.PhotoEntry photoEntry) {
        this.f39199b = qd1Var;
        this.f39198a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ce1 ce1Var = this.f39199b.f39392a;
        MediaController.PhotoEntry photoEntry = this.f39198a;
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
            ce1Var.B1 = new qj1(file2, file2, "");
            ce1Var.C1 = loadBitmap;
            ce1Var.f34859b2 = 0;
            ce1Var.f34915x0.requestLayout();
            ce1Var.b1(false);
            ce1Var.f34913w1 = null;
            ce1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
