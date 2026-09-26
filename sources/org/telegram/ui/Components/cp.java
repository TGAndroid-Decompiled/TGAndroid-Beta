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
import org.telegram.ui.zi1;
public final class cp implements ui {
    public final wi f23368a;
    public final TL_stories.TL_premium_boostsStatus f23369b;
    public final org.telegram.ui.ActionBar.d6 f23370c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.ec f23371f;
    public final org.telegram.ui.ad h;

    public cp(wi wiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.ec ecVar, org.telegram.ui.ad adVar) {
        this.f23368a = wiVar;
        this.f23369b = tL_premium_boostsStatus;
        this.f23370c = d6Var;
        this.d = gVar;
        this.e = j3;
        this.f23371f = ecVar;
        this.h = adVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        wi wiVar = this.f23368a;
        try {
            HashMap<Object, Object> selectedPhotos = wiVar.f30017j0.getSelectedPhotos();
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
                    bp bpVar = new bp(new zi1(file, file, ""), loadBitmap, false, 0);
                    bpVar.V1 = this.f23369b;
                    bpVar.f36152a.f36139a = this.f23370c;
                    bpVar.f36195p1 = this.d;
                    bpVar.F1 = false;
                    bpVar.E1 = false;
                    bpVar.f36191n1 = 0.2f;
                    bpVar.c1(this.e);
                    bpVar.I1 = new ap(wiVar, this.f23371f, 0);
                    ?? obj = new Object();
                    obj.f19581a = true;
                    obj.e = true;
                    this.h.showAsSheet(bpVar, obj);
                    wiVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean S1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void U0(Object obj) {
        bp bpVar = new bp(obj, null, true, 1);
        bpVar.V1 = this.f23369b;
        bpVar.f36152a.f36139a = this.f23370c;
        bpVar.f36195p1 = this.d;
        bpVar.c1(this.e);
        bpVar.I1 = new ap(this.f23368a, this.f23371f, 1);
        ?? obj2 = new Object();
        obj2.f19581a = true;
        obj2.e = true;
        this.h.showAsSheet(bpVar, obj2);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final void K0() {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
