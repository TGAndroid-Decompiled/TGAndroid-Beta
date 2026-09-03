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
import org.telegram.ui.wi1;
public final class cp implements ki {
    public final mp f26019a;

    public cp(mp mpVar) {
        this.f26019a = mpVar;
    }

    @Override
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mp mpVar = this.f26019a;
        try {
            HashMap<Object, Object> selectedPhotos = mpVar.V.f29072g0.getSelectedPhotos();
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
                    zo zoVar = new zo(new wi1(file, file, ""), loadBitmap, false, 2);
                    zoVar.S1 = mpVar.f29213c0;
                    zoVar.C1 = false;
                    zoVar.B1 = false;
                    zoVar.f37993k1 = 0.2f;
                    zoVar.c1(mpVar.v.a());
                    zoVar.F1 = new bp(this, 0);
                    mp.q(mpVar, zoVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void Z0(Object obj) {
        zo zoVar = new zo(obj, null, true, 3);
        mp mpVar = this.f26019a;
        zoVar.S1 = mpVar.f29213c0;
        zoVar.c1(mpVar.v.a());
        zoVar.F1 = new bp(this, 1);
        mp.q(mpVar, zoVar);
    }

    @Override
    public final boolean b2() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
