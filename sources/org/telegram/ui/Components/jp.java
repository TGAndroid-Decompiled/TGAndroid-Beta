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
import org.telegram.ui.lj1;
public final class jp implements wi {
    public final sp f24483a;

    public jp(sp spVar) {
        this.f24483a = spVar;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        sp spVar = this.f24483a;
        try {
            HashMap<Object, Object> selectedPhotos = spVar.Y.f29378j0.getSelectedPhotos();
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
                    gp gpVar = new gp(new lj1(file, file, ""), loadBitmap, false, 2);
                    gpVar.V1 = spVar.f27139f0;
                    gpVar.F1 = false;
                    gpVar.E1 = false;
                    gpVar.f30953n1 = 0.2f;
                    gpVar.c1(spVar.v.a());
                    gpVar.I1 = new ip(this, 0);
                    sp.q(spVar, gpVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean R1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        gp gpVar = new gp(obj, null, true, 3);
        sp spVar = this.f24483a;
        gpVar.V1 = spVar.f27139f0;
        gpVar.c1(spVar.v.a());
        gpVar.I1 = new ip(this, 1);
        sp.q(spVar, gpVar);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
