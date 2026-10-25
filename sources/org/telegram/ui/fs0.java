package org.telegram.ui;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
public final class fs0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.u6 f39439a;
    public final PhotoViewer f39440b;

    public fs0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f39440b = photoViewer;
        this.f39439a = u6Var;
    }

    @Override
    public final boolean a() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z10;
        PhotoViewer photoViewer = this.f39440b;
        if (photoViewer.T4 != null || photoViewer.f35620b5 != null) {
            return true;
        }
        if (photoViewer.f35610a5 != null) {
            FileLoader fileLoader = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation = photoViewer.f35610a5;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
            if (imageLocation == null) {
                tL_fileLocationToBeDeprecated = null;
            } else {
                tL_fileLocationToBeDeprecated = imageLocation.location;
            }
            String r12 = PhotoViewer.r1(imageLocation);
            if (photoViewer.f35836z5 == 0 && !photoViewer.B5) {
                z10 = false;
            } else {
                z10 = true;
            }
            File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, r12, z10);
            File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
            ImageLocation imageLocation2 = photoViewer.f35610a5;
            if (imageLocation2 != null) {
                tL_fileLocationToBeDeprecated2 = imageLocation2.location;
            }
            File pathToAttach2 = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.r1(imageLocation2), false);
            if (pathToAttach.exists() || file.exists() || pathToAttach2.exists()) {
                return true;
            }
            return false;
        } else if (photoViewer.f35694j7 != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void b(int r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fs0.b(int):void");
    }
}
