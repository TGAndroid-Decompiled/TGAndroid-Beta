package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class or0 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.c6 f41215a;
    public final PhotoViewer f41216b;

    public or0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f41216b = photoViewer;
        this.f41215a = c6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z10;
        PhotoViewer photoViewer = this.f41216b;
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
            if (photoViewer.f35841v5 == 0 && !photoViewer.f35860x5) {
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
        } else if (photoViewer.f35700f7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or0.b(int):void");
    }
}
