package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class ds0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g6 f36250a;
    public final PhotoViewer f36251b;

    public ds0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f36251b = photoViewer;
        this.f36250a = g6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z4;
        PhotoViewer photoViewer = this.f36251b;
        if (photoViewer.Q4 != null || photoViewer.Y4 != null) {
            return true;
        }
        if (photoViewer.X4 != null) {
            FileLoader fileLoader = FileLoader.getInstance(photoViewer.Q);
            ImageLocation imageLocation = photoViewer.X4;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
            if (imageLocation == null) {
                tL_fileLocationToBeDeprecated = null;
            } else {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            String q12 = PhotoViewer.q1(imageLocation);
            if (photoViewer.f34425w5 == 0 && !photoViewer.f34445y5) {
                z4 = false;
            } else {
                z4 = true;
            }
            File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, q12, z4);
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.Q);
            ImageLocation imageLocation2 = photoViewer.X4;
            if (imageLocation2 != null) {
                tL_fileLocationToBeDeprecated2 = imageLocation2.location;
            }
            File pathToAttach2 = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation2), false);
            if (pathToAttach.exists() || file.exists() || pathToAttach2.exists()) {
                return true;
            }
            return false;
        } else if (photoViewer.f34283g7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ds0.b(int):void");
    }
}
