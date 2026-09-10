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
import org.telegram.ui.lj1;
public final class hp implements wi {
    public final yi f23737a;
    public final TL_stories.TL_premium_boostsStatus f23738b;
    public final org.telegram.ui.ActionBar.f6 f23739c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.u3 f23740f;
    public final org.telegram.ui.cd h;

    public hp(yi yiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.u3 u3Var, org.telegram.ui.cd cdVar) {
        this.f23737a = yiVar;
        this.f23738b = tL_premium_boostsStatus;
        this.f23739c = f6Var;
        this.d = gVar;
        this.e = j3;
        this.f23740f = u3Var;
        this.h = cdVar;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.f23737a;
        try {
            HashMap<Object, Object> selectedPhotos = yiVar.f29378j0.getSelectedPhotos();
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
                    gp gpVar = new gp(new lj1(file, file, ""), loadBitmap, false, 0);
                    gpVar.V1 = this.f23738b;
                    gpVar.f30914a.f30901a = this.f23739c;
                    gpVar.f30957p1 = this.d;
                    gpVar.F1 = false;
                    gpVar.E1 = false;
                    gpVar.f30953n1 = 0.2f;
                    gpVar.c1(this.e);
                    gpVar.I1 = new fp(yiVar, this.f23740f, 0);
                    ?? obj = new Object();
                    obj.f18485a = true;
                    obj.e = true;
                    this.h.showAsSheet(gpVar, obj);
                    yiVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean R1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        gp gpVar = new gp(obj, null, true, 1);
        gpVar.V1 = this.f23738b;
        gpVar.f30914a.f30901a = this.f23739c;
        gpVar.f30957p1 = this.d;
        gpVar.c1(this.e);
        gpVar.I1 = new fp(this.f23737a, this.f23740f, 1);
        ?? obj2 = new Object();
        obj2.f18485a = true;
        obj2.e = true;
        this.h.showAsSheet(gpVar, obj2);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
