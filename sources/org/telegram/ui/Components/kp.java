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
import org.telegram.ui.zh1;
public final class kp implements pi {
    public final ri f28041a;
    public final TL_stories.TL_premium_boostsStatus f28042b;
    public final org.telegram.ui.ActionBar.g6 f28043c;
    public final org.telegram.ui.f d;
    public final long e;
    public final org.telegram.ui.fc f28044f;
    public final org.telegram.ui.bd h;

    public kp(ri riVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.fc fcVar, org.telegram.ui.bd bdVar) {
        this.f28041a = riVar;
        this.f28042b = tL_premium_boostsStatus;
        this.f28043c = g6Var;
        this.d = fVar;
        this.e = j10;
        this.f28044f = fcVar;
        this.h = bdVar;
    }

    @Override
    public final void O(Object obj) {
        jp jpVar = new jp(obj, null, true, 1);
        jpVar.W1 = this.f28042b;
        jpVar.f40442a.f40426a = this.f28043c;
        jpVar.f40488q1 = this.d;
        jpVar.c1(this.e);
        jpVar.J1 = new ip(this.f28041a, this.f28044f, 1);
        ?? obj2 = new Object();
        obj2.f21637a = true;
        obj2.e = true;
        this.h.showAsSheet(jpVar, obj2);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ri riVar = this.f28041a;
        try {
            HashMap<Object, Object> selectedPhotos = riVar.f30158j0.getSelectedPhotos();
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
                    jp jpVar = new jp(new zh1(file, file, ""), loadBitmap, false, 0);
                    jpVar.W1 = this.f28042b;
                    jpVar.f40442a.f40426a = this.f28043c;
                    jpVar.f40488q1 = this.d;
                    jpVar.G1 = false;
                    jpVar.F1 = false;
                    jpVar.f40484o1 = 0.2f;
                    jpVar.c1(this.e);
                    jpVar.J1 = new ip(riVar, this.f28044f, 0);
                    ?? obj = new Object();
                    obj.f21637a = true;
                    obj.e = true;
                    this.h.showAsSheet(jpVar, obj);
                    riVar.dismiss();
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void r(eh ehVar) {
        ehVar.run();
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
