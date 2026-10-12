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
import org.telegram.ui.kj1;
public final class tp implements yi {
    public final aj f30916a;
    public final TL_stories.TL_premium_boostsStatus f30917b;
    public final org.telegram.ui.ActionBar.c6 f30918c;
    public final org.telegram.ui.g d;
    public final long f30919e;
    public final org.telegram.ui.ic f30920f;
    public final org.telegram.ui.fd h;

    public tp(aj ajVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.ic icVar, org.telegram.ui.fd fdVar) {
        this.f30916a = ajVar;
        this.f30917b = tL_premium_boostsStatus;
        this.f30918c = c6Var;
        this.d = gVar;
        this.f30919e = j3;
        this.f30920f = icVar;
        this.h = fdVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        aj ajVar = this.f30916a;
        try {
            HashMap<Object, Object> selectedPhotos = ajVar.f24354j0.getSelectedPhotos();
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
                    sp spVar = new sp(new kj1(file, file, ""), loadBitmap, false, 0);
                    spVar.V1 = this.f30917b;
                    spVar.f44729a.f44714a = this.f30918c;
                    spVar.f44773p1 = this.d;
                    spVar.F1 = false;
                    spVar.E1 = false;
                    spVar.f44769n1 = 0.2f;
                    spVar.c1(this.f30919e);
                    spVar.I1 = new rp(ajVar, this.f30920f, 0);
                    ?? obj = new Object();
                    obj.f21087a = true;
                    obj.f21090e = true;
                    this.h.showAsSheet(spVar, obj);
                    ajVar.dismiss();
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
        sp spVar = new sp(obj, null, true, 1);
        spVar.V1 = this.f30917b;
        spVar.f44729a.f44714a = this.f30918c;
        spVar.f44773p1 = this.d;
        spVar.c1(this.f30919e);
        spVar.I1 = new rp(this.f30916a, this.f30920f, 1);
        ?? obj2 = new Object();
        obj2.f21087a = true;
        obj2.f21090e = true;
        this.h.showAsSheet(spVar, obj2);
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
