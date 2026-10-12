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
import org.telegram.ui.qj1;
public final class op implements ti {
    public final vi f28008a;
    public final TL_stories.TL_premium_boostsStatus f28009b;
    public final org.telegram.ui.ActionBar.c6 f28010c;
    public final org.telegram.ui.g d;
    public final long e;
    public final org.telegram.ui.lc f28011f;
    public final org.telegram.ui.hd h;

    public op(vi viVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.g gVar, long j10, org.telegram.ui.lc lcVar, org.telegram.ui.hd hdVar) {
        this.f28008a = viVar;
        this.f28009b = tL_premium_boostsStatus;
        this.f28010c = c6Var;
        this.d = gVar;
        this.e = j10;
        this.f28011f = lcVar;
        this.h = hdVar;
    }

    @Override
    public final void U(Object obj) {
        np npVar = new np(obj, null, true, 1);
        npVar.V1 = this.f28009b;
        npVar.f34853a.f34838a = this.f28010c;
        npVar.f34896p1 = this.d;
        npVar.c1(this.e);
        npVar.I1 = new mp(this.f28008a, this.f28011f, 1);
        ?? obj2 = new Object();
        obj2.f20469a = true;
        obj2.e = true;
        this.h.showAsSheet(npVar, obj2);
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.f28008a;
        try {
            HashMap<Object, Object> selectedPhotos = viVar.f30013j0.getSelectedPhotos();
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
                    np npVar = new np(new qj1(file, file, ""), loadBitmap, false, 0);
                    npVar.V1 = this.f28009b;
                    npVar.f34853a.f34838a = this.f28010c;
                    npVar.f34896p1 = this.d;
                    npVar.F1 = false;
                    npVar.E1 = false;
                    npVar.f34892n1 = 0.2f;
                    npVar.c1(this.e);
                    npVar.I1 = new mp(viVar, this.f28011f, 0);
                    ?? obj = new Object();
                    obj.f20469a = true;
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
    public final boolean p0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
