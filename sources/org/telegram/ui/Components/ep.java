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
import org.telegram.ui.xi1;
public final class ep implements vi {
    public final xi f26171a;
    public final TL_stories.TL_premium_boostsStatus f26172b;
    public final org.telegram.ui.ActionBar.d6 f26173c;
    public final org.telegram.ui.g d;
    public final long f26174e;
    public final org.telegram.ui.gc f26175f;
    public final org.telegram.ui.cd h;

    public ep(xi xiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.g gVar, long j3, org.telegram.ui.gc gcVar, org.telegram.ui.cd cdVar) {
        this.f26171a = xiVar;
        this.f26172b = tL_premium_boostsStatus;
        this.f26173c = d6Var;
        this.d = gVar;
        this.f26174e = j3;
        this.f26175f = gcVar;
        this.h = cdVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.f26171a;
        try {
            HashMap<Object, Object> selectedPhotos = xiVar.f32922j0.getSelectedPhotos();
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
                    dp dpVar = new dp(new xi1(file, file, ""), loadBitmap, false, 0);
                    dpVar.V1 = this.f26172b;
                    dpVar.f39487a.f39473a = this.f26173c;
                    dpVar.f39531p1 = this.d;
                    dpVar.F1 = false;
                    dpVar.E1 = false;
                    dpVar.f39527n1 = 0.2f;
                    dpVar.c1(this.f26174e);
                    dpVar.I1 = new cp(xiVar, this.f26175f, 0);
                    ?? obj = new Object();
                    obj.f21358a = true;
                    obj.f21361e = true;
                    this.h.showAsSheet(dpVar, obj);
                    xiVar.dismiss();
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
        dp dpVar = new dp(obj, null, true, 1);
        dpVar.V1 = this.f26172b;
        dpVar.f39487a.f39473a = this.f26173c;
        dpVar.f39531p1 = this.d;
        dpVar.c1(this.f26174e);
        dpVar.I1 = new cp(this.f26171a, this.f26175f, 1);
        ?? obj2 = new Object();
        obj2.f21358a = true;
        obj2.f21361e = true;
        this.h.showAsSheet(dpVar, obj2);
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(ih ihVar) {
        ihVar.run();
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
