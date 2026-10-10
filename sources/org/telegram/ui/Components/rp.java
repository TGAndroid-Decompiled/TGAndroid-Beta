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
import org.telegram.ui.jj1;
public final class rp implements wi {
    public final yi f30542a;
    public final TL_stories.TL_premium_boostsStatus f30543b;
    public final org.telegram.ui.ActionBar.e6 f30544c;
    public final org.telegram.ui.g d;
    public final long f30545e;
    public final org.telegram.ui.fc f30546f;
    public final org.telegram.ui.bd h;

    public rp(yi yiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.fc fcVar, org.telegram.ui.bd bdVar) {
        this.f30542a = yiVar;
        this.f30543b = tL_premium_boostsStatus;
        this.f30544c = e6Var;
        this.d = gVar;
        this.f30545e = j3;
        this.f30546f = fcVar;
        this.h = bdVar;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f30542a;
        try {
            HashMap<Object, Object> selectedPhotos = yiVar.f33247j0.getSelectedPhotos();
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
                    qp qpVar = new qp(new jj1(file, file, ""), loadBitmap, false, 0);
                    qpVar.V1 = this.f30543b;
                    qpVar.f43981a.f43966a = this.f30544c;
                    qpVar.f44025p1 = this.d;
                    qpVar.F1 = false;
                    qpVar.E1 = false;
                    qpVar.f44021n1 = 0.2f;
                    qpVar.c1(this.f30545e);
                    qpVar.I1 = new pp(yiVar, this.f30546f, 0);
                    ?? obj = new Object();
                    obj.f21361a = true;
                    obj.f21364e = true;
                    this.h.showAsSheet(qpVar, obj);
                    yiVar.dismiss();
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
    public final void a1(Object obj) {
        qp qpVar = new qp(obj, null, true, 1);
        qpVar.V1 = this.f30543b;
        qpVar.f43981a.f43966a = this.f30544c;
        qpVar.f44025p1 = this.d;
        qpVar.c1(this.f30545e);
        qpVar.I1 = new pp(this.f30542a, this.f30546f, 1);
        ?? obj2 = new Object();
        obj2.f21361a = true;
        obj2.f21364e = true;
        this.h.showAsSheet(qpVar, obj2);
    }

    @Override
    public final void f0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final void B0() {
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
