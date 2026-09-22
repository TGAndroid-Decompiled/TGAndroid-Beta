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
public final class dp implements ti {
    public final mp f23368a;

    public dp(mp mpVar) {
        this.f23368a = mpVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        mp mpVar = this.f23368a;
        try {
            HashMap<Object, Object> selectedPhotos = mpVar.Y.f28759j0.getSelectedPhotos();
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
                    ap apVar = new ap(new hj1(file, file, ""), loadBitmap, false, 2);
                    apVar.V1 = mpVar.f26200f0;
                    apVar.F1 = false;
                    apVar.E1 = false;
                    apVar.f38825n1 = 0.2f;
                    apVar.c1(mpVar.v.a());
                    apVar.I1 = new cp(this, 0);
                    mp.q(mpVar, apVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        ap apVar = new ap(obj, null, true, 3);
        mp mpVar = this.f23368a;
        apVar.V1 = mpVar.f26200f0;
        apVar.c1(mpVar.v.a());
        apVar.I1 = new cp(this, 1);
        mp.q(mpVar, apVar);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(fh fhVar) {
        fhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
