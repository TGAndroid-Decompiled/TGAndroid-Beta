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
public final class fp implements ui {
    public final op f24302a;

    public fp(op opVar) {
        this.f24302a = opVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        op opVar = this.f24302a;
        try {
            HashMap<Object, Object> selectedPhotos = opVar.Y.f30032j0.getSelectedPhotos();
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
                    cp cpVar = new cp(new zi1(file, file, ""), loadBitmap, false, 2);
                    cpVar.V1 = opVar.f27075f0;
                    cpVar.F1 = false;
                    cpVar.E1 = false;
                    cpVar.f36190n1 = 0.2f;
                    cpVar.c1(opVar.v.a());
                    cpVar.I1 = new ep(this, 0);
                    op.q(opVar, cpVar);
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
        cp cpVar = new cp(obj, null, true, 3);
        op opVar = this.f24302a;
        cpVar.V1 = opVar.f27075f0;
        cpVar.c1(opVar.v.a());
        cpVar.I1 = new ep(this, 1);
        op.q(opVar, cpVar);
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
