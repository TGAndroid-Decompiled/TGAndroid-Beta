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
public final class bd1 extends lu0 {
    public final MediaController.PhotoEntry f32380a;
    public final cd1 f32381b;

    public bd1(cd1 cd1Var, MediaController.PhotoEntry photoEntry) {
        this.f32381b = cd1Var;
        this.f32380a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        od1 od1Var = this.f32381b.f32676a;
        MediaController.PhotoEntry photoEntry = this.f32380a;
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
            od1Var.B1 = new zi1(file2, file2, "");
            od1Var.C1 = loadBitmap;
            od1Var.f36134b2 = 0;
            od1Var.f36190x0.requestLayout();
            od1Var.b1(false);
            od1Var.f36188w1 = null;
            od1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
