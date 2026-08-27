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
import org.telegram.ui.xh1;

public final class po implements ei {

    public final gi f31636a;

    public final TL_stories.TL_premium_boostsStatus f31637b;

    public final org.telegram.ui.ActionBar.c6 f31638c;
    public final org.telegram.ui.g d;

    public final long f31639e;

    public final org.telegram.ui.x3 f31640f;
    public final org.telegram.ui.xc h;

    public po(gi giVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.x3 x3Var, org.telegram.ui.xc xcVar) {
        this.f31636a = giVar;
        this.f31637b = tL_premium_boostsStatus;
        this.f31638c = c6Var;
        this.d = gVar;
        this.f31639e = j10;
        this.f31640f = x3Var;
        this.h = xcVar;
    }

    @Override
    public final void I(Object obj) {
        oo ooVar = new oo(obj, null, true, 1);
        ooVar.R1 = this.f31637b;
        ooVar.f40735a.f40429a = this.f31638c;
        ooVar.l1 = this.d;
        ooVar.c1(this.f31639e);
        ooVar.E1 = new no(this.f31636a, this.f31640f, 1);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        l2Var.f23622e = true;
        this.h.showAsSheet(ooVar, l2Var);
    }

    @Override
    public final boolean N0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gi giVar = this.f31636a;
        try {
            HashMap<Object, Object> selectedPhotos = giVar.f28650f0.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            if (str != null) {
                File file = new File(FileLoader.getDirectory(4), Utilities.random.nextInt() + ".jpg");
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(str, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
                bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                oo ooVar = new oo(new xh1(file, file, ""), bitmapLoadBitmap, false, 0);
                ooVar.R1 = this.f31637b;
                ooVar.f40735a.f40429a = this.f31638c;
                ooVar.l1 = this.d;
                ooVar.B1 = false;
                ooVar.A1 = false;
                ooVar.f40764j1 = 0.2f;
                ooVar.c1(this.f31639e);
                ooVar.E1 = new no(giVar, this.f31640f, 0);
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                l2Var.f23622e = true;
                this.h.showAsSheet(ooVar, l2Var);
                giVar.dismiss();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void F() {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
