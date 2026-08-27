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
import org.telegram.ui.xh1;

public final class ro implements ei {

    public final ap f32243a;

    public ro(ap apVar) {
        this.f32243a = apVar;
    }

    @Override
    public final void I(Object obj) {
        oo ooVar = new oo(obj, null, true, 3);
        ap apVar = this.f32243a;
        ooVar.R1 = apVar.f26779b0;
        ooVar.c1(apVar.v.a());
        ooVar.E1 = new qo(this, 1);
        ap.r(apVar, ooVar);
    }

    @Override
    public final boolean N0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ap apVar = this.f32243a;
        try {
            HashMap<Object, Object> selectedPhotos = apVar.U.f28650f0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            if (str != null) {
                File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                oo ooVar = new oo(new xh1(file, file, ""), bitmapLoadBitmap, false, 2);
                ooVar.R1 = apVar.f26779b0;
                ooVar.B1 = false;
                ooVar.A1 = false;
                ooVar.f40764j1 = 0.2f;
                ooVar.c1(apVar.v.a());
                ooVar.E1 = new qo(this, 0);
                ap.r(apVar, ooVar);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void F() {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
