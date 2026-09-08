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
import org.telegram.ui.hj1;
public final class ap implements ti {
    public final vi f24458a;
    public final TL_stories.TL_premium_boostsStatus f24459b;
    public final org.telegram.ui.ActionBar.f6 f24460c;
    public final org.telegram.ui.g d;
    public final long f24461e;
    public final org.telegram.ui.t3 f24462f;
    public final org.telegram.ui.bd h;

    public ap(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.t3 t3Var, org.telegram.ui.bd bdVar) {
        this.f24458a = viVar;
        this.f24459b = tL_premium_boostsStatus;
        this.f24460c = f6Var;
        this.d = gVar;
        this.f24461e = j3;
        this.f24462f = t3Var;
        this.h = bdVar;
    }

    @Override
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean D0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void K(Object obj) {
        zo zoVar = new zo(obj, null, true, 1);
        zoVar.V1 = this.f24459b;
        zoVar.f41941a.f41925a = this.f24460c;
        zoVar.f41985p1 = this.d;
        zoVar.c1(this.f24461e);
        zoVar.I1 = new yo(this.f24458a, this.f24462f, 1);
        ?? obj2 = new Object();
        obj2.f21169a = true;
        obj2.f21172e = true;
        this.h.showAsSheet(zoVar, obj2);
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.f24458a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f31318j0.getSelectedPhotos();
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
                    zo zoVar = new zo(new hj1(file, file, ""), loadBitmap, false, 0);
                    zoVar.V1 = this.f24459b;
                    zoVar.f41941a.f41925a = this.f24460c;
                    zoVar.f41985p1 = this.d;
                    zoVar.F1 = false;
                    zoVar.E1 = false;
                    zoVar.f41981n1 = 0.2f;
                    zoVar.c1(this.f24461e);
                    zoVar.I1 = new yo(viVar, this.f24462f, 0);
                    ?? obj = new Object();
                    obj.f21169a = true;
                    obj.f21172e = true;
                    this.h.showAsSheet(zoVar, obj);
                    viVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
