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
import org.telegram.ui.ai1;
public final class mp implements ri {
    public final ti f28732a;
    public final TL_stories.TL_premium_boostsStatus f28733b;
    public final org.telegram.ui.ActionBar.g6 f28734c;
    public final org.telegram.ui.f d;
    public final long e;
    public final org.telegram.ui.fc f28735f;
    public final org.telegram.ui.bd h;

    public mp(ti tiVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.f fVar, long j10, org.telegram.ui.fc fcVar, org.telegram.ui.bd bdVar) {
        this.f28732a = tiVar;
        this.f28733b = tL_premium_boostsStatus;
        this.f28734c = g6Var;
        this.d = fVar;
        this.e = j10;
        this.f28735f = fcVar;
        this.h = bdVar;
    }

    @Override
    public final void O(Object obj) {
        lp lpVar = new lp(obj, null, true, 1);
        lpVar.W1 = this.f28733b;
        lpVar.f40713a.f40691a = this.f28734c;
        lpVar.f40759q1 = this.d;
        lpVar.c1(this.e);
        lpVar.J1 = new kp(this.f28732a, this.f28735f, 1);
        ?? obj2 = new Object();
        obj2.f21636a = true;
        obj2.e = true;
        this.h.showAsSheet(lpVar, obj2);
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.f28732a;
        try {
            HashMap<Object, Object> selectedPhotos = tiVar.f30742j0.getSelectedPhotos();
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
                    lp lpVar = new lp(new ai1(file, file, ""), loadBitmap, false, 0);
                    lpVar.W1 = this.f28733b;
                    lpVar.f40713a.f40691a = this.f28734c;
                    lpVar.f40759q1 = this.d;
                    lpVar.G1 = false;
                    lpVar.F1 = false;
                    lpVar.f40755o1 = 0.2f;
                    lpVar.c1(this.e);
                    lpVar.J1 = new kp(tiVar, this.f28735f, 0);
                    ?? obj = new Object();
                    obj.f21636a = true;
                    obj.e = true;
                    this.h.showAsSheet(lpVar, obj);
                    tiVar.dismiss();
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
    public final void r(gh ghVar) {
        ghVar.run();
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
