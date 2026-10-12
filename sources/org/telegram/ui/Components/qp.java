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
import org.telegram.ui.qj1;
public final class qp implements ti {
    public final zp f28659a;

    public qp(zp zpVar) {
        this.f28659a = zpVar;
    }

    @Override
    public final void U(Object obj) {
        np npVar = new np(obj, null, true, 3);
        zp zpVar = this.f28659a;
        npVar.V1 = zpVar.f31948f0;
        npVar.c1(zpVar.v.a());
        npVar.I1 = new pp(this, 1);
        zp.s(zpVar, npVar);
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        zp zpVar = this.f28659a;
        try {
            HashMap<Object, Object> selectedPhotos = zpVar.Y.f30013j0.getSelectedPhotos();
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
                    np npVar = new np(new qj1(file, file, ""), loadBitmap, false, 2);
                    npVar.V1 = zpVar.f31948f0;
                    npVar.F1 = false;
                    npVar.E1 = false;
                    npVar.f34892n1 = 0.2f;
                    npVar.c1(zpVar.v.a());
                    npVar.I1 = new pp(this, 0);
                    zp.s(zpVar, npVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
