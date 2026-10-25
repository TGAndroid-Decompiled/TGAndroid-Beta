package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ci1;
public final class qp implements ri {
    public final yp f31974a;

    public qp(yp ypVar) {
        this.f31974a = ypVar;
    }

    @Override
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void T(Object obj) {
        np npVar = new np(obj, null, true, 3);
        yp ypVar = this.f31974a;
        npVar.W1 = ypVar.f35095e0;
        npVar.d1(ypVar.v.a());
        npVar.J1 = new pp(this, 1);
        yp.q(ypVar, npVar);
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        yp ypVar = this.f31974a;
        try {
            HashMap<Object, Object> selectedPhotos = ypVar.X.f33030j0.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                String str = photoEntry.imagePath;
                if (str == null) {
                    str = photoEntry.path;
                }
                if (str != null) {
                    File directory = FileLoader.getDirectory(4);
                    File file = new File(directory, Utilities.random.nextInt() + ".jpg");
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                    loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    np npVar = new np(new ci1(file, file, ""), loadBitmap, false, 2);
                    npVar.W1 = ypVar.f35095e0;
                    npVar.G1 = false;
                    npVar.F1 = false;
                    npVar.f43775o1 = 0.2f;
                    npVar.d1(ypVar.v.a());
                    npVar.J1 = new pp(this, 0);
                    yp.q(ypVar, npVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean x0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
