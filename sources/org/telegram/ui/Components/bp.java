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
import org.telegram.ui.fj1;
public final class bp implements ti {
    public final vi f23052a;
    public final TL_stories.TL_premium_boostsStatus f23053b;
    public final org.telegram.ui.ActionBar.e6 f23054c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.s3 f23055f;
    public final org.telegram.ui.bd h;

    public bp(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.s3 s3Var, org.telegram.ui.bd bdVar) {
        this.f23052a = viVar;
        this.f23053b = tL_premium_boostsStatus;
        this.f23054c = e6Var;
        this.d = gVar;
        this.e = j3;
        this.f23055f = s3Var;
        this.h = bdVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f23052a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f29033j0.getSelectedPhotos();
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
                    ap apVar = new ap(new fj1(file, file, ""), loadBitmap, false, 0);
                    apVar.V1 = this.f23053b;
                    apVar.f38467a.f38453a = this.f23054c;
                    apVar.f38510p1 = this.d;
                    apVar.F1 = false;
                    apVar.E1 = false;
                    apVar.f38506n1 = 0.2f;
                    apVar.c1(this.e);
                    apVar.I1 = new zo(viVar, this.f23055f, 0);
                    ?? obj = new Object();
                    obj.f19545a = true;
                    obj.e = true;
                    this.h.showAsSheet(apVar, obj);
                    viVar.dismiss();
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
        ap apVar = new ap(obj, null, true, 1);
        apVar.V1 = this.f23053b;
        apVar.f38467a.f38453a = this.f23054c;
        apVar.f38510p1 = this.d;
        apVar.c1(this.e);
        apVar.I1 = new zo(this.f23052a, this.f23055f, 1);
        ?? obj2 = new Object();
        obj2.f19545a = true;
        obj2.e = true;
        this.h.showAsSheet(apVar, obj2);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(gh ghVar) {
        ghVar.run();
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
