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
import org.telegram.ui.vi1;
public final class xo implements ji {
    public final li f30678a;
    public final TL_stories.TL_premium_boostsStatus f30679b;
    public final org.telegram.ui.ActionBar.f6 f30680c;
    public final org.telegram.ui.h d;
    public final long e;
    public final org.telegram.ui.y3 f30681f;
    public final org.telegram.ui.dd h;

    public xo(li liVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.y3 y3Var, org.telegram.ui.dd ddVar) {
        this.f30678a = liVar;
        this.f30679b = tL_premium_boostsStatus;
        this.f30680c = f6Var;
        this.d = hVar;
        this.e = j10;
        this.f30681f = y3Var;
        this.h = ddVar;
    }

    @Override
    public final void C0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f30678a;
        try {
            HashMap<Object, Object> selectedPhotos = liVar.f26698g0.getSelectedPhotos();
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
                    wo woVar = new wo(new vi1(file, file, ""), loadBitmap, false, 0);
                    woVar.S1 = this.f30679b;
                    woVar.f35179a.f35166a = this.f30680c;
                    woVar.f35212m1 = this.d;
                    woVar.C1 = false;
                    woVar.B1 = false;
                    woVar.f35210k1 = 0.2f;
                    woVar.c1(this.e);
                    woVar.F1 = new vo(liVar, this.f30681f, 0);
                    ?? obj = new Object();
                    obj.f20453a = true;
                    obj.e = true;
                    this.h.showAsSheet(woVar, obj);
                    liVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean X1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void Z0(Object obj) {
        wo woVar = new wo(obj, null, true, 1);
        woVar.S1 = this.f30679b;
        woVar.f35179a.f35166a = this.f30680c;
        woVar.f35212m1 = this.d;
        woVar.c1(this.e);
        woVar.F1 = new vo(this.f30678a, this.f30681f, 1);
        ?? obj2 = new Object();
        obj2.f20453a = true;
        obj2.e = true;
        this.h.showAsSheet(woVar, obj2);
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
    public final void z0() {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
