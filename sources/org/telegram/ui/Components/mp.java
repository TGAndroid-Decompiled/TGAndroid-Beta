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
import org.telegram.ui.zh1;
public final class mp implements pi {
    public final up f28665a;

    public mp(up upVar) {
        this.f28665a = upVar;
    }

    @Override
    public final void O(Object obj) {
        jp jpVar = new jp(obj, null, true, 3);
        up upVar = this.f28665a;
        jpVar.W1 = upVar.f31180e0;
        jpVar.c1(upVar.v.a());
        jpVar.J1 = new lp(this, 1);
        up.r(upVar, jpVar);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        up upVar = this.f28665a;
        try {
            HashMap<Object, Object> selectedPhotos = upVar.X.f30158j0.getSelectedPhotos();
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
                    jp jpVar = new jp(new zh1(file, file, ""), loadBitmap, false, 2);
                    jpVar.W1 = upVar.f31180e0;
                    jpVar.G1 = false;
                    jpVar.F1 = false;
                    jpVar.f40484o1 = 0.2f;
                    jpVar.c1(upVar.v.a());
                    jpVar.J1 = new lp(this, 0);
                    up.r(upVar, jpVar);
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
    public final void r(eh ehVar) {
        ehVar.run();
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
