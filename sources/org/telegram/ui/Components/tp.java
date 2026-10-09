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
import org.telegram.ui.jj1;
public final class tp implements wi {
    public final cq f31261a;

    public tp(cq cqVar) {
        this.f31261a = cqVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        cq cqVar = this.f31261a;
        try {
            HashMap<Object, Object> selectedPhotos = cqVar.Y.f33240j0.getSelectedPhotos();
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
                    qp qpVar = new qp(new jj1(file, file, ""), loadBitmap, false, 2);
                    qpVar.V1 = cqVar.f25470f0;
                    qpVar.F1 = false;
                    qpVar.E1 = false;
                    qpVar.f43977n1 = 0.2f;
                    qpVar.c1(cqVar.v.a());
                    qpVar.I1 = new sp(this, 0);
                    cq.s(cqVar, qpVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean Y1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void a1(Object obj) {
        qp qpVar = new qp(obj, null, true, 3);
        cq cqVar = this.f31261a;
        qpVar.V1 = cqVar.f25470f0;
        qpVar.c1(cqVar.v.a());
        qpVar.I1 = new sp(this, 1);
        cq.s(cqVar, qpVar);
    }

    @Override
    public final void f0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
