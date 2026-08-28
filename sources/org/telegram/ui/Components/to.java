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
import org.telegram.ui.yh1;
public final class to implements ii {
    public final cp f32772a;

    public to(cp cpVar) {
        this.f32772a = cpVar;
    }

    @Override
    public final void A(Object obj) {
        qo qoVar = new qo(obj, null, true, 3);
        cp cpVar = this.f32772a;
        qoVar.R1 = cpVar.f27522b0;
        qoVar.c1(cpVar.v.a());
        qoVar.E1 = new so(this, 1);
        cp.q(cpVar, qoVar);
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        cp cpVar = this.f32772a;
        try {
            HashMap<Object, Object> selectedPhotos = cpVar.U.f30114f0.getSelectedPhotos();
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
                    qo qoVar = new qo(new yh1(file, file, ""), loadBitmap, false, 2);
                    qoVar.R1 = cpVar.f27522b0;
                    qoVar.B1 = false;
                    qoVar.A1 = false;
                    qoVar.f41085j1 = 0.2f;
                    qoVar.c1(cpVar.v.a());
                    qoVar.E1 = new so(this, 0);
                    cp.q(cpVar, qoVar);
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final boolean t0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
