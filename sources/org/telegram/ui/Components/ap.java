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
import org.telegram.ui.ni1;
public final class ap implements ji {
    public final kp f23484a;

    public ap(kp kpVar) {
        this.f23484a = kpVar;
    }

    @Override
    public final void D(Object obj) {
        xo xoVar = new xo(obj, null, true, 3);
        kp kpVar = this.f23484a;
        xoVar.S1 = kpVar.f26340c0;
        xoVar.c1(kpVar.v.a());
        xoVar.F1 = new zo(this, 1);
        kp.q(kpVar, xoVar);
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        kp kpVar = this.f23484a;
        try {
            HashMap<Object, Object> selectedPhotos = kpVar.V.f26702g0.getSelectedPhotos();
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
                    xo xoVar = new xo(new ni1(file, file, ""), loadBitmap, false, 2);
                    xoVar.S1 = kpVar.f26340c0;
                    xoVar.C1 = false;
                    xoVar.B1 = false;
                    xoVar.f33318k1 = 0.2f;
                    xoVar.c1(kpVar.v.a());
                    xoVar.F1 = new zo(this, 0);
                    kp.q(kpVar, xoVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean V() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void C() {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
