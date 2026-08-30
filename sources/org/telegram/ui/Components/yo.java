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
import org.telegram.ui.ni1;
public final class yo implements ji {
    public final li f31063a;
    public final TL_stories.TL_premium_boostsStatus f31064b;
    public final org.telegram.ui.ActionBar.f6 f31065c;
    public final org.telegram.ui.h d;
    public final long e;
    public final org.telegram.ui.w3 f31066f;
    public final org.telegram.ui.bd h;

    public yo(li liVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.bd bdVar) {
        this.f31063a = liVar;
        this.f31064b = tL_premium_boostsStatus;
        this.f31065c = f6Var;
        this.d = hVar;
        this.e = j10;
        this.f31066f = w3Var;
        this.h = bdVar;
    }

    @Override
    public final void D(Object obj) {
        xo xoVar = new xo(obj, null, true, 1);
        xoVar.S1 = this.f31064b;
        xoVar.f33287a.f33270a = this.f31065c;
        xoVar.f33320m1 = this.d;
        xoVar.c1(this.e);
        xoVar.F1 = new wo(this.f31063a, this.f31066f, 1);
        ?? obj2 = new Object();
        obj2.f20478a = true;
        obj2.e = true;
        this.h.showAsSheet(xoVar, obj2);
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f31063a;
        try {
            HashMap<Object, Object> selectedPhotos = liVar.f26702g0.getSelectedPhotos();
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
                    xo xoVar = new xo(new ni1(file, file, ""), loadBitmap, false, 0);
                    xoVar.S1 = this.f31064b;
                    xoVar.f33287a.f33270a = this.f31065c;
                    xoVar.f33320m1 = this.d;
                    xoVar.C1 = false;
                    xoVar.B1 = false;
                    xoVar.f33318k1 = 0.2f;
                    xoVar.c1(this.e);
                    xoVar.F1 = new wo(liVar, this.f31066f, 0);
                    ?? obj = new Object();
                    obj.f20478a = true;
                    obj.e = true;
                    this.h.showAsSheet(xoVar, obj);
                    liVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean V() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void C() {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
