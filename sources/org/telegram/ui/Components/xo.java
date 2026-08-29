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
import org.telegram.ui.ai1;
public final class xo implements li {
    public final gp f34813a;

    public xo(gp gpVar) {
        this.f34813a = gpVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gp gpVar = this.f34813a;
        try {
            HashMap<Object, Object> selectedPhotos = gpVar.U.f31005f0.getSelectedPhotos();
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
                    uo uoVar = new uo(new ai1(file, file, ""), loadBitmap, false, 2);
                    uoVar.R1 = gpVar.f28933b0;
                    uoVar.B1 = false;
                    uoVar.A1 = false;
                    uoVar.f41652j1 = 0.2f;
                    uoVar.c1(gpVar.v.a());
                    uoVar.E1 = new wo(this, 0);
                    gp.q(gpVar, uoVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean T1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        uo uoVar = new uo(obj, null, true, 3);
        gp gpVar = this.f34813a;
        uoVar.R1 = gpVar.f28933b0;
        uoVar.c1(gpVar.v.a());
        uoVar.E1 = new wo(this, 1);
        gp.q(gpVar, uoVar);
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
