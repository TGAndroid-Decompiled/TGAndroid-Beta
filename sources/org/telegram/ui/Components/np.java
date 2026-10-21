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
import org.telegram.ui.th1;
public final class np implements ri {
    public final wp f28859a;

    public np(wp wpVar) {
        this.f28859a = wpVar;
    }

    @Override
    public final void O(Object obj) {
        kp kpVar = new kp(obj, null, true, 3);
        wp wpVar = this.f28859a;
        kpVar.V1 = wpVar.f32212f0;
        kpVar.c1(wpVar.v.a());
        kpVar.I1 = new mp(this, 1);
        wp.s(wpVar, kpVar);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        wp wpVar = this.f28859a;
        try {
            HashMap<Object, Object> selectedPhotos = wpVar.Y.f30558j0.getSelectedPhotos();
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
                    kp kpVar = new kp(new th1(file, file, ""), loadBitmap, false, 2);
                    kpVar.V1 = wpVar.f32212f0;
                    kpVar.F1 = false;
                    kpVar.E1 = false;
                    kpVar.f38556n1 = 0.2f;
                    kpVar.c1(wpVar.v.a());
                    kpVar.I1 = new mp(this, 0);
                    wp.s(wpVar, kpVar);
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
    public final void u(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean v() {
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
