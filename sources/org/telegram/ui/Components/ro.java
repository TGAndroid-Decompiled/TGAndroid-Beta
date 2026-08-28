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
import org.telegram.ui.yh1;
public final class ro implements ii {
    public final ki f32232a;
    public final TL_stories.TL_premium_boostsStatus f32233b;
    public final org.telegram.ui.ActionBar.b6 f32234c;
    public final org.telegram.ui.g d;
    public final long f32235e;
    public final org.telegram.ui.w3 f32236f;
    public final org.telegram.ui.xc h;

    public ro(ki kiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.w3 w3Var, org.telegram.ui.xc xcVar) {
        this.f32232a = kiVar;
        this.f32233b = tL_premium_boostsStatus;
        this.f32234c = b6Var;
        this.d = gVar;
        this.f32235e = j10;
        this.f32236f = w3Var;
        this.h = xcVar;
    }

    @Override
    public final void A(Object obj) {
        qo qoVar = new qo(obj, null, true, 1);
        qoVar.R1 = this.f32233b;
        qoVar.f41056a.f41043a = this.f32234c;
        qoVar.l1 = this.d;
        qoVar.c1(this.f32235e);
        qoVar.E1 = new po(this.f32232a, this.f32236f, 1);
        ?? obj2 = new Object();
        obj2.f23653a = true;
        obj2.f23656e = true;
        this.h.showAsSheet(qoVar, obj2);
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.f32232a;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.f30114f0.getSelectedPhotos();
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
                    qo qoVar = new qo(new yh1(file, file, ""), loadBitmap, false, 0);
                    qoVar.R1 = this.f32233b;
                    qoVar.f41056a.f41043a = this.f32234c;
                    qoVar.l1 = this.d;
                    qoVar.B1 = false;
                    qoVar.A1 = false;
                    qoVar.f41085j1 = 0.2f;
                    qoVar.c1(this.f32235e);
                    qoVar.E1 = new po(kiVar, this.f32236f, 0);
                    ?? obj = new Object();
                    obj.f23653a = true;
                    obj.f23656e = true;
                    this.h.showAsSheet(qoVar, obj);
                    kiVar.dismiss();
                }
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override
    public final boolean t0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
