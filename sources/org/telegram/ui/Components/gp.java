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
import org.telegram.ui.zi1;
public final class gp implements vi {
    public final pp f24655a;

    public gp(pp ppVar) {
        this.f24655a = ppVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        pp ppVar = this.f24655a;
        try {
            HashMap<Object, Object> selectedPhotos = ppVar.Y.f30282j0.getSelectedPhotos();
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
                    dp dpVar = new dp(new zi1(file, file, ""), loadBitmap, false, 2);
                    dpVar.V1 = ppVar.f27431f0;
                    dpVar.F1 = false;
                    dpVar.E1 = false;
                    dpVar.f36328n1 = 0.2f;
                    dpVar.c1(ppVar.v.a());
                    dpVar.I1 = new fp(this, 0);
                    pp.q(ppVar, dpVar);
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
        dp dpVar = new dp(obj, null, true, 3);
        pp ppVar = this.f24655a;
        dpVar.V1 = ppVar.f27431f0;
        dpVar.c1(ppVar.v.a());
        dpVar.I1 = new fp(this, 1);
        pp.q(ppVar, dpVar);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(ih ihVar) {
        ihVar.run();
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
