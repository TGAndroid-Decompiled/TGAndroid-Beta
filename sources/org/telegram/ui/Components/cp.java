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
import org.telegram.ui.hj1;
public final class cp implements ti {
    public final lp f25099a;

    public cp(lp lpVar) {
        this.f25099a = lpVar;
    }

    @Override
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean D0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void K(Object obj) {
        zo zoVar = new zo(obj, null, true, 3);
        lp lpVar = this.f25099a;
        zoVar.V1 = lpVar.f28291f0;
        zoVar.c1(lpVar.v.a());
        zoVar.I1 = new bp(this, 1);
        lp.q(lpVar, zoVar);
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        lp lpVar = this.f25099a;
        try {
            HashMap<Object, Object> selectedPhotos = lpVar.Y.f31318j0.getSelectedPhotos();
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
                    zo zoVar = new zo(new hj1(file, file, ""), loadBitmap, false, 2);
                    zoVar.V1 = lpVar.f28291f0;
                    zoVar.F1 = false;
                    zoVar.E1 = false;
                    zoVar.f41981n1 = 0.2f;
                    zoVar.c1(lpVar.v.a());
                    zoVar.I1 = new bp(this, 0);
                    lp.q(lpVar, zoVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
