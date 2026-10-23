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
public final class dc1 extends cu0 {
    public final MediaController.PhotoEntry f36594a;
    public final ec1 f36595b;

    public dc1(ec1 ec1Var, MediaController.PhotoEntry photoEntry) {
        this.f36595b = ec1Var;
        this.f36594a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        qc1 qc1Var = this.f36595b.f36921a;
        MediaController.PhotoEntry photoEntry = this.f36594a;
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
            qc1Var.C1 = new ai1(file2, file2, "");
            qc1Var.D1 = loadBitmap;
            qc1Var.f40723c2 = 0;
            qc1Var.f40779y0.requestLayout();
            qc1Var.b1(false);
            qc1Var.f40777x1 = null;
            qc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
