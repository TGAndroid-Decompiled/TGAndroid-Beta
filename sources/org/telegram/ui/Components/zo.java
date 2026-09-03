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
import org.telegram.ui.vi1;
public final class zo implements ji {
    public final jp f31439a;

    public zo(jp jpVar) {
        this.f31439a = jpVar;
    }

    @Override
    public final void C0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        jp jpVar = this.f31439a;
        try {
            HashMap<Object, Object> selectedPhotos = jpVar.V.f26698g0.getSelectedPhotos();
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
                    wo woVar = new wo(new vi1(file, file, ""), loadBitmap, false, 2);
                    woVar.S1 = jpVar.f26010c0;
                    woVar.C1 = false;
                    woVar.B1 = false;
                    woVar.f35210k1 = 0.2f;
                    woVar.c1(jpVar.v.a());
                    woVar.F1 = new yo(this, 0);
                    jp.q(jpVar, woVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean X1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void Z0(Object obj) {
        wo woVar = new wo(obj, null, true, 3);
        jp jpVar = this.f31439a;
        woVar.S1 = jpVar.f26010c0;
        woVar.c1(jpVar.v.a());
        woVar.F1 = new yo(this, 1);
        jp.q(jpVar, woVar);
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
    public final void z0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
