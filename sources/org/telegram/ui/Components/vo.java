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
import org.telegram.ui.ai1;
public final class vo implements li {
    public final ni f33594a;
    public final TL_stories.TL_premium_boostsStatus f33595b;
    public final org.telegram.ui.ActionBar.c6 f33596c;
    public final org.telegram.ui.h d;
    public final long f33597e;
    public final org.telegram.ui.x3 f33598f;
    public final org.telegram.ui.vc h;

    public vo(ni niVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.h hVar, long j10, org.telegram.ui.x3 x3Var, org.telegram.ui.vc vcVar) {
        this.f33594a = niVar;
        this.f33595b = tL_premium_boostsStatus;
        this.f33596c = c6Var;
        this.d = hVar;
        this.f33597e = j10;
        this.f33598f = x3Var;
        this.h = vcVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.f33594a;
        try {
            HashMap<Object, Object> selectedPhotos = niVar.f31005f0.getSelectedPhotos();
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
                    uo uoVar = new uo(new ai1(file, file, ""), loadBitmap, false, 0);
                    uoVar.R1 = this.f33595b;
                    uoVar.f41623a.f41354a = this.f33596c;
                    uoVar.l1 = this.d;
                    uoVar.B1 = false;
                    uoVar.A1 = false;
                    uoVar.f41652j1 = 0.2f;
                    uoVar.c1(this.f33597e);
                    uoVar.E1 = new to(niVar, this.f33598f, 0);
                    ?? obj = new Object();
                    obj.f23673a = true;
                    obj.f23676e = true;
                    this.h.showAsSheet(uoVar, obj);
                    niVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean T1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        uo uoVar = new uo(obj, null, true, 1);
        uoVar.R1 = this.f33595b;
        uoVar.f41623a.f41354a = this.f33596c;
        uoVar.l1 = this.d;
        uoVar.c1(this.f33597e);
        uoVar.E1 = new to(this.f33594a, this.f33598f, 1);
        ?? obj2 = new Object();
        obj2.f23673a = true;
        obj2.f23676e = true;
        this.h.showAsSheet(uoVar, obj2);
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
