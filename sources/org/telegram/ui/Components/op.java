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
import org.telegram.ui.pj1;
public final class op implements ti {
    public final vi f27699a;
    public final TL_stories.TL_premium_boostsStatus f27700b;
    public final org.telegram.ui.ActionBar.c6 f27701c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.kc f27702f;
    public final org.telegram.ui.gd h;

    public op(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.kc kcVar, org.telegram.ui.gd gdVar) {
        this.f27699a = viVar;
        this.f27700b = tL_premium_boostsStatus;
        this.f27701c = c6Var;
        this.d = gVar;
        this.e = j10;
        this.f27702f = kcVar;
        this.h = gdVar;
    }

    @Override
    public final void J(Object obj) {
        np npVar = new np(obj, null, true, 1);
        npVar.V1 = this.f27700b;
        npVar.f34577a.f34563a = this.f27701c;
        npVar.f34620p1 = this.d;
        npVar.c1(this.e);
        npVar.I1 = new mp(this.f27699a, this.f27702f, 1);
        ?? obj2 = new Object();
        obj2.f20169a = true;
        obj2.e = true;
        this.h.showAsSheet(npVar, obj2);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.f27699a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f29684j0.getSelectedPhotos();
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
                    np npVar = new np(new pj1(file, file, ""), loadBitmap, false, 0);
                    npVar.V1 = this.f27700b;
                    npVar.f34577a.f34563a = this.f27701c;
                    npVar.f34620p1 = this.d;
                    npVar.F1 = false;
                    npVar.E1 = false;
                    npVar.f34616n1 = 0.2f;
                    npVar.c1(this.e);
                    npVar.I1 = new mp(viVar, this.f27702f, 0);
                    ?? obj = new Object();
                    obj.f20169a = true;
                    obj.e = true;
                    this.h.showAsSheet(npVar, obj);
                    viVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean r0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void U(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
