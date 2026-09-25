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
public final class ep implements ui {
    public final np f23982a;

    public ep(np npVar) {
        this.f23982a = npVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        np npVar = this.f23982a;
        try {
            HashMap<Object, Object> selectedPhotos = npVar.Y.f30018j0.getSelectedPhotos();
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
                    bp bpVar = new bp(new zi1(file, file, ""), loadBitmap, false, 2);
                    bpVar.V1 = npVar.f26761f0;
                    bpVar.F1 = false;
                    bpVar.E1 = false;
                    bpVar.f36192n1 = 0.2f;
                    bpVar.c1(npVar.v.a());
                    bpVar.I1 = new dp(this, 0);
                    np.q(npVar, bpVar);
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
        bp bpVar = new bp(obj, null, true, 3);
        np npVar = this.f23982a;
        bpVar.V1 = npVar.f26761f0;
        bpVar.c1(npVar.v.a());
        bpVar.I1 = new dp(this, 1);
        np.q(npVar, bpVar);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(hh hhVar) {
        hhVar.run();
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
