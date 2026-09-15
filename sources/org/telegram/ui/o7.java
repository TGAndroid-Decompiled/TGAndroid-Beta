package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class o7 extends g7 {
    public org.telegram.ui.Cells.s7 f36111n;
    public final ArrayList f36112r;
    public org.telegram.ui.Components.pq f36113s;
    public final s7 v;

    public o7(s7 s7Var) {
        super(s7Var, 1);
        this.v = s7Var;
        this.f36112r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f36112r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((m7) arrayList2.get(i10)).d.f49194a.getPath();
                if (((m7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (this.f36113s == null) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.X9, false)), org.telegram.ui.ActionBar.i6.R4);
            this.f36113s = pqVar;
            pqVar.f27125w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) c1Var.f42675a;
        zh.a aVar = ((m7) this.e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f21375c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f49194a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f36113s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f49196c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f36113s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f49196c), false);
        }
        t7Var.i(this.v.f37266f.f49205j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f36111n == null) {
            this.f36111n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.f36111n, this.v.d.getCurrentAccount());
        n7Var.setStyle(1);
        return new s4.c1(n7Var);
    }
}
