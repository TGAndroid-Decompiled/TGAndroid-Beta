package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class pr0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.b6 f41586a;
    public final PhotoViewer f41587b;

    public pr0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f41587b = photoViewer;
        this.f41586a = b6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z10;
        PhotoViewer photoViewer = this.f41587b;
        if (photoViewer.P4 != null || photoViewer.X4 != null) {
            return true;
        }
        if (photoViewer.W4 != null) {
            FileLoader fileLoader = FileLoader.getInstance(photoViewer.P);
            ImageLocation imageLocation = photoViewer.W4;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
            if (imageLocation == null) {
                tL_fileLocationToBeDeprecated = null;
            } else {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            String q12 = PhotoViewer.q1(imageLocation);
            if (photoViewer.f35774v5 == 0 && !photoViewer.f35793x5) {
                z10 = false;
            } else {
                z10 = true;
            }
            File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, q12, z10);
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.P);
            ImageLocation imageLocation2 = photoViewer.W4;
            if (imageLocation2 != null) {
                tL_fileLocationToBeDeprecated2 = imageLocation2.location;
            }
            File pathToAttach2 = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation2), false);
            if (pathToAttach.exists() || file.exists() || pathToAttach2.exists()) {
                return true;
            }
            return false;
        } else if (photoViewer.f35634f7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pr0.b(int):void");
    }
}
