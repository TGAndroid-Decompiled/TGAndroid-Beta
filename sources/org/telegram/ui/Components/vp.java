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
import org.telegram.ui.kj1;
public final class vp implements yi {
    public final eq f32153a;

    public vp(eq eqVar) {
        this.f32153a = eqVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        eq eqVar = this.f32153a;
        try {
            HashMap<Object, Object> selectedPhotos = eqVar.Y.f24354j0.getSelectedPhotos();
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
                    sp spVar = new sp(new kj1(file, file, ""), loadBitmap, false, 2);
                    spVar.V1 = eqVar.f25753f0;
                    spVar.F1 = false;
                    spVar.E1 = false;
                    spVar.f44769n1 = 0.2f;
                    spVar.c1(eqVar.v.a());
                    spVar.I1 = new up(this, 0);
                    eq.s(eqVar, spVar);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean Y1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void Z0(Object obj) {
        sp spVar = new sp(obj, null, true, 3);
        eq eqVar = this.f32153a;
        spVar.V1 = eqVar.f25753f0;
        spVar.c1(eqVar.v.a());
        spVar.I1 = new up(this, 1);
        eq.s(eqVar, spVar);
    }

    @Override
    public final void d0(lh lhVar) {
        lhVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void P0() {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
