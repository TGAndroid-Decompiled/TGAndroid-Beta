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
public final class op implements ri {
    public final wp f29285a;

    public op(wp wpVar) {
        this.f29285a = wpVar;
    }

    @Override
    public final void O(Object obj) {
        lp lpVar = new lp(obj, null, true, 3);
        wp wpVar = this.f29285a;
        lpVar.W1 = wpVar.f32289e0;
        lpVar.c1(wpVar.v.a());
        lpVar.J1 = new np(this, 1);
        wp.r(wpVar, lpVar);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        wp wpVar = this.f29285a;
        try {
            HashMap<Object, Object> selectedPhotos = wpVar.X.f30742j0.getSelectedPhotos();
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
                    lp lpVar = new lp(new ai1(file, file, ""), loadBitmap, false, 2);
                    lpVar.W1 = wpVar.f32289e0;
                    lpVar.G1 = false;
                    lpVar.F1 = false;
                    lpVar.f40755o1 = 0.2f;
                    lpVar.c1(wpVar.v.a());
                    lpVar.J1 = new np(this, 0);
                    wp.r(wpVar, lpVar);
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
    public final void r(gh ghVar) {
        ghVar.run();
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
