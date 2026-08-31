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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.qi1;
public final class ap implements ki {
    public final mi f25301a;
    public final TL_stories.TL_premium_boostsStatus f25302b;
    public final org.telegram.ui.ActionBar.g6 f25303c;
    public final org.telegram.ui.h d;
    public final long f25304e;
    public final org.telegram.ui.w3 f25305f;
    public final org.telegram.ui.bd h;

    public ap(mi miVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.bd bdVar) {
        this.f25301a = miVar;
        this.f25302b = tL_premium_boostsStatus;
        this.f25303c = g6Var;
        this.d = hVar;
        this.f25304e = j10;
        this.f25305f = w3Var;
        this.h = bdVar;
    }

    @Override
    public final void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.f25301a;
        try {
            HashMap<Object, Object> selectedPhotos = miVar.f29054g0.getSelectedPhotos();
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
                    zo zoVar = new zo(new qi1(file, file, ""), loadBitmap, false, 0);
                    zoVar.S1 = this.f25302b;
                    zoVar.f36486a.f36188a = this.f25303c;
                    zoVar.f36520m1 = this.d;
                    zoVar.C1 = false;
                    zoVar.B1 = false;
                    zoVar.f36518k1 = 0.2f;
                    zoVar.c1(this.f25304e);
                    zoVar.F1 = new yo(miVar, this.f25305f, 0);
                    ?? obj = new Object();
                    obj.f22156a = true;
                    obj.f22159e = true;
                    this.h.showAsSheet(zoVar, obj);
                    miVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final void Z0(Object obj) {
        zo zoVar = new zo(obj, null, true, 1);
        zoVar.S1 = this.f25302b;
        zoVar.f36486a.f36188a = this.f25303c;
        zoVar.f36520m1 = this.d;
        zoVar.c1(this.f25304e);
        zoVar.F1 = new yo(this.f25301a, this.f25305f, 1);
        ?? obj2 = new Object();
        obj2.f22156a = true;
        obj2.f22159e = true;
        this.h.showAsSheet(zoVar, obj2);
    }

    @Override
    public final boolean b2() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
