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
import org.telegram.ui.ci1;
public final class op implements ri {
    public final ti f31344a;
    public final TL_stories.TL_premium_boostsStatus f31345b;
    public final org.telegram.ui.ActionBar.u6 f31346c;
    public final org.telegram.ui.f d;
    public final long e;
    public final org.telegram.ui.gc f31347f;
    public final org.telegram.ui.bd h;

    public op(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.gc gcVar, org.telegram.ui.bd bdVar) {
        this.f31344a = tiVar;
        this.f31345b = tL_premium_boostsStatus;
        this.f31346c = u6Var;
        this.d = fVar;
        this.e = j10;
        this.f31347f = gcVar;
        this.h = bdVar;
    }

    @Override
    public final void A(gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void T(Object obj) {
        np npVar = new np(obj, null, true, 1);
        npVar.W1 = this.f31345b;
        npVar.f43733a.f43452a = this.f31346c;
        npVar.f43779q1 = this.d;
        npVar.d1(this.e);
        npVar.J1 = new mp(this.f31344a, this.f31347f, 1);
        ?? obj2 = new Object();
        obj2.f22926a = true;
        obj2.e = true;
        this.h.showAsSheet(npVar, obj2);
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f31344a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f33030j0.getSelectedPhotos();
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
                    np npVar = new np(new ci1(file, file, ""), loadBitmap, false, 0);
                    npVar.W1 = this.f31345b;
                    npVar.f43733a.f43452a = this.f31346c;
                    npVar.f43779q1 = this.d;
                    npVar.G1 = false;
                    npVar.F1 = false;
                    npVar.f43775o1 = 0.2f;
                    npVar.d1(this.e);
                    npVar.J1 = new mp(tiVar, this.f31347f, 0);
                    ?? obj = new Object();
                    obj.f22926a = true;
                    obj.e = true;
                    this.h.showAsSheet(npVar, obj);
                    tiVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean x0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void R() {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
