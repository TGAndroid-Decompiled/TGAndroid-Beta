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
import org.telegram.ui.vh1;
public final class lp implements ri {
    public final ti f28292a;
    public final TL_stories.TL_premium_boostsStatus f28293b;
    public final org.telegram.ui.ActionBar.d6 f28294c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.hc f28295f;
    public final org.telegram.ui.dd h;

    public lp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.hc hcVar, org.telegram.ui.dd ddVar) {
        this.f28292a = tiVar;
        this.f28293b = tL_premium_boostsStatus;
        this.f28294c = d6Var;
        this.d = gVar;
        this.e = j10;
        this.f28295f = hcVar;
        this.h = ddVar;
    }

    @Override
    public final void O(Object obj) {
        kp kpVar = new kp(obj, null, true, 1);
        kpVar.V1 = this.f28293b;
        kpVar.f39078a.f39067a = this.f28294c;
        kpVar.f39121p1 = this.d;
        kpVar.c1(this.e);
        kpVar.I1 = new jp(this.f28292a, this.f28295f, 1);
        ?? obj2 = new Object();
        obj2.f21552a = true;
        obj2.e = true;
        this.h.showAsSheet(kpVar, obj2);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f28292a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f30586j0.getSelectedPhotos();
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
                    kp kpVar = new kp(new vh1(file, file, ""), loadBitmap, false, 0);
                    kpVar.V1 = this.f28293b;
                    kpVar.f39078a.f39067a = this.f28294c;
                    kpVar.f39121p1 = this.d;
                    kpVar.F1 = false;
                    kpVar.E1 = false;
                    kpVar.f39117n1 = 0.2f;
                    kpVar.c1(this.e);
                    kpVar.I1 = new jp(tiVar, this.f28295f, 0);
                    ?? obj = new Object();
                    obj.f21552a = true;
                    obj.e = true;
                    this.h.showAsSheet(kpVar, obj);
                    tiVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void r(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
